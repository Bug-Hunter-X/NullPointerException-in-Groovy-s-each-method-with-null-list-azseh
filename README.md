# Groovy NullPointerException in 'each' Method

This repository demonstrates a common yet subtle error in Groovy: a `NullPointerException` occurring when using the `each` method with a null list.

The issue arises because Groovy's `each` method does not explicitly handle null input.  When a null list is passed, a `NullPointerException` is thrown.

**Problem:** The `bug.groovy` file shows how a simple call to `each` on a potentially null list can cause a program crash.

**Solution:** The `bugSolution.groovy` file shows a safe way to handle this by using the `?` safe navigation operator or an explicit null check.