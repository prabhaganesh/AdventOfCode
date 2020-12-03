package solutions

class DayThree {

    fun solve(input: List<String>) {
        println("Challenge Part 1")
        val tree = countTrees(input, Pair(3, 1))
        println(tree)

        println("Challenge Part 2")
        println(countTrees(input, Pair(1, 1)) *
                countTrees(input, Pair(3, 1)) *
                countTrees(input, Pair(5, 1)) *
                countTrees(input, Pair(7, 1)) *
                countTrees(input, Pair(1, 2)))
    }

    private fun countTrees(input: List<String>, slope: Pair<Int, Int>): Long {
        var x = 0
        var y = 0
        var tree = 0L
        while (y < input.size) {
            if (input[y][x % input[y].length] == '#') {
                tree++
            }
            x += slope.first
            y += slope.second
        }
        return tree
    }
}

