Pod::Spec.new do |spec|
    spec.name                     = '[[appname]]_shared'
    spec.version                  = '[[version]]'
    spec.homepage                 = 'https://[[domain]].[[tld]]'
    spec.source                   = { :git => "Not Published", :tag => "Cocoapods/#{spec.name}/#{spec.version}" }
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = 'Some description for the Shared Module'

    spec.vendored_frameworks      = "build/cocoapods/framework/[[AppName]]Shared.framework"
    spec.libraries                = "c++"
    spec.module_name              = "#{spec.name}_umbrella"

    spec.ios.deployment_target = '15.0'

                

    spec.pod_target_xcconfig = {
        'KOTLIN_PROJECT_PATH' => ':[[appname]]-shared',
        'PRODUCT_MODULE_NAME' => '[[appname]]_shared',
    }

    spec.script_phases = [
        {
            :name => 'Build [[appname]]_shared',
            :execution_position => :before_compile,
            :shell_path => '/bin/sh',
            :script => <<-SCRIPT
                if [ "YES" = "$COCOAPODS_SKIP_KOTLIN_BUILD" ]; then
                  echo "Skipping Gradle build task invocation due to COCOAPODS_SKIP_KOTLIN_BUILD environment variable set to \"YES\""
                  exit 0
                fi
                set -ev
                REPO_ROOT="$PODS_TARGET_SRCROOT"
                "$REPO_ROOT/../gradlew" -p "$REPO_ROOT" $KOTLIN_PROJECT_PATH:syncFramework \
                    -Pkotlin.native.cocoapods.platform=$PLATFORM_NAME \
                    -Pkotlin.native.cocoapods.archs="$ARCHS" \
                    -Pkotlin.native.cocoapods.configuration=$CONFIGURATION
            SCRIPT
        }
    ]
end