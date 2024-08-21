package core.definitions.theory

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType
import core.definitions.vertex.Vertex
import core.utils.idGen

interface Theory {
    val name: String
    val description: String
    val id: Long
        get() = idGen.getAndIncrement()

    // Drscribing the Theory:
    val fermionsInTheory: List<FermionType>
    val bosonsInTheory: List<BosonType>
    val vertices: List<Vertex>
    val InteractionVertices: List<InteractionVertex>

    infix fun allows(interactionVertex: InteractionVertex): Boolean
}