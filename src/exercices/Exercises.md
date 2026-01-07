# Ejercicios de Control de Flujo en Java

---

## Ejercicio 1 – Mayor o menor de edad
**Tema:** `if / else`

### Instrucciones
Pide al usuario su edad y muestra:
- **"Eres mayor de edad"** si tiene 18 o más.
- **"Eres menor de edad"** si tiene menos de 18.

### Ejemplo de salida
****

``` 
Ingresa tu edad: 17
Eres menor de edad
```

### Pista
```java
Scanner sc = new Scanner(System.in);
int edad = sc.nextInt();
```
## Ejercicio 2 – Calificación del estudiante
**Tema:** `if / else if / else`

### Instrucciones
Pide una nota (0–20) y muestra:
- **"Excelente"** si es mayor o igual a 18.
- **"Aprobado"** si está entre 11 y 17.
- **"Desaprobado"** si es menor que 11.

### Ejemplo de salida
****

``` 
Ingresa tu nota: 15
Aprobado
```
## Ejercicio 3 – Día de la semana
**Tema:** `switch`

### Instrucciones
Pide un número del 1 al 7 y muestra el día correspondiente:
- 1 → Lunes
- 2 → Martes
- 3 → Miércoles
- 4 → Jueves
- 5 → Viernes
- 6 → Sábado
- 7 → Domingo

Si el número no está entre 1 y 7, muestra **"Número inválido"**.

### Ejemplo de salida
****

``` 
Ingresa un número del 1 al 7: 3
Miércoles
```

---

## Ejercicio 4 – Calculadora básica
**Tema:** `switch` con operaciones

### Instrucciones
Pide dos números y una operación (`+`, `-`, `*`, `/`).  
Usa `switch` para realizar la operación y mostrar el resultado.

### Ejemplo de salida
****

``` 
Ingrese el primer número: 10
Ingrese el segundo número: 5
Ingrese la operación (+, -, *, /): *
Resultado: 50
```

---

## Ejercicio 5 – Par o impar
**Tema:** `if / else`

### Instrucciones
Pide un número entero y muestra si es **par** o **impar**.

### Ejemplo de salida
****

``` 
Ingresa un número: 8
El número es par
```

### Pista
Usa el operador módulo `%`.

---

## Ejercicio 6 – Clasificación de edades
**Tema:** `if / else if / else`

### Instrucciones
Pide la edad de una persona y clasifícala como:
- **"Niño"** si tiene menos de 12.
- **"Adolescente"** si tiene entre 12 y 17.
- **"Adulto"** si tiene entre 18 y 59.
- **"Adulto mayor"** si tiene 60 o más.

---

## Ejercicio 7 – Notas con letras
**Tema:** `switch` con `char`

### Instrucciones
Pide una letra (`A`, `B`, `C`, `D`, `F`) y muestra su significado:
- A → Excelente
- B → Bueno
- C → Regular
- D → Malo
- F → Reprobado

### Ejemplo de salida
****

``` 
Ingrese una letra de calificación: B
Bueno
```


---

## Bonus – Mini proyecto: Menú de opciones
**Tema:** `switch`

### Instrucciones
Crea un programa que muestre el siguiente menú:

``` 
1. Ver saldo
2. Depositar dinero
3. Retirar dinero
4. Salir
```

Según la opción ingresada, muestra un mensaje diferente.
