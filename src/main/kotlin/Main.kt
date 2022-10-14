fun agoToText(name: String, sec: Int) {
    var m = sec / 60
    var h = sec / 3600

    val min1 = "минуту"
    val min2 = "минуты"
    val min3 = "минут"

    val resMinutes = if (m % 100 == 11) min3
    else if (m % 10 == 1) min1
    else if (m % 10 == 2 || m % 10 == 3 || m % 10 == 4) min2
    else min3

    val h1 = "час"
    val h2 = "часа"
    val h3 = "часов"


    val resHours = if (h % 100 == 11) h3
    else if (h % 10 == 1) h1
    else if (h % 10 == 2 || h % 10 == 3 || h % 10 == 4) h2
    else h3


    when (sec) {
        in 0..60 -> println("$name был(а) только что")
        in 61..60 * 60 -> println("$name был(а) $m $resMinutes назад")
        in 60 * 60 + 1..24 * 60 * 60 -> println("$name был(а) $h $resHours назад")
        in 24 * 60 * 60 + 1..(24 * 60 * 60) * 2 -> println("$name был(а) вчера")
        in ((24 * 60 * 60) * 2) + 1..24 * 60 * 60 * 3 -> println("$name был(а) позавчера")
        else -> println("Был(а) давно")
    }

}


fun main() {
    agoToText("Alex", 72000)

}
