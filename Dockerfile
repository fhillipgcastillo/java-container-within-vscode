From openjdk:8-jdk-alpine
MAINTAINER Fhillip Castillo gerson.fhillip@gmail.com

WORKDIR /Documents
copy object.java .
run ["chmod", "+x", "run_java_object.sh"]
RUN ["ls", "-al"]
# CMD ["javac", "object.java"]
# "java object"