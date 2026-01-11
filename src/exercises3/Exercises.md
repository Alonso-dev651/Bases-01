# Ejercicios de Break y Continue en Java

---
## Ejercicio 1 – Detener el conteo
**Tema:** `break`

### Instrucciones
Usa un bucle `for` que cuente del 1 al 10.
Pero cuando llegue al número 7, detén el bucle con `break`.

### Ejemplo de salida
****
``` 
1 
2 
3 
4 
5 
6 
Fin del bucle.
```

### Pista
```java
if (i == 7) break;
```

## Ejercicio 2 – Saltar números pares
**Tema:** `continue`

### Instrucciones
Muestra solo los números impares del 1 al 10, usando un bucle for y continue.

### Ejemplo de salida
****

``` 
1
3
5
7
9
```

### Pista
```java
if (i % 2 == 0) continue;
```


## Ejercicio 3 – Buscar un número
**Tema:** `break`

### Instrucciones
Usa un bucle `for` para recorrer los números del 1 al 100. Cuando llegues al número 42, muestra el mensaje "¡Encontrado!" y detén el bucle.

### Ejemplo de salida
****
``` 
Buscando...
Buscando...
...
¡Encontrado!
```

### Pista
Coloca un `if (i == 42)` dentro del bucle y usa `break;` para detenerlo.

## Ejercicio 4 – Saltar múltiplos de 3
**Tema:** `continue`

### Instrucciones
Muestra los números del 1 al 15, excepto los que son múltiplos de 3.

### Ejemplo de salida
****
``` 
1
2
4
5
7
8
10
11
13
14
```

### Pista
Usa la condición:
```java
if (i % 3 == 0) continue;
```

## Ejercicio 5 – Adivinar número secreto
**Tema:** `break`

### Instrucciones
Crea un número secreto (por ejemplo 7) y usa un bucle `while` para pedir al usuario que adivine el número. El programa termina cuando el usuario acierta.

### Ejemplo de salida
****
``` 
Adivina el número (entre 1 y 10): 5
Incorrecto.
Adivina el número (entre 1 y 10): 7
¡Correcto! Has adivinado el número.
```

### Pista
Usa `Scanner` para leer el número ingresado y un `break` cuando lo acierte.

## Ejercicio 6 – Menú con salida
**Tema:** `do-while` + `break`

### Instrucciones
Crea un menú que se repita hasta que el usuario elija “3” (salir):
``` 
1. Mostrar saludo
2. Mostrar número aleatorio
3. Salir
``` 

Cuando elija la opción 3, usa break para finalizar el bucle.

### Pista
Usa `do { ... } while(true);` y dentro un `switch(opcion)`.