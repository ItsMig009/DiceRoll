# DiceRoll
A
Notes
 - In this code the findViewById method is called everytime the rollDice() method is executed.
 - This slows down the performance of our application since the view has to be found within the view hierarchy.
 - To solve this issue we follow best practices by adding the diceImage field  using the keyword lateinit for non null items.


Gradle: The build tool of choice for Android
https://developer.android.com/studio/build#top-level
 - What devices run your app
 - Compile to executable
 - Dependency management
 - App signing for Google play
 - Automated Tests
 Gradle builds apk

 When Run Button is clicked:
 - App Resources
 - Compiled Code
 - AndroidManifest
 - Others
 These are packaged into an APK:
 - The executable format for distributing Android applications.

build.gradle (Project)
- Project wide build settings

build.gradle (Module:app)
- A folder with source files and resources for a discrete piece of functionality in your app.
- Each module has its own build.gradle file.

Example: This application contains one module named app. In case we want to add our own libraries
or support Android Wear, we can add our own.

Recap:
- Setup Android Studio (IDE)
- Setup device or emulator
- Basic app structure (XML Layouts, Activities)
- Layouts, Activities and the process of Layout Inflation
- Interactions 
- Gradle and Compatibility concepts.

