build image
    docker build -t fhillip:java8test .
compile
    docker run --rm -v $PWD:/Documents -w /Documents fhillip:java8test javac JavaFile.java
Run
    docker run --rm -v $PWD:/Documents -w /Documents fhillip:java8test java Main