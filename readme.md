build image
    docker build -t fhillip:java8 .
compile
    docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 javac JavaFile.java
Run
    docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 java Main