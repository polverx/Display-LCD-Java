# Display-LCD-Java
Este código tiene como función realizar el siguiente enunciado:

Objetivo: Crear un programa que imprime números en estilo de una pantalla LCD

Entrada: La entrada contiene varias líneas. Cada línea contiene 2 números separados por coma. El primer número representa el tamaño de la impresión (entre 1 y 10 – esta variable se llama “size”). El segundo número es el número a mostrar en la pantalla. Para terminar, se debe digitar 0,0. Esto terminará la aplicación.

Salida: Imprimir los números especificados usando el carácter “-“ para los caracteres horizontales, y “|” para los verticales. Cada dígito debe ocupar exactamente size+2 columnas y 2*size + 3 filas.

Entre cada impresión debe haber una línea blanca.



************************************

Para realizar este ejercicio se hizo un pequeño cambio con el "-" por un "--", dado que esto le brinda un tamaño un poco más uniforme a los números. 

************************************

Entrada:
```
2,15
4,589
0,0
```

Salida:

```
        ----  
     | |      
     | |      
        ----  
     |      | 
     |      | 
        ----  

 --------   --------   --------  
|          |        | |        | 
|          |        | |        | 
|          |        | |        | 
|          |        | |        | 
 --------   --------   --------  
         | |        |          | 
         | |        |          | 
         | |        |          | 
         | |        |          | 
 --------   --------   -------- 
```
 
