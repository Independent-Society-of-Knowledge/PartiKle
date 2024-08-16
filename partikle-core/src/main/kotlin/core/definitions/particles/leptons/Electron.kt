package core.definitions.particles.leptons

import core.definitions.*

class Electron: Particle {
    override val name: String
        get() ="Electron"
    override val mass: Double
        get() = 0.510999
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOne
//    override val colorCharge: ColorCharge
//        get() = ColorCharge.Neutral
    override val family: Family
        get() = Family.Leptons
    override val generation: Generation
        get() = Generation.First
}