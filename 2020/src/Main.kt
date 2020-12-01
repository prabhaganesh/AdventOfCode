import solutions.DayOne
import java.io.File

fun main(args: Array<String>) {
    println("*** Begin ***")
    val input = File("C:\\Users\\prabhakg\\idea-workspace\\AdventOfCode\\2020\\resources\\DayOne.txt")
            .readLines()
            .map { it.toInt() }
    DayOne().solve(input)
    println("*** End ***")
}