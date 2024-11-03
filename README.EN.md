[Versão em Português](README.md)

# Prototype of the System of Legião dos Corretores

This repository contains the prototype of the Back-End system in Kotlin Spring Boot, developed at [PUC Tec Startup Support Service (Serviço de Apoio a Startups - SA PUC Tec)](https://www.pucminas.br/puctec/Paginas/default.aspx) to meet the demand of the startup Legião dos Corretores.

## Project

For the development of this prototype, it was developed a project of the database through [Entity Relationship Diagram (ER)](./docs/Diagrama_Entidade_Relacionamento.png), and then an [Entity Relationship project in MySQL WorkBench](./docs/MySQL_Model.mwb) was built.

<img alt="In this entity relationship diagram, there are two entities: 'Person' ('Pessoa') and 'User' ('Usuário'), and a relationship: 'Person has User' ('Pessoa possuí Usuário') . The entity 'Person' ('Pessoa') has the following attributes: 'ID', 'Phone' (Telefone), 'Email', 'CPF' (Brazilian equivalent of US Social Security Number), RG (Brazilian Identity number) and 'Name' (Nome). The entity User (Usuário) has the following attributes: 'Role' (Papel), 'Password' (Senha) and 'User' (Usuário). The ID attribute of both Person (Pessoa) and User (Usuário) is a key attribute. The Name (Nome) attribute of the person entity is a composite attribute, formed by the following child attributes: 'Name' (Nome) and 'Surname' ('Sobrenome'). The 'Role' (Papel) attribute of the 'User' (Usuário) entity is a multivalued attribute. And the 'User' (Usuário) attribute of the entity with the same name is a multivalued and derived attribute. The 'Person has User' (Pessoa possuí Usuário) relationship 'User' (Usuário) relates the entities 'Person' (Pessoa) and 'User' (Usuário). This relationship is weak, and its cardinality is 1 ('Person') to 1 ('User')." src="./docs/Diagrama_Entidade_Relacionamento.png" title="Diagrama Entidade Relacionamento"/>

## Implementation

To implement this prototype, the [Spring Boot](https://spring.io/) framework was used along with the [Kotlin](https://kotlinlang.org/) programming language. And for the database, [MySQL](https://www.mysql.com/) was used.