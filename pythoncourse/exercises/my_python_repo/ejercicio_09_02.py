def party_planner(snacks, people):
    leftovers = None
    num_each = None

    # agregar el código para manejar las excepciones


    return(num_each, leftovers)

# no modificar este bloque de código
lets_party = 'y'
while lets_party == 'y':

    snacks = int(input("How many snack are you preparing? "))
    people = int(input("How many people are attending? "))

    snacks_each, leftovers = party_planner(snacks, people)

    if snacks_each:  # si snacks_each no es None
        message = "\nLet's party! We'll have {} people attending, they'll each get to eat {} snacks, and we'll have {} left over."
        print(message.format(people, snacks_each, leftovers))

    lets_party = input("\nWould you like to party more? (y or n) ")