[English Version](README.EN.md)

# Protótipo Sistema Legião dos Corretores

Este repositório contém o protótipo do sistema Back-End em Kotlin Spring Boot, desenvolvido no [Serviço de Apoio a Startups do PUC Tec (SA PUC Tec)](https://www.pucminas.br/puctec/Paginas/default.aspx) para atender a demanda da startup Legião dos Corretores.

## Projeto

Para o desenvolvimento deste protótipo, foi desenvolvido um projeto do banco de dados através do Diagrama Entidade Relacionamento (ER), e depois foi construído um projeto Entidade Relacionamento no MySQL WorkBench.

<img alt="Neste diagrama de entidade e relacionamento, existem duas entidades: &#39;Pessoa&#39; e &#39;Usuário&#39;, e um relacionmento: &#39;Pessoa possuí Usuário&#39;. A entidade pessoa possuí os seguintes atributos: ID, Telefone, Email, CPF, RG e Nome. Já a entidade Usuário possuí os seguintes atributos: Papel, Senha e Usuário. O atributo ID tanto de Pessoa como de Usuário é um atributo chave. Já o atributo Nome da entidade pessoa é um atributo composto, formado pelos seguintes atributos filhos: &#39;Nome&#39; e &#39;Sobrenome&#39;. O atributo &#39;Papel&#39; da entidade &#39;Usuário&#39; é um atributo multivalorado. E o atributo &#39;Usuário&#39; da entidade de mesmo nome é um atributo multivalorado e derivado. O relacionamento &#39;Pessoa possuí Usuário&#39; relaciona as entidades &#39;Pessoa&#39; e &#39;Usuário&#39;. Este relacionamento é fraco, e a sua cardinalidade é 1 (&#39;Pessoa&#39;) para 1 (&#39;Usuário&#39;)." src="./docs/Diagrama_Entidade_Relacionamento.png" title="Diagrama Entidade Relacionamento"/>