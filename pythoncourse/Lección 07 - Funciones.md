# Funciones

En esta lección conoceremos sobre  

- Definir Funciones
- Alcance de Variables
- Expresiones lambda
- Documentación

Una Función permite reutilizar código para usarlo una y otra de forma fácil.

## Definir una Función

Ejemplo de cómo definir una función:

```py
def cylinder_volume(height, radius):
    pi = 3.14159
    return height * pi * radius ** 2
```

Después de definir la función `cylinder_volume`, podemos invocarla así:

```py
cylinder_volume(10, 3)
```

### Encabezado (Header)  de la Función
```py
def <nombre_de_la_funcion> (<argumentos>):
```

1. El encabezado de una función siempre inicia con la palabra reservada `def`
2. `nombre_de_la_funcion`. Es el nombre con el cual será invocada o identificada la función
3. `argumentos`. Entre paréntesis, es una lista de valores de entrada que recibe la función separados por comas (`","`). También conocidos como parámetros de entrada.
4. El encabezado siempre debe terminar con dos puntos (`":"`)

### Cuerpo (Body) de la Función
1. El cuerpo de la función es un bloque de código identado después del encabezado.
2. Dentro del cuerpo se puede hacer referencia los argumentos de entrada.
3. Normalmente dentro del cuerpo de la función se incluye la sentencia `return` la cual es usada para regresar un valor o resultado a la sentencia que la invocó.

### Convenciones de nombrado para Funciones
1. Solo usar letras, números y guiones bajos.
2. No puede haber espacios entre las palabras del nombre de la función.
3. Es mandatorio que el nombre de la función inicie con una letra o guion bajo.
4. No usar [palabras reservadas de Python](https://pentangle.net/python/handbook/node52.html).
5. Trate de usar nombres descriptivos que ayuden a identificar fácilmente lo que hace la función.

## Argumentos por Default

Podemos agregar argumentos predeterminados en una función para tener valores por defecto para argumentos o parámetros que no están especificados en una llamada a la función.

```py
def cylinder_volume(height, radius=5):
    pi = 3.14159
    return height * pi * radius ** 2
```

Nótese que los valores que se están pasando a la función es por posición.

En una función es posible pasar valores a argumentos de dos formas:

1. Por posición
2. Por nombre

Veamos un ejemplo donde los vales se pasan a una función por nombre de argumento :

```py
cylinder_volume(10, 7)  # por posición
cylinder_volume(height=10, radius=7)  # por nombre de argumento
```

### [Lección 07 - Ejercicio 01](http://localhost:8888/lab/tree/my_python_repo/Ejercicio%2007-01.ipynb)

## Alcance de Variables

El alcance de una variable se refiere a aquellas partes de un programa que pueden hacer referencia a una variable.

Es importante tener en cuenta el alcance cuando se usan variables en funciones. Si se crea una variable dentro de una función, solo se puede usar dentro de esa función. No es posible acceder a él fuera de esa función.

```py
# Esto provocará un error
def some_function():
    word = "hello"

print(word)
```

Las variables que son definidas fuera de una función pueden ser accedidas o referenciadas dentro de una función como se muestra en el siguiente ejemplo:

```py
word = "hello"

def some_function():
    print(word)

some_function()
```

**Mejores Prácticas**: es mejor definir variables en un alcance más pequeño en el que se necesitarán. Si bien las funciones pueden referirse a variables definidas en un ámbito más amplio, esto rara vez es una buena idea ya que es posible que no sepa qué variables se han definido en un programa que tiene muchas variables.

## Expresiones Lambda

Podemos usar expresiones lambda para crear funciones anónimas. Es decir, funciones que no tienen nombre.

Son útiles para crear funciones rápidas que no se necesitan más adelante en el código. Esto puede ser especialmente útil para funciones de orden superior o funciones que toman otras funciones como argumentos.

Una función normal:

```py
def multiply(x, y):
    return x * y
```

puede ser reducida a:

```py
multiply = lambda x, y: x * y
```

**Componentes de una función Lambda :**

1. La palabra reservada **lambda** para indicar que se trata de una expresión lambda.  
2. Uno o más argumentos para la función anónima separados por comas, seguidos de dos puntos `:`. Esto es similar como en las funciones,
3. Expresión que se evalúa y que se devuelve como valor.

 Las expresiones lambda no son ideales para funciones complejas, pero pueden ser muy útiles para funciones cortas y simples.

En este ejemplo se usa una expresión lambda para calcular el promedio de los valores de una lista dentro de otra lista

```py
numbers = [
              [34, 63, 88, 71, 29],
              [90, 78, 51, 27, 45],
              [63, 37, 85, 46, 22],
              [51, 22, 34, 11, 18]
           ]

averages = list(map(lambda x: sum(x) / len(x), numbers))
print(averages)
```

En este ejemplo se usa una expresión lambda para obtener aquellas cadenas menores a 10 caracteres.

```py
cities = ["New York City", "Los Angeles", "Chicago", "Mountain View", "Denver", "Boston"]

short_cities = list(filter(lambda x: len(x) < 10, cities))
print(short_cities)
```

## Documentación  

La documentación se utiliza para hacer que el código sea más fácil de entender y usar. Las funciones son especialmente legibles porque a menudo usan cadenas de documentación **docstrings**. **Docstrings** son un tipo de comentario que se usa para explicar el propósito de una función y cómo debe usarse. Aquí hay una función calcular la densidad poblacional con un **docstrings**.

```py
def population_density(population, land_area):
    """Calculate the population density of an area.

    INPUT:
    population: int. The population of that area
    land_area: int or float. This function is unit-agnostic, if you pass in values in terms
    of square km or square miles the function will return a density in those units.

    OUTPUT:
    population_density: population / land_area. The population density of a particular area.
    """
    return population / land_area
```

Los **docstrings**  están encerrados entre comillas triples. La primera línea de la cadena de documentación es una breve explicación del propósito de la función. Los **docstrings** de una sola línea son perfectamente aceptables, como en el ejemplo anterior.

Cada parte del **docstring** es opcional, sin embargo, los **docstrings** son una buena práctica de codificación. Puede leer más sobre las convenciones de **docstring** [aquí](https://www.python.org/dev/peps/pep-0257/).
