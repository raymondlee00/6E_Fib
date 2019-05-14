/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n <= 2) {
          return 1;
        } else {
          return fib_recurrence(n-1) + fib_recurrence(n-2);
        }
    }
     /* These are class methods because this class does not create instances for which instance methods can applied.
     Also, calculating the nth term of the Fibonacci sequence is not particular to any one instance—it is a general
     computation that is central to the class itself.
    */
    /* Time complexity:
       Consider the size of the problem to be increasing without bound

       As the proxy for the time required, count the invocations

       Then cost of the grade8 algorithm
       grows exponentially
       as the size of the problem increases,
       because the cost is F(n - 1) + F(n - 2) + 2, where function F denotes the call stack for finding the nth term of
       the Fibonacci sequence
     */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      if (n <= 2) {
        return 1;
      } else {
        int fib0 = 1;
        int fib1 = 1;
        int dummy;
        for (int i = 0; i < n - 2; i++) {
          dummy = fib0;
          fib0 = fib1;
          fib1 += dummy;
        }
        return fib1;
      }
    }
    /* Time complexity:
       Consider the size of the problem to be increasing without bound

       As the proxy for the time required, count...

       Then cost of the grade8 algorithm
       grows linearly
       as the size of the problem increases,
       because the cost is only in the iteration. Since reassigning of variables takes constant in each iteration,
       the # of times to iterate this process is the operation I am counting as a proxy for the time the algo requires.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1.0 + Math.sqrt(5)) / 2;
        double psi = 1 - phi;
        return (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be increasing without bound

       As the proxy for the time required, count the computations

       Then cost of the binet algorithm
       grows at a constant rate
       as the size of the problem increases,
       because the algo is just doing arithmetic and these computations take constant time.
     */
}
