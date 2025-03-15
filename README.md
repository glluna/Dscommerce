# Dscommerce
## Descrição Geral

O **Dscommerce** é um sistema de e-commerce que permite o gerenciamento de usuários, produtos e categorias. O sistema oferece funcionalidades como cadastro de usuários, exibição de catálogo de produtos, gerenciamento de carrinho de compras e processamento de pedidos.

## Funcionalidades

- **Usuários**:
  - Cadastro de usuários com nome, e-mail, telefone, data de nascimento e senha.
  - Perfis de usuários: Cliente e Administrador.
  - Usuários não identificados podem se cadastrar e navegar no catálogo.
  - Clientes podem atualizar seu cadastro e visualizar seus pedidos.
  - Administradores têm acesso à área administrativa para gerenciar cadastros.

- **Produtos e Categorias**:
  - Cadastro de produtos com nome, descrição, preço e imagem.
  - Os produtos são organizados por categorias.
  - Exibição de catálogo de produtos com filtro por nome.

- **Carrinho de Compras**:
  - Usuários podem adicionar, remover e modificar a quantidade de produtos no carrinho.
  - Ao finalizar a compra, um pedido é salvo no sistema com o status "Aguardando Pagamento".

- **Pedidos**:
  - Cada pedido contém a lista de itens (produto + quantidade), status e data do registro.
  - Status do pedido: "Aguardando Pagamento", "Pago", "Enviado", "Entregue" e "Cancelado".
  - Registro do instante do pagamento quando um pedido é pago.

## Tecnologias Utilizadas

- **Backend**: Java (Spring Boot)
- **API**: RESTful com Spring Boot
- **Gerenciamento de Dependências**: Maven
- **Banco de Dados**: PostgreSQL (ou outro banco relacional)

## API REST

A aplicação disponibiliza uma API REST para integração. Alguns dos endpoints disponíveis são:

- **Usuários**
  - `GET /users` - Lista todos os usuários
  - `GET /users/{id}` - Retorna um usuário específico
  - `POST /users` - Cria um novo usuário
  - `PUT /users/{id}` - Atualiza um usuário
  - `DELETE /users/{id}` - Remove um usuário

- **Produtos**
  - `GET /products` - Lista todos os produtos
  - `GET /products/{id}` - Retorna um produto específico
  - `POST /products` - Cria um novo produto
  - `PUT /products/{id}` - Atualiza um produto
  - `DELETE /products/{id}` - Remove um produto

- **Pedidos**
  - `GET /orders` - Lista todos os pedidos
  - `GET /orders/{id}` - Retorna detalhes de um pedido
  - `POST /orders` - Cria um novo pedido
  - `PUT /orders/{id}` - Atualiza um pedido
  - `DELETE /orders/{id}` - Cancela um pedido

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Fork este repositório.
2. Crie uma branch com sua feature (`git checkout -b minha-feature`).
3. Commit suas mudanças (`git commit -m 'Minha nova feature'`).
4. Envie para o repositório remoto (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença

Este projeto é distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
