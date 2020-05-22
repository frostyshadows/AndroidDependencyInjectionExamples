## Performance measurements
Using [this Android Injection Performance project](https://github.com/Sloy/android-dependency-injection-performance)

#### Fib12 results
~300 injections

Library     | Setup Kotlin | Setup Java | Inject Kotlin | Inject Java
------------| ------------:| ----------:| -------------:| -----------:
**Dagger**  | 0.00 ms      | 0.00 ms    | 0.03 ms       | 0.03 ms
**Koin**    | 1.79 ms      | 1.71 ms    | 0.16 ms       | 0.18 ms
**Kodein**  | 3.17 ms      | 3.22 ms    | 0.42 ms       | 0.42 ms
