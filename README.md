# README #

RESTful API Documentation Using Swagger and Spring MVC

With the advancement of web technologies and different ways to implement them, there have been many different schools of thought about how to make it easy for end users and to address different challenges into the space of web. With this the inception of web-services proliferated majorily into two prime categories REST and SOAP.

Both of them are common way to expose web services, where SOAP has the significant contractual obligation between service consumer and service producer. It standardizes the request response structure through mutual understanding and adheres the contracts. But with RESTFul services the story is different. Describing to users how to use and interact with a REST API is a daunting task. There are no set standards to expose a REST contract other than HTTP method attributes governance. Many APIs resort to manually edited human-readable documentation, which is hard to maintain from a synchronization standpoint with the API. Hence, defining the standards for your REST services, and keeping the documentation updated in real time is a big challenge.

What is Swagger

Swagger is a specification for documenting REST API. It specifies the format (URL, method, and representation) to describe REST web services. Swagger is meant to enable the service producer to update the service documentation in real time so that client and documentation systems are moving at the same pace as the server. The methods, parameters, and models description are tightly integrated into the server code, thereby maintaining the synchronization in APIs and its documentation.

Swagger is the initiative of Wordnik, which defines the specification and framework for their internal development use for “develop.wordnik.com” and underlying system. They started developing the framework in early 2010—being released, is currently also used by Wordnik’s APIs, which powers both internal and external API clients.

Advantages

With the Swagger framework, the server, client and documentation team can be in synchronization simultaneously.

As Swagger is a language-agnostic specification, with its declarative resource specification, clients can easily understand and consume services without any prior knowledge of server implementation or access to the server code.

The Swagger UI framework allows both implementers and users to interact with the API. It gives clear insight into how the API responds to parameters and options.

Swagger responses are in JSON and XML, with additional formats in progress.

Swagger implementations are available for various technologies like Scala, Java, and HTML5.

Client generators are currently available for Scala, Java, JavaScript, Ruby, PHP, and Actionscript 3, with more client support underway.

With this, we attempt to expose the sample REST web-service with Spring MVC, and showcase the Swagger documentation.

Swagger Integration with Spring MVC.

In order to document the Spring MVC Rest API’s mention the following maven dependencies into the pom.xml.
1
2
3
4
5
6
7
8
9
	
<dependency>
 
            <groupId>com.mangofactory</groupId>
 
            <artifactId>swagger-springmvc</artifactId>
 
            <version>0.5.2</version>
 
</dependency>

This will cause the related Swagger artifacts, like swagger-core and swagger-annotations, to be included in your build path.

Mentioned are some of the following Annotations provided from wordnik Spring MVC for the Swagger project to document the Rest

    APIs.@Api
    @ApiClass
    @ApiError
    @ApiErrors
    @ApiOperation
    @ApiParam
    @ApiParamImplicit
    @ApiParamsImplicit
    @ApiProperty
    @ApiResponse
    @ApiResponses
    @ApiModel

In order to make use of the above-mentioned annotations in the controller, bind the swagger configuration bean into the mvc-context.xml.
1
2
3
	
<!-- Configuration Bean -->
 
<bean id="documentationConfig" class="com.mangofactory.swagger.configuration.DocumentationConfig"/>
