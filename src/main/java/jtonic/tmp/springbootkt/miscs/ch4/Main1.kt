package jtonic.tmp.springbootkt.miscs.ch4

/**
 * Created by Antonel Ernest Pazargic on 07/07/2017.
 * @author Antonel Ernest Pazargic
 */

class Main1 {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val p1 = Point(2, 2)
            val p2 = Point(3, 3)
            println("p1 + p2 = ${p1 + p2}")
            println("p1 * p2 = ${p1 * p2}")
            println("p1 * 10 = ${p1 * 10}")
            println("20 * p2 = ${20 * p2}")
        }
    }
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.times(other: Point): Point = Point(x * other.x, y * other.y)
operator fun Point.times(scale: Int): Point = Point(x * scale, y * scale)
operator fun Int.times(other: Point): Point = Point(this * other.x, this * other.y)
