package core.definitions.fermion

enum class LeptonType : FermionType {
    // Leptons
    Electron,
    AntiElectron,
    ElectronNeutrino,
    AntiElectronNeutrino,

    Muon,
    AntiMuon,
    MuonNeutrino,
    AntiMuonNeutrino,

    Tau,
    AntiTau,
    TauNeutrino,
    AntiTauNeutrino,
}