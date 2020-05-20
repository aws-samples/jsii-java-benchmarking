# jsii-java-benchmarking

> Benchmark jsii Java module vs native counterpart

## Run benchmarks

Run the below command:

```bash
java -jar target/benchmarks.jar
```

## Results

The outputs from the run of [JMH (Java Microbenchmark Harness)](https://openjdk.java.net/projects/code-tools/jmh/) on both jsii and native implementations:

1. From an AWS Workspaces VM with 4 Cores and 8 GiB RAM running Windows 10.

|Benchmark                         |Mode  |Cnt |     Score|     Error|  Units|    •|
|----------------------------------|------|---:|---------:|---------:|-------|----:|
|MyBenchmark.jsiiImplementation    |avgt  |25  | 12555.941| ± 319.522|  us/op| [![][maven-jsii-image]][maven-jsii-url] |
|MyBenchmark.nativeImplementation  |avgt  |25  |    12.838| ±   0.200|  us/op| [![][maven-native-image]][maven-native-url] |

<details><summary>View details</summary>
<p>

```
D:\aws\jsii\jsii-java-benchmarking>java -jar target/benchmarks.jar
# JMH version: 1.23
# VM version: JDK 1.8.0_241, Java HotSpot(TM) Client VM, 25.241-b07
# VM invoker: C:\Program Files (x86)\Java\jre1.8.0_241\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: software.aws.jsiisamples.benchmarking.MyBenchmark.jsiiImplementation

# Run progress: 0.00% complete, ETA 00:16:40
# Fork: 1 of 5
# Warmup Iteration   1: 14331.834 us/op
# Warmup Iteration   2: 11911.441 us/op
# Warmup Iteration   3: 11874.760 us/op
# Warmup Iteration   4: 12013.852 us/op
# Warmup Iteration   5: 11854.685 us/op
Iteration   1: 12151.993 us/op
Iteration   2: 12169.085 us/op
Iteration   3: 11999.240 us/op
Iteration   4: 11896.771 us/op
Iteration   5: 12619.026 us/op

# Run progress: 10.00% complete, ETA 00:15:04
# Fork: 2 of 5
# Warmup Iteration   1: 14748.496 us/op
# Warmup Iteration   2: 12751.123 us/op
# Warmup Iteration   3: 12290.214 us/op
# Warmup Iteration   4: 12165.288 us/op
# Warmup Iteration   5: 12402.689 us/op
Iteration   1: 12735.736 us/op
Iteration   2: 12255.579 us/op
Iteration   3: 12506.625 us/op
Iteration   4: 12184.219 us/op
Iteration   5: 12057.108 us/op

# Run progress: 20.00% complete, ETA 00:13:24
# Fork: 3 of 5
# Warmup Iteration   1: 14530.169 us/op
# Warmup Iteration   2: 12784.111 us/op
# Warmup Iteration   3: 12980.016 us/op
# Warmup Iteration   4: 16250.559 us/op
# Warmup Iteration   5: 13489.370 us/op
Iteration   1: 12647.705 us/op
Iteration   2: 12086.489 us/op
Iteration   3: 13790.882 us/op
Iteration   4: 12784.410 us/op
Iteration   5: 12169.945 us/op

# Run progress: 30.00% complete, ETA 00:11:43
# Fork: 4 of 5
# Warmup Iteration   1: 14785.784 us/op
# Warmup Iteration   2: 12738.713 us/op
# Warmup Iteration   3: 12265.211 us/op
# Warmup Iteration   4: 12854.145 us/op
# Warmup Iteration   5: 12585.060 us/op
Iteration   1: 12663.644 us/op
Iteration   2: 12649.074 us/op
Iteration   3: 12765.451 us/op
Iteration   4: 12705.375 us/op
Iteration   5: 13248.444 us/op

# Run progress: 40.00% complete, ETA 00:10:03
# Fork: 5 of 5
# Warmup Iteration   1: 15461.000 us/op
# Warmup Iteration   2: 12900.952 us/op
# Warmup Iteration   3: 12709.827 us/op
# Warmup Iteration   4: 12919.096 us/op
# Warmup Iteration   5: 12904.040 us/op
Iteration   1: 12698.104 us/op
Iteration   2: 12587.787 us/op
Iteration   3: 12800.126 us/op
Iteration   4: 12823.234 us/op
Iteration   5: 12902.475 us/op


Result "software.aws.jsiisamples.benchmarking.MyBenchmark.jsiiImplementation":
  12555.941 ±(99.9%) 319.522 us/op [Average]
  (min, avg, max) = (11896.771, 12555.941, 13790.882), stdev = 426.553
  CI (99.9%): [12236.419, 12875.463] (assumes normal distribution)


# JMH version: 1.23
# VM version: JDK 1.8.0_241, Java HotSpot(TM) Client VM, 25.241-b07
# VM invoker: C:\Program Files (x86)\Java\jre1.8.0_241\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: software.aws.jsiisamples.benchmarking.MyBenchmark.nativeImplementation

# Run progress: 50.00% complete, ETA 00:08:22
# Fork: 1 of 5
# Warmup Iteration   1: 12.973 us/op
# Warmup Iteration   2: 13.536 us/op
# Warmup Iteration   3: 13.171 us/op
# Warmup Iteration   4: 13.581 us/op
# Warmup Iteration   5: 13.126 us/op
Iteration   1: 12.918 us/op
Iteration   2: 12.803 us/op
Iteration   3: 13.005 us/op
Iteration   4: 12.800 us/op
Iteration   5: 12.652 us/op

# Run progress: 60.00% complete, ETA 00:06:42
# Fork: 2 of 5
# Warmup Iteration   1: 12.756 us/op
# Warmup Iteration   2: 12.675 us/op
# Warmup Iteration   3: 12.593 us/op
# Warmup Iteration   4: 12.621 us/op
# Warmup Iteration   5: 12.600 us/op
Iteration   1: 12.785 us/op
Iteration   2: 12.511 us/op
Iteration   3: 12.710 us/op
Iteration   4: 12.728 us/op
Iteration   5: 12.979 us/op

# Run progress: 70.00% complete, ETA 00:05:01
# Fork: 3 of 5
# Warmup Iteration   1: 12.607 us/op
# Warmup Iteration   2: 12.794 us/op
# Warmup Iteration   3: 12.786 us/op
# Warmup Iteration   4: 12.725 us/op
# Warmup Iteration   5: 12.607 us/op
Iteration   1: 12.707 us/op
Iteration   2: 12.601 us/op
Iteration   3: 12.592 us/op
Iteration   4: 12.487 us/op
Iteration   5: 12.550 us/op

# Run progress: 80.00% complete, ETA 00:03:21
# Fork: 4 of 5
# Warmup Iteration   1: 12.660 us/op
# Warmup Iteration   2: 12.665 us/op
# Warmup Iteration   3: 12.815 us/op
# Warmup Iteration   4: 12.767 us/op
# Warmup Iteration   5: 12.750 us/op
Iteration   1: 12.846 us/op
Iteration   2: 13.267 us/op
Iteration   3: 13.070 us/op
Iteration   4: 12.877 us/op
Iteration   5: 13.449 us/op

# Run progress: 90.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 12.831 us/op
# Warmup Iteration   2: 12.883 us/op
# Warmup Iteration   3: 12.676 us/op
# Warmup Iteration   4: 12.646 us/op
# Warmup Iteration   5: 12.716 us/op
Iteration   1: 12.894 us/op
Iteration   2: 12.598 us/op
Iteration   3: 12.609 us/op
Iteration   4: 13.055 us/op
Iteration   5: 13.452 us/op


Result "software.aws.jsiisamples.benchmarking.MyBenchmark.nativeImplementation":
  12.838 ±(99.9%) 0.200 us/op [Average]
  (min, avg, max) = (12.487, 12.838, 13.452), stdev = 0.268
  CI (99.9%): [12.637, 13.038] (assumes normal distribution)


# Run complete. Total time: 00:16:45

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                         Mode  Cnt      Score     Error  Units
MyBenchmark.jsiiImplementation    avgt   25  12555.941 ± 319.522  us/op
MyBenchmark.nativeImplementation  avgt   25     12.838 ±   0.200  us/op
```

</p>
</details>

2. From a 2012 MacBook Pro with 2.3 GHz Quad-Core Intel i7 and 16GiB RAM running macOS Catalina.

|Benchmark                         |Mode  |Cnt |     Score|     Error|  Units|    •|
|----------------------------------|------|---:|---------:|---------:|-------|----:|
|MyBenchmark.jsiiImplementation    |avgt  |25  |  8788.736| ± 225.320|  us/op| [![][maven-jsii-image]][maven-jsii-url] |
|MyBenchmark.nativeImplementation  |avgt  |25  |     4.720| ±   0.046|  us/op| [![][maven-native-image]][maven-native-url] |

<details><summary>View details</summary>
<p>

```
➜ java -jar target/benchmarks.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/Users/aws/jsii-java-benchmarking/target/benchmarks.jar) to field java.io.Console.cs
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.23
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: software.aws.jsiisamples.benchmarking.MyBenchmark.jsiiImplementation

# Run progress: 0.00% complete, ETA 00:16:40
# Fork: 1 of 5
# Warmup Iteration   1: 9086.142 us/op
# Warmup Iteration   2: 8590.354 us/op
# Warmup Iteration   3: 8830.453 us/op
# Warmup Iteration   4: 8913.132 us/op
# Warmup Iteration   5: 8826.407 us/op
Iteration   1: 8759.022 us/op
Iteration   2: 8762.097 us/op
Iteration   3: 8806.527 us/op
Iteration   4: 9145.615 us/op
Iteration   5: 9315.198 us/op

# Run progress: 10.00% complete, ETA 00:15:08
# Fork: 2 of 5
# Warmup Iteration   1: 10273.856 us/op
# Warmup Iteration   2: 9612.391 us/op
# Warmup Iteration   3: 9271.182 us/op
# Warmup Iteration   4: 8765.071 us/op
# Warmup Iteration   5: 8430.183 us/op
Iteration   1: 8532.571 us/op
Iteration   2: 8577.925 us/op
Iteration   3: 8687.188 us/op
Iteration   4: 8756.423 us/op
Iteration   5: 8624.706 us/op

# Run progress: 20.00% complete, ETA 00:13:27
# Fork: 3 of 5
# Warmup Iteration   1: 8946.459 us/op
# Warmup Iteration   2: 8623.076 us/op
# Warmup Iteration   3: 8508.722 us/op
# Warmup Iteration   4: 8523.645 us/op
# Warmup Iteration   5: 8700.732 us/op
Iteration   1: 8753.885 us/op
Iteration   2: 8613.427 us/op
Iteration   3: 8546.702 us/op
Iteration   4: 8576.574 us/op
Iteration   5: 8532.791 us/op

# Run progress: 30.00% complete, ETA 00:11:46
# Fork: 4 of 5
# Warmup Iteration   1: 9000.748 us/op
# Warmup Iteration   2: 8581.723 us/op
# Warmup Iteration   3: 8556.725 us/op
# Warmup Iteration   4: 8473.837 us/op
# Warmup Iteration   5: 8592.249 us/op
Iteration   1: 8623.831 us/op
Iteration   2: 8655.819 us/op
Iteration   3: 8676.265 us/op
Iteration   4: 8730.658 us/op
Iteration   5: 8514.944 us/op

# Run progress: 40.00% complete, ETA 00:10:05
# Fork: 5 of 5
# Warmup Iteration   1: 9332.987 us/op
# Warmup Iteration   2: 8717.307 us/op
# Warmup Iteration   3: 9231.023 us/op
# Warmup Iteration   4: 9151.423 us/op
# Warmup Iteration   5: 8457.722 us/op
Iteration   1: 8525.757 us/op
Iteration   2: 8896.765 us/op
Iteration   3: 9027.845 us/op
Iteration   4: 9439.887 us/op
Iteration   5: 9635.977 us/op


Result "software.aws.jsiisamples.benchmarking.MyBenchmark.jsiiImplementation":
  8788.736 ±(99.9%) 225.320 us/op [Average]
  (min, avg, max) = (8514.944, 8788.736, 9635.977), stdev = 300.795
  CI (99.9%): [8563.416, 9014.056] (assumes normal distribution)


# JMH version: 1.23
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: software.aws.jsiisamples.benchmarking.MyBenchmark.nativeImplementation

# Run progress: 50.00% complete, ETA 00:08:24
# Fork: 1 of 5
# Warmup Iteration   1: 4.888 us/op
# Warmup Iteration   2: 4.691 us/op
# Warmup Iteration   3: 4.679 us/op
# Warmup Iteration   4: 4.688 us/op
# Warmup Iteration   5: 4.703 us/op
Iteration   1: 4.694 us/op
Iteration   2: 4.672 us/op
Iteration   3: 4.646 us/op
Iteration   4: 4.685 us/op
Iteration   5: 4.692 us/op

# Run progress: 60.00% complete, ETA 00:06:43
# Fork: 2 of 5
# Warmup Iteration   1: 4.865 us/op
# Warmup Iteration   2: 4.759 us/op
# Warmup Iteration   3: 4.712 us/op
# Warmup Iteration   4: 4.726 us/op
# Warmup Iteration   5: 4.750 us/op
Iteration   1: 4.750 us/op
Iteration   2: 4.733 us/op
Iteration   3: 4.787 us/op
Iteration   4: 4.722 us/op
Iteration   5: 4.740 us/op

# Run progress: 70.00% complete, ETA 00:05:02
# Fork: 3 of 5
# Warmup Iteration   1: 4.915 us/op
# Warmup Iteration   2: 4.784 us/op
# Warmup Iteration   3: 4.770 us/op
# Warmup Iteration   4: 4.767 us/op
# Warmup Iteration   5: 4.788 us/op
Iteration   1: 4.776 us/op
Iteration   2: 4.750 us/op
Iteration   3: 4.894 us/op
Iteration   4: 4.733 us/op
Iteration   5: 4.670 us/op

# Run progress: 80.00% complete, ETA 00:03:21
# Fork: 4 of 5
# Warmup Iteration   1: 4.712 us/op
# Warmup Iteration   2: 4.785 us/op
# Warmup Iteration   3: 4.974 us/op
# Warmup Iteration   4: 4.647 us/op
# Warmup Iteration   5: 4.698 us/op
Iteration   1: 4.639 us/op
Iteration   2: 4.653 us/op
Iteration   3: 4.658 us/op
Iteration   4: 4.645 us/op
Iteration   5: 4.637 us/op

# Run progress: 90.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 4.950 us/op
# Warmup Iteration   2: 4.769 us/op
# Warmup Iteration   3: 4.752 us/op
# Warmup Iteration   4: 4.747 us/op
# Warmup Iteration   5: 4.749 us/op
Iteration   1: 4.766 us/op
Iteration   2: 4.754 us/op
Iteration   3: 4.778 us/op
Iteration   4: 4.766 us/op
Iteration   5: 4.770 us/op


Result "software.aws.jsiisamples.benchmarking.MyBenchmark.nativeImplementation":
  4.720 ±(99.9%) 0.046 us/op [Average]
  (min, avg, max) = (4.637, 4.720, 4.894), stdev = 0.062
  CI (99.9%): [4.674, 4.767] (assumes normal distribution)


# Run complete. Total time: 00:16:47

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                         Mode  Cnt     Score     Error  Units
MyBenchmark.jsiiImplementation    avgt   25  8788.736 ± 225.320  us/op
MyBenchmark.nativeImplementation  avgt   25     4.720 ±   0.046  us/op
```


</p>
</details>

P.S: Thanks to [the detailed reference](http://tutorials.jenkov.com/java-performance/jmh.html) on implementing the benchmarking harness,

## License

This library is licensed under the MIT-0 License. See the LICENSE file.

[maven-jsii-image]: https://img.shields.io/maven-central/v/software.aws.jsiisamples.jsii/jsii-code-samples
[maven-jsii-url]: https://search.maven.org/artifact/software.aws.jsiisamples.jsii/jsii-code-samples
[maven-native-image]: https://img.shields.io/maven-central/v/software.aws.jsiisamples.java/jsii-native-java
[maven-native-url]: https://search.maven.org/artifact/software.aws.jsiisamples.java/jsii-native-java/
