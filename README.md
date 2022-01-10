# ProjetoCompiladores2021
Projeto Compiladores 2021.1
Compiladores - 2021.1

Grupo: Eduarda Beatriz Cavalcanti Ottoni, Larissa Regina de Penha Arruda e Silva, Lucas Anderson Albuquerque Silva, Marcelo George de Albuquerque Maia e Samuel Linkon Guedes Figueiredo;

Motivação: alguns membros do grupo enfrentam problemas na hora de testar pequenas funcionalidades da aplicação ao longo da sua criação. Então, partindo dessa necessidade, trabalhamos na criação de uma DSL que gera testes simples a partir de uma frase. Não conseguimos testar o comando para executar a instrução desejada, mas o funcionamento esperado se dá a partir do comando abaixo:

  comando:
   describe('GET /user', it('list all user', get, '/api/user', 200, json))

  resultado esperado:
  describe('GET /user', () => {
  it('list all user', () => request(APIURL)
    .get('/api/user')
    .expect(200)
    .expect('Content-Type', /json/));
})
