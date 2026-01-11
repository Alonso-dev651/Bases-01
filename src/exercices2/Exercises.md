# Ejercicios de Bucles en Java

---

## Ejercicio 1 – Imprimir números del 1 al 10
**Tema:** `for`

### Instrucciones
Pide al usuario su edad y muestra:
Muestra en pantalla los números del 1 al 10.

### Ejemplo de salida
****

``` 
1 2 3 4 5 6 7 8 9 10
```

## Ejercicio 2 – Sumar los primeros 5 números
**Tema:** `for`

### Instrucciones
Calcula la suma de los números del 1 al 5 y muestra el resultado.

### Ejemplo de salida
****

``` 
La suma es: 15
```

### Pista
```java
suma += i;
```

## Ejercicio 3 – Contar hacia atrás
**Tema:** `for`

### Instrucciones
Muestra los números del 10 al 1 (de forma descendente).

### Ejemplo de salida
****

``` 
10 9 8 7 6 5 4 3 2 1
```

## Ejercicio 4 – Mostrar solo números pares del 1 al 20
**Tema:** `while`

### Instrucciones
Usa un bucle `while` para mostrar solo los números pares del 1 al 20.

### Ejemplo de salida
****

``` 
2 4 6 8 10 12 14 16 18 20
```

### Pista
Usa if `(i % 2 == 0)` para verificar si es par.

## Ejercicio 5 – Contar hasta que el usuario escriba 0
**Tema:** `while`

### Instrucciones
Pide números al usuario y sigue pidiendo hasta que ingrese 0. Luego muestra cuántos números ingresó.

### Ejemplo de salida
****

``` 
Ingrese un número: 5
Ingrese un número: 3
Ingrese un número: 0
Ingresaste 2 números.
```

### Pista
Necesitas un contador `(int contador = 0;)` y un bucle que pare cuando el número sea 0.

## Ejercicio 6 – Validar contraseña
**Tema:** `do-while`

### Instrucciones
Simula un login simple: Pide una contraseña hasta que el usuario escriba "1234". Cuando lo haga, muestra "Acceso concedido".
### Ejemplo de salida
****

``` 
Ingrese la contraseña: 0000
Incorrecta, intente de nuevo.
Ingrese la contraseña: 1234
Acceso concedido.
```

### Pista
El `do-while` sirve porque al menos debe pedirse una vez la contraseña.

## Ejercicio 7 – Tabla de multiplicar
**Tema:** `for`

### Instrucciones
Pide un número y muestra su tabla de multiplicar del 1 al 10.

### Ejemplo de salida
****

``` 
Ingrese un número: 5
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

## Ejercicio 8 – Contar dígitos
**Tema:** `while`

### Instrucciones
Pide un número entero positivo y muestra cuántos dígitos tiene.

### Ejemplo de salida
****

``` 
Ingrese un número: 12345
Tiene 5 dígitos
```

### Pista
Divide entre 10 en cada iteración hasta que el número sea 0.

## Ejercicio 9 – Sumar números pares e impares por separado
**Tema:** `for`

### Instrucciones
Del 1 al 20, muestra la suma de los números pares y la de los impares por separado.

### Ejemplo de salida
****

``` 
Suma de pares: 110
Suma de impares: 100
```

## Ejercicio 10 – Triángulo de asteriscos
**Tema:** `for` anidado

### Instrucciones
Muestra un triángulo como el siguiente:

### Ejemplo de salida
****

``` 
*
**
***
****
*****
```

### Pista
Usa un `for` dentro de otro `for`.

## Ejercicio 11 – Invertir un número
**Tema:** `while`

### Instrucciones
Pide un número (por ejemplo, 1234) y muestra su versión invertida (4321).

### Pista
Usa el operador `%` para obtener el último dígito y `/= 10` para eliminarlo.

## Ejercicio 12 – Menú interactivo
**Tema:** `do-while` + `switch`

### Instrucciones
Crea un programa que muestre el siguiente menú:


``` 
1. Mostrar saludo
2. Mostrar fecha actual
3. Salir
```