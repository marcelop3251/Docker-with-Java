# Docker-with-Java

### A project to demonstrated how we can started docker development.

### A project to demonstrated how we can started docker development.

## Tecnologies

This projet uses Docker, Java 8, eclipse and Git.

### Getting Started

- Install Docker Community Edition (CE) on your machine.
Details of how to install can be found here https://docs.docker.com/install/


After of install clone this project at your machine local.

This tutorial was development in machine linux, Ubuntu 18

At root of your project run the following command.

**docker build -f eclipse.dockerfile -t {your-user-docker}/java8-eclipse .**

This command will create one image with Java 8, Eclipse and git. This can take a long time.

- Allow SO to listen and connect to host X server
Linux: sudo xhost +

Now we going to build container

 **docker run --name eclipse -e DISPLAY=$DISPLAY -v "/tmp/.X11-unix:/tmp/.X11-unix" -v "{directory_for_volume}:/root/workspace" --network host -d {your-user-docker}/java8-eclipse**
 
wether all it is ok, so you can see the Eclipse starting. Select the directory /root/workspace and clone this project and import the project java into the directory Docker/java/. Now you can edited into the container :)

- Running the application
This appication utilize how database the postgres, so we going to build postgres container.

**docker run --name postgres -e POSTGRES_PASSWORD=654321 -e POSTGRES_USER=docker-java -e POSTGRES_DB=docker-java -p 5432:5432 --network host -v "directory_for_volume:/var/lib/postgresql/data" postgres**

Into of file **application.properties** change string of connection with database for **jdbc:postgresql://localhost:5432/docker-java**. Execute the application and wether all it is ok, so you have an API-REST working for you throught of container in localhost:8080.

## What more we can do with docker?

For demostrate the power what have with docker, we create the following system.

### Architecture

![system](https://github.com/marcelop3251/Docker-with-Java/blob/master/architecture.png)

- Install docker-compose on your machine

Details of how to install can be found here. https://docs.docker.com/compose/install/

At root of your project, into the directory Docker,running the following command.
- docker-compose build for created images
- docker-compose up for to go up the container

Acess in your machine the folowwing addres
http://localhost for register user.
http://localhost/list-users.html for user list registered

I hope you enjoyed :)
