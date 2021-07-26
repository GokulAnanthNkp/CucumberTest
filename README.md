# CreditCard Cucumber

Credit Card_Cucumber test
------------

To skip the tests via the command line by executing the following command:
------------
mvn install -DskipTests


If you absolutely must, you can also use the maven.test.skip property to skip compiling the tests.
------------
maven.test.skip is honored by Surefire, Failsafe and the Compiler Plugin.

mvn install -Dmaven.test.skip=true