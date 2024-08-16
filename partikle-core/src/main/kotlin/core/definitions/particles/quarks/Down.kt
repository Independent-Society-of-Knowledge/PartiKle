package core.definitions.particles.quarks

import core.definitions.*

class Down: Particle {
    override val name: String
        get() = "Down"
    override val mass: Double
        get() = 7.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOneThirds
//    override val colorCharge: ColorCharge
//        get() = ColorCharge.Neutral
    override val family: Family
        get() = Family.Quarks
    override val generation: Generation
        get() = Generation.First
}

