package com.luigi.first_spring_application.controller;

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

    // @GetMapping("/get")
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
