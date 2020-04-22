# Estructuras de Datos

En esta lección conoceremos los diferentes tipos de estructuras de datos usados en Python:

- Tipos de estructuras de datos:
	- Listas
	- Tuplas
	- Conjuntos
	- Diccionarios
	- Estructuras de datos compuestas

- Operadores  de Identidad

## Listas

Las **estructuras de datos** son contenedores que organizan y agrupan los tipos de datos de diferentes formas. Una **lista** es una de las estructuras de datos más comunes y básicas en Python.  

Las listas deben ser creadas usando **corchetes** y pueden contener cualquier combinación de los tipos de datos (numérico y alfanumérico).

Para ejecutar los siguientes comandos use JupyterLab.

### Crear una lista

```py
list_of_elements = [1, 3.4, 'a string', True]
```

### Acceder a un elemento de la lista

```py
>>> list_of_elements[0]
1
```

```py
>>> list_of_random_things[len(list_of_random_things)]

---------------------------------------------------------------------------
IndexError                                Traceback (most recent call last)
<ipython-input-34-f88b03e5c60e> in <module>()
----> 1 lst[len(lst)]

IndexError: list index out of range

```

> Note que para acceder al último elemento de la lista se debe especificar el valor del tamaño de la lista menos 1 (len() - 1). Pruebe el siguiente comando para confirmar esto.

```py
>>> list_of_elements[len(list_of_elements) - 1]
True
```

### Rebanar y cortar (Slice & Dice)
```py
>>> list_of_elements = [1, 3.4, 'a string', True]
>>> list_of_elements[1:1]
[]
```
```py
>>> list_of_elements = [1, 3.4, 'a string', True]
>>> list_of_elements[1:2]
[3.4]
```
```py
>>> list_of_elements = [1, 3.4, 'a string', True]
>>> list_of_elements[1:3]
[3.4, 'a string']
```
```py
>>> list_of_elements = [1, 3.4, 'a string', True]
>>> list_of_elements[1:4]
[3.4, 'a string', True]
```
```py
>>> list_of_elements = [1, 3.4, 'a string', True]
>>> list_of_elements[1:5]
[3.4, 'a string', True]
```

### IN o NOT IN

```py
>>> 'this' in 'this is a string'
True
>>> 'in' in 'this is a string'
True
>>> 'isa' in 'this is a string'
False
>>> 5 not in [1, 2, 3, 4, 6]
True
>>> 5 in [1, 2, 3, 4, 6]
False
```


## Mutabilidad y Orden

El concepto de **mutabilidad** en Python indica si podemos o no cambiar un objeto una vez que se ha creado. Si un objeto (como una lista o cadena) se puede cambiar (como una lista), se considera **mutable**.

Sin embargo, si un objeto no se puede cambiar, entonces el objeto se considera **inmutable**.

Ejemplo de mutabilidad:

```py
>>> my_list = [1, 2, 3, 4, 5]
>>> my_list[0] = 'one'
>>> print(my_list)
['one', 2, 3, 4, 5]
```

Ejemplo de un objeto inmutable:
```py
>>> my_string = "Hello World"
>>> my_string[0] = 'M'
```

El concepto de **orden** en Python indica si la posición de un elemento en el objeto se puede utilizar para accederlo. Ambas cadenas y listas están ordenadas. Podemos usar el orden para acceder a partes de una lista y cadena.

En lecciones posteriores veremos que, diferentes tipos de datos, cuyas propiedades de mutabilidad y ordenamiento, son importantes de tener en cuenta para poder acceder a ellos y manipularlos.

## Funciones básicas

1. `len()` devuelve el número de elementos que hay en una lista.

2. `max()` devuelve el elemento más grande de la lista. La forma en que se determina el elemento más grande depende del tipo de objetos que estén en la lista.
	- El elemento máximo en una lista de números es el número más grande.
	- El máximo de elementos en una lista de cadenas es el último elemento ordenado alfabéticamente.
	- La función `max()` no está definida para listas que contienen elementos de diferentes tipos no compatibles.

3. `min()` devuelve el elemento más pequeño de una lista. `min()` es lo opuesto a `max()`, que devuelve el elemento más grande de una lista.

4. `sorted()` devuelve una copia de una lista en orden de menor a mayor, dejando la lista sin cambios.

Probemos:

```py
my_string_list = ['Z', 'ALZ', 'B']
max(my_string_list)
sorted(my_string_list)
```

4. `join()`. Es un método de cadena que toma una lista de cadenas como argumento y devuelve una cadena que consta los elementos unidos por un separador.

```py
my_separator= "\n"
my_string_list = ["This", "is", "my", "Python", "course"]
new_string = my_separator.join(my_string_list)

print(new_string)
```

5. `append()`. Este método agrega un elemento al final de una lista.

```py
letters = ['a', 'b', 'c', 'd']
letters.append('z')

print(letters)
```

6. `pop()`. Este método elimina un elemento de una lista. Si no se especifica un valor, se elimina el último elemento (en otros tipos de estructuras si no se define un valor puede eliminar el primer elemento)

```py
letters = ['a', 'b', 'c', 'd']
letters.pop(0)

print(letters)
```

7.  `split()`. Divide una cadena y como resultado devuelve una lista.

```py
verse = "if you can keep your head when all about you are losing theirs and blaming it on you   if you can trust yourself when all men doubt you     but make allowance for their doubting too   if you can wait and not be tired by waiting      or being lied about  don’t deal in lies   or being hated  don’t give way to hating      and yet don’t look too good  nor talk too wise"
print(verse, "\n")

verse_list = verse.split()
print(verse_list, '\n')
```

## Tuplas

Una **tupla** es otro tipo de estructura útil. Es un tipo de datos para secuencias de elementos ordenadas **inmutables**. A menudo se usan para almacenar información relacionada. Considere este ejemplo que involucra latitud y longitud:

```py
location = (13.4125, 103.866667)

print("Latitude:", location[0])
print("Longitude:", location[1])
```

Probemos lo siguiente:

```py
location[0] = 12.1
```
¿'Una Tupla es un objeto **mutable**?

¿'Una Tupla es un objeto **ordenado**?

## Conjunto

Un **conjunto** es un tipo de datos para colecciones **mutables no ordenadas** de elementos **únicos**. Una aplicación de un conjunto es eliminar rápidamente los duplicados de una lista.

```py
numbers = [1, 2, 6, 3, 1, 1, 6]
unique_nums = set(numbers)

print(unique_nums)
```

### [Lección 05 - Ejercicio  01](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2005-01.ipynb)

## Diccionarios

Un diccionario es un tipo de dato **mutable** que almacena asignaciones de claves únicas a valores:

```py
elements = {"hydrogen": 1, "helium": 2, "carbon": 6}

print(elements["helium"])

elements["lithium"] = 3  # Insertar "lithium" con el valor 3 dentro del diccionario
```

```py
print("carbon" in elements)

print(elements.get("dilithium"))
print(elements.get("hydrogen"))

print(elements["hydrogen"])
```

¿Qué diferencia hay entre usar get() o corchetes ([])?

```py
print(elements["dilithium"])
```

## Operadores de identidad

Operadores:
- `is` evalúa si ambos objetos contienen el mismo valor

- `is not` evalúa si ambos objetos no contienen el mismo valor

Probemos:

```py
n = elements.get("dilithium")
print(n is None)
print(n is not None)
```

# Estructuras de datos compuestas

Una característica interesante en Python es el poder incluir contenedores dentro de otros contenedores para crear estructuras de datos compuestos. Por ejemplo:

```py
elements = {"hydrogen": {"number": 1,
                         "weight": 1.00794,
                         "symbol": "H"},
              "helium": {"number": 2,
                         "weight": 4.002602,
                         "symbol": "He"}}
```

Para acceder a este diccionario anidado:

```py
helium = elements["helium"]
hydrogen_weight = elements["hydrogen"]["weight"]
```

Para agregar una nueva llave al diccionario:

```py
oxygen = {"number":8,"weight":15.999,"symbol":"O"}  # crear un diccionario
elements["oxygen"] = oxygen  # asignar el diccionario al diccionario compuesto
print('elements = ', elements)
```

| Estructura de Datos | Ordenado | Mutable | Constructor | Ejemplo |
|--|--|--|--|--|
| Lista 	| Si | Si | `[ ]` or `list()`	| `[5.7, 4, 'yes', 5.7]` |
| Tupla 	| Si | No | `( )` or `tuple()`	| `(5.7, 4, 'yes', 5.7)` |
| Conjunto	| No | Si | `{}`* or `set()`	| `{5.7, 4, 'yes'}`	 |
| Diccionario 	| No | No | `{ }` or `dict()`	| `{'Jun': 75, 'Jul': 89}` |

* Puede usar `{}` para definir un set como este `{1, 2, 3}`. Sin embargo, si dejan las llaves vacías, Python creará un diccionario vacío. Por lo que, para crear un **set vacío**, se debe usar `set()`.

** Un diccionario por sí mismo es mutable, pero cada una de las llaves individuales debe ser inmutable.

### [Lección 05 - Ejercicio  02](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2005-02.ipynb)


### [Lección 05 - Ejercicio  03](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2005-03.ipynb)
