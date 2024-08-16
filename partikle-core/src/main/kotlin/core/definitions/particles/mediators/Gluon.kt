package core.definitions.particles.mediators

import core.definitions.ElectricCharge
import core.definitions.Family
import core.definitions.Generation
import core.definitions.Particle

class Gluon: Particle {
    override val name: String
        get() = "Gluon"
    override val mass: Double
        get() = 0.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.Zero
    override val family: Family
        get() = Family.Mediators
    override val generation: Generation
        get() = Generation.NoGeneration
}