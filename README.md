[English Version](README.EN.md)

# Protótipo do Sistema da Legião dos Corretores

Este repositório contém o protótipo do sistema Back-End em Kotlin Spring Boot, desenvolvido no [Serviço de Apoio a Startups do PUC Tec (SA PUC Tec)](https://www.pucminas.br/puctec/Paginas/default.aspx) para atender a demanda da startup Legião dos Corretores.

## Projeto

Para o desenvolvimento deste protótipo, foi desenvolvido um projeto do banco de dados através do [Diagrama Entidade Relacionamento (ER)](./docs/Diagrama_Entidade_Relacionamento.png), e depois foi construído um projeto [Entidade Relacionamento no MySQL WorkBench](./docs/MySQL_Model.mwb).

<img alt="Neste diagrama de entidade e relacionamento, existem duas entidades: 'Pessoa' e 'Usuário', e um relacionamento: 'Pessoa possuí Usuário'. A entidade pessoa possuí os seguintes atributos: 'ID', 'Telefone', 'Email', 'CPF', 'RG' e 'Nome'. Já a entidade Usuário possuí os seguintes atributos: 'Papel', 'Senha' e 'Usuário'. O atributo ID tanto de Pessoa como de Usuário é um atributo chave. Já o atributo Nome da entidade pessoa é um atributo composto, formado pelos seguintes atributos filhos: 'Nome' e 'Sobrenome'. O atributo 'Papel' da entidade 'Usuário' é um atributo multivalorado. E o atributo 'Usuário' da entidade de mesmo nome é um atributo multivalorado e derivado. O relacionamento 'Pessoa possuí Usuário' relaciona as entidades 'Pessoa' e 'Usuário'. Este relacionamento é fraco, e a sua cardinalidade é 1 ('Pessoa') para 1 ('Usuário')." src="./docs/Diagrama_Entidade_Relacionamento.png" title="Diagrama Entidade Relacionamento"/>

## Implementação

Para a implementação deste protótipo, foi utilizado o framework [Spring Boot](https://spring.io/) junto da linguagem de programação [Kotlin](https://kotlinlang.org/). E para o banco de dados, foi utilizado o [MySQL](https://www.mysql.com/).