package org.example

import kotlinx.benchmark.*

@State(Scope.Benchmark)
open class FaultyBenchmark {
    @Benchmark
    fun faulty() {
        throw RuntimeException()
    }

    @Benchmark
    fun thisOneIsNoBetter() {
        throw RuntimeException()
    }

    @Benchmark
    fun butThatOneIsFine() = 0
}
