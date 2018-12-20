## Exercício

O diagrama abaixo representa as atividades na implementação de um recurso REST de operação POST para manipulação de uma determinada representação (entidade carro, por exemplo).

<p align="center">
  <img src="https://user-images.githubusercontent.com/33067041/50282525-2b257480-043a-11e9-92a0-243ca77cdfd9.png">
</p>

Utilizando o diagrama acima como base para o desenvolvimento de uma aplicação, o candidato DEVE seguir as seguintes instruções:

* A aplicação DEVE ser desenvolvida utilizando a abordagem [API-First](https://swagger.io/resources/articles/adopting-an-api-first-approach/) com a especificação [OpenAPI 2.0 - Swagger](https://swagger.io/docs/specification/2-0/what-is-swagger/). Ou seja, o primeiro passo DEVE ser a criação de um arquivo YAML com a descrição da API com as operações e objetos que a aplicação irá suportar.
* A aplicação DEVE conter a implementação de todas as operações básicas de CRUD, ou seja, POST para criar, GET para ler, PUT e/ou PATH para atualizar e DELETE para remover.
  * No estilo RESTful o PUT é utilizado para realizar uma atualização completa na entidade e o PATH para atualizações parciais. A atualização em si no estilo RESTful envolve algumas técnicas mais complexas, mas para este exercício o candidato poderá optar por qualquer um dos verbos sem se preocupar com essas complexidades, apenas em realizar a operação de UPDATE.
* A representação de resposta da API DEVE conter atributos não existentes nas entidades do banco de dados, ou seja atributos calculados.
* A aplicação DEVE conter testes unitários.
* A aplicação DEVE ser desenvolvida utilizando recursos do Java 8 sempre que possível.
•	A implementação DEVE ser entregue em no máximo **4 dias corridos** após o recebimento do exercício.
* A entrega DEVE ser através de algum repositório GIT. A avaliação será realizada no commit/push mais próximo do término dos 4 dias de prazo para conclusão do exercício.
* A aplicação DEVE ser baseada na implementação de referência disponível no [GitHub](https://github.com/lancerbh/animals-api-reference).
  * A aplicação desenvolvida será avaliada em relação a capacidade do candidato em realizar a leitura e aplicar o padrão existente na implementação de referência ([GitHub](https://github.com/lancerbh/animals-api-reference)).
  * Esta implementação de referência contem todas as configurações necessárias.
  * Esta implementação de referência contem tudo que é necessário para o candidato concluir o exercício.
* A aplicação PODE conter recursos/implementações adicionais, caso o candidato tenha interesse (diferencial).
* A implementação PODE ser entregue com diagramas de atividades das operações (diferencial).
* A implementação DEVE ser criada com base nas entidades representadas na seção Entidades e a API DEVE ser da representação **Carro**.
* A aplicação NÃO DEVE conter UI (User Interface), apenas o back-end (API).

## Entidades

<p align="center">
  <img src="https://user-images.githubusercontent.com/33067041/50282965-958ae480-043b-11e9-8112-7073163aef0d.png">
</p>

## Importante

* A aplicação será analisada através do SonarQube. É recomendado a utilização do plugin [SonarLint](https://www.sonarlint.org/).
* A aplicação será analisada em relação a cobertura de testes. É recomendado a utilização de algum plugin de análise de cobertura (exemplo o [EclEMMA](https://www.eclemma.org/) para Eclipse).

## Dúvidas

* O candidato DEVE enviar um email para [gp@grupomult.com.br](mailto:gp@grupomult.com.br) com cópia para [lancer.castro@grupomult.com.br](mailto:lancer.castro@grupomult.com.br) com a URL do repositório onde contenha a implementação realizada.
* O candidato PODE entrar em contato através do email [gp@grupomult.com.br](mailto:gp@grupomult.com.br) para qualquer dúvida sobre o processo.
* O candidato PODE entrar em contato através do email [lancer.castro@grupomult.com.br](mailto:lancer.castro@grupomult.com.br) para qualquer dúvida sobre o exercício.
