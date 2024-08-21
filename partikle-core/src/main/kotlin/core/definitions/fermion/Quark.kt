package core.definitions.fermion

import core.definitions.attrs.ColorCharge
import core.definitions.attrs.ElectricCharge
import core.definitions.attrs.Generation

data class Quark(
    override val type: QuarkType,
    override val mass: Double,
    override val electricCharge: ElectricCharge,
    override val colorCharge: ColorCharge,
    override val generation: Generation,
) : Fermion {
    init {
        assert(
            electricCharge != ElectricCharge.Zero
                    && electricCharge != ElectricCharge.NegativeOne
                    && electricCharge != ElectricCharge.PositiveOne
        ) {
            "A Quark does not possess integer electric charge!"
        }
    }
}
