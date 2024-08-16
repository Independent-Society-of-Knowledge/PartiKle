package core.definitions.particles.leptons

import core.definitions.*

class Tau: Particle {
    override val name: String
        get() = "Tau"
    override val mass: Double
        get() = 1776.99
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOne
//    override val colorCharge: ColorCharge
//        get() = ColorCharge.Neutral
    override val family: Family
        get() = Family.Leptons
    override val generation: Generation
        get() = Generation.Third
}