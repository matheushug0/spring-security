# Spring Security
- Projeto desenvolvido a partir [desse vídeo](https://www.youtube.com/watch?v=EQ5EwIYsgIE), com o propósito de entender e implementar os mecanismos de acesso utlizados numa API.
- Processo de criação do projeto foi documentado via commits e  `README.md` a fim de:
    - Fixar os conhecimentos
    - Execitar o uso do Git
## Tópicos
- Autenticação
- Segurança de Rotas
- Uso do OAuth 2.0 utilizando o acesso com o Google Accounts
- Uso do JWT no Resource Server

## Roteiro do Projeto
- [x] Criação de um projeto base sem implementação de segurança
- [ ] Adição do Spring Security e Proteção Automática
- [ ] Configuração da segurança para as rotas
- [ ] Autenticando no Google com Oauth 2.0
- [ ] Autenticação com JWT

### 1 - Criação do Projeto
- Implementação de uma rota pública sem autenticação
```
@GetMapping("/public")
String publicRoute(){
  return """
          <h1>Public Route - you are allowed to access here.</h1>
          """;
}
```
- Acesso a rota pública
<img src="./files/1.jpg">



