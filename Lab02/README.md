# WIX1002 - Lab 2

Matric number: **26068372**

## Programs

| File | Task |
| --- | --- |
| `l2q1/L2Q1.java` | Fahrenheit to Celsius |
| `l2q2/L2Q2.java` | Monthly car-loan payment |
| `l2q3/L2Q3.java` | Three random integers, sum and average |
| `l2q4/L2Q4.java` | Convert seconds to hours, minutes and seconds |
| `l2q5/L2Q5.java` | A random number and the sum of its digits |
| `l2q6/L2Q6.java` | Energy needed to heat water |
| `formatting/PrintfFormats.java` | The same number in 15 printf formats |

For Question 6, the sample run asks for grams and Fahrenheit. The program
converts these inputs to kilograms and Celsius before applying the formula.

## Run

From this Lab02 directory, compile the programs:

```sh
javac -d build l2q*/L2Q*.java formatting/PrintfFormats.java
```

Run an individual program, for example:

```sh
java -cp build l2q1.L2Q1
java -cp build formatting.PrintfFormats
```

## Printf task

The formatting program passes the same `double` value, `1234.56789`,
to every numbered printf statement. Its output includes the matric number.
The bars around each result show the padding spaces.

| Format | Effect |
| --- | --- |
| `%f` | Fixed-point notation with six decimal places |
| `%.0f` | Round to zero decimal places |
| `%.1f` | One decimal place |
| `%.2f` | Two decimal places |
| `%.4f` | Four decimal places |
| `%15.2f` | Align right within a width of 15 |
| `%-15.2f` | Align left within a width of 15 |
| `%015.2f` | Pad with zeros to a width of 15 |
| `%+.2f` | Include the plus sign |
| `%,.2f` | Use a thousands separator |
| `%e` | Scientific notation |
| `%.3e` | Scientific notation with three decimal places |
| `%E` | Scientific notation with an uppercase E |
| `%.3g` | Three significant digits in general notation |
| `%a` | Hexadecimal floating-point notation |

`formatting/26068372_printf_output.png` contains the program's output.
