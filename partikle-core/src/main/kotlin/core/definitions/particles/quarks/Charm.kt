package core.definitions.particles.quarks

import core.definitions.ElectricCharge
import core.definitions.Family
import core.definitions.Generation
import core.definitions.Particle

class Charm: Particle {
    override val name: String
        get() = "Charm"
    override val mass: Double
        get() = 1200.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.PositiveTwoThirds
    override val family: Family
        get() = Family.Quarks
    override val generation: Generation
        get() = Generation.Second
}