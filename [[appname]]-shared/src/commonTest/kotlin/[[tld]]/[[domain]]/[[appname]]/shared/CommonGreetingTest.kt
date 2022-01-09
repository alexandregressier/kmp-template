package [[tld]].[[domain]].[[appname]].shared

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.string.shouldContain

class CommonGreetingTest : WordSpec() {
    val greeting = Greeting().greeting()

    init {
        "Greeting" should {
            "hello someone" {
                greeting shouldContain "Hello"
            }
        }
    }
}