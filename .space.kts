/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Build, run tests and publish") {
   gradlew("openjdk:11", "build")
   //gradlew("openjdk:11", "build publishh")
}
