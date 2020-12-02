package solutions

class DayTwo {

    fun solve(input: List<String>) {
        println("Challenge Part 1")
        findValidPasswordCountV1(parse(input))

        println("Challenge Part 2")
        findValidPasswordCountV2(parse(input))
    }

    private fun findValidPasswordCountV2(input: List<PasswordPolicy>) {
        input.filter {
            it.evaluateV2()
        }.size.let { println(it) }
    }


    private fun findValidPasswordCountV1(input: List<PasswordPolicy>) {
        input.filter {
            it.evaluateV1()
        }.size.let { println(it) }
    }

    private fun parse(input: List<String>): List<PasswordPolicy> {
        return input.map {
            val parts = it.split(" ")
            val range = parts[0].split("-")
            PasswordPolicy(range[0].toInt(), range[1].toInt(), parts[1].first(), parts[2])
        }.toList()
    }
}

class PasswordPolicy(val rangeLow: Int, val rangeHigh: Int, val char: Char, val password: String) {

    fun evaluateV1(): Boolean {
        return password.filter { it == char }.count() in rangeLow..rangeHigh
    }

    fun evaluateV2(): Boolean {
        return (password[rangeLow - 1] == char).xor(password[rangeHigh - 1] == char)
    }
}
