package core.definitions.vertices

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType
import core.definitions.vertex.Vertex
import core.definitions.vertex.VertexType
import core.utils.allFermionsInQCD

class QCDVertex : Vertex {



    override val type: VertexType
        get() = VertexType.Chromodynamic
    override val fermions: List<FermionType>
        get() = allFermionsInQCD
    override val bosons: List<BosonType>
        get() = listOf(BosonType.Gluon)


}