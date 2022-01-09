package [[tld]].[[domain]].[[appname]].shared

class Greeting {
    fun greeting(): String =
        "Hello, ${Platform().platform}!"
}