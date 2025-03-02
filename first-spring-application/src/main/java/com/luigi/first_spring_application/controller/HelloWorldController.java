package com.luigi.first_spring_application.controller;

import com.luigi.first_spring_application.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
O que é @RestController?
A annotation @RestController pertence ao Spring Web e é usada para indicar que essa classe é um controlador REST, ou seja,
ela será responsável por lidar com requisições HTTP (como GET, POST, PUT e DELETE).

Ela combina duas outras annotations do Spring:

@Controller → Indica que a classe é um controlador, ou seja, uma camada responsável por processar as
requisições do usuário.
@ResponseBody → Faz com que os métodos dessa classe retornem automaticamente a resposta no corpo da requisição HTTP
(em formato JSON, XML ou outro adequado).

Resumo:
@RestController transforma a classe em um controlador REST.
Os métodos dentro dela processam requisições HTTP e retornam respostas no corpo da requisição.
É comumente usada para construir APIs REST no Spring Boot.

=====================================

A annotation @RequestMapping no Spring Boot é usada para definir a URL base (endpoint)
para um controlador ou um método específico que lida com requisições HTTP.
No seu código, ela está sendo usada na classe HelloWorldController, assim:

Isso significa que todas as requisições para esse controlador começarão com /hello-world.

A annotation @RequestMapping pode ser aplicada a nível de classe (como no seu exemplo) e/ou nível de método.

O @RequestMapping pode ser usado também para definir métodos HTTP específicos, como GET, POST, PUT e DELETE.
Mais abaixo temos o @GetMapping, que é uma alternativa mais específica para
@RequestMapping com method = RequestMethod.GET.

Ou seja, todas vezes que alguma request chegar no meu endpoint /hello-world e usar o método Get
quem vai responder essa requisição é o meu método helloWorld()
*/

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    /*
    Aqui, a classe HelloWorldController depende de um serviço chamado HelloWorldService para funcionar.
    Essa dependência é resolvida através do construtor da classe, um conceito
    fundamental da injeção de dependência no Spring.

    A injeção de dependência (Dependency Injection - DI) é um padrão de design onde um
    objeto recebe suas dependências externamente, em vez de criá-las dentro dele.
    Isso melhora a modularidade, facilita a manutenção e permite a realização de testes unitários com mais facilidade.

    No seu código:
    A classe HelloWorldController precisa de uma instância de HelloWorldService.
    Ao invés de criar essa instância manualmente, o Spring Boot injeta automaticamente o serviço na classe através do construtor.
    Isso funciona porque HelloWorldService provavelmente está anotado com @Service ou @Component, permitindo que o Spring gerencie essa dependência.

    Resumo:
    private HelloWorldService helloWorldService; → Declara a dependência do serviço.
    public HelloWorldController(HelloWorldService helloWorldService) → O Spring injeta automaticamente a instância do serviço via construtor.
    A injeção de dependência melhora a manutenção, reduz o acoplamento e facilita os testes.
    */
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    // @GetMapping("/get")
    @GetMapping
    public String helloWorld() {
        return helloWorldService.HelloWorld("Luigi");
    }
}
