import kotlin.math.abs

fun main(){
    var temperature = 98.5
    var guess = 0.0
    var value = 0.0

    while (guess != temperature){
        print("Enter a number between 92.0 and 104.0: ")

            guess = readLine()!!.toDouble()
            value = abs(guess)
            if (value < 97.5)
                println("low")
            else if (value < 99.5)
                println("normal")
            else if (value > 99.5)
                println("high")



    }

    println("You guessed right, the temperature is $temperature")
}