package core.definitions.vertex

import core.definitions.boson.BosonType
import core.definitions.fermion.FermionType
import core.utils.idGen

interface Vertex {
    val id: Long
        get() = idGen.incrementAndGet()
    val type: VertexType

    val fermions: List<FermionType>
    val bosons: List<BosonType>

    fun interactiveFor(particleType: FermionType): Boolean {
        return particleType in fermions
    }

    fun byBoson(bosonType: BosonType): Boolean {
        return bosonType in bosons
    }

}

