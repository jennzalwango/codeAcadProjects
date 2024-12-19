fun main () {

    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below
    // var distance: Int

    println("Enter an integer between 400 and 600")
    val distance = Integer.valueOf(readLine())

    val calculateTotalForGas = (costOfGas / mileage) * distance

    val totalForGas = Math.round(calculateTotalForGas * 100) /100.00

    val totalMoneySaved = totalForGas + 200


    println("What's your name?")
    var name = readLine()
    // Write your code below
    println("What's your friends name?")
    val friendsName = readLine()

    println("Enter an adjective")
    val adjective = readLine()
    println("what city")
    val city = readLine()
    println("Enter a brand name")
    val brandName = readLine()

    println("What kind of job will you and your $friendsName do in order to save maney")

    val work = readLine()


    print("""
    A long time ago, $name and their friend $friendsName planned an $adjective road trip to see their favorite band: $brandName. 
    The venue was $distance miles away which meant they needed to save $totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $brandName t-shirts to remember their trip.
    """.trimIndent())
}

// To Run.
// kotlinc Madlibs.kt -include-runtime -d Madlibs.jar
//java -jar Madlibs.jar