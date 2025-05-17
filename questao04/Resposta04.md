# Resposta da Questão 04

## Diferenciação básica

$\quad$ De forma geral, os _arrays_ de tipo primitivo guardam somente valores do tipo que foram declarados, enquanto os _arrays_ de objetos guardam todo um objeto (contendo todos os seus atributos).

## Alocação de Memória de _array_

$\quad$ Um _Array_ Primitivo armazena diretamente o valor em seu espaço contínuo de memória, determinado anteriormente e de forma fixa.

$\quad$ Um _Array_ de Objetos é estritamente oposto ao anterior, pois não armazena diretamente os objetos em um espaço contínuo de memória. Na verdade, não há um "armazenamento direto" e sim uma referência aos objetos através de ponteiros, fazendo com que seu "espaço de memória" seja fragmentado.

$\quad$ A união dos 2 casos acontece quando há uma alocação de um objeto de forma individual a um _array_.

Exemplo:
````
array[i] = new Objeto(...)
````

## Cuidados para acesso de elementos de um _array_ de objetos

1. Só é possível acessar posições entre 0 e o _tamanho escolhido - 1_.
2. Antes de ser adicionada qualquer coisa em um _array_, suas posições tem o valor _NULL_, então a tentativa de acesso de posições antes da adição de Objetos resultará no resultado _NULL_.
