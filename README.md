# Microservices with Spring Boot 3 and Spring Cloud, Third Edition
This is the code repository for [Microservices with Spring Boot 3 and Spring Cloud, Third Edition](https://www.amazon.com/Microservices-Spring-Boot-Cloud-microservices/dp/1805128698), published by Packt.

**Build resilient and scalable microservices using Spring Cloud, Istio, and Kubernetes**

The author of this book is -[Magnus Larsson](https://www.linkedin.com/in/magnuslarssoncallista/?originalSubdomain=se)

## About the book
Looking to build and deploy microservices but not sure where to start? Check out Microservices with Spring Boot 3 and Spring Cloud, Third Edition.
With a practical approach, you'll begin with simple microservices and progress to complex distributed applications. Learn essential functionality and deploy microservices using Kubernetes and Istio.
This book covers Java 17, Spring Boot 3, and Spring Cloud 2022. Java EE packages are replaced with the latest Jakarta EE packages. Code examples are updated and deprecated APIs have been replaced, providing the most up to date information. Gain knowledge of Spring's AOT module, observability, distributed tracing, and Helm 3 for Kubernetes packaging.
Start with Docker Compose to run microservices with databases and messaging services. Progress to deploying microservices on Kubernetes with Istio. Explore persistence, resilience, reactive microservices, and API documentation with OpenAPI. Learn service discovery with Netflix Eureka, edge servers with Spring Cloud Gateway, and monitoring with Prometheus, Grafana, and the EFK stack.
By the end, you'll build scalable microservices using Spring Boot and Spring Cloud.

## Key Takeaways
- Build reactive microservices using Spring Boot
- Develop resilient and scalable microservices using Spring Cloud
- Use OAuth 2.1/OIDC and Spring Security to protect public APIs
- Implement Docker to bridge the gap between development, testing, and production
- Deploy and manage microservices with Kubernetes
- Apply Istio for improved security, observability, and traffic management
- Write and run automated microservice tests with JUnit, test containers, Gradle, and bash
- Use Spring AOT and GraalVM to native compile the microservices
- Use Micrometer Tracing for distributed tracing

## Try out new versions

If you want to try out the source code of this book with newer versions of Spring, Java, Kubernetes, and Istio than used in the book, you can take a look at the following blog posts:

1. [Upgrade to Spring Boot 3.1](https://callistaenterprise.se/blogg/teknik/2023/10/18/microservices-upgrade-to-SpringBoot31/) (published 10 October 2023)
1. [Upgrade to Spring Boot 3.2 and Java 21](https://callistaenterprise.se/blogg/teknik/2024/06/03/microservices-upgrade-to-SpringBoot32/) (published 3 June 2024)
1. [Faster startup with Spring Boot 3.2 and CRaC, part 1 - Automatic checkpoint](https://callistaenterprise.se/blogg/teknik/2024/07/01/SpringBoot-with-CRaC-part1-automatic-checkpoint/) (published 1 July 2024)

## Errata

* **Chapters 4 - 23**

  The deprecated CLI command `docker-compose` (v1) has been replaced with with `docker compose` (v2) in the test script `test-em-all.bash`. For more information, see [Docker docs on how to migrate to Compose V2](https://docs.docker.com/compose/migrate/#:~:text=From%20July%202023%20Compose%20V1,supported%20versions%20of%20Docker%20Desktop).

* **Page 51**, section *Using Spring Initializr to generate skeleton code*:

  Spring Boot 3.0.x is no longer available for use by Spring Initializr. For updated instructions on how to use Spring Initializr with Spring Boot 3.1, see [Upgrade to Spring Boot 3.1](https://callistaenterprise.se/blogg/teknik/2023/10/18/microservices-upgrade-to-SpringBoot31/).

* **Page 81**, section *Running our first Docker commands*: 

  The sentence: *We can leave the container with an exit command and verify that the Ubuntu container no longer **exits** with the docker ps -a command.*  

  Should be: *We can leave the container with an exit command and verify that the Ubuntu container no longer **exists** with the docker ps -a command.*
  
* **Page 89**, section *Building a Docker image*: 

  The sentence: *Docker will use the Dockerfile in the current directory to build **Docker Engine**.*  

  Should be: *Docker will use the Dockerfile in the current directory to build **the Docker image**.*  

* **Page 173**, section *Non-blocking REST APIs in the composite services*: 

  The sentence: *Change the service implementation so it calls the **coreata** services’ APIs in parallel and in a non-blocking way*  

  Should be: *Change the service implementation so it calls the **core** services’ APIs in parallel and in a non-blocking way*  

* **Page 603**, Chapter 21, *Installation Instructions for macOS*, section *Post-installation actions*.

  The following post-installation instruction is missing:

  Ensure that the option *Allow the default Docker socket to be used (requires password)* is selected. This option will create a symlink for the Docker socket at `/var/run/docker.sock`. If this option is not enabled, running tests with Test Containers will fail with error messages like:

  ```
  Caused by: java.lang.IllegalStateException: Could not find a valid Docker environment. Please see logs and check configuration
  ```

  The symlink can also be installed using the following command:

  ```
  sudo ln -s ~/.docker/run/docker.sock /var/run/docker.sock
  ```

  For more information, see: 
  1. <https://docs.docker.com/desktop/settings/mac/#advanced-1>
  2. <https://docs.docker.com/desktop/mac/permission-requirements/#installing-symlinks>

* **Page 611**, section *Installing WSL 2 together with a default Ubuntu server*.

  The install command for WSL 2 is incorrect, missing a hyphen; it should be:

  ```
  wsl --install
  ```

## Outline and Chapter Summary
This book is about building production-ready microservices using Spring Boot 3 and Spring Cloud. This book primarily covers Spring Boot, Spring Cloud, Docker, Kubernetes, Istio, the EFK stack, Prometheus, and Grafana. Each of these open source tools works great by itself, but it can be challenging to understand how to use them together in an advantageous way. In some areas, they complement each other, but in other areas they overlap, and it is not obvious which one to choose for a particular situation.
This is a hands-on book that describes step by step how to use these open source tools together. This is the book I was looking for ten years ago when I started to learn about microservices, but with updated versions of the open source tools it covers.

1.  Introduction to Microservices
2.  Introduction to Spring Boot
3.  [Creating a Set of Cooperating Microservices](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter03)
4.  [Deploying Our Microservices Using Docker](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter04)
5.  [Adding an API Description Using OpenAPI](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter05)
6.  [Adding Persistence](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter06)
7.  [Developing Reactive Microservices](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter07)
8.  Introduction to Spring Cloud
9.  [Adding Service Discovery Using Netflix Eureka](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter09)
10. [Using Spring Cloud Gateway to Hide Microservices behind an Edge Server](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter10)
11. [Securing Access to APIs](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter11)
12. [Centralized Configuration](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter12)
13. [Improving Resilience Using Resilience4j](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter013)
14. [Understanding Distributed Tracing](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter14)
15. [Introduction to Kubernetes](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter15)
16. [Deploying Our Microservices to Kubernetes](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter16)
17. [Implementing Kubernetes Features to Simplify the System Landscape](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter17)
18. [Using a Service Mesh to Improve Observability and Management](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter18)
19. [Centralized Logging with the EFK Stack](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter19)
20. [Monitoring Microservices](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter20)
21. Installation Instructions for macOS
22. Installation Instructions for Microsoft Windows with WSL 2 and Ubuntu
23. [Native Compiled Java Microservices](https://github.com/PacktPublishing/Microservices-with-Spring-Boot-and-Spring-Cloud-Third-Edition/tree/main/Chapter23)

### Chapter 01, Introduction to Microservices
The introductory chapter of the book delves into the realm of microservices, presenting a comprehensive overview of the fundamental concepts and design patterns inherent to this architectural approach. Rather than uncritically extolling the virtues of microservices, the chapter strives to elucidate how one can harness their advantages while effectively navigating the intricacies of constructing microservices that are scalable, resilient, and easily manageable. The opening section outlines key subjects encompassed within the chapter, including the author's personal journey into microservices, an elucidation of microservice-based architecture, identification of the challenges entailed therein, strategies for countering these challenges through purposeful design patterns, and exploration of software tools that facilitate adept management of these hurdles. Additionally, the chapter briefly alludes to pertinent factors of consideration that lie outside the book's purview.
In summary, this inaugural chapter of the book serves as a primer on microservices, elucidating both their potential benefits and the pragmatic techniques to confront the complexities intrinsic to their implementation. It offers readers a structured introduction to the realm of microservices, encompassing insights into architecture, challenges, design patterns, and tools, while maintaining a balanced perspective on their utility and challenges.

**Key Insights**:.
- The chapter adopts a balanced stance towards microservices, focusing on their advantages while acknowledging the challenges they pose in terms of scalability, resilience, and management.
- Readers gain an understanding of core microservices concepts, including their architecture, design patterns, and software enablers.
- The author's personal journey into microservices offers a relatable entry point for readers, highlighting real-world experiences and motivations.
- The chapter underscores the challenges inherent in microservices, such as complexity, communication, and maintenance issues.
- It introduces readers to essential design patterns that address the identified challenges, aiding in the creation of effective and manageable microservices systems.
- Practical insights are provided on how to leverage microservices' benefits while mitigating potential pitfalls.
- Readers are introduced to software tools that can assist in managing and overcoming microservices challenges.
- The chapter acknowledges certain considerations beyond its coverage, providing a holistic perspective on the complexities of microservices implementation.


### Chapter 02, Introduction to Spring Boot
The "Introduction to Spring Boot" chapter offers readers an initial immersion into Spring Boot 3 and the constellation of open-source tools integral to the book's initial segment. The chapter delineates the ensemble of technologies that will be utilized, including Spring WebFlux for building RESTful APIs, springdoc-openapi for generating OpenAPI-based documentation, Spring Data for database interaction (SQL and NoSQL), Spring Cloud Stream for message-based microservices, and Docker for containerized deployment of microservices. The subsequent focal point involves crafting a series of cooperative microservices using Spring Boot, with an emphasis on delivering tangible business value. While acknowledging the challenges tied to microservices, the chapter primarily focuses on functionality development, saving deeper challenge exploration for forthcoming sections. The narrative pivots towards the creation of microservices housing business logic founded on Spring Beans, which are exposed through REST APIs facilitated by Spring WebFlux. The OpenAPI Specification underpins API documentation via springdoc-openapi, while data persistence is achieved using Spring Data with compatibility across SQL and NoSQL databases. To accommodate reactive microservices and asynchronous message-based services, Spring Cloud Stream comes into play. The chapter culminates with the integration of Docker, enabling the orchestration of microservices, including databases and message brokers, through a unified command.
In essence, the chapter functions as an orientation to Spring Boot 3 and the associated technologies that underpin the book's opening section. It introduces the pivotal tools that will be harnessed for building microservices, highlighting their individual roles within the development landscape. The narrative sets the stage for constructing functional microservices with an outlook on business value, while also alluding to forthcoming chapters that will delve deeper into the multifaceted challenges of microservices.

**Key Insights**:
- The chapter provides an overview of essential open-source tools and technologies, including Spring WebFlux, springdoc-openapi, Spring Data, Spring Cloud Stream, and Docker. It highlights their significance in building and deploying microservices.
- Readers are introduced to Spring Boot 3, its release in November 2022, and its compatibility with Spring Framework 6.0 and Jakarta EE 9. The importance of Java 17 as the minimum required version is emphasized.
- The chapter emphasizes the development of cooperative microservices using Spring Boot, with a central focus on delivering practical business value through functional capabilities.
- While addressing microservices challenges to some extent, the chapter primarily concentrates on the development process, postponing a deeper exploration of challenges to later chapters.
- The chapter outlines the creation of microservices with business logic constructed using plain Spring Beans, fostering a modular and maintainable approach.
- Spring WebFlux is introduced as a tool for exposing REST APIs, with springdoc-openapi enabling the generation of comprehensive OpenAPI-based documentation for the APIs.
- Spring Data's role in facilitating data storage in both SQL and NoSQL databases is highlighted, showcasing its versatility in adapting to various data management requirements.
- The narrative introduces Spring Cloud Stream for building message-based microservices, offering insights into the development of reactive and asynchronous services.
- Docker is introduced as a means to run microservices as containers, streamlining the process of starting, stopping, and orchestrating the microservice landscape.
- The chapter encourages readers to delve briefly into the distinct characteristics and purposes of each introduced technology, setting the stage for their practical application in subsequent chapters.


### Chapter 03, Creating a Set of Cooperating Microservices 
The "Creating a Set of Cooperating Microservices" chapter is a practical guide to crafting a collaborative set of microservices from scratch. Employing Spring Initializr, the chapter navigates readers through the creation of initial project structures rooted in Spring Framework 6.0 and Spring Boot 3.0. The focus revolves around establishing three foundational core services, each responsible for managing distinct resources, alongside a composite service orchestrating these core elements to produce a unified composite outcome. As the chapter progresses, readers are introduced to the basics of implementing RESTful APIs through Spring WebFlux. While these microservices begin with minimalistic functionality, subsequent chapters promise progressive augmentation of their capabilities.
This chapter is an experiential journey into constructing and coordinating microservices. Through hands-on implementation, readers gain insights into the orchestration of these microservices, gradually expanding their functionalities. The pinnacle of this chapter is the creation of a composite microservice that leverages RESTful APIs of the core microservices to generate a comprehensive aggregated response. The chapter encompasses diverse topics including landscape introduction, project skeleton generation, RESTful API incorporation, composite microservice integration, error handling, manual API testing, isolated microservice automated testing, and semi-automated testing of the complete microservice landscape.

**Key Insights**:
- The chapter offers a hands-on approach to building a collaborative ecosystem of microservices, starting from the ground up and utilizing Spring Initializr for project scaffolding.
- Readers are introduced to the concept of core microservices, each managing specific resources, and a composite service that orchestrates these core services to produce a unified outcome.
- The chapter underscores a gradual approach to functionality development, with initial microservices possessing minimalistic features and promising further enhancement in subsequent chapters.
- Using Spring WebFlux, readers are guided through the creation of rudimentary RESTful APIs, which serve as the foundation for interaction between microservices.
- A pivotal highlight involves the creation of a composite microservice that leverages the RESTful APIs of core microservices to deliver a comprehensive aggregated result.
- The chapter covers strategies for handling errors within the microservices landscape, ensuring robustness and graceful handling of exceptions.
- Readers are exposed to a variety of testing approaches, from manual API testing to isolated automated tests for microservices, and semi-automated tests for the entire landscape.
- The chapter sets the stage for gradual learning, recognizing that the microservices' functionality will evolve and expand across subsequent chapters.
- Readers gain a tangible understanding of how core and composite microservices operate together, how RESTful APIs are realized, and how different testing strategies contribute to the microservices ecosystem's quality.
- The chapter forms a foundational cornerstone for the forthcoming content, indicating that more intricate features and challenges of microservices will be addressed in detail in the subsequent parts of the book.


### Chapter 04, Deploying Our Microservices Using Docker
The "Deploying Our Microservices Using Docker" chapter offers readers an immersive guide to effectively deploying microservices using Docker. The focus is on integrating Dockerfiles and docker-compose files to facilitate a one-command startup of the entire microservices landscape. The chapter's scope extends to utilizing multiple Spring profiles for streamlined configuration management, both with and without Docker.
Throughout the chapter, readers are introduced to Docker and its application in containerizing microservices. By its conclusion, the chapter equips readers with the capability to execute automated tests seamlessly within Docker containers, encompassing the entire microservices landscape. This approach proves invaluable for developers, enabling local testing, seamless integration into build servers, and system-level verification of code changes. The chapter primes readers for upcoming sections by hinting at the integration of databases and queue managers as Docker containers, fostering an enriched testing landscape. Covered topics encompass an introduction to Docker, the evolving compatibility of Docker and Java, deploying a single microservice using Docker, orchestrating microservice landscapes via Docker Compose, and the automation of tests for collaborating microservices.

**Key Insights**:
- The chapter serves as a comprehensive guide to deploying microservices using Docker, emphasizing the utilization of Dockerfiles and docker-compose files for streamlined and efficient containerization.
- Readers gain the ability to initiate the entire microservices landscape with a single command, a powerful feature facilitated by Docker's orchestration capabilities.
- The chapter introduces the use of multiple Spring profiles to manage configurations, accommodating both Dockerized and non-Dockerized deployments.
- The chapter highlights the transformative synergy between Docker and microservices, facilitating the encapsulation of microservices into containers for simplified deployment and management.
- By the chapter's conclusion, readers master the art of running fully automated tests for their microservices ecosystem within Docker containers, effectively ensuring system-level functionality without additional infrastructure.
- Developers gain the ability to verify microservices locally and seamlessly transfer these exact tests to build servers, ensuring consistent and accurate testing across different environments.
- The chapter underscores the significance of testing multiple cooperating microservices, offering a practical means to ensure seamless collaboration among various services.
- The chapter illuminates how the compatibility between Docker and Java evolved, particularly highlighting Java 10's improved compatibility with containers.
- The integration of Docker Compose simplifies the management of microservices landscapes, streamlining the process of running, coordinating, and scaling multiple services.
- The chapter sets the stage for future exploration by hinting at the forthcoming integration of databases and queue managers as Docker containers, promising an enriched testing ecosystem.


### Chapter 05, Adding an API Description Using OpenAPI
The "Adding an API Description Using OpenAPI" chapter provides a comprehensive guide to effectively document microservice APIs using the OpenAPI Specification. Employing the springdoc-openapi tool, readers learn how to annotate services to dynamically generate OpenAPI-based API documentation. A pivotal highlight involves testing these APIs using Swagger UI, a web browser tool.
The chapter underscores the significance of clear and accessible API documentation, which greatly impacts an API's usability. It delves into how the OpenAPI Specification, previously known as Swagger, is widely utilized for documenting RESTful services. The open-source project springdoc-openapi is introduced as a tool to create such documentation, accompanied by the integration of Swagger UI viewer. By the chapter's conclusion, readers will have comprehensive OpenAPI-based documentation for the external API of the product-composite-service microservice, further complemented by an integrated Swagger UI viewer for visualizing and testing the API. Covered topics encompass the introduction to springdoc-openapi usage, its integration into source code, the process of building and launching a microservice landscape, and practical exploration of the OpenAPI documentation.

**Key Insights**:
- The chapter highlights the importance of clear API documentation and introduces the OpenAPI Specification as a powerful tool for achieving comprehensive and accessible documentation.
- Readers are equipped with the skill to dynamically generate API documentation using the springdoc-openapi tool, simplifying the process of keeping API documentation up-to-date.
- A significant feature is the integration of Swagger UI, enabling both visualization and interactive testing of APIs directly within a web browser.
- The chapter underscores the impact of well-documented APIs on their usability and value, acknowledging that accessible documentation is a crucial aspect of an API's effectiveness.
- The OpenAPI Specification, formerly known as Swagger, stands as a widely adopted standard for documenting RESTful services, resonating with API gateways and documentation practices.
- Readers gain practical experience in integrating the open-source tool springdoc-openapi to produce comprehensive OpenAPI-based API documentation.
- The integration of Swagger UI as a documentation viewer not only aids visualization but also enables practical testing of APIs directly within the viewer.
- The chapter encompasses the process of incorporating OpenAPI-based documentation and Swagger UI within a microservice landscape, promoting accessibility and interaction.
- By the chapter's conclusion, readers have tangible OpenAPI-based API documentation for an external API, enhancing understanding and usability.
- Swagger UI consolidates API documentation visualization and testing in a single tool, fostering efficiency and ease of use.


### Chapter 06, Adding Persistence
The "Adding Persistence" chapter offers a comprehensive guide on incorporating data persistence into microservices. Through Spring Data integration, readers learn how to establish and access data in MongoDB for two core microservices, while the remaining microservice accesses data in a MySQL relational database. The utilization of Testcontainers to initiate databases during integration tests enhances the practicality of the process.
The chapter dives into the art of data persistence within microservices, leveraging Spring Data for MongoDB and MySQL databases. Core microservices, namely product and recommendation, rely on Spring Data for MongoDB, while the review microservice employs Spring Data for the Java Persistence API (JPA) to interact with a MySQL database. This integration extends to updating RESTful APIs to facilitate data creation, deletion, and retrieval. The chapter extends to running databases as Docker containers, managed through Docker Compose—a parallel strategy to microservices deployment. Key topics covered encompass introducing persistence to core microservices, crafting automated tests that prioritize persistence, integrating persistence within the service layer, expanding the composite service API, integrating databases into Docker Compose, manual testing of new APIs and persistence, and refining automated tests for the entire microservices landscape.

**Key Insights**:
- The chapter offers a practical guide to integrating data persistence within microservices, with a focus on Spring Data for MongoDB and MySQL databases.
- Readers learn to employ MongoDB and MySQL databases for data storage across different microservices, utilizing Spring Data as the bridging framework.
- Testcontainers are introduced as a tool to initiate databases during integration tests, promoting reliable and consistent testing of persistence-related functionalities.
- The chapter emphasizes the practicality of persisting and accessing data through the integration of Spring Data, underlining the significance of efficient data management.
- Different microservices employ distinct persistence strategies, aligning with their specific requirements and data structures.
- Existing RESTful APIs are extended to accommodate new operations for data creation, deletion, and retrieval, underscoring the seamless integration of persistence.
- Databases are run as Docker containers using Docker Compose, parallel to microservices deployment, streamlining the management of the entire ecosystem.
- The chapter showcases the synergy between manual testing of new APIs and persistence layers, alongside automated tests that encompass the entire microservices landscape.
- Automated tests for the microservices landscape are enhanced to encompass persistence-related functionalities, ensuring the robustness of the entire ecosystem.
- Spring Data serves as a powerful tool for enabling comprehensive data management across microservices, contributing to their functional integrity.


### Chapter 07, Developing Reactive Microservices
The "Developing Reactive Microservices" chapter delves into the significance of a reactive approach in microservices development and provides comprehensive guidance on constructing end-to-end reactive services. The chapter equips readers with the knowledge to develop and test both non-blocking synchronous RESTful APIs and asynchronous event-driven services, accompanied by insights on employing reactive non-blocking drivers for MongoDB and traditional blocking code for MySQL.
This chapter serves as a comprehensive guide to reactive microservices development. Readers learn to craft non-blocking synchronous REST APIs and asynchronous event-driven services, while also gaining a deeper understanding of when to choose between these two alternatives. The chapter underscores the foundation of reactive systems as message-driven and asynchronous, enabling scalability, resilience, and responsiveness. Core topics encompass the selection of development approaches, construction of non-blocking synchronous APIs and event-driven asynchronous services, as well as the execution of both manual and automated tests for a reactive microservices landscape.

**Key Insights**:
- The chapter emphasizes the importance of adopting a reactive approach in microservices development, offering insights into its benefits and practical applications.
- Readers gain a comprehensive understanding of crafting end-to-end reactive services, which encompass both non-blocking synchronous REST APIs and asynchronous event-driven services.
- The chapter equips readers with the skills to develop non-blocking synchronous RESTful APIs and asynchronous event-driven services, while also guiding them in selecting the appropriate approach for specific scenarios.
- The chapter underscores that reactive systems, founded on asynchronous communication, possess the characteristics of elasticity, scalability, and resilience, which collectively contribute to system responsiveness.
- Elasticity and responsiveness are highlighted as key attributes of reactive systems, enabling systems to dynamically scale and remain operational in the face of failures.
- Readers learn to discern between non-blocking synchronous APIs and event-driven asynchronous services, enabling them to choose the most suitable approach for their specific requirements.
- The chapter bridges theory with practice, guiding readers through the development and testing of reactive microservices, ensuring that the concepts are applied effectively.
- Readers gain insights into employing reactive non-blocking drivers for MongoDB and conventional blocking code for MySQL, optimizing database interactions in line with the reactive paradigm.
- Both manual and automated testing of the reactive microservices landscape are covered, fostering a comprehensive understanding of the ecosystem's functionality and responsiveness.
- Asynchronous communication is recognized as a fundamental enabler of scalability and resilience within reactive systems, aligning with the core principles of microservices architecture.


### Chapter 08, Introduction to Spring Cloud
The "Introduction to Spring Cloud" chapter serves as a gateway to Spring Cloud and its integral components within the context of this book's microservices journey. Having explored various facets, from Spring Boot-based APIs to reactive microservices and automated testing, the chapter now ushers in Spring Cloud to render services production-ready. This includes making them scalable, robust, configurable, secure, and resilient.
As the chapter unfolds, readers are introduced to the pivotal role of Spring Cloud in implementing key design patterns covered in earlier sections. These patterns, including service discovery, edge server setup, centralized configuration, circuit breaker implementation, and distributed tracing, are essential for shaping microservices into a cohesive, resilient ecosystem. Spring Cloud emerges as a transformative framework, aligning with the principles highlighted in the book's foundational chapters, and empowering readers to enhance their microservices with advanced capabilities that ensure readiness for production deployment.

**Key Insights**:
- The chapter serves as a gateway to Spring Cloud, offering readers an introduction to its role in enhancing microservices for production readiness.
- Spring Cloud complements the microservices journey covered so far by focusing on making services production-ready, encompassing scalability, resilience, security, and configurability.
- The chapter bridges the gap between design patterns introduced earlier and Spring Cloud's implementation, demonstrating how Spring Cloud can bring these patterns to life.
- Readers gain an understanding of how Spring Cloud facilitates service discovery, a pivotal aspect of enabling microservices to seamlessly locate and communicate with one another.
- Spring Cloud's role in establishing edge servers, a key component for routing and load distribution, is unveiled, showcasing its significance in optimizing microservices communication.
- The chapter underscores Spring Cloud's central role in enabling centralized configuration management, a critical aspect of maintaining consistency and manageability across a microservices landscape.
- Readers learn about Spring Cloud's implementation of the circuit breaker pattern, ensuring fault tolerance and resilience by gracefully handling failures in a distributed system.
- The chapter highlights how Spring Cloud contributes to distributed tracing, enabling enhanced visibility into microservices interactions for effective monitoring and troubleshooting.
- Spring Cloud emerges as a transformative framework, capable of elevating microservices to production readiness through its comprehensive set of capabilities.
- The chapter underscores Spring Cloud's seamless integration with the previously covered microservices concepts, positioning it as the next logical step in the journey towards building robust, scalable, and efficient microservices architectures.


### Chapter 09, Adding Service Discovery Using Netflix Eureka
The "Adding Service Discovery Using Netflix Eureka" chapter offers a comprehensive guide to incorporating service discovery capabilities into a microservices landscape using Netflix Eureka within Spring Cloud. This involves integrating a Netflix Eureka-based service discovery server, configuring microservices to utilize Spring Cloud LoadBalancer for efficient service discovery, and enabling automatic load balancing for new instances as they become available.
The chapter delves into the integration of Netflix Eureka as a pivotal discovery service for Spring Boot-based microservices. It emphasizes the significance of such a service in facilitating seamless communication among microservices and the rationale behind opting for a discovery service over a DNS server. Readers are introduced to the practicalities of setting up a Netflix Eureka server, connecting microservices to it through the Spring Cloud module for Netflix Eureka clients, and configuring development-use scenarios. The chapter equips readers with the knowledge to effectively try out Netflix Eureka's discovery service capabilities. Key topics encompass an introduction to service discovery, the establishment of a Netflix Eureka server, microservices' connection to the server, configuration setup, and practical exploration of Netflix Eureka as a discovery service.

**Key Insights**:
- The chapter serves as a comprehensive guide to seamlessly integrate Netflix Eureka into Spring Cloud, enabling effective service discovery within a microservices landscape.
- Readers gain a deeper understanding of how Netflix Eureka improves communication among microservices by providing a centralized service discovery mechanism.
- The chapter highlights the significance of service discovery in facilitating dynamic and efficient interaction between microservices, offering an alternative to traditional DNS-based communication.
- Readers learn how microservices are automatically registered with Netflix Eureka upon startup, streamlining the addition of new services to the ecosystem.
- The integration of Spring Cloud LoadBalancer with Netflix Eureka facilitates automatic load balancing, ensuring traffic is distributed efficiently among available microservice instances.
- The chapter guides readers through the practical steps of setting up a Netflix Eureka-based service discovery server, showcasing its role as a central hub for microservices registration and communication.
- Readers gain insights into configuring microservices to connect seamlessly with the Netflix Eureka server, enabling straightforward communication and interaction.
- Practical guidance is provided on configuring Netflix Eureka for development scenarios, enhancing the testing and implementation process.
- The chapter prompts readers to consider why a dedicated discovery service like Netflix Eureka is preferred over DNS servers for seamless microservices communication.
- By the end of the chapter, readers are equipped to explore and test the functionality of Netflix Eureka's service discovery capabilities within their microservices landscape.


### Chapter 10, Using Spring Cloud Gateway to Hide Microservices behind an Edge Server
The "Using Spring Cloud Gateway to Hide Microservices behind an Edge Server" chapter provides a comprehensive guide on leveraging Spring Cloud Gateway to establish an edge server, concealing microservices from external consumers and selectively exposing specific APIs. By integrating a Spring Cloud Gateway-based edge server into the system landscape, readers gain insights into how this configuration enhances security, streamlines access to public APIs, and simplifies the internal complexity of microservices.
This chapter delves into the practical implementation of Spring Cloud Gateway as an edge server within a microservices ecosystem. It elucidates the process of strategically exposing public APIs through the edge server while keeping private APIs accessible only within the microservice landscape. In this context, the product composite service and Netflix Eureka's discovery server become externally accessible via the edge server, while the core services—product, recommendation, and review—are hidden from external access. Readers receive step-by-step guidance on incorporating the edge server, configuring Spring Cloud Gateway including routing rules, and hands-on exploration of the edge server's functionality. Key topics encompass the establishment of the edge server, Spring Cloud Gateway setup with routing configurations, and the practical exploration of this edge server configuration.

**Key Insights**:
- The chapter underscores the importance of an edge server, particularly Spring Cloud Gateway, in enhancing microservices architecture by selectively exposing APIs to external consumers while keeping internal complexities hidden.
- Readers gain insights into how Spring Cloud Gateway allows for fine-grained control over API exposure, safeguarding private APIs and only making essential public APIs accessible to external users.
- The chapter highlights the security benefits of using an edge server, which serves as a protective barrier between external consumers and the microservices landscape, safeguarding sensitive functionalities.
- Spring Cloud Gateway's role in concealing the intricate inner workings of microservices from external users promotes a cleaner and more secure interaction model.
- Readers learn to configure routing rules within Spring Cloud Gateway, enabling precise control over which microservices and APIs are accessible from outside the ecosystem.
- The chapter demonstrates how Spring Cloud Gateway streamlines external access to specific microservices, enhancing usability while maintaining control over the system landscape.
- Spring Cloud Gateway aligns with the microservices architectural philosophy by providing a centralized way to manage API access and traffic flow.
- The chapter navigates the distinction between public APIs, accessible externally via the edge server, and private APIs, which remain restricted within the microservices environment.
- Practical insights are provided into setting up Spring Cloud Gateway, helping readers grasp its configuration and usage seamlessly.
- By exploring the edge server's functionality through practical exercises, readers gain the skills to effectively incorporate Spring Cloud Gateway into their microservices landscape.


### Chapter 11, Securing Access to APIs
The "Securing Access to APIs" chapter provides comprehensive guidance on safeguarding exposed APIs using OAuth 2.0 and OpenID Connect. Readers are introduced to the establishment of an OAuth 2.0 authorization server based on Spring Authorization Server within the system landscape. This includes configuring the edge server and composite service to require valid access tokens issued by the authorization server, securing communication with external consumers via HTTPS, and replacing the internal OAuth 2.0 authorization server with an external OpenID Connect provider from Auth0 for enhanced security.
This chapter focuses on enhancing security for APIs and web pages accessible through the edge server introduced previously. Readers gain insights into the utilization of HTTPS to mitigate eavesdropping risks during external API access. The chapter delves into the intricacies of OAuth 2.0 and OpenID Connect, enabling users and client applications to be authenticated and authorized for API access. Furthermore, readers learn about using HTTP Basic authentication to secure access to the Netflix Eureka discovery server. Key topics encompass an introduction to OAuth 2.0 and OpenID Connect, security considerations for the system landscape, HTTPS implementation, access protection for the discovery server, the integration of a local authorization server, authentication and authorization via OAuth 2.0 and OpenID Connect, and practical testing scenarios involving both local and external authorization servers.

**Key Insights**:
- The chapter underscores the significance of OAuth 2.0 and OpenID Connect standards in ensuring robust security for microservices APIs and web pages.
- Readers gain practical insights into establishing an OAuth 2.0 authorization server using Spring Authorization Server, enhancing the system landscape's security framework.
- The chapter highlights the configuration of the edge server and composite service to mandate valid access tokens from the authorization server, bolstering API access security.
- Readers learn about the pivotal role of HTTPS in safeguarding external communication, mitigating the risk of eavesdropping and ensuring data confidentiality.
- OAuth 2.0 and OpenID Connect mechanisms are revealed as powerful tools for not only authenticating users and applications but also authorizing their access to specific APIs.
- The chapter introduces the application of HTTP Basic authentication to secure access to the discovery server, protecting its functionalities from unauthorized users.
- Practical guidance is provided on setting up and testing a local authorization server, followed by the exploration of enhanced security using an external OpenID Connect provider like Auth0.
- The integration of an external OpenID Connect provider, such as Auth0, showcases the flexibility of security measures that can be applied to microservices.
- The chapter highlights how the combination of HTTPS, OAuth 2.0, OpenID Connect, and HTTP Basic authentication collectively elevate the security posture of microservices APIs and web pages.
- By demonstrating practical implementation and testing scenarios, readers gain the skills and knowledge required to apply advanced security measures within their microservices ecosystem.


### Chapter 12, Centralized Configuration
The "Centralized Configuration" chapter provides comprehensive guidance on streamlining configuration management for microservices by employing the Spring Cloud Config Server. This involves centralizing configuration files from various microservices into a single repository, subsequently using the Spring Config Server to efficiently distribute these configurations during runtime.
Within this chapter, readers embark on a journey to understand and implement the Spring Cloud Config Server. It addresses the challenges that arise with managing configuration files across numerous microservices. By centralizing configuration files within a dedicated repository, the Spring Cloud Config Server facilitates easier management and updates. Through practical implementation, readers grasp the process of configuring microservices to retrieve their respective configurations from the central repository, enhancing efficiency and simplifying maintenance. Key topics include an introduction to the Spring Cloud Config Server, setting up the server, configuring client microservices to interact with the server, structuring the configuration repository, and hands-on exploration of the Spring Cloud Config Server's functionality.

**Key Insights**:
- The chapter highlights the challenge of managing configuration files for multiple microservices and emphasizes the need for a centralized approach to simplify configuration handling.
- Readers gain a deep understanding of how the Spring Cloud Config Server serves as a powerful tool for centralizing and distributing configuration files to microservices.
- The chapter underscores the advantages of placing all microservices' configuration files in a single, central repository, streamlining updates and minimizing configuration-related complexities.
- Readers learn how the Spring Config Server enables microservices to retrieve their configurations dynamically from the central repository, enhancing runtime flexibility.
- The Spring Cloud Config Server empowers developers to efficiently manage and update configuration files across multiple microservices, ensuring consistency and simplifying maintenance.
- The chapter guides readers on structuring the configuration repository effectively, enabling easy navigation and organized configuration management.
- By setting up the Spring Cloud Config Server and configuring client microservices, readers acquire hands-on skills to streamline configuration distribution in their microservices landscape.
- The Spring Config Server's role in centralizing configurations supports scalability, enabling easy expansion of microservices while maintaining manageable configurations.
- Centralized configuration management reduces the need for redundant configuration files within each microservice, promoting efficient use of resources.
- The Spring Cloud Config Server ensures microservices start up with accurate and up-to-date configurations, simplifying the deployment process.


### Chapter 13, Improving Resilience Using Resilience4j
The "Improving Resilience Using Resilience4j" chapter delves into leveraging Resilience4j's capabilities to enhance the resilience of microservices, focusing on mitigating errors and preventing the "chain of failure" anti-pattern. The chapter guides readers on integrating key mechanisms such as retrying, circuit breaking, and fallback methods into a composite service. By configuring the circuit breaker to fail fast when the circuit is open and implementing fallback strategies, readers learn to create a more robust and responsive microservices ecosystem.
Within this chapter, readers gain practical insights into using Resilience4j to bolster the resilience of microservices. Building upon the concepts introduced in earlier chapters, the chapter emphasizes the role of circuit breakers, time limiters, and retry mechanisms in safeguarding against common error scenarios. By effectively integrating these mechanisms into the source code, readers are equipped with the skills to mitigate issues arising from slow or unresponsive microservices and intermittent request failures. Key topics encompass introducing Resilience4j mechanisms, their implementation in source code, and hands-on experimentation within the system landscape to validate the enhanced resilience achieved through these strategies.

**Key Insights**:
- The chapter highlights the significance of Resilience4j in strengthening microservices' resilience, offering mechanisms to effectively mitigate errors and prevent cascading failures.
- Readers are guided on leveraging Resilience4j's capabilities to thwart the "chain of failure" anti-pattern, a critical aspect in maintaining overall system stability.
- Practical insights are provided on integrating a retry mechanism into the composite service, allowing microservices to respond effectively even in the presence of transient errors.
- Readers learn to integrate a circuit breaker to swiftly manage and isolate unresponsive downstream microservices, thus safeguarding the system from bottlenecks and failures.
- The chapter emphasizes configuring the circuit breaker to fail fast when the circuit is open, aiding in rapid error detection and reducing the potential impact on the entire system.
- By implementing fallback methods, readers discover how to ensure best-effort responses even in scenarios where primary functionality is compromised.
- Practical examples demonstrate how Resilience4j's time limiter can effectively manage microservices that begin to respond slowly or not at all, avoiding performance degradation.
- Readers gain insights into using Resilience4j's retry mechanisms to counteract intermittent request failures, often arising due to network issues, enhancing overall service reliability.
- The chapter enables readers to implement Resilience4j's mechanisms directly into the source code, promoting hands-on skill development.
- By adeptly applying Resilience4j's features, readers elevate the resilience of their microservices landscape, ensuring responsive and reliable functionalities even in the face of challenging scenarios.


### Chapter 14, Understanding Distributed Tracing
The "Understanding Distributed Tracing" chapter delves into the utilization of distributed tracing, specifically focusing on employing Zipkin to capture and visualize tracing data. This includes integrating Micrometer Tracing to imbue trace IDs into requests, enabling a comprehensive visualization of the interaction between cooperating microservices within request chains.
Throughout this chapter, readers embark on an exploration of distributed tracing's critical role in enhancing comprehension of microservices' collaboration, especially when fulfilling external API requests. The chapter underscores the essential nature of distributed tracing for managing complex microservices landscapes. Building upon concepts introduced earlier, the chapter unveils how Micrometer Tracing facilitates trace data collection, while Zipkin serves as the platform for storing and visually representing this trace information. Key topics encompass introducing distributed tracing with Micrometer Tracing and Zipkin, practical integration of tracing into source code, dynamic addition of trace information, and visualizing diverse API request outcomes. This exploration covers both synchronous and asynchronous processing scenarios, offering readers a comprehensive understanding of the broader tracing landscape.

**Key Insights**:
- The chapter underscores the pivotal role of distributed tracing in enhancing comprehension of microservices' cooperative behavior, enabling a clearer understanding of their interactions and dependencies.
- Readers are introduced to Zipkin, a powerful tool for collecting and visualizing tracing information, which aids in comprehending the flow of requests and responses across microservices.
- Distributed tracing proves indispensable for managing intricate landscapes of interconnected microservices, offering insights into how they work together to fulfill requests.
- The chapter introduces Micrometer Tracing as a means to infuse trace IDs into requests, enabling the visualization of request chains between microservices.
- Practical insights guide readers on programmatically adding information to traces, enhancing the granularity of tracing data and providing a comprehensive picture of system behavior.
- Through examples, readers learn to visualize both successful and unsuccessful API requests, a crucial aspect in identifying bottlenecks and improving system performance.
- The chapter covers both synchronous and asynchronous processing scenarios, enabling readers to understand how distributed tracing adapts to various modes of interaction between microservices.
- By leveraging distributed tracing, readers gain access to a wealth of information about request flows, aiding in identifying latency, inefficiencies, and areas for optimization.
- Distributed tracing facilitates effective debugging and performance optimization by providing a visual representation of request journeys through the microservices landscape.
- The chapter contributes to readers' holistic comprehension of microservices' cooperative behaviors, paving the way for enhanced system management and optimization.


### Chapter 15, Introduction to Kubernetes
The "Introduction to Kubernetes" chapter serves as a primer on Kubernetes, elucidating its fundamental concepts and guiding readers through a sample deployment. The chapter equips readers with essential insights on setting up a local Kubernetes environment using Minikube, facilitating development and testing.
In this chapter, readers embark on a journey into Kubernetes, the dominant container orchestrator in the contemporary landscape. Acknowledging the vastness of Kubernetes and container orchestration as a topic, the chapter distills the most critical aspects based on practical experience. Topics covered include the introduction of Kubernetes concepts, its API objects, and the runtime components that power its orchestration prowess. Readers delve into the creation of a local Kubernetes cluster, gaining hands-on experience with sample deployments, and familiarizing themselves with the kubectl Kubernetes CLI tool. The chapter underscores the importance of managing local Kubernetes environments, preparing readers for deeper explorations into Kubernetes' capabilities.

**Key Insights**:
- The chapter serves as a foundational guide to Kubernetes, introducing readers to its core concepts and principles that underpin container orchestration.
- Readers gain insights into Kubernetes API objects, essential components that define the desired state of applications, aiding in effective management and scaling of containerized applications.
- The chapter delves into Kubernetes' runtime components, offering readers a grasp of the underlying mechanisms that enable automated deployment, scaling, and management of applications.
- Practical insights guide readers through setting up a local Kubernetes environment using Minikube, a crucial step in enabling hands-on experimentation, development, and testing.
- Readers familiarize themselves with the kubectl Kubernetes CLI tool, an essential skill for managing and interacting with Kubernetes clusters and resources.
- By trying out a sample Deployment, readers gain practical experience in deploying applications within the Kubernetes environment, building a foundation for more complex deployments.
- The chapter highlights the importance of effective cluster management, preparing readers for effectively handling their local Kubernetes environments.
- Minikube's local setup empowers readers to engage in iterative development and testing, facilitating efficient application refinement before deployment to larger clusters.
- Through Kubernetes, readers gain an introduction to the world of container orchestration, a pivotal aspect of modern application deployment and management.
- The chapter sets the stage for deeper explorations into Kubernetes' extensive capabilities, empowering readers to navigate the complex world of container orchestration with confidence.


### Chapter 16, Deploying Our Microservices to Kubernetes
The "Deploying Our Microservices to Kubernetes" chapter is a practical guide that navigates readers through the deployment process of microservices on Kubernetes. By employing Helm, a Kubernetes package manager, readers are equipped with the knowledge of how to package and configure microservices for various runtime environments, streamlining deployment. The chapter also underscores the significance of Kubernetes' built-in support for service discovery, replacing the need for external tools like Netflix Eureka. Furthermore, the chapter delves into the utilization of Spring Boot features that aid in the seamless deployment of microservices in Kubernetes.
Within this chapter, readers embark on the journey of deploying the microservices featured in the book onto the Kubernetes platform. Through the lens of Helm, a tool optimized for Kubernetes, the chapter unveils the art of packaging and configuring microservices for deployment across diverse runtime scenarios. Additionally, the inherent service discovery capabilities of Kubernetes, facilitated by Service objects and the kube-proxy component, are emphasized as a means to replace the previously employed Netflix Eureka. The chapter also offers insights into the incorporation of Spring Boot functionalities that contribute to the smooth deployment of microservices within the Kubernetes environment. With a focus on practicality, the chapter ensures readers are well-versed in deploying, managing, and verifying the functionality of their microservices in the Kubernetes landscape.

**Key Insights**:
- Readers gain an understanding of how Helm, a powerful package manager for Kubernetes, facilitates the efficient packaging and configuration of microservices, enabling streamlined deployment across different runtime environments.
- The chapter highlights the value of leveraging Kubernetes' inherent service discovery capabilities, underpinned by Service objects and the kube-proxy component. This eliminates the need for external solutions like Netflix Eureka, simplifying the service discovery process.
- Readers delve into the world of Kubernetes-powered deployment, capitalizing on Spring Boot's supportive features for graceful shutdown, as well as liveness and readiness probes. These features ensure microservices are effectively deployed and managed within the Kubernetes environment.
- Practical insights equip readers with the skills to employ Helm for packaging, configuring, and deploying microservices in various runtime scenarios, fostering a practical approach to microservice deployment on Kubernetes.
- Readers are guided through the utilization of a test script, specifically "test-em-all.bash," to rigorously verify the deployed microservices' functionality, ensuring successful execution within the Kubernetes environment.
- Helm's capabilities enhance deployment efficiency, enabling microservices to be consistently and effectively deployed across different runtime environments, contributing to operational scalability.
- By adopting Kubernetes' native service discovery capabilities, the chapter underscores the ecosystem's comprehensive support for managing service interactions, reducing external dependencies.
- Insights into Spring Boot's features optimize the deployment lifecycle, ensuring that microservices are gracefully handled during deployment and effectively address liveness and readiness concerns.
- Through the provided test script, readers can rigorously verify the deployed microservices' functionality, ensuring that they meet performance and functionality expectations within the Kubernetes environment.
- Helm, Kubernetes' service discovery, and Spring Boot features collectively form a holistic deployment strategy, empowering readers to confidently navigate microservice deployment complexities on Kubernetes.


### Chapter 17, Implementing Kubernetes Features to Simplify the System Landscape
The "Implementing Kubernetes Features to Simplify the System Landscape" chapter elucidates how Kubernetes features can serve as alternatives to Spring Cloud services introduced earlier. Readers will discover the rationale behind replacing Spring Cloud Config Server with Kubernetes' Secrets and ConfigMaps, and understand the process of substituting Spring Cloud Gateway with Kubernetes Ingress objects. Moreover, the chapter navigates the integration of cert-manager to automate certificate provisioning and rotation for external HTTPS endpoints, streamlining the security process.
Within the existing microservice architecture, various supporting services fulfill essential design patterns. This chapter strategically streamlines the landscape by integrating Kubernetes' native capabilities to manage these patterns, eliminating the need for extra deployed services. Spring Cloud Config Server is supplanted by Kubernetes ConfigMaps and Secrets, while the Spring Cloud Gateway finds its counterpart in Kubernetes Ingress objects functioning as edge servers. The introduction of cert-manager automates the cumbersome certificate provisioning and rotation, ensuring secure external APIs. Crucially, the chapter addresses the balance between leveraging Kubernetes features while maintaining microservices' platform independence. Concluding by demonstrating microservice deployment via Docker Compose and functional testing, readers gain insights into sustaining microservice functionality beyond the Kubernetes environment.
In summary, "Implementing Kubernetes Features to Simplify the System Landscape" guides readers in strategically incorporating Kubernetes features as replacements for Spring Cloud services, optimizing the system's architecture and security. The integration of native Kubernetes capabilities, such as ConfigMaps, Secrets, Ingress objects, and cert-manager, elevates the efficiency and resilience of the microservice ecosystem while maintaining the flexibility to function beyond the Kubernetes platform.

**Key Insights**:
- The chapter highlights how Kubernetes features can be harnessed to replace certain Spring Cloud services, simplifying the microservice landscape. By utilizing Kubernetes-native components like ConfigMaps and Secrets, and leveraging Kubernetes Ingress objects as edge servers, the architecture becomes more streamlined and easier to manage.
- The integration of cert-manager showcases the significance of automating certificate provisioning and rotation for external HTTPS endpoints. This not only enhances security but also reduces manual overhead, ensuring that certificates are managed seamlessly within the Kubernetes environment.
- While embracing Kubernetes features, the chapter emphasizes the importance of avoiding microservice code dependence on the platform. This insight underscores the need to ensure that microservices can function both within and beyond the Kubernetes ecosystem, maintaining flexibility and adaptability.
- The chapter's core theme revolves around integrating Kubernetes features to simplify microservice architecture. Replacing Spring Cloud services with Kubernetes-native alternatives aligns with Kubernetes' strengths, ultimately resulting in a more efficient and manageable system.
- By strategically using Kubernetes components like ConfigMaps, Secrets, and Ingress objects, the chapter demonstrates how design patterns can be fulfilled more effectively within the Kubernetes environment. This optimization contributes to the overall efficiency and robustness of the microservice ecosystem.
- The integration of cert-manager underscores the need for automated security measures in managing certificates for external APIs. The ability to automate certificate provisioning and rotation enhances security practices and reduces the risk of operational errors.
- The chapter concludes by highlighting the importance of testing microservices' functionality not only within Kubernetes but also beyond it. Demonstrating functional testing via Docker Compose showcases the significance of maintaining a comprehensive testing approach that considers different deployment environments.
- Understanding how to harness Kubernetes features strategically demonstrates the power of using the right tools for specific tasks. This insight enables architects and developers to make informed decisions about the optimal use of platform capabilities.


### Chapter 18, Using a Service Mesh to Improve Observability and Management
In "Using a Service Mesh to Improve Observability and Management," the concept of a service mesh is introduced as a powerful tool to enhance the management and observability of a microservice ecosystem. The chapter dives into the implementation of a service mesh using Istio within the Kubernetes environment. By utilizing a service mesh, readers can expect to gain improved capabilities in resilience, security, traffic management, and monitoring within their microservice landscape.
Throughout the chapter, readers are acquainted with the rationale behind adopting a service mesh. This technology addresses various challenges, such as enforcing security policies, enhancing resilience, and efficiently managing traffic flow. The significance of observability, which enables a clear visualization of traffic interactions among microservices, is emphasized. While some functions of a service mesh overlap with Spring Cloud and Kubernetes, this chapter clarifies that the majority of service mesh functionality complements these tools. Deploying Istio within Kubernetes is explored, and topics like secure observation, resilience assurance, zero-downtime updates, and Docker Compose-based testing are covered. The chapter not only introduces the concept of a service mesh but also demonstrates its practical application to elevate the management and monitoring aspects of microservices.

**Key Insights**:
- The chapter introduces the concept of a service mesh as a valuable solution for enhancing microservice management and observability. It highlights how a service mesh, exemplified by Istio, can address challenges related to security, traffic management, resilience, and observability in a microservice ecosystem.
- The chapter provides insights into deploying Istio, a prominent open-source service mesh, within a Kubernetes environment. This deployment enables readers to tap into the advanced capabilities offered by Istio to improve the overall functioning and monitoring of their microservice landscape.
- The chapter emphasizes that while there may be overlaps between a service mesh and tools like Spring Cloud and Kubernetes, the majority of service mesh functionalities are designed to complement these existing solutions. This showcases how a service mesh can seamlessly integrate with the microservices ecosystem without duplicating efforts.
- Key insight points also revolve around the significance of utilizing a service mesh to ensure the resilience of microservices, enforce security policies, and efficiently manage the flow of traffic between services. This highlights how a service mesh adds a layer of control and protection to microservice interactions.
- The concept of observability takes center stage, demonstrating the importance of visualizing traffic interactions between microservices. This capability provides valuable insights into the behavior and performance of the entire microservice landscape, aiding in troubleshooting and optimization.
- The chapter provides practical guidance on implementing Istio and utilizing its features. It delves into topics such as secure observation, zero-downtime updates, and Docker Compose-based testing, enabling readers to understand how to apply the service mesh concept in real-world scenarios.
- Lastly, the chapter underscores the flexibility of a service mesh ecosystem. It highlights the importance of ensuring that microservice source code remains independent of specific platforms like Kubernetes or Istio, thereby safeguarding the ecosystem against platform lock-in.


### Chapter 19, Centralized Logging with the EFK Stack
The chapter presents a comprehensive guide on implementing centralized log management using the EFK stack, consisting of Elasticsearch, Fluentd, and Kibana. This stack is a powerful open-source solution for collecting, storing, and visualizing log streams from microservices. The chapter illustrates how to deploy the EFK stack within a Minikube environment and effectively utilize it to analyze log records generated by various microservices. Readers will learn how to navigate the collected log data, search for specific information, and conduct root cause analyses.
The chapter highlights the importance of consolidating log records from different microservice instances for better visibility and analysis. By utilizing Elasticsearch, a distributed database, and Fluentd, a versatile data collector, the EFK stack streamlines the collection, transformation, and storage of log data. Kibana complements this stack by offering an intuitive graphical interface to visualize search results and perform thorough analyses of the accumulated log records. Readers will gain insights into configuring Fluentd, deploying the EFK stack on Kubernetes, and leveraging the stack's capabilities to analyze log records from various microservices. This chapter equips readers with the tools needed to efficiently identify and resolve issues through root cause analysis, making centralized log management a crucial aspect of a well-managed microservices landscape.

**Key Insights**:
- The EFK stack (Elasticsearch, Fluentd, Kibana) offers an effective solution for managing and analyzing logs from microservices. By centralizing log records, developers can gain better visibility into the behavior of individual services and their interactions, leading to improved troubleshooting and performance optimization.
- Elasticsearch, a distributed database, serves as the backbone of the EFK stack. Its search and analytics capabilities enable efficient querying and analysis of large log datasets. This empowers developers to quickly identify patterns, anomalies, and critical information within logs, aiding in the timely detection and resolution of issues.
- Fluentd acts as the data collector within the EFK stack, capable of gathering log data from various sources, transforming it, and delivering it to Elasticsearch for storage. Its flexibility allows integration with different types of microservices and log formats, ensuring that log records are efficiently processed and made accessible for analysis.
- Kibana serves as the user-friendly front-end tool in the stack, offering visualization and exploration of log data stored in Elasticsearch. Developers can create custom dashboards, charts, and graphs, making it easier to identify trends and potential problems through interactive visualizations.
- Centralized log management using the EFK stack enables effective root cause analysis. By tracking log records across different microservices involved in a request's processing, developers can pinpoint the source of errors or failures and address them more efficiently.
- The insights gained from the EFK stack's log analysis can be leveraged to optimize microservice behavior and performance. Patterns in log data can reveal areas of improvement, guiding developers in making informed decisions to enhance the overall system's reliability.
- The chapter emphasizes deploying the EFK stack on Kubernetes, particularly Minikube, for development and testing purposes. This provides a controlled environment for mastering log management techniques before applying them in production systems.
- Centralized log management not only aids in troubleshooting but also enhances real-time monitoring. Developers can set up alerts and notifications based on specific log events, ensuring timely responses to critical issues.
- The EFK stack's adaptability to various microservices architectures makes it a valuable asset in any modern application landscape. Its open-source nature and integration capabilities allow it to accommodate different tech stacks and deployment scenarios.
- Regular log analysis using the EFK stack fosters a culture of continuous improvement. Developers can learn from historical log data to iteratively enhance the performance, resilience, and security of microservices over time.


### Chapter 20, Monitoring Microservices
"Monitoring Microservices" delves into the crucial aspect of effectively monitoring microservices deployed in Kubernetes using Prometheus and Grafana. The chapter underscores the significance of performance metrics for maintaining optimal application performance and resource utilization. By harnessing Prometheus and Grafana, developers gain the tools to collect, analyze, and visualize metrics, ensuring timely detection of anomalies and proactive resolution.
The chapter demonstrates how to leverage existing Grafana dashboards to monitor diverse metrics, providing insights into response times, API requests, and resource consumption. Furthermore, it empowers readers to create customized dashboards tailored to their specific monitoring needs, enabling comprehensive visibility into the microservices landscape. A key focus is on setting up alerts within Grafana, a pivotal feature for proactively managing issues. By configuring alerts based on predefined thresholds, developers can receive notifications, including emails, when metric values surpass the designated limits, facilitating rapid response and troubleshooting.
In summary, this chapter equips readers with the knowledge and tools needed to establish a robust monitoring framework using Prometheus and Grafana. By mastering these technologies, developers can uphold performance, optimize resource utilization, and ensure the reliability of microservices in a dynamic Kubernetes environment.

**Key Insights**:
- Monitoring microservices is essential to ensure optimal performance and resource utilization. Collecting and analyzing performance metrics enables early detection of issues, preventing potential service disruptions and downtime.
- The combined use of Prometheus and Grafana offers a powerful solution for monitoring microservices. Prometheus collects metrics, while Grafana provides visualization, analysis, and alerting capabilities, facilitating comprehensive monitoring and proactive management.
- Developers need to instrument their code to collect relevant application metrics. This involves integrating Prometheus client libraries into microservices to track key performance indicators, response times, and other relevant data.
- Successful monitoring requires proper deployment and configuration of microservices. The chapter guides readers through building and deploying microservices, ensuring they're set up to emit metrics in a way that Prometheus can scrape.
- Utilizing Grafana's pre-built dashboards offers insights into various aspects of microservices performance. These dashboards provide visual representations of metrics, enabling quick identification of trends, patterns, and anomalies.
- The capability to create custom dashboards tailored to specific monitoring needs empowers developers to track metrics that are most relevant to their microservices. This flexibility ensures a comprehensive view of performance.
- Setting up alerts in Grafana is critical for proactive management. Configuring alerts based on predefined thresholds ensures that developers are notified promptly when metrics exceed acceptable limits, enabling swift response and issue resolution.
- Monitoring with Prometheus and Grafana enables proactive issue identification and resolution. By detecting anomalies early and responding to alerts, developers can minimize downtime and maintain consistent service quality.
- Integrating Prometheus and Grafana within a Kubernetes environment provides a holistic approach to monitoring. It offers insights into both microservices performance and the underlying infrastructure, facilitating effective troubleshooting.
- Regularly reviewing and refining monitoring strategies based on insights from Prometheus and Grafana contributes to ongoing service optimization, enabling iterative improvements to microservices performance and stability.


### Chapter 21, Installation Instructions for macOS
"Installation Instructions for macOS" provides a step-by-step guide for installing the necessary tools on Mac systems, catering to both Intel-based and Apple silicon (ARM64) architectures. The chapter focuses on enabling readers to seamlessly set up their environment to follow the instructions presented throughout the book.
Within this chapter, readers are introduced to the essential technical prerequisites for successful installation. The guide covers the installation process for various tools required to effectively execute the commands outlined in the book. Additionally, readers gain insights into accessing the source code associated with the book's content, ensuring easy access to relevant examples and resources. The chapter's topics encompass technical requirements, tool installation, and source code accessibility, collectively offering a comprehensive foundation for readers to confidently proceed with the book's content on macOS.

**Key Insights**:
- The chapter emphasizes the importance of meeting technical prerequisites for successful installation. It guides readers through the process of preparing their macOS environment for tool installation, ensuring compatibility with both Intel-based and Apple silicon (ARM64) systems.
- The chapter provides a detailed walkthrough for installing the necessary tools required for following the instructions throughout the book. It covers tool installation on macOS, allowing readers to easily set up their development environment and execute commands seamlessly.
- Insight is offered into accessing the book's source code, enabling readers to explore and reference the provided examples and resources. This ensures that readers can access practical implementations of concepts discussed in the book.
- The chapter prioritizes user-friendliness by presenting step-by-step instructions and explanations, making it easier for readers to follow along and successfully install the required tools on their macOS systems.
- The chapter acknowledges the diverse hardware architecture of macOS systems, catering to both traditional Intel-based Macs and the newer Apple silicon (ARM64)-based Macs. This inclusive approach ensures that readers with different hardware configurations can equally benefit from the installation guide.
- By providing clear installation instructions and access to source code, the chapter sets a solid foundation for readers to dive into subsequent chapters of the book with confidence, knowing they have a properly configured environment.
- The instructions given in this chapter collectively contribute to streamlining the development setup process for readers, allowing them to focus on the core content of the book and the practical implementation of microservices concepts.
- The chapter aligns with the book's practical approach, ensuring that readers can quickly and easily set up their macOS environment to engage effectively with the hands-on examples and exercises presented in the book.


### Chapter 22, Installation Instructions for Microsoft Windows with WSL 2 and Ubuntu
The chapter outlines a step-by-step guide to installing the necessary tools on a Windows PC using Windows Subsystem for Linux (WSL) v2, enabling readers to follow along with the book's content seamlessly. It focuses on creating a compatible environment for running commands introduced in the book.

**Key Insights**:
- The chapter serves as a comprehensive guide for readers to set up their Windows PCs for tool installation through Windows Subsystem for Linux (WSL) v2. By providing a clear step-by-step approach, readers can effortlessly configure their system to accommodate the tools required for effective learning and implementation.
- The chapter ensures readers have access to the source code associated with the book. This availability of source code enhances the learning experience, allowing readers to engage with practical examples, code snippets, and real-world implementations discussed throughout the book.
- The chapter underscores the importance of fulfilling technical prerequisites to ensure smooth installation. This preparation is essential for readers to create a compatible development environment that aligns with the book's instructions.
- By breaking down the installation process into manageable steps, the chapter aims to make it easier for readers to successfully set up their Windows PCs. This streamlines the process and minimizes potential hurdles that might arise during tool installation.
- The instructions provided in this chapter not only enable readers to install necessary tools but also empower them to access source code materials. This accessibility fosters a more immersive and effective learning experience for readers, promoting hands-on engagement with the concepts presented in the book.


### Chapter 23, Native Compiled Java Microservices
"Native Compiled Java Microservices" introduces readers to the concept of creating Spring-based microservices that are compiled into native code. This chapter delves into the novel native image support in Spring Framework 6 and Spring Boot 3, as well as the underlying GraalVM Native Image compiler. By adopting this approach, developers can generate microservices that exhibit nearly instantaneous startup times, a significant advantage over traditional Java Virtual Machine-based implementations.
Throughout the chapter, readers gain insights into compiling Java source code into executable binary files known as Native Images. These images facilitate rapid startup and are characterized by efficient memory consumption. The discussion includes the Spring Ahead-of-Time (AOT) engine integrated into Spring Framework 6, along with GraalVM's Native Image compiler. The chapter underscores the potential benefits of native compilation and offers practical guidance for implementing this approach in microservices development.

**Key Insights**:
- The chapter addresses the crucial aspect of optimizing microservice performance by compiling Java source code into Native Images. This approach harnesses the power of Spring's AOT engine and GraalVM's Native Image compiler to create microservices that launch rapidly and require less memory, contributing to improved overall system performance.
- Readers are guided through the process of native compilation, including its benefits and considerations. The chapter demystifies the complexities surrounding Native Image creation, helping developers to understand the scenarios where native compilation is particularly advantageous and how to tackle potential challenges that may arise during this transformation.
- The chapter doesn't just discuss the theory behind native compilation; it provides practical instructions on how to test and compile Native Images. This hands-on approach empowers developers to apply the concepts learned in real-world scenarios, using tools like Docker Compose and Kubernetes for comprehensive testing and deployment.
- By introducing readers to the advanced features of Spring Framework 6 and Spring Boot 3, the chapter showcases how the development landscape is evolving. The integration of GraalVM's Native Image compiler exemplifies the pursuit of cutting-edge technologies to address performance bottlenecks and enhance microservice architecture.


> If you feel this book is for you, get your [copy](https://www.amazon.com/Microservices-Spring-Boot-Cloud-microservices/dp/1805128698) today! <img alt="Coding" height="15" width="35"  src="https://media.tenor.com/ex_HDD_k5P8AAAAi/habbo-habbohotel.gif">

## Know more on the Discord server <img alt="Coding" height="25" width="32"  src="https://cliply.co/wp-content/uploads/2021/08/372108630_DISCORD_LOGO_400.gif">
You can get more engaged on the discord server for more latest updates and discussions in the community at [Discord](https://packt.link/SpringBoot3e )

## Download a free PDF <img alt="Coding" height="25" width="40" src="https://emergency.com.au/wp-content/uploads/2021/03/free.gif">
_If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no cost. Simply click on the link to claim your free PDF._
[Free-Ebook](https://packt.link/free-ebook/9781805128694) <img alt="Coding" height="15" width="35"  src="https://media.tenor.com/ex_HDD_k5P8AAAAi/habbo-habbohotel.gif">
We also provide a PDF file that has color images of the screenshots/diagrams used in this book at [GraphicBundle](https://packt.link/XHJmq) <img alt="Coding" height="15" width="35"  src="https://media.tenor.com/ex_HDD_k5P8AAAAi/habbo-habbohotel.gif">

## Get to know the Author
_Magnus Larsson_ is an IT industry veteran since 1986, has consulted for major Swedish firms like Volvo, Ericsson, and AstraZeneca. Despite past struggles with distributed systems, today's open-source tools like Spring Cloud, Kubernetes, and Istio offer effective solutions. For the past eight years, Magnus has been helping customers use these tools and shared insights through presentations and blog posts.

## Other Related Books
- [Learning Spring Boot 3.0 - Third Edition](https://www.packtpub.com/product/learning-spring-boot-30-third-edition/9781803233307)
- [Full Stack Development with Spring Boot 3 and React](https://www.packtpub.com/product/full-stack-development-with-spring-boot-and-react-third-edition/9781801816786)
