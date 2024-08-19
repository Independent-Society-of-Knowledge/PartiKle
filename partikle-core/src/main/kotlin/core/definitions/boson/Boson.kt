package core.definitions.boson

import core.definitions.attrs.ColorCharge
import core.definitions.attrs.ElectricCharge
import core.definitions.attrs.Spin
import core.utils.idGen

interface Boson {
    val type: BosonType
    val mass: Double
    val electricCharge: ElectricCharge
    val colorCharge: ColorCharge
    val spin: Spin
        get() = Spin.One
    val id: Long
        get() = idGen.incrementAndGet()
}