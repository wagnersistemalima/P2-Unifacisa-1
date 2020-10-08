# Exercícios sobre Reúso (e os demais tópicos que estudamos)

Vamos aprimorar o aplicativo que estávamos criando para o Uber. [Este exercício ainda está em fase de aprimoramento!]

1. Crie a classe Data com os seguintes atributos: dia, mes, ano, hora, minuto, segundo. 
Crie os métodos e construtores que precisar.
2. Crie a classe ContaCorrente com os seguintes atributos: nome, cpf, senha, saldo. 
Crie um método que permita transferir valores entre Contas. 
Crie um construtor que permita inicializar a conta com R$ 500 e uma senha específica.
Crie outros métodos e construtores conforme precisar.
3. Crie a classe Motorista com os seguintes atributos: nome, cpf, data, conta, data ingresso, lista de corridas.
4. Crie a classe Passageiro com os seguintes atributos: nome, cpf, data, conta, data ingresso, lista de corridas.
5. Crie uma classe Pessoa para evitar duplicação de código em Motorista e Passageiro.
6. Crie a classe Corrida com os seguintes atributos: data de início da corrida, data de fim da corrida, quantidade de km.
7. Imagine que tenhamos 3 tipos de Corrida. 
Corrida convencional (UberX) com carros populares: pagamos o preço base normal de R$5 e um custo de R$1.6 por km. 
Corrida mais cara (UberVip) com carros de luxo: pagamos o preço base normal de R$5, um custo de R$2.3 por km
Corrida compartilhada (UberPool): pagamos o preço base normal de R$4.5 e um custo de R$1.3 por km, e recebemos um desconto de 10% por cada passageiro extra (a Uber se encarrega de encontrar passageiros que estejam no trajeto e compartilhem o mesmo destino, de modo que possam dividir os custos da viagem)
8. Crie a classe Uber. 
Uber deve ter uma conta, que é a conta da empresa, uma função pública para solicitar corridas.
Uber deve ter uma lista de corridas pendentes.
Uber deve ter uma lista de motoristas, e uma função que permita motoristas se cadastrarem e descadastrarem no Uber.
Uber deve ter uma lista de clientes, e uma função que permita motoristas se cadastrarem e descadastrarem no Uber.
Sempre que Uber tiver mais do que 50 corridas, ative a tarifa dinâmica, que eleva o preço da Corrida em 10%.
Uber deve ter uma função que mapeia a corrida para o motorista que tiver menor lucro agregado sobre as corridas.
Ao ter uma corrida mapeada para um motorista, assuma que ela foi realizada e compute seus custos.
Após isto, transfira 60% do valor da corrida para o motorista, e transfira 40% do valor da corrida para o Uber.
Adicione esta corrida no histórico do motorista e do cliente.
9. Instancie um Uber. Crie vários motoristas e passageiros. 
Faça os passageiros solicitarem inúmeras corridas.
Mapeie as corridas para os motoristas e as realize uma a uma.

Se você precisar criar funções/variáveis adicionais, fique à vontade.