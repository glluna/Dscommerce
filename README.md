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

