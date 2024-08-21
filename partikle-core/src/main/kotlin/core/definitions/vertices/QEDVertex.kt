package core.definitions.vertices

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType
import core.definitions.vertex.Vertex
import core.definitions.vertex.VertexType
import core.utils.allFermionsInQED

class QEDVertex : Vertex {


    override val type: VertexType
        get() = VertexType.Electrodynamic
    override val fermions: List<FermionType>
        get() = allFermionsInQED
    override val bosons: List<BosonType>
        get() = listOf(BosonType.Gamma)
}

