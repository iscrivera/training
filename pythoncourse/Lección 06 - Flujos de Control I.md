# Flujos de Control

En esta lección aprenderemos a controlar la secuencia de ejecución de un código en Python, mediante el uso de sentencias de programación, las cuales pueden afectar el comportamiento de nuestro código:

Las sentencias de flujos de control que veremos en esta lección son:

- Sentencias Condicionales
	- IF, ELSE, ELSE IF
	- Expresiones Booleanas Complejas
	- Recomendaciones
- Bucles (For & While)
- Break & Continue
- Zip & Enumerate
- List Comprehensions

##  Antes de empezar.... lo importante es la identación (sangría)

Algunos otros idiomas usan llaves o paréntesis para mostrar dónde comienzan y terminan los bloques de código. En Python usamos la identación para encerrar bloques de código.

En Python, la identación convencionalmente viene en múltiplos de cuatro espacios. Debemos ser estrictos acerca de seguir esta convención, porque cambiar la sangría puede cambiar completamente el significado del código. Si está trabajando en un equipo de programadores de Python, ¡es importante que todos sigan la misma convención de identación!

# Sentencias Condicionales

## IF

Una sentencia `if` es una declaración condicional que ejecuta u omite código en función de si una condición es verdadera o falsa.

```py
if phone_balance < 5:
    phone_balance += 10
    bank_balance -= 10
```

Analicemos esto:

- Una instrucción `if` comienza con la palabra clave `if`, seguida de la condición a evaluar, en este caso `phone_balance <5`, y luego **dos puntos**. La condición se especifica en una expresión booleana que se evalúa como Verdadero (`True`) o Falso (`False`).  

- Después de esta línea hay un bloque de código **identado** que se ejecutará si esa condición es verdadera. Si no, el código en este bloque si simplemente se omite.

## ELSE IF

Además de la cláusula `if`, hay otras dos cláusulas opcionales que a menudo se usan con una declaración: `else` y `elif`. Veamos un ejemplo

```py
if season == 'spring':
    print('plant the garden!')
elif season == 'summer':
    print('water the garden!')
elif season == 'fall':
    print('harvest the garden!')
elif season == 'winter':
    print('stay indoors!')
else:
    print('unrecognized season')
```

### [Lección 06 - Ejercicio 01](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-01.ipynb)

### [Lección 06 - Ejercicio 02](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-02.ipynb)

## Expresiones Booleanas complejas

Para condiciones complejas podemos usar los operadores lógicos `and`, `or` y `not`. Por ejemplo:

```py
if (not unsubscribed) and (location == "USA" or location == "CAN"):
    print("send email")
```

## Recomendaciones

1. **No usar `True` o `False` como condiciones**
```py
# Un mal ejemplo
if True:
    print("This indented code will always get run.")
```

2. **No comparar una variable booleana con  `== True` o `== False`**

```py
# Un mal ejemplo
if is_cold == True:
    print("The weather is cold!")
```
```py
# Un buen ejemplo
if is_cold:
    print("The weather is cold!")
```

3. **Asegurarse que un objeto puede devolver un valor verdadero**

Algunos de los objetos de Python que son evaluados como `False` son:

- constantes: `None` y `False`
-   Cero en cualquier tipo de dato numérico: `0`, `0.0`, `0j`, `Decimal(0)`, `Fraction(0, 1)`
-   Secuencias vacías y colecciones: `'""`, `()`, `[]`, `{}`, `set()`, `range(0)`
