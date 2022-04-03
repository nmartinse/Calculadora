# Calculadora
El interfaz de usuario es una calculadora, que contiene distintos botones y una pantalla. Algunos de los botones corresponden a las operaciones que la calculadora puede realizar, entre los que se encuentran:
*	Suma de dos números (tipo double).
*	Resta de dos números (tipo double).
*	Multiplicación de dos números (tipo double).
*	División de dos números (tipo double).
*	Calcular el factorial de un número (tipo int). Se debe introducir el número o una operación y después pulsar el botón fact (en el caso de haberlo pulsado después de introducir una operación se calculará el factorial del resultado de esa operación). Si se hace en otro orden saltará una excepción avisando al usuario de que tiene que introducir primero el número. Después de haber calculado el factorial se puede seguir operando con el resultado, es decir, el usuario podría ahora pulsar +6 y lo que haría la calculadora sería sumar 6 al resultado.
*	Comprobar si un número (tipo int) es primo. De igual manera que con el factorial, el usuario debe introducir primero la operación o número que quiera comprobar y después al botón primo. Después de haber calculado si es primero se puede seguir operando con el número que se ha introducido (de igual manera que con el factorial).

El resto de los botones corresponden con:
*	Los números.
*	Punto para indicar el decimal. La implementación de este botón no deja al usuario añadir un punto si el número ya tiene uno (aunque el usuario pulse el botón este no tendrá ningún efecto).
*	El botón clear (C), que elimina el contenido de la pantalla y el contenido de las variables (que se explican más adelante).
*	El botón delete (<-), que elimina un caracter. Captura una excepción causada porque no haya más elementos en las variables para eliminar (este caso podría surgir si el usuario elimina caracteres cuando hay un error en pantalla).
*	El botón igual (=) que devuelve el resultado de lo que haya introducido el usuario por pantalla.

Para el funcionamiento correcto de la calculadora se han creado dos variables de clase, in y out. La variable in se encarga de guardar lo que el usuario va introduciendo al pulsar los botones y la variable out lo que se va a mostrar por pantalla.
Además, se han creado tres métodos auxiliares:
* procesarOperaciones(String intro): el parámetro de entrada es la cadena de caracteres que se quiere procesar. Este método se encarga de procesar lo que el usuario ha introducido y devolverle el resultado. También, se encarga de capturar las distintas excepciones y de mostrar un mensaje adecuado al usuario.
*	compruebaDobleOperacion(String intro, String text): este método es para procesar si el usuario ha pulsado dos veces el mismo operando. Como parámetros de entrada tiene la cadena introducida por el usuario y la operación introducida. En tal caso, lo que se hará es la operación con el mismo número (por ejemplo si el usuario introduce 4++, la calculadora entenderá que es 4+4).
*	tranformaStringInt(String intro): este método sirve para transformar una cadena de caracteres tipo String a un número tipo Integer.
