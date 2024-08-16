package core.definitions.particles.leptons

import core.definitions.*

class MuonNeutrino: Particle {
    override val name: String
        get() = "MuonNeutrino"
    override val mass: Double
        get() = 0.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.Zero
//    override val colorCharge: ColorCharge
//        get() = ColorCharge.Neutral
    override val family: Family
        get() = Family.Leptons
    override val generation: Generation
        get() = Generation.Second
}