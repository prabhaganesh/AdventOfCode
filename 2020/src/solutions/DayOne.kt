package solutions

class DayOne {

    fun solve(input: List<Int>) {
        println("Challenge Part 1")
        val twoNumbersTo2020 = findTwoNumbersToTotal(input, 2020)
        foldAndPrint(twoNumbersTo2020)

        println("Challenge Part 2")
        val threeNumbersTo2020 = findThreeNumbersTotal(input, 2020)
        foldAndPrint(threeNumbersTo2020)
    }


    private fun findTwoNumbersToTotal(input: List<Int>, total: Int): List<Int> {
        input.forEach {
            if (input.contains(total - it)) {
                return listOf(it, total - it)
            }
        }
        return listOf()
    }

    private fun findThreeNumbersTotal(input: List<Int>, total: Int): List<Int> {
        input.forEach {
            val twoNum = findTwoNumbersToTotal(input, total - it)
            if (twoNum.isNotEmpty()) {
                return listOf(it) + twoNum
            }
        }
        return listOf()
    }

    private fun foldAndPrint(threeNumbersTo2020: List<Int>) {
        println("numbers: $threeNumbersTo2020")
        val result = threeNumbersTo2020.fold(1, { acc, next -> acc * next })
        println("Result: $result")
        println()
    }
}