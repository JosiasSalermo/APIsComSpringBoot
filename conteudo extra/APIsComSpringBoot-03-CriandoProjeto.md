A estrutura de projetos em Spring Boot são baseadas nos seguintes arquivos e pastas:

_.mvn:_

Nesta pasta teremos as configurações para o funcionamento do Maven. Vale lembrar que o Maven é um gerenciador de dependências, com ele podemos gerenciar diversos complementos que o Spring pode utilizar nos projetos, como: Spring Security, conexões com banco de dados, utilização de JPA (ORM), estrutura para APIs, JWT para trabalhar com tokens, entre outras dependências

_src_

É nesta pasta que você irá desenvolver toda a estrutura do projeto, além do projeto, você pode realizar algumas configurações no arquivo _application.properties_ , como: conexões com banco de dados, alterar a porta de funcionamento, habilitar log de ações, entre outras funcionalidades.

_mvnw_ e _mvnw.cmd_

São arquivos de configuração do Maven.

_pom.xml_

É considerado o "cérebro" do nosso projeto, pois ele terá todo o "conhecimento" necessário para realizarmos diversas funcionalidaes em nossos projetos, como: conexões com banco de dados, configuração de servidor, segurança de aplicações, envio de e-mails, entre outras ações. É neste arquivo que iremos especificar todas as dependências que desejamos utilizar nos projetos.
