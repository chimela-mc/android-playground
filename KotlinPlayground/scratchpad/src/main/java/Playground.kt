// No package line needed for simple testing right now!

fun main() {
    println("--- IT WORKS! ---")
    printTripLength()
    printMeetingReminder()
    printEscapeChar()
    notificationsMain()
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 2))
    tellFriends()
    promoSale()
    printPartySize()
    totalSalary()
    basicMath()
    loginAttempt()
    calBurn()
    println("Have I spent more time using my phone today: ${compareScreenTime(100, 50)}")
    println("Have I spent more time using my phone today: ${compareScreenTime(50, 100)}")

    println("\n--- Weather Report ---")
    weatherDetails("Ankara", 27, 31, 82)
    weatherDetails("Tokyo", 32, 36, 10)
    weatherDetails("Cape Town", 59, 64, 2)
    weatherDetails("Guatemala City", 50, 55, 7)
    println(1 < 1)
    println(1 == 1)
    trafficLightColor()
}

fun trafficLightColor() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if(trafficLightColor == "Yellow") {
        println("Slow")
    } else {
        println("Go")
    }
}
fun weatherDetails(city : String, lowTemp : Int, highTemp : Int, chanceOfRain : Int) {
    println("City: $city\nLow temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%\n")
}

fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun calBurn() {
    val steps = 4000
    val caloriesBurned = calculateCaloriesFromSteps(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun calculateCaloriesFromSteps(stepCount: Int): Double {
    val caloriesBurnedPerStep = 0.04
    val totalCaloriesBurned = stepCount * caloriesBurnedPerStep
    return totalCaloriesBurned
}

fun loginAttempt() {
    // FIXED: Renamed emailId to email
    val firstUserEmail = "user_one@gmail.com"
    println(displayAlertMessage(email = firstUserEmail))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmail = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmail))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmail = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmail))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $email"
}

fun basicMath() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}


fun totalSalary() {
    val baseSalary = 5000
    val bonusAmount = 1000
    // FIXED: Removed quotes so it does math instead of text
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun printPartySize() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun promoSale() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}

fun tellFriends() {
    println("Use val for constants. Use var for variables.")
}

fun birthdayGreeting(name : String = "Rover", age: Int): String {
    val nameGreeting = "Happy birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun printEscapeChar() {
    println("Say \"hello\"")
}

fun printTripLength() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}


fun printMeetingReminder() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    // FIXED: Used String Templates
    val reminder = "$nextMeeting$date at work"
    println(reminder)
}

fun notificationsMain() {
    val notificationsEnabled = false
    // FIXED: Used String Templates
    println("Are notifications enabled? $notificationsEnabled")
}
