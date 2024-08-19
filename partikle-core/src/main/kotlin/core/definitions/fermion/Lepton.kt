package core.definitions.fermion

import core.definitions.attrs.ColorCharge
import core.definitions.attrs.ElectricCharge
import core.definitions.attrs.Generation

data class Lepton<LeptonType>(
    override val type: LeptonType,
    override val mass: Double,
    override val electricCharge: ElectricCharge,
    override val generation: Generation,
) : Fermion<LeptonType> {

    override val colorCharge: ColorCharge = ColorCharge.Neutral

    init {
        assert(electricCharge != ElectricCharge.PositiveOneThirds && electricCharge != ElectricCharge.PositiveTwoThirds) {
            "A Lepton can not have a non-integer electric charge."
        }
    }
}