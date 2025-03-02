package com.luigi.first_spring_application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
As annotations @Configuration e @Bean são usadas para definir beans gerenciados
pelo Spring de forma manual, sem depender de @Component ou @Service.

A annotation @Configuration indica que a classe contém configurações de beans do Spring.
Ela funciona como um arquivo de configuração da aplicação.

O Spring identifica essa classe como uma classe de configuração.
Todos os métodos dentro dela que estiverem anotados com @Bean serão gerenciados pelo contêiner do Spring.

A annotation @Bean indica que o Spring deve gerenciar um objeto
específico e disponibilizá-lo como um bean na aplicação.

Sempre que o Spring precisar de um objeto do tipo SDKAWS, ele chamará esse método
e fornecerá a mesma instância para toda a aplicação.
Isso é útil quando queremos criar e configurar manualmente
um objeto sem depender de @Component ou @Service.

Para configurar bibliotecas de terceiros
Se SDKAWS vier de uma biblioteca externa e não tiver @Component,
você não pode usar @Autowired diretamente. O @Bean resolve isso:

Resumo
@Configuration → Define uma classe como um arquivo de configuração do Spring.
@Bean → Cria um bean gerenciado manualmente, útil para classes de bibliotecas externas.
Alternativa ao @Component, mas com mais controle sobre a instância criada.

@Configuration
public class HelloConfiguration {
    @Bean
    public SDKAWS sdkAWS() {
        return new SDAWS();
    }
}
*/