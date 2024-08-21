package core.definitions.theory

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType

interface InteractionVertex {
    val ingoing: List<FermionType>
    val outgoing: List<FermionType>
    val bosons: List<BosonType>
}