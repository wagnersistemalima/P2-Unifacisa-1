# Exercícios sobre Arrays

1. Crie uma classe chamada ArrayMathUtils com os seguintes métodos estáticos:

- **int[] calculaDivisores(int num)**: deve retornar um array de inteiros contendo os dividores de *num*; Ex: *12* &rarr; *[1, 2, 3, 4, 6, 12]*; *32* &rarr; *[1, 2, 4, 16, 32]*; Dica: descubra a quantidade de divisores antes de criar o array

- **double computaMaior(double[] numeros)**: deve retornar o maior double do array de double; Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *54.0*

- **double computaMenor(double[] numeros)**: deve retornar o menor double do array de double; Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *4.3*

- **double computaMedia(double[] numeros)**: deve retornar a média dos valores do array de double; Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *24.1*

- **boolean temNumRepetido(double[] numeros)**: deve retornar se existe números repetidos no array de double; Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *false*

- **int[][] somaMatrizes(int[][] m1, int[][] m2)**: deve retornar a soma de m1 e m2 (neste caso, m1 e m2 sempre terão quantidades iguais de linhas e de colunas); Ex: *m1 = [[5, 4], [0, 2], [1, -1]]* e *m2 = [[0, -2], [5, -3], [-1, 0]]* &rarr; *[[5, 2], [5, -1], [0, -1]]*; Dica: antes desenhe esses arrays bidimensionais em forma de matrizes (tabelas) que você entenderá com mais facilidade o que foi proposto


2. Crie uma classe chamada SistemaInterpol. 
SistemaInterpol deve ter um array de Strings (*procurados*) como atributo de instância.
Essa classe também deve ter um método de instância (**void adicionarProcurados(String nomes)**), que recebe uma String como argumento. 
Essa String contém os nomes de vários procurados separadaos por espaço (" ").
Portanto, esse método deve armazenar esses nomes no array *procurados*.
SistemaInterpol também deve ter o seguinte método de instância: **boolean ehProcurado(String nome)**.
Essa função deve retornar verdadeiro caso o *nome* esteja no array *procurados*.
Faça uma classe com um main para testar SistemaInterpol.
Ex: *adicionarProcurados("Phulano Syckrano Bheltranno")*, e *ehProcurado("Bheltranno")* &rarr; *true*; 
*adicionarProcurados("Phulano Syckrano Bheltranno")*, e *ehProcurado("Fulano")* &rarr; *false*;

3. Crie uma classe chamada CampeonatoFutebol. 
CampeonatoFutebol deve ter um array de Strings (*times*) como atributo de instância.
Essa classe também deve ter um método de instância (**void adicionarTimes(String times)**), que recebe uma String como argumento. 
Essa String contém os nomes dos vários times separadaos por espaço (" ").
Portanto, esse método deve armazenar esses times no array de Strings *times*.
CampeonatoFutebol também deve ter o seguinte método de instância: **String[] criarCampeonato()**.
Essa função deve retornar um array de Strings contendo todas as possibilidades de jogos entre os times.
Faça uma classe com um main para testar CampeonatoFutebol.
Ex: *adicionarTimes("Treze Campinense Botafogo Autoesporte")*, e *criarCampeonato()* &rarr; *["Treze X Campinense", "Treze X Botafogo", "Treze x Autoesporte", "Campinense X Botafogo", "Campinense X Autoesporte", "Botafogo X Autoesporte"]; 

## Desafio

Crie uma classe chamada JogoDaVelha.
JogoDaVelha deve ter um array bidimensional de char (*tabuleiro*) como atributo de instância.
Assuma que o primeiro jogador sempre marca com 'x'.
Crie uma variável de instância booleana (*vezJogador1*) que indique se é a vez de jogar do jogador 1.
Por padrão, no construtor, inicialize *vezJogador1* com *true*.
Crie o seguinte método de instância: **boolean jogar(int linha, int coluna)**.
Use a variável *vezJogador1* para decidir se vai adicionar 'x' ou 'o' naquela jogada.
A função **boolean jogar(int linha, int coluna)** deve retornar *true* se o jogador venceu o jogo ou se não houver possibilidade de jogadas extras (conhecido como "deu velha"), ou *false*, caso contrário.
Para auxiliar a função **boolean jogar(int linha, int coluna)**, vamos criar uma função chamada **boolean detectaFimJogo()**.
A função **boolean detectaFimJogo()** vai verificar se no *tabuleiro* existe uma reta horizontal, vertical, ou diagonal, de três marcações iguais (qualquer símbolo).
Se existir alguma reta com três marcações iguais, **boolean detectaFimJogo()** retorna *true*, caso contrário, retorna *false*.
Também crie uma função chamada **void iniciarJogo()**.
A função **iniciarJogo()** poderia ser chamada dentro do construtor, por exemplo.
Dentro da função **iniciarJogo()**, você deverá criar um laço, para que enquanto o jogo não termine (por vitória ou impossibilidade de jogadas extras), os jogadores continuem fazendo suas jogadas.
Faça uma classe com um main para testar JogoDaVelha.