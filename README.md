# DiceRoll
A
Notes
 - In this code the findViewById method is called everytime the rollDice() method is executed.
 - This slows down the performance of our application since the view has to be found within the view hierarchy.
 - To solve this issue we follow best practices by adding the diceImage field  using the keyword lateinit for non null items.


 Gradle: The build tool of choice for Android
 - What devices run your app
 - Compile to executable
 - Dependency management
 - App signing for Google play
 - Automated Tests