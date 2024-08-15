package core.definitions

interface Particle {
    val name: String
    val mass: Double
    val charge: Double
    val family: Family
    val generation: Generation
}