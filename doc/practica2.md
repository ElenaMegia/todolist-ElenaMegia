# Documentación práctica 2
Elena Megía Cañaveras
## Funcionalidad del programa:
Para esta practica hemos usado la aplicación incial todolist-inicial. Primero hemos configurado la aplicación y hemos ejecutado los test para comprobar que todo funciona.
Lo que queremos en este programa es que con tu usuario (previamente registrado), puedas incluir tus tareas y en el estado en el que están.
Para eso hemos creado un proyecto en github y un flujo de trabajo. También he creado un docker para este trabajo al igual que un repostirotio.

He añadido la barra del menú excepto en las páginas de login y registro, también la página de listado de usuarios y la página de descripción de usuario.
## Codigo añadido:
- Java
    - Controller: 
    He añadido varias funciones al HomeController una es el metodo para el listadod de usuarios, creando una lista donde se van introducciendo todos y llamando al metodo
    listadoDeUsuario de la clase UsuarioServicio. Además, he añadido otro metodo llamado descripción de usuario, donde conseguimos todos los datos de un usuario en concreto, para esto no hemos tenido que crear
    ningún método ya que hemos usado el findById() de UsuarioService.
       
    - Service:
    En UsuarioService he añadido el metodo listadoDeUsuarios en el que se meten todos los usuarios en una lista para poder tener
    el listado completo. He usado una ArrayList ya que me ha parecido la mejor manera para tratar los datos obtenidos. 

- Resources
    - Templates: En todas las template excepto en el login y registrer he introducido la Barra de Menú con NAV.
        - about: He introducido mi nombre, la versión de la aplicación y la fecha de realease.
        - descripcionUsuario: este documento html lo he añadido nuevo, donde he añadido la barra de menú y los datos de usuario para que se muestran como la descripción del usuario seleccionado



### URL GitHub y Docker Hub:
**GitHub** : [todolist-ElenaMegia](https://github.com/ElenaMegia/todolist-ElenaMegia.git)

**Docker Hub** : [Imagen Docker](https://hub.docker.com/r/elenamegia/mads-todolist)