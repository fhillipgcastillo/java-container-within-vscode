## Requirements
* Docker installed
* Installed VS code extension "*Remote Development*" by Microsoft

## Notes
* Build image
    * docker build -t fhillip:java8test .
* There are 2 ways
  * via direct docker
    * compile
      * docker run -it fhillip:java8test javac object.java
      * docker run --rm -v $PWD:/Documents -w /Documents fhillip:java8test javac object.java
    * Run
      * docker run- it fhillip:java8test java object
      * docker run --rm -v $PWD:/Documents -w /Documents fhillip:java8test java object
  * Using VS Code Remote Development extension
    * Run the run_java_object.sh will compile and run the project file
      * ./run_java_object.sh
