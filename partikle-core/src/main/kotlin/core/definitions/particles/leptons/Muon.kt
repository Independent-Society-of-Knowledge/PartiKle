package core.definitions.particles.leptons

import core.definitions.*

class Muon: Particle {
    override val name: String
        get() = "Muon"
    override val mass: Double
        get() = 105.659
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOne
//    override val colorCharge: ColorCharge
//        get() = ColorCharge.Neutral
    override val family: Family
        get() = Family.Leptons
    override val generation: Generation
        get() = Generation.Second
}