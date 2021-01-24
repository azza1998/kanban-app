# KanbanSpring

Full Stack Kanban App to create your account and organize your cards, move card to another column and upload your attachments.

## Getting Started

### Prerequisites

What things you need to install the software and how install them

* Install Node.js
* Install MongoDB
* Install Java 11 (This project I use AdoptOpenJdk)
* install Angular CLI: 9.1.0
  * Run npm install -g @angular/cli to install Globally or npm install @angular/cli to install locally. To install Install Specific Version (Example: 9.1.0) npm install -g @angular/cli@9.1.0.

### Installing

* Clone this project repository
* Run ```mongod``` to start mongoDB
* Run ```mvnw clean install && mvnw spring-boot:run``` in the folder ```kanbanSpringServer``` to start in localhost:8080
* Run ```npm install && npm start --open``` in the folder ```kanbanSpringApp``` to open the project automatically in the url ```http://localhost:4200```
  * ```npm start``` run ng serve will start with proxy config, where "target" is spring boot localhost:8080.

![Kanban](assets/kanban.gif)

## Deployment

Instructions how to install **Docker** on [Ubuntu](https://docs.docker.com/install/linux/docker-ce/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/).

How to run it?

Execute this command in a terminal:

* ```docker-compose build``` - Build the image.
* ```docker-compose up``` - Starts the containers.
* ```docker-machine ip default``` - Get docker host ip address.
* To access use ```http://localhost:4200/``` or ```http://<docker host ip address>:4200/```

## Built With

### kanbanSpringClient - Front-End

* Angular CLI: 9.1.0
* Node: 12.2.0
* MongoDB: 4.2.3
* Java 11(AdoptOpenJdk)
* Angular FlexLayout: 9.0.0-beta.29
* Angular Material: 9.2.4
* ngx-spinner: 9.0.2
* ng2-file-upload: 1.4.0

### kanbanSpringServer - Back-End

* spring-boot-starter-parent: 2.3.0
* spring-boot-starter-data-mongodb
* spring-boot-starter-security
* spring-boot-starter-web
* spring-boot-starter-validation
* spring-boot-devtools
* jjwt:0.9.1
* lombok:1.8.2

## Features

* Authentication using JWT in Spring Boot.
* Change your password,email,name, set cover image to your account.
* Move Columns position.
* Move Cards position.
* Move Card to another column.
* Upload attachments for your card.
* To do delombok use this command in folder kanbanSpringServer `mvnw lombok:delombok -Pdlombok`
  * The output will be `\target\generated-sources\delombok\`

## Contributing

1. Clone this repository.
1. Make a new branch.
1. Commit and push your changes.
1. Create a Pull Request.

## Authors

* **Braian Silva** - [Twitter](https://twitter.com/braiancode) - [Gmail](mailto:braiannogueirasilva@gmail.com)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

Copyright (c) 2020 **Braian Silva**
