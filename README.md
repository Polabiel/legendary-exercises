# legendary-exercises

📋 list of exercises by professor guilherme of Topics in Computing Systems

## Exercício 1

Qual o retorno deste programa para `funcao([83, 41, 5, 1, 59, 97], 2)`?

```java
public static int[] funcao ( int [] A , int i ) {
  A[1] = 17;
  A[i / 2] = 9;
  A[2 * i - 1] = 95;
  A[i - 1] = A [5] / 2;
  A[3] = A[ i ];
  A[i + 1] = A [ i ] + A [ i - 1];
  A[A [2] - 2] = 78;
  A[A [ i ] - 1] = A [1] * A [ i ] / 5;
  A[A [2] mod 2 + 2] = A[ i + 6 / 2] - A [ i - 1 * 2];
  return A;
}
```

> Resposta passo à passo: `[83, 24.6, -79, 14, 59, 48.5]`
>
> Resposta Correta depois de rodar o código: `[83, 17, 9, 95, 48.5, 5, 22]`

## Exercício 2

Qual o retorno deste programa para funcao(81)?

```java
public static int funcao(int n) {
        int p = 1;
        int r = n;
        while (p + 1 < r) {
            int q = (p + r) / 2;
            if (Math.pow(q, 2) <= n) {
                p = q;
            } else {
                r = q;
            }
        }
        return p;
    }
```

> Resposta: 81

## Exercício 3

O programa abaixo recebe um arranjo A de n números inteiros e o rearranja
de modo que seus elementos, ao final, estejam ordenados de forma decrescente.
Contudo, este programa possui alguns erros de lógica. Encontre-os e corrija-os.

```java
    public static int[] ordena(int[] A) {
        int i;
        int j;
        int chave;

        for (i = 1; i < A.length; i++) {
            chave = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > chave) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = chave;
        }
        return A;
    }
```

> Resposta: O erro está na linha 8, onde a condição do while está invertida. O correto é `A[j] < chave`.

## Exercício 4

```java
public class Ex04 {
    private static int busca1(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                return i;
            }
        }
        return -1;
    }

    private static int busca2(int[] A, int k) {
        int inicio = 0, fim = A.length;
        while (inicio < fim) {
            int meio = (inicio + fim) / 2;
            if (A[meio] == k) {
                return meio;
            }
            if (A[meio] < k) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int valor1 = busca1(A, 13);
        int valor2 = busca2(A, 13);
        System.out.prinln(valor1 + " - " + valor2);
    }
}
```

- _(A)_ Qual é o resultado da impressão da linha 31?
  Resposta: 13 - 13 = 0
- _(B)_ busca1 é "Melhor" do que busca2? Justifique sua resposta.
  Não, a busca1 é uma busca que traz para o usuario uma lentidão de acordo com a quantidade de elementos no array, já a busca2 é uma busca binária que é mais eficiente e rápida. fazendo com que o valores sejam particionados/divididos para eliminar certa para de valores que não são necessários para a busca. (O(log n))
  > [!IMPORTANT]
  > A busca binária é muito eficiente no entanto, ela só funciona em arrays ordenados.

## Exercício 5

Escreva um programa em Java que embaralhe um arranjo A de n inteiros.

```java
import java.util.Random;

public class Ex05 {
    public static int[] embaralhe(int[] A) {
        Random rand = new Random();

        for (int i = A.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        return A;
    }
}
```

> [!NOTE] Basicamente, o método `embaralhe` recebe um array de inteiros e embaralha os elementos do array. O método `nextInt` da classe `Random` gera um número aleatório entre 0 e o valor passado como parâmetro. O método `embaralhe` embaralha o array de trás para frente, trocando o elemento na posição `i` com o elemento na posição `j`, onde `j` é um número aleatório entre 0 e `i`.

## Exercício 6

Escreva um programa em Java uma função que encontre dois elementos de um arranjo `A` de `n` inteiros, distintos entre si, que somados seja igual a um determinado inteiro `k`.

> Resposta em baixo

```java
public class Ex06 {
    public static int[] funcao(int[] A, int k) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] + A[j] == k) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}
```

## Exercício 7

Escreva um programa em Java que remova os elementos duplicados de um arranjo `A` de `n` cadeias de caracteres.

```java
public class Ex07 {
    public static int[] funcao(int[] A) {
        int[] B = new int[A.length];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            boolean repetido = false;
            for (int k = 0; k < j; k++) {
                if (A[i] == B[k]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                B[j] = A[i];
                j++;
            }
        }
        return B;
    }
}

```
## Exercício 8

Escreva um programa em Java que organize um arranjo A de n inteiros de modo
que todos os inteiros negativos apareçam antes de todos os inteiros positivos.

```java
import java.util.Arrays;

public class OrganizaArray {
    public static void main(String[] args) {
        int[] arr = {-1, 3, -5, 7, 2, -4, 6, -8};
        organizeArray(arr);
        System.out.println("Array organizado: " + Arrays.toString(arr));
    }
    
    public static void organizeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            while (arr[left] < 0 && left < right) {
                left++;
            }
            while (arr[right] >= 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
```

## Exercício 9

Escreva um programa em Java que obtenha o elemento majoritário de um
arranjo A de n inteiros. Um elemento majoritário é um elemento que aparece
mais de n/2 vezes.

```java
import java.util.HashMap;
import java.util.Map;

public class ElementoMajoritario {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 2, 2};
        int majoritario = encontrarElementoMajoritario(arr);
        if (majoritario != -1) {
            System.out.println("Elemento majoritário: " + majoritario);
        } else {
            System.out.println("Não há elemento majoritário no array.");
        }
    }
    
    public static int encontrarElementoMajoritario(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = arr.length;
        
        // Conta a ocorrência de cada elemento
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Verifica se algum elemento tem ocorrência maior que n/2
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        
        // Retorna -1 se não houver elemento majoritário
        return -1;
    }
}
```
## Exercício 10
Escreva um programa em Java que encontre um elemento específico em um
arranjo A de n inteiros usando a busca por interpolação.

```java
public class BuscaInterpolacao {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int elemento = 13;
        int indice = buscaInterpolacao(arr, elemento);
        if (indice != -1) {
            System.out.println("Elemento encontrado na posição: " + indice);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }
    }
    
    public static int buscaInterpolacao(int[] arr, int elemento) {
        int esquerda = 0;
        int direita = arr.length - 1;
        
        while (esquerda <= direita && elemento >= arr[esquerda] && elemento <= arr[direita]) {
            // Fórmula da interpolação para encontrar a posição aproximada
            int posicao = esquerda + ((elemento - arr[esquerda]) * (direita - esquerda)) / (arr[direita] - arr[esquerda]);
            
            if (arr[posicao] == elemento) {
                return posicao;
            }
            
            if (arr[posicao] < elemento) {
                esquerda = posicao + 1;
            } else {
                direita = posicao - 1;
            }
        }
        
        return -1;
    }
}
```
