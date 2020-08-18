# Tipos Primitivos 

**Perguntas que gostaríamos de respostas sobre este tópico?**
- Niverton: quais os tipos de dados primitivos?
- Niverton: nos tipos numéricos, qual o valor máximo e mínimo permitido?
- Wagner: vantagem dos tipos primitivos? (são mais performáticos?)
- Vitor: em qual momento usar tipos primitivos?
- Lucas Mayer: diferença de usar tipo double e float?
- Niverton: tamanho em bytes dos tipos?
- Calebe: tipos numéricos usam vírgula? 4.6, 6.7, 1,000,000
- Samuel: temos a palavra reservada unsigned, como em C++? acho que não
- Jonathas: os tipos primitivos em Java São os mesmos que usamos em Python? marjoritariamente

**Decimais**
Perceba que o bit mais à esquerda é sempre usado para determinar se o número será negativo ou positivo.

- 1 bit
- 1 byte ==> 8 bits
- 1 kilobyte ==> 1000 bytes
- 1 megabyte ==> 1000000 bytes
- 1 gigabyte ==> 1000000000 bytes
- 1 terabyte ==> 1000000000000 bytes

### Lembrando como converter um número binário para decimal...

43210

01010 

==> 0*(2^0) + 1*(2^1) + 0*(2^2) + 1*(2^3) + 0*(2^4) 

==> 0 + 2 + 0 + 8 + 0

==> 10

## Tipos Numéricos

- **byte**: 
    - 1 byte (ou 8 bits); no entanto, o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -128 à 127.
    - Se conseguíssemos usar todos os bits para representar o valor de um número, teríamos um intervalo de 0 à 255.
        - 00000000 ==> 0
        - 11111111 ==> 1+2+4+8+16+32+64+128 ==> 255
        - O bit mais significativo (bit mais à esquerda) é usado para representar se o número é positivo ou negativo:
            - 11111111 ==> (1+2+4+8+16+32+64)*(-1) ==> -127
            - 01111111 ==> (1+2+4+8+16+32+64)*(1) ==> 127
        - Lembrar que não faria sentido existir 00000000 e 10000000, pois não há zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o outro é usado como um valor negativo (que estende o intervalo de -127 para -128)

- **short**:
    - possui 16 bits (ou 2 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -32768 à 32767
        - 1111111111111111 ==> (1+2+4+8+16+32+64+128+256+512+1024+2048+4096+8192+16384)*(-1) ==> -32767
        - 0111111111111111 ==> 32767
        - 0000000000000000 ==> 0
        - 1000000000000000 ==> -32768
        - Lembrar que não faria sentido existir 0000000000000000 e 1000000000000000, pois não há zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o outro é usado como um valor negativo (que estende o intervalo de -32767 para -32768)

- **int**: 
    - possui 32 bits (ou 4 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -8.589.934.592 à 8.589.934.591

- **long**:
    - possui 64 bits (ou 8 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807


