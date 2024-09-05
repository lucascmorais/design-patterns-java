# Padrão de projeto Builder
## Intenção Oficial
Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações

## Visão geral do Builder
- O padrão sugere a separação do código que cria e o código que usa o objeto;
- Trata da criação de objetos complexos (complexos de verdade);
  - Construtores muito complexos;
  - Composição de vários objetos (composite);
  - Algoritmo de criação de objetos complexos.
- Permite a criação de um objeto em etapas;
- Permite method chaining;
- O objeto final pode variar de acordo com a necessidade;
- É um padrão complexo.

## Consequencias

| Bom                                              | Ruim                                         |
|--------------------------------------------------|----------------------------------------------|
| Separa criação da utilização                     | O codigo final pode se tornar muito complexo |
| O cliente não precisa criar objetos diretamente  |                                              |
| O mesmo código pode construir objetos diferentes |                                              |
| Ajuda na aplicação dos princípios SRP e OCP      |                                              |
