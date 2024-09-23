# Anotações do módulo 2

## Anatomia das Classes 1

Toda classe deve estar dentro da pasta `src`

Nome da classe com a primeira letra de cada palavra em maiúsculo.

**Exemplo:**
MinhaClasse;
CarrosUsados;
MinhasComprasNaShopee

````java
public class MinhaClasse {
    
}
````

Se minha classe é executável, ou seja, tem capacidade de inicializar o projeto, ela precisa ter o método principal (main).

````java
public class MinhaClasse {
    public static void main(String[] args) {
        
    }
}
````

```java
// System é uma classe
System.out.print("Sejam bem-vindos");
```

## Anatomia das Classes 2

### Padrão de Nomenclatura

- Todo Arquivo deve começar em letra Maiúscula.
**Exemplo:**
MinhaClasse.java;
CarrosUsados.java;
MinhasComprasNaShopee.java.
- **Nome da Classe no arquivo:** A classe deve possuir o mesmo nome do arquivo.
- **Nome de variáveis:** As variáveis deverão ser escritas com letras minúsculas, caso seja nome composto, usar camelCase.

>[!IMPORTANT]
>Existe uma regra adicional para variáveis quando queremos identificar que ela não sofrerá alterações de valor, exemplo: queremos que a variável `br` receba o valor "brasil" e nunca será mudado. Neste caso declaramos a variável em MAIUSCULO.

````java
String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;
int ANO_2000 = 2000;
````

Em conformidade com a idéia anterior, podemos adicionar a palavra reservada `final` para não permitir a mudança do valor da variável.

````java
final String BR = "Brasil";
final double PI = 3.14;
final int ESTADOS_BRASILEIROS = 27;
final int ANO_2000 = 2000;
````

>[!CAUTION]
>Para declarar uma variável, nós podemos utilizar caracteres,números e símbolos, porém, devemos seguir algumas regras da linguagem.
>
> - Deve conter apenas letras, _(underline), $ ou números de 0 a 9.
> - Deve obrigatóriamente se iniciar por uma letra, _ ou $, jamais número. (preferencialmente letra).
> - Deve iniciar com uma letra minúscula (boa pratica - ver abaixo).
> - Não pode conter espaços
> - Não podemos usar palavras-chave da linguagem.
> - O nome deve ser único dentro de um escopo.

`````java
// Declaração inválida de variáveis.

int numero&um = 1; // Só aceita o simbulo $
int 1numero = 1; // Não pode começar em número
int numero um = 1 // Não pode conter espaços
int long = 1; // Não pode ser uma palavra reservada
`````

## Anatomia das Classes 3

### Declarando variáveis e métodos

#### Declarando variáveis

````java
// Estrutura
Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; // observe que aqui a variável spike não tem valor, Dog é a Classe.
````

#### Declarando métodos

````java
// Estrutura
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
````

## Anatomia de Classes 4

### Identação

Basicamente, identar é um termo utilizado para escrever o código do programa de forma hierárquica.

>[!TIP] IDENTAÇÃO JAVA
No JAVA a identação não é fundamental para a compilação, sendo recomendada apenas por boa prática.

## Anatomia de Classes 5

### Organizando arquivos

A medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

#### Convenções de nome

Ao desenvolver um projeto, as empresas normalmente possúi uma finalidade `comercial`, `organizacional`, `open-source`

nesse sentido, poderemos ver como prefixo de um package os seguinte nomes:

- com.exemplo > comercial;
- org.exemplo > organizacional
- opensource.exemplo > open-source

Supondo o nome da empresa como `HyperTech` e o nome da aplicação como `notification`:

- `com.hypertech.notification.app`
- `com.hypertech.notification.model`
- `com.hypertech.notification.util`
- `com.hypertech.notification.service`

Supondo que vou organizar meus estudos:

- `edu.lucas.tema.logica`
- `edu.lucas.tema.controleFluxo`

ou então

- `edu.lucas.primeiraSemana`
- `edu.lucas.segundaSemana`

>[!NOTE] No VsCode
>
> 1. Crie uma pasta edu (dentro do `src`)
> 2. Crie uma pasta lucas (dentro de `edu`)
> 3. Crie uma pasta primeiraSemana (dentro de `lucas`)
>
> No arquivo adicionado na pasta primeiraSemana, deve conter uma declaração de `package` na primeira linha.
> Algo como:
>
> ````java
> package edu.lucas.segundaSemana;
>
>public class MinhaClasse {
>    
>}
>````

## Anatomia de Classes 6

### Java Beans

Uma das maiores dificuldades da programação é escrever algoritimos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

#### Variáveis

- Uma variável deve ser **clara**, sem abreviações ou definições sem sentido;
- Uma variável é **sempre no singular**, exceto quando se tratar de um array ou coleção.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
  
>[!CAUTION]Não recomendado
>
> ````java
>double salMedio = 1500; // abreviado
>String emails = "nome@gmail.com" // [plural] confuso, pois a variável só possui o valor de um único email
>````

#### Método

Os métodos deverão ser nomeados como **verbos**, através de uma mistura de letras minúsculas e maiúsculas. Em princípio, todas as letras que compõe o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

  >[!TIP] Exemplos sugeridos
  >
  >```java
  >somar(int n1, int n2){}
  >abrirConexao(){}
  >concluirProcessamento(){}
  >findById(){}
  >```

.

  >[!CAUTION] calcularImprimir(){} 
  > O exemplo acima não está bom, pois não sabemos se o método calcula ou imprime.
  
## Tipos Primitivos

>[!NOTE] Os oito tipos primitivos em java são:
int, byte, short, long, float, double, boolean e char - esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (Memory stack).

| **Tipo**  | **Memória** | **Valor Mínimo**           | **Valor Máximo**            |
|-----------|-------------|----------------------------|-----------------------------|
| `byte`    | 8 bits      | -128                       | 127                         |
| `short`   | 16 bits     | -32.768                    | 32.767                      |
| `int`     | 32 bits     | -2^31 (-2.147.483.648)     | 2^31 - 1 (2.147.483.647)    |
| `long`    | 64 bits     | -2^63 (-9.223.372.036.854.775.808) | 2^63 - 1 (9.223.372.036.854.775.807) |
| `float`   | 32 bits     | ~-3.4 * 10^38              | ~3.4 * 10^38                |
| `double`  | 64 bits     | ~-1.7 * 10^308             | ~1.7 * 10^308               |
| `char`    | 16 bits     | '\u0000' (0)               | '\uffff' (65.535)           |
| `boolean` | 1 bit       | `false` (0)                | `true` (1)                  |
---

````java
// byte: Um número inteiro de 8 bits (1 byte). Valores vão de -128 a 127.
byte idade = 25;

// short: Um número inteiro de 16 bits (2 bytes). Valores vão de -32.768 a 32.767.
short ano = 2024;

// int: Um número inteiro de 32 bits (4 bytes). Valores vão de -2^31 a 2^31 - 1.
int populacao = 1_000_000;

// long: Um número inteiro de 64 bits (8 bytes). Valores vão de -2^63 a 2^63 - 1.
long distancia = 123_456_789L;

// float: Um número de ponto flutuante de precisão simples (32 bits). Utilizado para números decimais.
float preco = 19.99f;

// double: Um número de ponto flutuante de precisão dupla (64 bits). Utilizado para números decimais com maior precisão que float.
double pi = 3.14159;

// char: Um caractere de 16 bits. Representa um único caractere Unicode.
char letra = 'A';

// boolean: Um valor lógico que pode ser true (verdadeiro) ou false (falso).
boolean ativo = true;

````
>[!CAUTION] Long e Float
tipo `long` e `float` precisam ser terminado com sua letra inicial.
>
>- `long distancia = 123_456_789L;`
>
>- `float preco = 19.99f;`

Apesar de o tipo float ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernoss, se tornou desnecessário utilizar os tipos `short` e `byte`, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo `long`, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria da vezes utilizaremos `int` para inteiros e `float` para números fracionados.

>[!TIP] Curiosidade sobre o int
Mesmo que tenhamos 4 tipos inteiros, a maior parte das vezes usamos o int por conta da compatibilidade da JVM.
>
>Literais inteiros em Java, como 10, são automaticamente tratados como int pela JVM, a menos que especificado de outra forma com um sufixo L para long.
>
>Exemplo:
>
>```java
>int valor = 100; // Literal 100 é um int por padrão
>```
>
>*Um número literal é um valor numérico diretamente representado no código-fonte de um programa, sem a necessidade de ser calculado ou derivado de variáveis. Em outras palavras, é um valor numérico escrito explicitamente no código.*

### Números começando com zero

Em Java, um número inteiro que começa com 0 é interpretado como um literal octal (base 8), e isso pode causar comportamentos inesperados se você não estiver ciente disso.

Exemplos:
Literal octal:

````java
int numero = 012;  // 012 é um literal octal, equivalente a 10 em decimal
````

Nesse exemplo, 012 não é interpretado como 12 em decimal, mas sim como 10 porque 012 é um número octal. No sistema octal, 012 significa `1 * 8 + 2 = 10` em decimal.

**Problemas Potenciais:**
Se você pretende usar um número decimal que começa com 0, como 012, mas não quer que ele seja interpretado como octal, isso pode levar a resultados incorretos.

**Como Evitar:**
Para garantir que um número seja interpretado como decimal, basta não começar com 0. Se você precisa trabalhar com números que poderiam ser confundidos com octais, ou você deve remover o zero inicial, ou usar uma representação adequada.

**Nota sobre outros literais:**

- Números que começam com 0x ou 0X são interpretados como literais hexadecimais (base 16).

- Números que começam com 0b ou 0B são interpretados como literais binários (base 2).

Esses prefixos indicam diferentes bases numéricas, mas apenas o prefixo 0 sem uma letra é interpretado como octal.

### Tipagem

>[!CAUTION] Java é fortemente tipado
Veja o cenário abaixo:
>
>````java
>// Declaração e >inicialização de um short
>short numeroCurto = 1;
>
>// Conversão >implícita de short para int (permitido)
>int numeroNormal = numeroCurto;
>
>// Tentativa de >conversão de int para short (erro de compilação)
>short numeroCurto2 = numeroNormal;
>````

#### Explicação:

- **Conversão de `short` para `int`:**
A linha `int numeroNormal = numeroCurto;` está correta porque há uma promoção automática de tipos menores (`short`) para tipos maiores (`int`). Essa conversão é feita de forma implícita pela JVM, sem necessidade de casting, pois não há risco de perda de dados.

- **Conversão de `int` para `short`:**
A linha `short numeroCurto2 = numeroNormal;` gera um erro de compilação. Isso ocorre porque `int` tem um intervalo maior do que `short`, então essa conversão não é permitida implicitamente. Em Java, o tipo `int` pode armazenar valores que excedem a capacidade de um `short`. Portanto, ao tentar atribuir um `int` a um `short`, a conversão precisa ser feita explicitamente com casting para indicar ao compilador que você está ciente dos riscos de possível perda de dados.

#### Solução:

Para corrigir o problema, é necessário fazer um casting explícito de `int` para `short`:

```java
short numeroCurto2 = (short) numeroNormal;
```

#### Considerações:

- Casting explícito pode resultar em perda de dados se o valor de int exceder o intervalo que short pode armazenar (de -32.768 a 32.767).

- Sempre que converter tipos maiores para menores, verifique se o valor está dentro do intervalo do tipo menor para evitar resultados inesperados.
  
## Variáveis e constantes

### Variável

 Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

 No java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esa a causa do nome "variável", pois o valor pode variar.

````java
int numero = 27;
````

### Constante

 Já as constantes são valores armazenados em memória que não podem ser modificados depois de declarados. Em java, esses valores são representados pela palavra `final`, seguida do tipo.

 >[!TIP] Identificador
 Por convenção, constantes são sempre escritas em CAIXA_ALTA.

````java
final int ANO_NASCIMENTO = 1998;
````

## Operadores em Java

### Operadores Aritméticos

Os operadores aritméticos são usados para realizar operações matemáticas básicas, como adição, subtração, multiplicação, e divisão.

| Operador | Descrição             | Exemplo            |
|----------|-----------------------|--------------------|
| `+`      | Adição                | `a + b`            |
| `-`      | Subtração             | `a - b`            |
| `*`      | Multiplicação         | `a * b`            |
| `/`      | Divisão               | `a / b`            |
| `%`      | Módulo (Resto)        | `a % b`            |

>[!NOTE] CONCATENADOR
O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

.

>[!WARNING] ATENÇÃO!
>A partir do momento em que é utilizado o (+) como concatenação, o java não reconhece mais como operador aritmético, apenas como concatenador.
>
>`Variavel = 1+1+1+"1"` = 31, sendo 3 da soma e concatenou o 1
>
>`Variavel = "1"+1+1+"1"` = 1111, sendo que concatenou todos os valores, pois após concatenar uma vez, não será mais possível fazer a conta.
>
>**Como burlar esse problema:**
>
> Utilizando parênteses para priorizar a conta antes de concatenar:
>
>`variavel = "1"+(1+1+1)` = 13, onde a soma foi feita primeiro e só depois foi concatenado.

### Operadores Unários

Os operadores unários realizam operações em apenas um operando. Eles incluem operações como incremento, decremento e mudança de sinal.

| Operador | Descrição                                 | Exemplo              |
|----------|-------------------------------------------|----------------------|
| `+`      | Indica valor positivo (normalmente implícito) | `+a`                 |
| `-`      | Negação do valor                          | `-a`                 |
| `++`     | Incremento (incrementa em 1)              | `a++` ou `++a`       |
| `--`     | Decremento (decrementa em 1)              | `a--` ou `--a`       |
| `!`      | Negação lógica (inverte valor booleano)   | `!true` (resulta em `false`) |

### Operadores Relacionais

Os operadores relacionais são usados para comparar dois valores e retornar um valor booleano (`true` ou `false`).

| Operador | Descrição              | Exemplo            |
|----------|------------------------|--------------------|
| `==`     | Igual a                | `a == b`           |
| `!=`     | Diferente de           | `a != b`           |
| `>`      | Maior que              | `a > b`            |
| `<`      | Menor que              | `a < b`            |
| `>=`     | Maior ou igual a       | `a >= b`           |
| `<=`     | Menor ou igual a       | `a <= b`           |

### Operadores Lógicos

Os operadores lógicos são usados para combinar duas ou mais expressões booleanas.

| Operador | Descrição              | Exemplo            |
|----------|------------------------|--------------------|
| `&&`     | E lógico (AND)         | `a && b`           |
| `\|\|`   | OU lógico (OR)         | `a \|\| b`         |
| `!`      | Negação lógica (NOT)   | `!a`               |

### Operador Ternário

O operador ternário é uma forma concisa de representar uma expressão condicional.

| Operador | Descrição                               | Exemplo                        |
|----------|-----------------------------------------|--------------------------------|
| `?:`     | Expressão condicional (if-else simplificado) | `condição ? valor1 : valor2` |

#### Exemplo de uso do operador ternário:

```java
int resultado = (a > b) ? a : b;

```

### Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador de atribuição mais básico é o `=`, mas existem versões combinadas com operadores aritméticos para facilitar a manipulação de valores.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `=`      | Atribuição simples                        | `a = b`            |
| `+=`     | Atribuição com adição                     | `a += b` (equivale a `a = a + b`) |
| `-=`     | Atribuição com subtração                  | `a -= b` (equivale a `a = a - b`) |
| `*=`     | Atribuição com multiplicação              | `a *= b` (equivale a `a = a * b`) |
| `/=`     | Atribuição com divisão                    | `a /= b` (equivale a `a = a / b`) |
| `%=`     | Atribuição com módulo                     | `a %= b` (equivale a `a = a % b`) |

### Operadores Bitwise

Os operadores bitwise permitem manipular os bits individuais de um valor inteiro. Eles são frequentemente usados em operações de baixo nível, como na programação de sistemas embarcados.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `&`      | E bit a bit (AND)                         | `a & b`            |
| `\|`      | OU bit a bit (OR)                         | `a \| b`            |
| `^`      | OU exclusivo bit a bit (XOR)              | `a ^ b`            |
| `~`      | Negação bit a bit (NOT)                   | `~a`               |
| `<<`     | Deslocamento de bits à esquerda           | `a << 2`           |
| `>>`     | Deslocamento de bits à direita            | `a >> 2`           |
| `>>>`    | Deslocamento de bits à direita sem sinal  | `a >>> 2`          |

### Operadores de Referência

Os operadores de referência são usados principalmente para manipular objetos e arrays em Java.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `.`      | Acesso a membro de objeto                 | `objeto.metodo()`  |
| `[]`     | Acesso a elementos de array               | `array[0]`         |
| `instanceof` | Verifica se um objeto é uma instância de uma classe | `objeto instanceof Classe` |

#### Exemplo de uso de operadores de referência:

```java
String nome = "Java";
System.out.println(nome.length());  // Usa o operador `.` para acessar o método `length`
```

## Métodos

### Critério de nomeação de métodos

- Deve ser nomeado como verbo
- Seguir o padão camelCase

>[!NOTE] Atenção!
>Não existe em **JAVA** o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

### Critério de definição de métodos

Mas, como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar a essa conclusão, somos auxiliados por uma convenção estrutural para os métodos. Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.

3. **Quais parâmetros serão necessários para execussão do método?** OS métodos as vezes precisão de argumentos como critérios para a execussão.
4. **O método possúi o risco de apresentar alguma excessão?** Excessões são comuns na execussão de métodos, as vezes é necessário prever e tratar a possível existência de uma excessão.
5. **Qual a visibilidade do método?** Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível da própria classe.

>[!NOTE] 
Caso o método não retorne nenhum valor, ele será representado pela palavra chave `void`

#### Quando usar um método que retorna um valor

- Quando o método realiza um cálculo e você precisa do resultado desse cálculo.
- Quando o método busca ou obtém dados que são necessários para outras partes do programa.
- Quando a lógica do método precisa informar algum resultado ao chamador.

#### Quando usar um método que não retorna um valor

- Quando o método está realizando uma ação, como imprimir uma mensagem ou atualizar o estado de um objeto, e não precisa fornecer um valor de volta.
- Quando a operação realizada pelo método é apenas um efeito colateral, como alterar o estado de um objeto ou modificar uma variável global.
- Quando o método realiza uma operação que não tem um "resultado" que o chamador precisa capturar.

## Escopo

## Palavras Reservadas

Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com **letra minúscula**, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por sua finalidades.

### Controle de Pacotes

- **`import`**: Importa pacotes ou classes para dentro do código.
- **`package`**: Especifica a que pacote todas as classes de um arquivo pertencem.

### Modificadores de Acesso

- **`public`**: Acesso de qualquer classe.
- **`private`**: Acesso apenas dentro da classe.
- **`protected`**: Acesso por classes no mesmo pacote e subclasses.

### Tipos Primitivos

- **`boolean`**: Um valor indicando verdadeiro ou falso.
- **`byte`**: Um inteiro de 8 bits (signed).
- **`char`**: Um caractere Unicode (16-bit unsigned).
- **`double`**: Um número de ponto flutuante de 64 bits (signed).
- **`float`**: Um número de ponto flutuante de 32 bits (signed).
- **`int`**: Um inteiro de 32 bits (signed).
- **`long`**: Um inteiro de 64 bits (signed).
- **`short`**: Um inteiro de 16 bits (signed).
- **`void`**: Indica que o método não tem retorno de valor.

### Modificadores de Classes, Variáveis ou Métodos

- **`abstract`**: Classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.
- **`class`**: Especifica uma classe.
- **`extends`**: Indica a superclasse que a subclasse está estendendo.
- **`final`**: Impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
- **`implements`**: Indica as interfaces que uma classe irá implementar.
- **`interface`**: Especifica uma interface.
- **`native`**: Indica que um método está escrito em uma linguagem dependente de plataforma, como C.
- **`new`**: Instancia um novo objeto, chamando seu construtor.
- **`static`**: Faz um método ou variável pertencer à classe ao invés de às instâncias.
- **`strictfp`**: Usado em frente a um método ou classe para garantir que os números de ponto flutuante sigam as regras de ponto flutuante em todas as expressões.
- **`synchronized`**: Indica que um método só pode ser acessado por uma thread de cada vez.
- **`transient`**: Impede a serialização de campos.
- **`volatile`**: Indica que uma variável pode ser alterada durante o uso de threads.

### Controle de Fluxo Dentro de um Bloco de Código

- **`break`**: Sai do bloco de código em que está.
- **`case`**: Executa um bloco de código dependendo do teste do `switch`.
- **`continue`**: Pula a execução do código que viria após essa linha e vai para a próxima iteração do loop.
- **`default`**: Executa esse bloco de código caso nenhum dos testes de `switch-case` seja verdadeiro.
- **`do`**: Executa um bloco de código uma vez, e então realiza um teste em conjunto com o `while` para determinar se o bloco deverá ser executado novamente.
- **`else`**: Executa um bloco de código alternativo caso o teste `if` seja falso.
- **`for`**: Usado para realizar um loop condicional sobre um bloco de código.
- **`if`**: Usado para realizar um teste lógico de verdadeiro ou falso.
- **`instanceof`**: Determina se um objeto é uma instância de determinada classe, superclasse ou interface.
- **`return`**: Retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável).
- **`switch`**: Indica a variável a ser comparada nas expressões `case`.
- **`while`**: Executa um bloco de código repetidamente enquanto a condição for verdadeira.

### Tratamento de Erros

- **`assert`**: Testa uma expressão condicional para verificar uma suposição do programador.
- **`catch`**: Declara o bloco de código usado para tratar uma exceção.
- **`finally`**: Bloco de código, após um `try-catch`, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção.
- **`throw`**: Usado para lançar uma exceção para o método que o chamou.
- **`throws`**: Indica que um método pode lançar uma exceção para o método que o chamou.
- **`try`**: Bloco de código que tentará ser executado, mas que pode causar uma exceção.

### Variáveis de Referência

- **`super`**: Refere-se à superclasse imediata.
- **`this`**: Refere-se à instância atual do objeto.

### Palavras Reservadas Não Utilizadas

- **`const`**: Não utilize para declarar constantes; use `public static final`.
- **`goto`**: Não implementada na linguagem Java por ser considerada prejudicial.

### Literais Reservados

- **`null`**, **`true`**, e **`false`**: São tecnicamente valores literais, e não palavras-chave. Tentar criar identificadores com esses valores resultará em um erro de compilação.

### Escopo de Uso

| **Uso**   | **Palavras**                              | **Observação**                                                   |
|-----------|------------------------------------------|------------------------------------------------------------------|
| **Arquivo** | `package`, `import`, `static`           | `package` define o diretório da classe, `import` indica de onde a classe será importada, `static` faz um membro pertencer à classe. |
| **Classe** | `public`, `protected`, `private`, `final`, `abstract`, `extends`, `implements` | `public`, `protected`, e `private` determinam o acesso; `final` evita herança; `abstract` define uma classe que não pode ser instanciada ou métodos que devem ser implementados por subclasses; `extends` define uma superclasse; `implements` indica a implementação de interfaces. |
| **Método** | `public`, `protected`, `private`, `static`, `final`, `abstract`, `void`, `return` | `public`, `protected`, e `private` determinam o acesso; `static` define métodos de classe; `final` impede a sobrescrita; `abstract` define métodos que devem ser implementados por subclasses; `void` indica ausência de retorno; `return` é usado para devolver um valor. |
| **Atributo** | `public`, `protected`, `private`, `static`, `final`, tipo primitivo | `public`, `protected`, e `private` determinam o acesso; `static` faz o atributo pertencer à classe; `final` impede a modificação do valor; tipo primitivo define o tipo de dado. |

### Palavras "Opostas"

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas (antônimas) na linguagem Java conforme tabela abaixo:

| **Palavra** | **Palavra Oposta** | **Explicação**                                                  |
|-------------|---------------------|-----------------------------------------------------------------|
| `package`   | `import`            | `package` define o diretório onde a classe reside; `import` indica de onde a classe será importada. Classes com nomes iguais podem estar em pacotes diferentes. |
| `extends`   | `implements`        | `extends` define que uma classe estende outra classe; `implements` define que uma classe implementa uma interface. Não há uma relação inversa direta entre esses dois. |
| `final`     | `abstract`          | `final` impede a modificação de valor ou comportamento; `abstract` define que métodos ou classes devem ser implementados por subclasses. Se uma classe tem um método abstrato, ela própria deve ser abstrata. |
| `throws`    | `throw`             | `throws` indica que um método pode lançar uma exceção; `throw` é usado para lançar efetivamente uma exceção. Essas palavras são usadas em contextos diferentes para manipulação de exceções. |

## Documentação

O JavaDoc é uma ferramenta que gera documentação de código-fonte Java em formato HTML. Ele lê os comentários do tipo /** ... */ no código e transforma essas anotações em documentação estruturada.

Como Escrever Comentários JavaDoc
Para criar JavaDocs, você escreve comentários especiais diretamente acima da declaração de uma classe, método ou campo. Esses comentários geralmente começam com /** e terminam com */.

### Tags

| **Tag**  | **Descrição** |
|----------|---------------|
| `@autor` | Autor / Criador |
| `@version` | Versão do recurso disponibilizado |
| `@since` | Versão / Data de início da disponibilização do recurso |
| `@param` | Descrição dos parâmetros dos métodos criados |
| `@return` | Definição do tipo de retorno de um método |
| `@throws` | Se o método lança alguma exceção |

````java
 /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
  public int somar(int numeroUm, int numeroDois) {
    return  numeroUm + numeroDois;
}

````

### Tipo de comentários

- One Line

```java
// Olá, eu sou um comentário em uma única linha
```

- Multi Line
  
````java
  /* Olá,
 * Eu sou um comentario
 * que posso ser mais detalhadod
 * quando necessário
 */
````

- Documentation
  
````java
  /** 
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */
````

### Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

**Criando nossa documentação no formato html para disponibilizar via web.**

Para gerar a documentação JavaDoc, você usa o comando javadoc no terminal, apontando para o arquivo .java:

````shell
javadoc -d diretorio_de_saida NomeDoArquivo.java

````

- **-d:** Especifica o diretório onde a documentação gerada será armazenada.
  
- **NomeDoArquivo.java:** O arquivo ou arquivos que contêm o código-fonte.
  
Após a execução, o JavaDoc criará uma série de arquivos HTML no diretório especificado, que poderão ser visualizados em um navegador web.

**Outro exemplo**

````shell
// No terminal execute o comando abaixo

javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

````

O comando que você forneceu é usado para gerar a documentação JavaDoc a partir dos arquivos-fonte Java localizados no diretório `src`. Aqui está a explicação de cada parte do comando:

- **`javadoc`**: Este é o comando para gerar a documentação JavaDoc.

- **`-encoding UTF-8`**: Especifica que o encoding dos arquivos-fonte Java está em UTF-8.

- **`-docencoding ISO-8859-1`**: Define que a documentação gerada será codificada em ISO-8859-1, uma codificação de caracteres comumente usada para idiomas ocidentais.

- **`-d ../docs`**: Define o diretório de saída para a documentação gerada. Neste caso, a documentação será armazenada no diretório `docs`, que está um nível acima do diretório atual.

- **`src/*.java`**: Indica que todos os arquivos `.java` no diretório `src` devem ser processados para gerar a documentação.

Em resumo, esse comando gera a documentação JavaDoc para todos os arquivos `.java` na pasta `src`, garantindo que o encoding dos arquivos seja respeitado e que a documentação gerada seja armazenada na pasta `docs`, um nível acima do diretório atual.

## Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou nossos clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa ?

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso iremos aprender como executar um programa Java via terminal como MS - DOS ou terminal do VsCode.

>[!NOTE]
>Observe que nosso projeto Java criado por um IDE, ele terá uma pasta chamada `bin`. É nesta pasta que ficarão os arquivos `.class`, o nosso `bytecode`.

### Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o MS-DOS ou Power Shell

2. Localize o diretório do seu projeto: cd C:\estudos\dio-trilha-java-basico\java-terminal

3. Acesse a pasta bin: `cd bin`
4. Agora digite o comando:`java MinhaClasse` (nome da sua classe sem a extensão .classir) incluindo o pacote ex: `java educ/lucas/curso01/MinhaClasse`. **Tem que ser executado a partr da pasta bin.**

### Pasta bin

A pasta bin é onde guardamos nossas classes compilads com extenção `.class`.

O processo é feito automaticamente pelo vscode, podemos verificar o arquivo .vscode/settings.json para configurar o `outputPath`.

### Compilação Múltipla

>[!NOTE] Usei esse método para corrigir um erro que tinha na pasta bin
> Na ocasião, as novas classes não estavam indo para a pasta bin. Logo, excluí a pasta bin inteira e usei o código recomendado abaixo

Se uma classe tiver dependencias de uma segunda classe e estiverem no mesmo pacote ou diretório, você pode precisar compilar ambas as classes ao mesmo tempo. Tente compilar todos os arquivos `.java` no pacote:

```shell
javac -d bin modulo-02/projeto-m2/src/educ/lucas/curso01/*.java
```

1. `javac` - Este é o compilador de Java. Ele converte arquivos .java (código-fonte Java) em arquivos .class (bytecode Java), que podem ser executados pela Java Virtual Machine (JVM).
2. `-d bin` - A opção -d seguida de bin especifica o diretório de destino onde os arquivos .class compilados serão colocados.
   - bin é o diretório de saída para os arquivos compilados. Após a compilação, a estrutura de diretórios dentro de bin refletirá a estrutura dos pacotes no código-fonte.
  
3. `modulo-02/projeto-m2/src/educ/lucas/curso01/*.java`

  Esse caminho especifica a localização dos arquivos de código-fonte `.java` que serão compilados.

  `*.java` indica que todos os arquivos `.java` dentro do diretório `educ/lucas/curso01` devem ser compilados. O `*` é um coringa que seleciona todos os arquivos que terminam com `.java.`

#### O Que Acontece Quando Você Executa Esse Comando

- Localização dos Arquivos: O compilador `javac` vai até o diretório `modulo-02/projeto-m2/src/educ/lucas/curso01/` e identifica todos os arquivos `.java`.
  
- Compilação: Cada arquivo `.java` é compilado e transformado em um arquivo `.class`.
- Diretório de Saída: Os arquivos `.class` resultantes são colocados no diretório `bin`, seguindo a estrutura de pacotes. Por exemplo, se você tiver um arquivo `Usuario.java` que declara `package educ.lucas.curso01;`, o compilador criará o arquivo `bin/educ/lucas/curso01/Usuario.class`.

### Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:
`java MinhaClasse agumentoUm argumentoDois`


````java
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
````

Adicionando argumentos nas configurações do vscode para executar o arquivo já com os argumentos.

1. Na barra de ferramentas (menu superior), procure `Executar`.
2. Clique em `Adicionar configuração` ou `Abrir configuração`
3. No arquivo de configuração (`launch.json` dentro de `.vscode`), procure o bloco correspondente ao seu arquivo.
4. adicione os argumentos. Ex: 

````json
 "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "AboutMe",
            "request": "launch",
            "mainClass": "educ.lucas.curso01.AboutMe",
            "projectName": "projeto-m2_e3d2a5a1",
            /* argumentos adicionados */
            "args": ["Lucas","Gerhardt","26","1.80"]
        }

````

Executando o programa agora no terminal

````shell
cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin

java AboutMe GLEYSON SAMPAIO 28 1.58

````

>[!NOTE] É preciso garantir que o arquivo tenha sido compilado e criado o arquivo .class na pasta bin

### Scanner

Nos exemplos anteriores percebemos que podemos receber dados digitados pelo usuário do nosso sistema, porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras agora vamos receber estes dados via **Scanner**.

A classe **Scanner** permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa `AboutMe` para deixar mais intuitivo aos usuários.

>[!CAUTION] Problemas com métodos next() nextInt() nextLine() etc...
> Estava tentando resolver um desafio do bootcamp, onde tinha que usar a classe scanner e pedir ao usuário pra inserir a resposta no terminal.
> O problema veio ao precisar informar o nome completo. O método `next()` não pega o nome completo, apenas a próxima cadeia de string, ou seja, ao digitar "Lucas Gerhardt" ele só pega o Lucas e não consegue ler o Gerhardt. Enfim, tava dando esse erro. Corrigi adicionando o método `nextLine()`no lugar, porém apareceu outro problema.
>
> **nextLine()**
>
> Quando usamos os métodos next(), nextInt(), nextDouble() e semelhantes, o scanner lê o valor que você digitou, mas ele não "pega" a tecla Enter `(\n)` que você pressiona depois de digitar o valor. Essa tecla Enter fica "presa" no buffer de entrada.
>
> Depois disso, quando você chama `scanner.nextLine()`, ele vê essa tecla Enter que ficou no buffer e pensa que você quer dizer "ok, terminei de digitar", então ele não te dá a chance de digitar mais nada e pula direto para a próxima parte do código.
>
> Para evitar isso, a gente coloca um `scanner.nextLine()` extra logo depois de `scanner.next()`ou `scanner.nextInt()`. Esse `scanner.nextLine()` extra vai capturar a tecla Enter que ficou no buffer, limpando o caminho para que o próximo `scanner.nextLine()` realmente funcione como esperado, permitindo que você digite o nome completo sem problemas.

````java
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Captura um número inteiro
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpa a nova linha deixada por nextInt()

        // Captura uma única palavra
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        scanner.nextLine();  // Limpa a nova linha deixada por next()

        // Captura uma linha inteira de texto
        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        // Captura um número de ponto flutuante
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  // Limpa a nova linha deixada por nextDouble()

        // Exibe as informações capturadas
        System.out.println("+++++++++++++++++");
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));
    }
}


````

**Resumo das Boas Práticas:**

Use `nextLine()` para ler linhas inteiras de texto.

Use `next()`, `nextInt()`, `nextDouble()` para ler valores específicos, mas sempre lembre de limpar o buffer depois.

Sempre adicione `scanner.nextLine()` após n`extInt()`, `nextDouble()`, `next()`, etc., antes de usar `nextLine()` novamente.

**Quando Não Limpar o Buffer:**

Se você estiver usando apenas `nextLine()` em seu código, não precisará se preocupar com a limpeza do buffer, pois ele já captura a nova linha corretamente.

## Controles de fluxo

### Classificação

- Estruturas condicionais: if-else, switch-case
- Estruturas de repetição: for, while, do-while
- Estruturas de exceções: try-catch-finally, throw
  
