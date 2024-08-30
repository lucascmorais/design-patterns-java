# Padrão de projeto Singleton
## Intenção Oficial
Garantir que uma classe tenha somente uma instancia no programa e fornecer um ponto de acesso global para a mesma

## Somente uma instancia?
Geralmente usado para acesso a recursos compartilhados, como acesso à base de dados, interfaces, sistemas de arquivos, servidores de impressão e mais.

Também é usado para substituir variáveis globais, como em casos de uso de objetos de configuração de sistema como um todo.

## Ponto de acesso global?
Você pode permitir acesso global ao Singleton em roda sua aplicação, assim como fazíamos (ou fazemos) com variáveis globais.

Uma vantagem do Singleton é que podemos proteger a instancia com encapsulamento, evitando que outro código sobrescreva seu valor.

## Aplicabilidade
Use o singleton quando uma classe precisa ter somente uma instancia disponivel em todo o seu programa.

Use o singleton quando perceber que está usando variaveis globais para amnter partes importantes do programa, como variaveis de configuração que são usadas por toda a aplicação.

## Consequencias

| Bom                                                               | Ruim                                                                                                      |
|-------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| Acesso controlado a instancia unica                               | É mais dificil de testar                                                                                  |
| É facil permitir um numero maior de instancias caso mude de ideia | Viola o principio da responsabilidade unica                                                               |
| Usa lazy instantiatin, o Singleton só é criado no momento do uso  | Requer tratamento especial em casos de concorrencia                                                       |
| Substitui variaveis globais                                       | Erich Gamma (Autor) descreveu que este seria o unico padrão que ele removeria se fosse refatorar o livro  |