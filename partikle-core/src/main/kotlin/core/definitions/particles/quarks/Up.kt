package core.definitions.particles.quarks

import core.definitions.ElectricCharge
import core.definitions.Family
import core.definitions.Generation
import core.definitions.Particle

class Up: Particle {
    override val name: String
        get() = "Up"
    override val mass: Double
        get() = 3.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.PositiveTwoThirds
    override val family: Family
        get() = Family.Quarks
    override val generation: Generation
        get() = Generation.First
}