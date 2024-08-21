package core.definitions.theory

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType
import core.definitions.vertex.Vertex
import core.definitions.vertices.QEDVertex
import core.utils.allFermionsInQED

class QED: Theory {
    override val name: String
        get() = "Quantum Electrodynamics Theory"
    override val description: String
        get() = "The fundamental theory of electromagnetism"
    override val fermionsInTheory: List<FermionType>
        get() = allFermionsInQED
    override val bosonsInTheory: List<BosonType>
        get() = listOf(BosonType.Gamma)
    override val vertices: List<Vertex>
        get() = listOf(QEDVertex())
    override val InteractionVertices: List<InteractionVertex>
        get() = TODO("Not yet implemented")
    override fun allows(interactionVertex: InteractionVertex): Boolean {
        TODO("Not yet implemented")
    }
}