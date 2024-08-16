package core.definitions.particles.mediators

import core.definitions.ElectricCharge
import core.definitions.Family
import core.definitions.Generation
import core.definitions.Particle

class WMinus: Particle {
    override val name: String
        get() = "WMinusBoson"
    override val mass: Double
        get() = 80420.0
    override val electricCharge: ElectricCharge
        get() = ElectricCharge.NegativeOne
    override val family: Family
        get() = Family.Mediators
    override val generation: Generation
        get() = Generation.NoGeneration

}