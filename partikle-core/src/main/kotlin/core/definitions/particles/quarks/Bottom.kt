package core.definitions.particles.quarks

import core.definitions.ElectricCharge
import core.definitions.Family
import core.definitions.Generation
import core.definitions.Particle

class Bottom: Particle {
    override val name: String
        get() = "Down"
    override val mass: Double
        get() = 7.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOneThirds
    override val family: Family
        get() = Family.Quarks
    override val generation: Generation
        get() = Generation.Third
}