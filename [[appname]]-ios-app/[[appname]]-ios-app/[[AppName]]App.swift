import [[AppName]]Shared
import SwiftUI

@main
struct [[AppName]]App: App {
    var body: some Scene {
        WindowGroup {
            TabView {
                FooView()
                    .tabItem {
                        Label("Foo", systemImage: "star")
                    }
                BarView()
                    .tabItem {
                        Label("Bar", systemImage: "heart")
                    }
            }
        }
    }
}
