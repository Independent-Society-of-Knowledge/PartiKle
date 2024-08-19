package core.definitions.fermion

import core.definitions.attrs.ColorCharge
import core.definitions.attrs.ElectricCharge
import core.definitions.attrs.Generation
import core.definitions.attrs.Spin
import core.utils.idGen
import java.util.concurrent.atomic.AtomicLong

interface Fermion<T> {
    val type: T
    val mass: Double
    val electricCharge: ElectricCharge
    val colorCharge: ColorCharge
    val spin: Spin
        get() = Spin.Half
    val id: Long
        get() = idGen.incrementAndGet()
    val generation: Generation
}