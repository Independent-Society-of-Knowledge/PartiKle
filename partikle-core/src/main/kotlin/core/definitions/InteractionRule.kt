package core.definitions

typealias InteractionRule = Pair<Particle, Particle>.() -> Boolean

fun main() {
    val electron = object: Particle {
        override val mass: Double
            get() = 0.510999
        override val charge: Double
            get() = -1.0
        override val generation: Generation
            get() = Generation.First

    }

    val muon     = object: Particle {
        override val mass: Double
        get() = 0.510999
        override val charge: Double
        get() = -1.0
        override val generation: Generation
        get() = Generation.Second
    }



}