fun main() {
    var array: ArrayList<Player> = ArrayList<Player>()
    array.add(Player("Виктор", 100, 20000))
    array.add(Player("Сергей", 122, 20344))
    array.add(Player("Джон", 145, 43000))
    array.add(Player("Том", 123, 24300))
    array.add(Player("Александр", 133, 43200))

    var totalMoney = array.sumOf { it.money }
    var totalScore = array.sumOf { it.score }

    println("Общее количество денег $totalMoney")
    println("Общее количество очков $totalScore")
}

data class Player(val name: String, val score: Int, val money: Int)