set TEST_JAVA_HOME=C:\Users\Jenkins\Desktop\Roland-Repo\jdk-11.0.12+7

rem compile source code
%TEST_JAVA_HOME%\bin\javac DemoApplication.java

rem run application to make sure it works
%TEST_JAVA_HOME%\bin\java DemoApplication

rem run application with additional library path
%TEST_JAVA_HOME%\bin\java -Djava.library.path="." DemoApplication
