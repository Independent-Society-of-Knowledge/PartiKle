package core.definitions.vertex

import core.definitions.boson.Boson
import core.definitions.boson.BosonType
import core.definitions.fermion.Fermion
import core.definitions.fermion.LeptonType
import core.definitions.fermion.QuarkType

val qedV1: Vertex = object: Vertex {
    override val type: VertexType
        get() = VertexType.Electrodynamic
    override val allowedLeptons: List<LeptonType>
        get() = listOf(LeptonType.Electron, LeptonType.AntiElectron, LeptonType.Muon, LeptonType.AntiMuon, LeptonType.Tau, LeptonType.AntiTau)
    override val allowedQuarks: List<QuarkType>
        get() = listOf(QuarkType.UpQuark, QuarkType.DownQuark)
    override val allowedBosons: List<BosonType>
        get() = TODO("Not yet implemented")

}