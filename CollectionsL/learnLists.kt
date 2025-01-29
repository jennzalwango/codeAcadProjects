fun main() {
    
     // immutable lists cannot be changed its declared with listOf

    var sportsWater = listOf("Wind Surfing", "Sailing"," Swimming", "Jet Skiing", "Water Skiing")
    println(waterSports)


    //creating a mutable list
    val openBroadwayShows = mutableListOf("The Lion King","Chicago", "The Cher Show","Les Miserables")
    openBroadwayShows[2] = "Wicked"
    println(openBroadwayShows)

    // working with mutable Lists
    val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

    // Write your code below 🪐
    // remove
    planets.remove("Pluto")
    println(planets)

// add new items at the end of the list
    planets.add("Earth")
    println(planets)

// randomly selects a valu
    println(planets.random())


}