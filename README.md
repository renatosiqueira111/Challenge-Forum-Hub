
https://github.com/rrrtent/Challenge-Forum-Hub/assets/134557648/bac56dbc-173d-473b-9b3b-871d8fe58dcb


Funcionalidades
A API do FórumHub permite as seguintes operações:

Criar um novo tópico: Permite aos usuários criarem novos tópicos;

Mostrar todos os tópicos criados: Retorna uma lista de todos os tópicos;

Mostrar um tópico específico: Retorna os detalhes de um tópico específico baseado em seu ID;

Atualizar um tópico: Permite a edição de um tópico existente;

Eliminar um tópico: Permite a exclusão de um tópico;


Como Executar
Pré-requisitos
Java 17 instalado

Passos:
Clone o repositório:


git clone https://github.com/rrrtent/Challenge-Forum-Hub.git

Navegue até o diretório do projeto:

cd Challenge-Forum-Hub
Execute o projeto utilizando Maven:

mvn spring-boot:run
A API estará disponível em http://localhost:8080.

Endpoints da API
Tópicos
Criar Tópico

POST /api/topicos
Request Body:
json
{
  "titulo": "Título do Tópico",
  "mensagem": "Conteúdo do Tópico",
  "autorId": 1
}

Listar Todos os Tópicos

GET /api/topicos
Mostrar Tópico Específico

GET /api/topicos/{id}
Atualizar Tópico

PUT /api/topicos/{id}
Request Body:
json
{
  "titulo": "Novo Título do Tópico",
  "mensagem": "Novo Conteúdo do Tópico"
}
Eliminar Tópico

DELETE /api/topicos/{id}
Autenticação e Autorização

O FórumHub utiliza Spring Security para gerenciar autenticação e autorização. Para acessar os endpoints da API, é necessário realizar login e obter um token de autenticação.

Tecnologias Utilizadas

Java 17: Linguagem de programação utilizada.
Spring Boot: Framework utilizado para facilitar a criação e desenvolvimento da aplicação.
Spring Security: Utilizado para autenticação e autorização.
JPA/Hibernate: Para mapeamento objeto-relacional e persistência de dados.
H2 Database: Banco de dados em memória para desenvolvimento e testes.
Maven: Gerenciador de dependências e automação de build.


Estrutura do Banco de Dados

O banco de dados foi projetado para armazenar informações sobre os tópicos, incluindo:
Usuários: Informações sobre os usuários do fórum.
Tópicos: Detalhes dos tópicos de discussão.
Respostas: Respostas dos usuários aos tópicos.
