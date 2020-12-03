import solutions.DayThree
import java.io.File

fun main(args: Array<String>) {
    println("*** Begin ***")
    val input = File("C:\\Users\\prabhakg\\idea-workspace\\AdventOfCode\\2020\\resources\\DayThree.txt")
            .readLines()
    DayThree().solve(input)
    println("*** End ***")
}