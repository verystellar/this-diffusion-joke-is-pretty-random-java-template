package org.example.jmh;

import org.example.Diffusion;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 2, time = 5)
@Measurement(iterations = 3, time = 5)
public class SampleBenchmark {
    @Benchmark
    @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
    public void simulate_10_walks(Blackhole bh) {
        Diffusion generator = new Diffusion();
        int gen = generator.simulate(2);
        bh.consume(gen);
  }
    @Benchmark
    @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
    public void simulate_50_walks(Blackhole bh) {
        Diffusion generator = new Diffusion();
        int gen = generator.simulate(50);
        bh.consume(gen);
    }
    @Benchmark
    @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
    public void simulate_100_walks(Blackhole bh) {
        Diffusion generator = new Diffusion();
        int gen = generator.simulate(100);
        bh.consume(gen);
    }
    @Benchmark
    public void simulate_500_walks(Blackhole bh) {
        Diffusion generator = new Diffusion();
        int gen = generator.simulate(500);
        bh.consume(gen);
    }

}
