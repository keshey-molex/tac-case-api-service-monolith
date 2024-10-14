
# Dockerize Client API Demo

## Table of Contents
[Run it from DockerHub](#run-it-from-dockerhub)

[Docker Build Instructions (Ubuntu)](#ubuntu-instructions)
   1. [Making sure the OS is up to date](#making-sure-the-os-is-up-to-date)
   2. [Install Java 21 JDK](#install-java-21-jdk)
   3. [Install Maven](#install-maven)
   4. [Install Docker](#install-docker)
   5. [Install Git and Curl](#install-git-and-curl)
   6. [Clone the Repo](#clone-the-repo)
   7. [Build the Container](#build-the-container)
   8. [Now Run it](#now-run-it)
   9. [Try it out](#try-it-out)
   10. [Swagger: API Documentation](#swagger-api-documentation)


## Run it from DockerHub
```
docker pull pbranestrategy/client-api-demo:0.0.3
docker run -p 8080:8080 pbranestrategy/client-api-demo:0.0.3
```

#### On MacOS
```
docker run --privileged -m 1g --cpus="2.0" -p 8080:8080 pbranestrategy/client-api-demo:latest
```

## Ubuntu Instructions

### Making sure the OS is up to date
```
$ sudo apt update
$ sudo apt upgrade -y
```

### Install Java 21 JDK
```
$ sudo add-apt-repository ppa:openjdk-r/ppa
$ sudo apt install openjdk-21-jdk -y
```

### Install Maven
```
$ sudo apt install maven -y
```

### Install Docker
```
$ sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common
$ curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add - \
$ sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
$ sudo usermod -aG docker $USER
$ sudo systemctl start docker
```

### Install Git and Curl
```
$ sudo apt install git curl wget -y
```

### Clone the Repo
```
$ mkdir -p development/src/molex
$ cd development/src/molex
$ git clone https://github.com/pbrane/client-api-demo.git
```

### Build the Container
```
$ cd client-api-demo/
$ ./mvnw clean
$ docker build -t client-api-demo .
```

### Now Run it
```
$ docker run -p 8080:8080 client-api-demo
```

### Try it out:
```
$ curl -X 'GET' 'http://localhost:8080/api/v1/tacCases/CN004' -H 'accept: */*'
```

#### Swagger: API Documentation
http://localhost:8008/swagger-ui.html
