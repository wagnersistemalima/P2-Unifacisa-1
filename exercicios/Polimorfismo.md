# Exercícios sobre Polimorfismo

Polimorfismo só acontece em uma situação na qual diferentes entidades podem realizar uma mesma ação de modo diferente.
Tecnicamente falando, isto só é possível com a aplicação de herança e sobrescrita de métodos.
Vamos experimentar alguns exemplos que abordem essa situação.

## Zoológico

Implemente a seguinte hierarquia de classes. 

<p align="center">
  <img src="https://github.com/eduardolfalcao/P2-Unifacisa/blob/master/conteudo/imgs/uml-polimorfismo-animais.png" width="450" height="308"/>
</p>

Nas funções void, apenas exiba a ação que está acontecendo. 
Por exemplo: 
- emitirSom() de Animal deve exibir "Animal emitindo som"
- emitirSom() de Cachorro deve exibir "Au au"
- emitirSom() de Cavalo deve exibir "Innnririririri"
- emitirSom() de Preguica deve exibir "ZZzzzzZZZZzzzz"
- correr() de Cachorro deve exibir "Cachorro correndo"
- correr() de Cavalo deve exibir "Cavalo trotando"
- escalarArvore() de Preguica deve exibir "Nao"

Crie uma classe Zoologico composta por 5 jaulas (lista), onde cada uma terá um animal diferente. 
Depois percorra cada jaula e “cutuque o animal” (emitirSom) e, se o animal souber correr, dê uma carreira nele (correr). 

## Mortal Kombat

Imagine que estamos implementando o jogo de Mortal Kombat.
Implemente a seguinte hierarquia de classes. 

<p align="center">
  <img src="https://github.com/eduardolfalcao/POO-Unifacisa/blob/master/conteudo/imgs/mk.png"/ width="550" height="550">
</p>

- Crie construtores (lembre-se do reuso, subclasse reusa construtor da superclasse)
- Cerquilha (#) significa modificador protected, e + significa modificador público
- Os métodos de lutador devem tirar os seguintes danos:
    - Socar: 7
    - Chutar: 5
    - Atirar: 10
    - Lançar magia: 12
- Nas subclasses iremos sobrescrever alguns métodos:
    - Jax
        - socar: adicione mais 10 ao dano original de socar
    - NightWolf
        - atirar: adicione mais 5 ao dano original de atirar
        - lançar magia: adicione mais 6 ao dano original de lançar magia
    - SubZero
        - lançar magia: adicione mais 8 ao dano original de lançar magia
    - Rayden
        - lançar magia: adicione mais 9 ao dano original de lançar magia
    - Liu Kang
        - chutar: adicione mais 9 ao dano original de chutar
        - lançar magia: adicione mais 8 ao dano original de lançar magia
    - Sônia
        - chutar: adicione mais 8 ao dano original de chutar
        - socar: adicione mais 8 ao dano original de socar
        
Por fim, crie a classe MortalKombat.
- MortalKombat recebe dois lutadores.
- MortalKombat deve ter um método chamado fight():
    - enquanto a vida dos dois lutadores for maior que zero (ou seja, enquanto alguém estiver vivo), faça o seguitne:
        - sorteia um dos lutadores para atacar;
        - sorteia um tipo de golpe
        - realiza o golpe.

No fim, o programa deve dizer qual dos lutadores venceu a partida.
Experimente seu programa algumas vezes com lutadores diferentes.

