https://www.scala-js.org/libraries/libs.html
http://www.lihaoyi.com/hands-on-scala-js/

### how to use java script libraries? 
???

### aws javascript library
https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/sqs-examples.html

### how to configure app ?
???


Some of the examples can be run from intellij, for `httpCallExample` I get 
```
Exception in thread "main" java.lang.Error: A method defined in a JavaScript raw type of a Scala.js library has been called. This is most likely because you tried to run Scala.js binaries on the JVM. Make sure you are using the JVM version of the libraries.
```
I didnt find out how to correctly specify a `MainModuleInitializer`
```
No main module initializer was specified (possibly because no or multiple main classes were found), but scalaJSUseMainModuleInitializer was set to true. You can explicitly specify it either with `mainClass := Some(...)` or with `scalaJSMainModuleInitializer := Some(...)`
```
putting the path to the main class i want doesn't seem to work so I just commented out all main classes but the one I want to run or run it in intellij if possible.