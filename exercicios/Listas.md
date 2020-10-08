# Exercícios sobre Listas

1. Crie uma classe chamada ListaMathUtils com os seguintes métodos estáticos:

- **List\<Integer\> calculaDivisores(int num)**: deve retornar uma lista de Integers contendo os dividores de *num*; 
Ex: *12* &rarr; *[1, 2, 3, 4, 6, 12]*; *32* &rarr; *[1, 2, 4, 16, 32]*; 

- **double computaMaior(List\<Double\> numeros)**: deve retornar o maior double da lista de Double; 
Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *54.0*

- **double computaMenor(List\<Double\> numeros)**: deve retornar o menor double da lista de Double; 
Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *4.3*

- **double computaMedia(List\<Double\> numeros)**: deve retornar a média dos valores da lista de Double; 
Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *24.1*

- **boolean temNumRepetido(List\<Double\> numeros)**: deve retornar se existe números repetidos na lista de Double; 
Ex: *[12.4, 43.1, 4.3, 54.0, 6.7]* &rarr; *false*

2. Crie uma classe chamada SistemaInterpol. 
SistemaInterpol deve ter uma Lista de Strings (*procurados*) como atributo de instância.
Essa classe também deve ter um método de instância (**void adicionarProcurado(String nome)**), que recebe uma String como argumento. 
Portanto, esse método deve adicionar esse nome na lista *procurados*.
SistemaInterpol também deve ter o seguinte método de instância: **boolean ehProcurado(String nome)**.
Essa função deve retornar verdadeiro caso o *nome* esteja na lista *procurados*.
Faça uma classe com um main para testar SistemaInterpol.

3. Crie uma classe chamada LojaDeCarros. 
Reutilize a classe Carro implementada no [exercício ClassesEObjetos](ClassesEObjetos.md).
Adicione na classe Carro um atributo de instância *int id*, para identificar aquele carro.
Nos construtores da classe Carro, gere um *id* aleatório para cada carro instanciado.
LojaDeCarros deve ter uma Lista de Carros disponíveis (*carrosDisponiveis*) como atributo de instância.
Essa classe também deve ter um método de instância (**void adicionarCarro(Carro carro)**), que recebe um Carro como argumento. 
Portanto, esse método deve adicionar esse nome na lista *carrosDisponiveis*.
LojaDeCarros deve ter um método de instância que exibe todos os carros disponíveis para venda: **void exibirCarrosDisponíveis()**.
LojaDeCarros deve ter uma Lista de Carros vendidos (*carrosVendidos*) como atributo de instância.
Essa classe também deve ter um método de instância (**int venderCarro(int id)**), que recebe o identificador do Carro como argumento. 
Portanto, esse método deve adicionar esse nome na lista *carrosVendidos*.
Cada Carro pode estar de forma individual em promoção.
LojaDeCarros deve ter um método de instância (**void adicionarPromocao(int id)**) que configura o carro com aquele identificador como estando em promoção de 15%.
LojaDeCarros também deve ter um método de instância que retorna o apurado da loja até aquele momento: **int computaApuradoDasVendas()**, considerando os carros em promoção.
Por fim, LojaDeCarros deve ter uma função **void limparVendidos()**, que apaga a lista de carros vendidos.
Faça uma classe com um main para testar LojaDeCarros.