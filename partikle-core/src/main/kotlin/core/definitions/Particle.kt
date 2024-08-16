package core.definitions

interface Particle {
    val name: String
    val mass: Double
    val electricCharge: ElectricCharge
//    val colorCharge: ColorCharge
    val family: Family
    val generation: Generation
}