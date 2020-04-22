# Programación en Python

## Acerca del curso

Es un curso que ha sido desarrollado como parte del programa de capacitación interna de Axity.

Está orientado a todos aquellos colaboradores o consultores cuyas actividades están enfocadas en:

- Desarrollo de software

- Programación o codificación

- Soluciones tecnológicas que deriven en codificación

- Desarrollo de soluciones de Big Data


## Objetivos del curso

En este curso aprenderás:

- Los fundamentos de programación en Python

- Los diferentes tipos de estructuras, flujos de control e implementación de programas o scripts

## Contenido del curso

- [Lección 01 - Introducción](Lecci%C3%B3n%2001%20-%20Introducci%C3%B3n.md)

- [Lección 02 - Qué es Python](Lecci%C3%B3n%2002%20-%20Qu%C3%A9%20es%20Python.md)

- [Lección 03 - Instalando Python](Lecci%C3%B3n%2003%20-%20Instalando%20Python.md)

- [Lección 04 - Tipos de Datos y Operadores](Lecci%C3%B3n%2004%20-%20Tipos%20de%20Datos%20y%20Operadores.md)

- [Lección 05 - Estructuras de Datos](Lecci%C3%B3n%2005%20-%20Estructuras%20de%20Datos.md)

- [Lección 06 - Flujos de Control I (Condicionales)](Lecci%C3%B3n%2006%20-%20Flujos%20de%20Control%20I.md)

- [Lección 06 - Flujos de Control II (Bucles)](Lecci%C3%B3n%2006%20-%20Flujos%20de%20Control%20II.md)

- [Lección 07 - Funciones](Lecci%C3%B3n%2007%20-%20Funciones.md)

- [Lección 08 - Guías de Estilo](Lecci%C3%B3n%2008%20-%20Gu%C3%ADas%20de%20Estilo.md)

- [Lección 09 - Scripting](Lecci%C3%B3n%2009%20-%20Scripting.md)

- [Lección 10 - Introducción a NumPy & Pandas](Lecci%C3%B3n%2010%20-%20Introducci%C3%B3n%20a%20NumPy%20&%20Pandas.md)

- [Lección 11 - Python & AWS](Lecci%C3%B3n%2011%20-%20Python%20&%20AWS%20-%20Redshift.md)

## Pre-requisitos

- Conocimiento sobre comandos básicos de Linux

- Conocimientos básicos de programación

- Laptop con:

    - Mínimo 8 Gb de RAM

    - Mínimo 25 GB disponibles en disco

- Tener habilitado en el BIOS las opciones de virtualización. Si no se tienen los permisos de administrador para habilitar estas opciones, acercarse con el área de soporte para que los habiliten.

- Descargar e instalar [VMware Player 15](https://www.vmware.com/go/downloadworkstationplayer)

- Descargar la VM para el curso (solicitar al instructor)

- Para validar, iniciar la VM con el usuario: **axity** y contraseña: **Welcome1**.

**Nota**: La VM viene configurada con 4 GB de memoria y 2 Cores/Procesadores. Ajustar si es necesario.

- Durante curso, el participante deberá descargar el archivo `my_python_repo.zip` que se encuentra en en repositorio `axity-python-internal-training/exercises`

- Una vez descargado el archivo, este deberá descomprimirse dentro del directorio `/home/axity` de la VM.

## Para el instructor

- Utilizar el repositorio `axity-python-internal-training` para compartir con el grupo de asistentes. Este repositorio puede estar en [GitHub](https://github.com) o en algún otro servicio de gestión de repositorios de **Git**.

- Dentro del repositorio `axity-python-internal-training` se encuentra el directorio `solutions` el cual contiene las soluciones a cada uno de los ejercicios planteados en este curso. Este directorio se encuentra incluido en el archivo `.gitignore` ya que es para uso solo del instructor como apoyo a la solución de los ejercicios de este curso.
- Para la lección 11 (Python & AWS), se recomienda que el instructor tenga una cuenta en AWS para poder crear un Bucket en S3 y un Clúster de Redshift. Para configurar el ambiente en AWS:
	- Crear un bucket y cargar los archivos del directorio `solutions/bucket` (o bien descargar y descomprimir el archivo `bucket.zip`)
	- Crear un clúster de Redshift con los siguientes datos:
		- **CLUSTER_NAME**=dwhcluster
		- **DB_NAME**=dwh
		- **DB_USER**=dwhuser
		- **DB_PASSWORD**=Passw0rd
		- **DB_PORT**=5439
    - (redshift_security_group & myRedshiftRole)
