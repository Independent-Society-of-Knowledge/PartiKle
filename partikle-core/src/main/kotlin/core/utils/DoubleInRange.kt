package core.utils

infix fun Double.inRange(other: ClosedRange<Double> ): Boolean {
    return this > other.start && this < other.endInclusive
}
