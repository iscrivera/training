# Bucles

Un objeto **iterable** es un objeto que puede devolver uno de sus elementos a la vez. Estos objetos pueden incluir tipos de secuencia, como cadenas, listas y tuplas, así como tipos que no son de secuencia, como diccionarios y archivos.

## Bucles For

Veamos un ejemplo para conocer como implementar un bucle `for`:

```py
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']
for city in cities:
    print(city)
print("Done!")
```
**Componentes de un bucle `for`**  :

1. La primera línea del bucle comienza con la palabra clave `for`, que indica que se trata de un bucle `for`.

2. A continuación se indica `city in cities`, lo que indica que la `city` es la variable de iteración, y `cities` es el iterable sobre el que está trabajando el bucle. En la primera iteración del bucle, `city` obtiene el valor del primer elemento en `cities`, que es `"new york city"`.

3. La línea de encabezado del bucle `for` siempre termina con dos puntos `:` .
Después del encabezado del bucle `for` hay un bloque de código identado, el cuerpo del bucle, que se ejecutará en cada iteración de este bucle. Solo hay una línea en el cuerpo de este bucle: imprimir (ciudad).

4. Después de que el cuerpo del bucle se haya ejecutado, todavía no pasamos a la siguiente línea; volvemos a la línea de encabezado `for`, donde la variable de iteración toma el valor del siguiente elemento del iterable. En la segunda iteración del ciclo anterior, la ciudad toma el valor del siguiente elemento en las ciudades, que es `"mountain view"`.

5. Este proceso se repite hasta que el bucle haya iterado a través de todos los elementos del iterable. Luego, pasamos a la línea que sigue al cuerpo del bucle; en este caso, imprime `"Done!"`. Podemos decir cuál es la siguiente línea después del cuerpo del bucle porque no tiene identación. ¡Aquí hay otra razón por la que prestar atención a la identación es muy importante en Python!

### Usando la función `range()` con bucles `for`

`range ()` es una función incorporada utilizada para crear una secuencia iterativa de números. Con frecuencia usará range () con un bucle for para repetir una acción un cierto número de veces. como en este ejemplo:

```py
for i in range(3):
    print("Hello!")
```

Salida:

```
Hello!
Hello!
Hello!
```

#### range(start=0, stop, step=1)

La función `range()` toma **tres argumentos enteros**, el primero y el tercero son opcionales:  

- `start`. Es el primer número de la secuencia. Si no se especifica, `start` por defecto es 0.  

- `stop`. Es 1 más que el último número de la secuencia. Este argumento debe ser especificado.  

- `step`. Es la diferencia entre cada número en la secuencia. Si no se especifica, el `step` predeterminado es 1.

### Creando y modificando listas

```py
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']
capitalized_cities = []

for city in cities:
    capitalized_cities.append(city.title())
```

```py
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']

for index in range(len(cities)):
    cities[index] = cities[index].title()
```

### [Lección 06 - Ejercicio 03](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-03.ipynb)

### Construyendo Diccionarios

#### Usando un bucle `for`

```py
book_title =  ['great', 'expectations','the', 'adventures', 'of', 'sherlock','holmes','the','great','gasby','hamlet','adventures','of','huckleberry','fin']
```
```py
word_counter = {}
```
```py
for word in book_title:
    if word not in word_counter:
        word_counter[word] = 1
    else:
        word_counter[word] += 1
```

#### Usando el método `get()`

```py
book_title =  ['great', 'expectations','the', 'adventures', 'of', 'sherlock','holmes','the','great','gasby','hamlet','adventures','of','huckleberry','fin']
```
```py
word_counter = {}
```
```py
for word in book_title:
    word_counter[word] = word_counter.get(word, 0) + 1
```

### Iterando a través de Diccionarios

```py
cast = {
           "Jerry Seinfeld": "Jerry Seinfeld",
           "Julia Louis-Dreyfus": "Elaine Benes",
           "Jason Alexander": "George Costanza",
           "Michael Richards": "Cosmo Kramer"
       }
```
```py
for key in cast:
    print(key)
```
Otra forma:

```py
for key, value in cast.items():
    print("Actor: {}    Role: {}".format(key, value))
```

### [Lección 06 - Ejercicio 04](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-04.ipynb)

## Bucles While

Los bucles `for` son un ejemplo de "**iteración definida**", lo que significa que el cuerpo del bucle se ejecuta un número predeterminado de veces. Esto difiere de una "**iteración indefinida**", que es cuando un ciclo se repite un número desconocido de veces y termina cuando se cumple alguna condición, que es lo que sucede en un bucle `while`.

Veamos un ejemplo:

```py
card_deck = [4, 11, 8, 5, 13, 2, 8, 10]
hand = []

# agrega a hand los elementos de la lista card_deck mientras la suma total sea menor a 17
while sum(hand) < 17:
    hand.append(card_deck.pop())
```

**Componentes de un bucle `while`**  :

1. La primera línea del bucle comienza con la palabra clave `while`.

2. A continuación se indica la condición que debe cumplirse para que se ejecute el bloque dentro del `while`.

3. La línea de encabezado del bucle for siempre termina con dos puntos `:`.

4. Después del encabezado del bucle for hay un bloque de código identado, el cuerpo del bucle, que se ejecutará en cada iteración de este bucle. Solo hay una línea en el cuerpo de este bucle: imprimir (ciudad).

### [Lección 06 - Ejercicio 05](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-05.ipynb)

## Break & Continue

A veces necesitamos más control sobre cuándo debe terminar un buble, o saltar una iteración. En estos casos, usamos las palabras clave `break` y `continue`, que se pueden usar tanto en bucles `for` como `while`.  

- `break` termina un bucle  

- `continue` omite una iteración de un bucle  

Un ejemplo sería concatenar los elementos de una lista en una sola cadena, pero solo hasta que el tamaño de la cadena no exceda los 140 caracteres:

```py
headlines = ["Local Bear Eaten by Man",
             "Legislature Announces New Laws",
             "Peasant Discovers Violence Inherent in System",
             "Cat Rescues Fireman Stuck in Tree",
             "Brave Knight Runs Away",
             "Papperbok Review: Totally Triffic"]

news_ticker = ""
for headline in headlines:
    news_ticker += headline + " "
    if len(news_ticker) >= 140:
        news_ticker = news_ticker[:140]
        break

print(news_ticker)
```

### [Lección 06 - Ejercicio 06](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-06.ipynb)


# Zip & Numerate

`zip` y `enumerate` son funciones incorporadas útiles cuando trabajamos con bucles.

### Zip

`zip` devuelve un iterador que combina múltiples iterables en una secuencia de tuplas. Cada tupla contiene los elementos en esa posición de todos los iterables. Por ejemplo:

```py
list(zip(['a', 'b', 'c'], [1, 2, 3]))
```
Resultado:

```py
[('a', 1), ('b', 2), ('c', 3)]
```

Si necesitamos hacer un Unzip:

```py
some_list = [('a', 1), ('b', 2), ('c', 3)]
letters, nums = zip(*some_list)
```

Otro ejemplo:

```py
x_coord = [23, 53, 2, -12, 95, 103, 14, -5]
y_coord = [677, 233, 405, 433, 905, 376, 432, 445]
z_coord = [4, 16, -6, -42, 3, -6, 23, -1]
labels = ["F", "J", "A", "Q", "Y", "B", "W", "X"]

points = []
for point in zip(labels, x_coord, y_coord, z_coord):
    points.append("{}: {}, {}, {}".format(*point))

for point in points:
    print(point)
```    

### Enumerate

`enumerate` es una función que devuelve un iterador de tuplas que contienen índices y valores de una lista. A menudo es útil cuando se desea el índice junto con cada elemento de un iterable en un bucle.

```py
letters = ['a', 'b', 'c', 'd', 'e']
for i, letter in enumerate(letters):
    print(i, letter)
```

Resultado:

```py
0 a
1 b
2 c
3 d
4 e
```

# List Comprehensions

En Python, puede crear listas de manera muy rápida y concisa con List Comprehensions.

En un ejemplo normal:

```py
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']
capitalized_cities = []
for city in cities:
    capitalized_cities.append(city.title())
```

Usando List Comprehensions:

```py
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']
capitalized_cities = [city.title() for city in cities]
```

Otro ejemplo:

```py
squares = [x**2 for x in range(9) if x % 2 == 0]
```

Un ejemplo más:

```py
squares = [x**2 if x % 2 == 0 else x + 3 for x in range(9)]
```

### [Lección 06 - Ejercicio 07](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2006-07.ipynb)
