package fr.tarcaye.codingame.wip

import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val W = input.nextInt() // width of the building.
    val H = input.nextInt() // height of the building.
    val N = input.nextInt() // maximum number of turns before game over.
    val X0 = input.nextInt()
    val Y0 = input.nextInt()

    var zoneDeRecherche = SearchArea(0, W - 1, 0, H - 1)
    var batman = Position(X0, Y0)

    // game loop
    while (true) {
        val distance = Distance.valueOf(input.next())
        batman = batman.move(zoneDeRecherche, distance)

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");

        println("0 0")
    }
}

data class SearchArea(val minX: Int, val maxX: Int, val minY: Int, val maxY: Int)
data class Position(val x: Int, val y: Int) {
    fun move(searchArea: SearchArea, distance: Distance): Position {
        return Position(updateX(searchArea), 2)
    }

    private fun updateX(searchArea: SearchArea): Int {
        return when {
            2 * x == searchArea.maxX -> x - 1
            else -> searchArea.maxX - x
        }
    }

}

enum class Distance {
    COLDER, WARMER, SAME, UNKNOWN
}