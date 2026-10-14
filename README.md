# 🧠 API de Skills: Processo Seletivo Neki

![Java](https://img.shields.io/badge/Java-11-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=postgresql&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=flat-square&logo=swagger&logoColor=black)

API REST desenvolvida para o **desafio técnico do processo seletivo da Neki** ao final da residência do Serratec (2021).

A aplicação gerencia as **skills (habilidades) de cada usuário**, com o nível de conhecimento em cada uma. Ela serve de back-end para o app mobile [reactnative-front](https://github.com/ramosth/reactnative-front).

## Endpoints

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/skill/all` | Lista todas as skills |
| `GET` | `/skill/{id}` | Busca uma skill pelo ID |
| `POST` | `/skill/add` | Cadastra uma skill |
| `PUT` | `/skill/update/{id}` | Atualiza uma skill |
| `DELETE` | `/skill/delete/{id}` | Remove uma skill |

A documentação interativa fica disponível no **Swagger UI** (`/swagger-ui.html`).

## Modelo de dados

- **Usuario:** dados do usuário
- **Skill:** habilidade (nome, versão, descrição e imagem)
- **UsuarioSkill:** relacionamento entre usuário e skill, com o nível de conhecimento

## Como executar

**Pré-requisitos:** Java 11 e PostgreSQL.

1. Configure o banco em `src/main/resources/application.properties`
2. Rode o projeto:

```bash
./mvnw spring-boot:run
```

---

Desenvolvido por [Thamires Ramos](https://github.com/ramosth) · [LinkedIn](https://linkedin.com/in/thamires-ramos/)
