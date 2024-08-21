package core.utils

import core.definitions.fermion.FermionType
import core.definitions.fermion.LeptonType
import core.definitions.fermion.QuarkType

val allFermions: List<FermionType> = listOf(
    // Leptons
    LeptonType.Electron,
    LeptonType.ElectronNeutrino,
    LeptonType.Muon,
    LeptonType.MuonNeutrino,
    LeptonType.Tau,
    LeptonType.TauNeutrino,

    // Anti-Leptons
    LeptonType.AntiElectron,
    LeptonType.AntiElectronNeutrino,
    LeptonType.AntiMuon,
    LeptonType.AntiMuonNeutrino,
    LeptonType.AntiTau,
    LeptonType.AntiTauNeutrino,

    // Quarks
    QuarkType.Up,
    QuarkType.Down,
    QuarkType.Charm,
    QuarkType.Strange,
    QuarkType.Top,
    QuarkType.Bottom,

    // Anti-Quarks
    QuarkType.AntiUp,
    QuarkType.AntiDown,
    QuarkType.AntiCharm,
    QuarkType.AntiStrange,
    QuarkType.AntiTop,
    QuarkType.AntiBottom,
)

val allFermionsInQED: List<FermionType> = listOf(
    LeptonType.Electron,
    LeptonType.Muon,
    LeptonType.Tau,
    QuarkType.Up,
    QuarkType.Down,
    QuarkType.Charm,
    QuarkType.Strange,
    QuarkType.Top,
    QuarkType.Bottom,
)

val allFermionsInQCD: List<FermionType> = listOf(
    // Quarks
    QuarkType.Up,
    QuarkType.Down,
    QuarkType.Charm,
    QuarkType.Strange,
    QuarkType.Top,
    QuarkType.Bottom,

    // Anti-Quarks
    QuarkType.AntiUp,
    QuarkType.AntiDown,
    QuarkType.AntiCharm,
    QuarkType.AntiStrange,
    QuarkType.AntiTop,
    QuarkType.AntiBottom,
)