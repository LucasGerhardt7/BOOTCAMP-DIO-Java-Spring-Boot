# CONTROLE DE FLUXO

## ESTRUTURAS CONDICIONAIS

As estruturas condicionais em Java permitem que o programa tome decisões e execute diferentes blocos de código com base em condições específicas.

### 1. if

A estrutura `if` é usada para executar um bloco de código se uma condição específica for verdadeira.

```java
if (condicao) {
    // Bloco de código a ser executado se a condição for verdadeira
}
```

### 2. if-else

A estrutura if-else permite que o programa execute um bloco de código se a condição for verdadeira e outro bloco se a condição for falsa.

````java
if (condicao) {
    // Bloco de código a ser executado se a condição for verdadeira
} else {
    // Bloco de código a ser executado se a condição for falsa
}
````

### 3. if-else if-else

Quando há várias condições para verificar, a estrutura if-else if-else pode ser usada. Ela permite que você verifique múltiplas condições em sequência.

````java

if (condicao1) {
    // Bloco de código a ser executado se a condição1 for verdadeira
} else if (condicao2) {
    // Bloco de código a ser executado se a condição2 for verdadeira
} else {
    // Bloco de código a ser executado se nenhuma condição anterior for verdadeira
}
````

### 5. Operador Ternário

O operador ternário é uma forma compacta de escrever uma condição if-else. Ele avalia uma expressão e retorna um valor com base em uma condição.

````java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
````

### 4. switch

A estrutura switch é usada quando você deseja comparar uma variável com múltiplos valores possíveis e executar diferentes blocos de código com base no valor correspondente.

````java
switch (variavel) {
    case valor1:
        // Bloco de código a ser executado se variavel == valor1
        break;
    case valor2:
        // Bloco de código a ser executado se variavel == valor2
        break;
    // ...
    default:
        // Bloco de código a ser executado se nenhum dos casos anteriores for satisfeito
        break;
}
````

>[!NOTE] Notas sobre switch:
>
> O uso de break é importante para evitar a execução em cascata dos casos.
O bloco default é opcional, mas útil para tratar valores inesperados.
>[!WARNING]
Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação em informar a palavra `break` em cada alternativa.

Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

* O sistema terá 03 planos: BASIC, MIDIA , TURBO
* BASIC: 100 minutos de ligação
* MIDIA: 100 minutos de ligação + Whats e Intagram grátis
* TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube

```java
// Modo condicional convencional
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
        }else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
            System.out.println("5Gb Youtube");
        }
    }
}

```

```java
// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
```

>[!WARNING]
Se optarem por usar **`switch`** / **`case`**, estudem um  pouco mais sobre os conceitos de **`continue`**, **`break`** e **`default`**

## ESTRUTURAS DE REPETIÇÃO

>Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.
https://diegomariano.com/lacos-de-repeticao-2/

Laços ou repetições são representados pelas seguintes estruturas:

* For (para)
* While (enquanto)
* Do While (faça enquanto)

### 1. for

A estrutura for é usada quando você sabe o número específico de vezes que deseja repetir um bloco de código.

```java
for (inicializacao; condicao; incremento) {
    // Bloco de código a ser executado
}
```

EXEMPLO:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i: " + i);
}
```

#### O que acontece

O for é composto de três partes:

1. **Inicialização**: int i = 0; - Executa uma vez no início do loop.
2. **Condição**: i < 5; - Verifica se a condição é verdadeira antes de cada iteração.
3. **Incremento**: i++; - Executa após cada iteração para atualizar o contador.

#### for-each

O for-each é usado para iterar sobre elementos de uma coleção (como arrays ou listas) sem a necessidade de um índice.

```java
// ExemploFor.java
public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

            //Forma abreviada
        for(String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
```

1. `String aluno : alunos` -> De forma abreviada é criada uma variável `nome` obtendo um elemento do vetor a cada ocorrência.
2. A impressão de cada aluno é realizada.

### break e continue

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **`break`** interrompe o laço, já o **`continue`** interrompe somente a iteração atual.

### While

O laço **`while`** (na tradução literal para a língua portuguesa “enquanto”) determina que enquanto uma condição for válida, o bloco de código será executado. O laço **`while`** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe do controle de repetição **`while`** é exibida abaixo:

```
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

### Do While

O laço **`do / while`** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, **`do / while`** testa a condição após executar o código,sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **`do / while`** é exibida abaixo:

```

//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
```

## Estrutura de exceção

### Exceções

Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma **exceção** (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e os demais não são erros mas sim fluxos não previstos pela aplicação.

É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de _**Tratamento de Exceções**_.

### Conhecendo algumas exceções já mapeadas

A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

| Nome                           | Causa                                                                |
| ------------------------------ | -------------------------------------------------------------------- |
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variável nula.        |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero.                           |
| java.sql.SQLException          | Quando existe algum erro relacionado a interação com banco de dados. |
| java.io.FileNotFoundException  | Quando tentamos ler ou escrever em um arquivo que não existe.        |

### Tratamento de exceções

E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução **`try`** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.&#x20;

A instrução **`catch`** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.&#x20;

A instrução **`finally`** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares:&#x20;

Estrutura de um bloco com try e catch

```java
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
```

>[!WARNING]
O bloco **`try`** / **`catch`** pode conter um conjunto de **catchs** correspondentes a cada exceção que **prevista** em uma funcionalidade do programa.


### Hierarquia das exceções

A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou _Exceções Checadas e Não Checadas_.&#x20;

>[!NOTE]
O que determina uma exceção ser classificado como **checada** ou **não checada** ?\
É o risco dela ser disparada logo você precisa tratá-la, exemplo:


Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto contém Alfanuméricos.

```java
public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}
```

>[!NOTE]
As linhas 3 e 5 apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma exceção checada, logo nós programadores que iremos usar este método teremos que tratá-la explicitamente com **`try \ catch`**.

### Exceções customizadas

Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

* Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.
* Primeiro criamos nossa exceção:

```java
public class CepInvalidoException extends Exception {}
```

* Em seguida criamos nosso método de formatação de cep.

```java
static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
```

#### Referências

https://www.w3schools.com/java/java_try_catch.asp

https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html

>[!CAUTION]Unhandled exception
>Em Java, as exceções são divididas em dois tipos principais:
>
> - Unchecked Exceptions (Exceções não verificadas): São subclasses de RuntimeException. Não é obrigatório tratá-las com um bloco try-catch ou declarar no método com throws.
>
> - Checked Exceptions (Exceções verificadas): São exceções que não são subclasses de RuntimeException. O compilador exige que elas sejam tratadas explicitamente no código, seja com um bloco try-catch ou declarando no método que a exceção pode ser lançada usando a palavra-chave throws.
>
> Quando você vê a mensagem "Unhandled exception type", significa que o compilador detectou que uma exceção verificada pode ser lançada por algum código, mas não há um bloco try-catch para tratá-la, e o método não declarou que pode lançar essa exceção com throws.