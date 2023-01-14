package machine

class CoffeeMachine() {
    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550


    fun remainingCoffeeMachine() {
        println(
            """
       The coffee machine has:
       $water ml of water
       $milk ml of milk 
       $coffee g of coffee beans
       $cups disposable cups
       $$money of money 
    """.trimIndent()
        )
    }

    fun makeCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        when (readln()) {

            "1" -> {
                when {
                    water < 250 -> println("Sorry, not enough water!")
                    coffee < 16 -> println("Sorry, not enough coffee!")
                    cups == 0 -> println("Sorry, not enough cups!")
                    else -> {
                        water -= 250
                        coffee -= 16
                        cups -= 1
                        money += 4
                    }
                }
            }

            "2" -> {
                when {
                    water < 350 -> println("Sorry, not enough water!")
                    milk < 75 -> println("Sorry, not enough milk!")
                    coffee < 20 -> println("Sorry, not enough coffee!")
                    cups == 0 -> println("Sorry, not enough cups!")
                    else -> {
                        water -= 350
                        milk -= 75
                        coffee -= 20
                        cups -= 1
                        money += 7
                    }
                }
            }

            "3" -> {
                when {
                    water < 200 -> println("Sorry, not enough water!")
                    milk < 100 -> println("Sorry, not enough milk!")
                    coffee < 12 -> println("Sorry, not enough coffee!")
                    cups == 0 -> println("Sorry, not enough cups!")
                    else -> {
                        water -= 200
                        milk -= 100
                        coffee -= 12
                        cups -= 1
                        money += 6
                    }
                }
            }

        }
        println("I have enough resources, making you a coffee!")
    }

    fun fillCoffeeMachine() {
        println("Write how many ml of water you want to add:")
        val addWater = readln().toInt()
        water += addWater
        println("Write how many ml of milk you want to add:")
        val addMilk = readln().toInt()
        milk += addMilk
        println("Write how many grams of coffee beans you want to add:")
        val addCoffee = readln().toInt()
        coffee += addCoffee
        println("Write how many disposable cups you want to add:")
        val addCups = readln().toInt()
        cups += addCups
    }

    fun takeCoffeeMachineMoney() {
        println("I gave you $money")
        money = 0
    }

    fun inputCoffeeMachine(input: String) {

        when (input) {
            "buy" -> {
                makeCoffee()
            }

            "fill" -> {
                fillCoffeeMachine()
            }

            "take" -> {
                takeCoffeeMachineMoney()
            }

            "remaining" -> {
                remainingCoffeeMachine()
            }

        }

    }

}






fun main() {

    val coffeeMachine = CoffeeMachine()

    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")

        val userInput = readln()

        if (userInput != "exit")  {
            coffeeMachine.inputCoffeeMachine(userInput)
        }

        else {
            break
        }

    }

}
