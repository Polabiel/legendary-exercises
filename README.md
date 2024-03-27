# legendary-exercises
📋 list of exercises by professor guilherme of Topics in Computing Systems

## Qual o retorno deste programa para `funcao([83, 41, 5, 1, 59, 97], 2)`?
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
> Resposta passo à passo:  `[83, 24.6, -79, 14, 59, 48.5]`
> 
> Resposta Correta depois de rodar o código: `[83, 17, 9, 95, 48.5, 5, 22]`
