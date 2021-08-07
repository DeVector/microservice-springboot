# Micro Service with Spring Boot
Este projeto tem o intuito de realizar a implementação de um sistema de e-commerce com o intuito de cadastrar produtos e exibilos atraves de um catalogo, como também adicionar
itens no carrinho

Foram utilizados nesse projeto:

* Framework Spring Boot as versões 2.2.6.RELEASER, 2.3.0.RELEASE e 2.5.3
* Foi utilizado os Container do ElasticSearch e Redis atraves do Docker
* Foram criados um total de 5 serviços
    * Product: com o intuito de realizar o cadastramento de produtos;
    * ShopinCart: que será implementado para guarda os produtos desejados na sacola de compras;
    * ConfigServer: feito com o intuito de realizar as conexão com os servidores responsavel de outros serviços;
    * ServiceDiscovery: feito com o intuito de executar o servido Eureka;
    * Getway: responsavel para qual rota será destinado a partir de um path solicitado.
    
Este projeto foi idealizado com o apoio de videos aulas da DIO.
