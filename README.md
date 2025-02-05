# Dead Code After Exception Handling in Java

This repository demonstrates a subtle bug in Java related to dead code after exception handling.  The `UncommonBug.java` file contains code that throws an `ArithmeticException` and then has a `println` statement that might never be reached.

The `UncommonBugSolution.java` file provides a corrected version.

This example highlights the importance of carefully considering code flow after exception handling blocks.  Dead code can introduce unexpected behavior or hide logic errors.