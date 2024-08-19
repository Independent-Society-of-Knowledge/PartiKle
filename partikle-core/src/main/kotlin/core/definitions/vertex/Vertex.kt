package core.definitions.vertex

import core.definitions.boson.Boson
import core.definitions.boson.BosonType
import core.definitions.fermion.Fermion
import core.definitions.fermion.LeptonType
import core.definitions.fermion.QuarkType
import core.utils.idGen
import java.util.concurrent.atomic.AtomicLong

interface Vertex {
    val id: Long
        get() = idGen.incrementAndGet()
    val type: VertexType
    val allowedLeptons: List<LeptonType>
    val allowedQuarks: List<QuarkType>
    val allowedBosons: List<BosonType>
}