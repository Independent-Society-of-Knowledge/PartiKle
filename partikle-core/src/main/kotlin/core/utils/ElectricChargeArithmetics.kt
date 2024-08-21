package core.utils

import core.definitions.attrs.ElectricCharge

fun ElectricCharge.toDouble(): Double {
    return if (this === ElectricCharge.Zero) {
        0.0
    } else if (this === ElectricCharge.NegativeOne) {
        -1.0
    } else if (this === ElectricCharge.PositiveOne) {
        1.0
    } else if (this === ElectricCharge.PositiveOneThirds) {
        0.3
    } else if (this === ElectricCharge.PositiveTwoThirds) {
        0.6
    } else if (this === ElectricCharge.NegativeOneThirds) {
        -0.3
    } else if (this === ElectricCharge.NegativeTwoThirds) {
        -0.6
    } else {
        0.0
    }
}

fun Double.toElectricCharge(): ElectricCharge? {
    return if (this inRange -0.01..0.01) {
        ElectricCharge.Zero
    } else if (this inRange -1.01..-.99) {
        ElectricCharge.NegativeOne
    } else if (this inRange 0.99..1.01) {
        ElectricCharge.PositiveOne
    } else if (this inRange 0.29..0.31) {
        ElectricCharge.PositiveOneThirds
    } else if (this inRange -0.31..-0.29) {
        ElectricCharge.NegativeOneThirds
    } else if (this inRange 0.65..0.67) {
        ElectricCharge.PositiveTwoThirds
    } else if (this inRange -0.67..0.65) {
        ElectricCharge.NegativeTwoThirds
    } else {
        // TODO Here we have to throw an exception.
        ElectricCharge.Zero
    }

}