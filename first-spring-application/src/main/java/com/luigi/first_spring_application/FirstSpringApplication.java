package com.luigi.first_spring_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

/*
Uma annotation em Java é um recurso que permite adicionar metadata ao código, ou seja, informações adicionais que podem ser usadas pelo compilador, por frameworks ou até mesmo em tempo de execução. As annotations começam com @ e podem ser aplicadas a classes, métodos, variáveis, parâmetros, entre outros.

Para que servem as annotations?
Elas são usadas para diversas finalidades, como:

Configuração de frameworks (por exemplo, Spring, Hibernate, JPA, etc.).
Geração automática de código (como o Lombok, que gera getters e setters).
Fornecimento de informações ao compilador (como @Override, que indica que um método está sobrescrevendo outro).
Controle de injeção de dependência (muito usada no Spring).
O que faz @SpringBootApplication?
No seu código, a annotation @SpringBootApplication está aplicada à classe FirstSpringApplication. Essa annotation pertence ao framework Spring Boot e é uma das principais ao iniciar uma aplicação.

Ela equivale a três outras annotations combinadas:

@Configuration → Indica que a classe contém configurações da aplicação.
@EnableAutoConfiguration → Habilita a configuração automática do Spring Boot.
@ComponentScan → Permite ao Spring procurar automaticamente componentes, serviços e configurações dentro do pacote da aplicação.
Resumindo:
A annotation @SpringBootApplication marca a classe principal da aplicação e faz com que o Spring Boot configure automaticamente vários aspectos do projeto, permitindo que a aplicação seja iniciada com o mínimo de configuração necessária.
*/

@SpringBootApplication
/*
@Profile("dev")

A annotation @Profile("dev") e a configuração spring.profiles.active=dev são usadas para gerenciar perfis
(profiles) no Spring Boot. Perfis permitem definir diferentes configurações para diferentes ambientes
(como desenvolvimento, teste e produção), facilitando a adaptação do comportamento da aplicação conforme necessário.
*/
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
