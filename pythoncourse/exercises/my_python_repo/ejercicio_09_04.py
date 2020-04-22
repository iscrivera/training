# función para crear `flower_dictionary` desde el nombre de archivo
def create_flowerdict(filename):
    flower_dict = {}
    
    # agregue si código aquí
    
    return flower_dict

# Función principal para solicitar la entrada de usuario.
# No modificar este bloque del código
# Ajustar solo la ruta del archivo si es necesario
def main(): 
    flower_d = create_flowerdict('datafiles/flowers.txt')
    full_name = input("Enter your First [space] Last name only: ")
    first_name = full_name[0].lower()
    first_letter = first_name[0]
# imprimir el resultado con el valor correspondiente a la llave del diccionario
    print("Unique flower name with the first letter: {}".format(flower_d[first_letter]))

main()
