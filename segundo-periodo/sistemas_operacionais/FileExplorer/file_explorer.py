import os

current_path = os.getcwd()

while True:
    # Exibir prompt
    user_input = input(f"{current_path} $ ")

    # Dividir o comando e os argumentos
    tokens = user_input.split()

    if not tokens:
        continue

    # Comando
    command = tokens[0]

    # Argumentos
    args = tokens[1:]

    # Executar comandos
    match command:
        case "pwd":
            print(current_path)
        case "ls":
            files = os.listdir(current_path)
            for file in files:
                print(file)
        case "cd":
            if args:
                if args[0] == "..":
                    current_path = os.path.dirname(current_path)
                else:
                    new_path = os.path.join(current_path, args[0])
                    if os.path.isdir(new_path):
                        current_path = new_path
                    else:
                        print(f"O diretório '{args[0]}' não existe.")
            else:
                print("Por favor, forneça o nome do diretório.")
        case "mkdir":
            if args:
                new_dir = os.path.join(current_path, args[0])
                os.makedirs(new_dir, exist_ok=True)
            else:
                print("Por favor, forneça o nome do diretório a ser criado.")
        case "rm":
            if args:
                file_path = os.path.join(current_path, args[0])
                try:
                    os.remove(file_path)
                except FileNotFoundError:
                    print(f"O arquivo '{args[0]}' não existe.")
            else:
                print("Por favor, forneça o nome do arquivo a ser removido.")
        case "clear":
            os.system("clear" if os.name == "posix" else "cls")
        case "exit":
            break
        case _:
            print("Comando não reconhecido. Tente novamente.")


