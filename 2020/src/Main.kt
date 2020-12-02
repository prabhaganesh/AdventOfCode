import solutions.DayTwo
import java.io.File

fun main(args: Array<String>) {
    println("*** Begin ***")
    val input = File("C:\\Users\\prabhakg\\idea-workspace\\AdventOfCode\\2020\\resources\\DayTwo.txt")
            .readLines()
    DayTwo().solve(input)
    println("*** End ***")
}