// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package software.aws.jsiisamples.benchmarking;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

public class MyBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void jsiiImplementation(Blackhole blackhole) {
        // create a new instance of the `HelloWorld` class
        software.aws.jsiisamples.jsii.HelloWorld helloWorld =
                new software.aws.jsiisamples.jsii.HelloWorld();

        // call `sayHello`
        blackhole.consume(helloWorld.sayHello("World"));

        // call `fibonacci` for numbers 0 to 25
        int i = 0;
        while (i <= 25) {
            blackhole.consume(helloWorld.fibonacci(i));
            i++;
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void nativeImplementation(Blackhole blackhole) {
        // create a new instance of the `HelloWorld` class
        software.aws.jsiisamples.java.HelloWorld helloWorld =
                new software.aws.jsiisamples.java.HelloWorld();

        // call `sayHello`
        blackhole.consume(helloWorld.sayHello("World"));

        // call `fibonacci` for numbers 0 to 25
        int i = 0;
        while (i <= 25) {
            blackhole.consume(helloWorld.fibonacci(i));
            i++;
        }
    }

}
