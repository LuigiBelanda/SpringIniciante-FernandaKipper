package com.luigi.first_spring_application.service;

import org.springframework.stereotype.Service;

/*
A annotation @Service é usada no Spring Boot para indicar que essa classe é um componente de serviço. Isso significa que:

O Spring gerencia automaticamente essa classe (não precisamos instanciar manualmente).
Ela pode ser injetada em outras classes usando a injeção de dependência.
É uma especialização de @Component, o que a torna um Spring Bean (ou seja, uma classe gerenciada pelo contêiner do Spring).

A classe HelloWorldService pode ser injetada em qualquer outro componente do Spring, como um Controller.
No seu caso, o HelloWorldController já está utilizando esse serviço

Resumo:
@Service → Indica que a classe é um serviço gerenciado pelo Spring.
O Spring cria e injeta essa classe automaticamente onde for necessário.
O método HelloWorld(String name) retorna "Hello World! <nome>".
Melhora a organização do código, separando a lógica de negócio da camada de controle (Controller).
*/
@Service
public class HelloWorldService {
    /*
    O que acontece quando alguém acessa http://localhost:8080/hello-world
    A requisição chega no Controller (HelloWorldController).
    O método helloWorld() chama helloWorldService.HelloWorld("Luigi").
    O serviço retorna "Hello World! Luigi".
    A resposta é enviada para o cliente (navegador, Postman, etc.).
    */
    public String HelloWorld(String name) {
        return "Hello World! " + name;
    }
}
