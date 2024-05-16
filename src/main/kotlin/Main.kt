package com.utp


import MyClass
import java.util.*

// Constantes, no se pueden modificar. Se deben ubicar fuera de las clases o funciones.
// Su valor debe ser conocido en tiempo de compilación
const val PI : Double = 3.1416

fun main(args: Array<String>) {

    // para leer datos del teclado por terminal
    var ingresado = readLine()

    // Variables mutables, se pueden modificar
    var vAndf : Boolean?
    vAndf = true
    println(vAndf)
    vAndf = false // <- Cambio de valor
    println(vAndf)

    // Constantes, estas se puede o no saber su valor en tiempo de compilación
    val nombre = "Leonardo"
    // nombre = "Juan" // Error
    println("hola $nombre")

    // Uso de constantes
    println(PI)


    // Tipos de datos

    // Cualquier tipo de dato
    var x: Any

    // Enteros
    val numGrande: Long = 1_000_000_000_000
    val numChico: Int = 2147483647 // 32 bits -> numero maximo 2^31 - 1 = 2147483647
    val numByte: Byte = 127 // 8 bits -> numero maximo 2^7 - 1 = 127
    val numShort: Short = 32767 // 16 bits -> numero maximo 2^15 - 1 = 32767

    // Decimales
    val numFloat: Float = 1.1412313f // 32 bits -> 7 digitos de precision. Debe terminar en f por ser float
    val numDouble: Double = 1.1412313 // 64 bits -> 15 digitos de precision

    // Caracteres
    val letra: Char = 'a'

    // Cadenas
    val cadena: String = "Hola mundo"
    cadena.uppercase() // "HOLA MUNDO"
    cadena.lowercase() // "hola mundo"
    cadena.capitalize() // "Hola mundo"

    // Booleanos
    val verdadero: Boolean = true

    // Conversiones
    // de entero a ...
    val num1: Int = 10
    val num2: Long = num1.toLong() // Conversion de Int a Long
    val num3: Double = num1.toDouble() // Conversion de Int a Double
    val num4: Float = num1.toFloat() // Conversion de Int a Float
    val num5: String = num1.toString() // Conversion de Int a String
    val num6: Char = num1.toChar() // Conversion de Int a Char
    val num7: Byte = num1.toByte() // Conversion de Int a Byte
    val num8: Short = num1.toShort() // Conversion de Int a Short
    val num9: Boolean = num1 > 5 // Conversion de Int a Boolean

    // de double a ...
    val num10: Double = 10.0
    val num11: Int = num10.toInt() // Conversion de Double a Int
    val num12: Long = num10.toLong() // Conversion de Double a Long

    // de string a ...
    val num13: String = "10"
    val num14: Int = num13.toInt() // Conversion de String a Int
    val num15: Long = num13.toLong() // Conversion de String a Long
    val num16: Double = num13.toDouble() // Conversion de String a Double

    // de char a ...
    val num17: Char = '1'
    val num18: Int = num17.code // Convierte el char a su valor en la tabla ASCII / UniCode
    val num19: Long = num17.code.toLong() // Conversion de Char a Long

    // de boolean a ...
    val num20: Boolean = true
    val num21: Int = num20.compareTo(false) // Conversion de Boolean a Int
    // devuelve 0 si son iguales, 1 si es verdadero y -1 si es falso
    val num22: String = num20.toString() // Conversion de Boolean a String


    // Comparaciones
    val a = 10
    val b = 20
    val c = "10"
    val d = "20"
    val e = 10.0
    val f = 20.0
    val g = "10.0"
    val h = "20.0"

    println(a == b) // false
    println(a != b) // true
    println(a > b) // false
    println(a < b) // true

    println(a.compareTo(b)) // -1
    println(a.compareTo(a)) // 0
    println(b.compareTo(a)) // 1

    println(g.toDouble() == a.toDouble()) // true

    println(a == c.toInt()) // true

    println(e == a.toDouble()) // true


    // Operadores aritméticos
    // suma +, resta -, multiplicación *, división /, módulo %


    // Operadores lógicos
    // and &&, or ||, not !

    // Operadores de incremento y decremento
    var i = 0
    i++ // i = i + 1
    i-- // i = i - 1
    i+=2 // i = i + 2
    i-=2 // i = i - 2
    i*=2 // i = i * 2
    i/=2 // i = i / 2
    i%=2 // i = i % 2


    // Operadores de asignación
    // =, +=, -=, *=, /=, %=

    // Operadores de igualdad
    // ==, !=

    // Operadores de comparación
    // >, <, >=, <=

    // Operadores de rango
    // in, !in
    val rango = 1..10
    println(5 in rango) // true
    println(15 !in rango) // true

    // Operadores de tipo
    // is, !is
    x = 10 // x es de tipo Any
    println(x is Int) // true
    println(x is String) // false
    println(x !is Float) // true

    // Operadores de bit
    // and, or, xor, shl, shr, ushr
    val bit1 = 0b1010
    val bit2 = 0b1100
    // estos operadores son para hacer operaciones bit a bit, se imprimen en decimal
    println(bit1 and bit2) // 0b1000 -> es para hacer una operación AND bit a bit
    println(bit1 or bit2) // 0b1110 -> es para hacer una operación OR bit a bit
    println(bit1 xor bit2) // 0b0110 -> es para hacer una operación XOR bit a bit
    println(bit1 shl 1) // 0b10100 -> es para hacer un corrimiento a la izquierda
    println(bit1 shr 1) // 0b0101 -> es para hacer un corrimiento a la derecha
    println(bit1 ushr 1) // 0b0101 -> es para hacer un corrimiento a la derecha sin signo

    // Para imprimer en otra base se debe usar el método toString(nBase)
    println((bit1 and bit2).toString(2)) // 1010

    // Operadores de rango
    // .., downTo, until
    val rango1 = 1..10 // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val rango2 = 10 downTo 1 // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    val rango3 = 1 until 10 // 1, 2, 3, 4, 5, 6, 7, 8, 9 -> no incluye el 10
    // manualmente
    val rango4 = 1..10 step 2 // 1, 3, 5, 7, 9
    val rango5 = 10 downTo 1 step 2 // 10, 8, 6, 4, 2


    // Arrays
    val array1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println("Array: $array1") // no se visualiza correctamente (dirección de memoria)
    println("Array a Lista: ${array1.toList()}") // se convierte a lista para imprimir




    //Listas
    // con logitud fija
    val lista1 = listOf<Int>(1, 2, 3, 4, 5)

    // con longitud variable
    val lista2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    // lista vacia con longitud fija
    val lista3 = emptyList<Int>()
    // lista vacia con longitud variable
    val lista4 = mutableListOf<Int>()

    var lista5 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Operadores de indexación
    // [], get, set
    println(lista1[0]) // 1
    println(lista1.get(0)) // 1
    //lista1[0] = 10 // error, ya que la lista es de solo lectura
    // En las mutables si se puede:
    lista2[0] = 10 // Se puede modificar, ya que la lista es mutable
    lista2.set(0, 10) // el primer valor de la lista se cambia a 10
    lista2.add(6) // se agrega un nuevo valor a la lista
    lista2.removeAt(0) // se elimina el primer valor de la lista

    //lista3.add(10) // error, si es vacia e inmutable no se puede agregar valores, siempre queda vacia

    lista4.add(10) // se agrega un nuevo valor a la lista
    lista4.add(20) // se agrega un nuevo valor a la lista
    lista4.add(30) // se agrega un nuevo valor a la lista

    // Operadores de colección
    // in, !in, contains, isEmpty, isNotEmpty, size, first, last, indexOf, lastIndexOf
    10 in lista1 // true
    10 !in lista1 // false
    lista1.contains(10) // false
    lista1.isEmpty() // false
    lista1.isNotEmpty() // true
    lista1.size // 5
    lista1.first() // 1 -> si está vacía lanza una excepción
    lista1.firstOrNull() // 1 -> devuelve el primer valor de la lista o null si está vacía
    lista1.last() // 5 -> si está vacía lanza una excepción
    lista1.lastOrNull() // 5 -> si está vacía devuelve null
    lista1.indexOf(3) // 2 -> primera aparición del valor 3
    lista1.lastIndexOf(3) // 2 -> última aparición del valor 3

    // Operadores de orden
    lista1.sorted() // [1, 2, 3, 4, 5] -> ordena la lista, usa el algoritmo
    lista1.sortedDescending() // [5, 4, 3, 2, 1] -> ordena la lista de forma descendente
    lista1.sortedBy { num -> num < 5 } // los ordena por los valores menores a 5
    lista1.sortedByDescending { num -> num < 5 } // los ordena por los valores mayores a 5
    lista1.shuffled() // [3, 1, 5, 2, 4] -> mezcla los valores de la lista
    lista1.reversed() // [5, 4, 3, 2, 1] -> invierte el orden de la lista

    // Operadores de modificación en las MUTABLES
    lista2.remove(10) // elimina el valor 10 de la lista
    lista2.removeIf { it > 3 } // elimina los valores mayores a 3 de la lista
    lista2.removeAt(0) // elimina el primer valor de la lista
    lista2.removeAll { it % 2 == 0 } // elimina los valores pares de la lista
    lista2.clear() // elimina todos los valores de la lista


    // Operadores de iteración
    // forEach, forEachIndexed, iterator, next, hasNext
    lista1.forEach { println(it) } // imprime cada valor de la lista
    lista1.forEachIndexed { index, value -> println("index: $index, value: $value") } // imprime el index y el valor de la lista
    lista1.iterator().forEach { println(it) } // imprime cada valor de la lista
    lista1.iterator().next() // 1
    lista1.iterator().hasNext() // true

    // Funciones de colección - de Orden Superior - Programación funcional
    val lista6 = lista1.map { it * 2 } // [2, 4, 6, 8, 10]
    // .filter
    val lista7 = lista1.filter { it % 2 == 0 } // [2, 4] -> devuelve los valores que cumplen la condición
    // .reduce
    val suma = lista1.reduce { acc, i -> acc + i } // 15 -> suma todos los valores de la lista
    // .fold
    val suma2 = lista1.fold(0) { acc, i -> acc + i } // 15 -> suma todos los valores de la lista
    // .all
    val todosMayoresQueCero = lista1.all { it > 0 } // true -> verifica si todos los valores cumplen la condición
    // .any
    val algunoMayorQueCero = lista1.any { it > 0 } // true -> verifica si alguno de los valores cumple la condición
    // .count
    val cantidadMayoresQueCero = lista1.count { it > 0 } // 5 -> cuenta cuántos valores cumplen la condición
    // .find
    val primerMayorQueCero = lista1.find { it > 0 } // 1 -> devuelve el primer valor que cumple la condición
    // .first
    val primerMayorQueCero2 = lista1.first { it > 0 } // 1 -> devuelve el primer valor que cumple la condición


    // Ejemplo de iteración
    val iterator = lista1.iterator()
    while(iterator.hasNext()) {
        val num = iterator.next()
        println("While iterator: $num")
    }

    // Mapas
    // con logitud fija
    val mapa1 = mapOf<Int, String>(
        1 to "uno",
        2 to "dos",
        3 to "tres"
    )
    // con longitud variable
    val mapa2 = mutableMapOf<Int, String>(
        0 to "cero",
        1 to "uno",
        2 to "dos",
        3 to "tres"
    )
    // mapa vacio con longitud fija
    val mapa3 = emptyMap<Int, String>() // no se puede agregar valores


    // Operadores de indexación
    // [], get, set
    mapa1[1] // "uno"
    mapa1.get(1) // "uno"
    //mapa1[1] = "UNO" // error, ya que la lista es de solo lectura
    // En las mutables si se puede:
    mapa2[1] = "UNO" // Se puede modificar, ya que la lista es mutable
    mapa2[4] = "CUATRO" // se agrega un nuevo valor al mapa
    mapa2.set(2, "DOS") // el segundo valor de la lista se cambia a "DOS"
    mapa2.set(3, "TRES") // el tercer valor de la lista se cambia a "TRES"
    mapa2.put(4, "CUATRO") // se agrega un nuevo valor al mapa
    mapa2.remove(0) // se elimina el primer valor del mapa

    //mapa3.put(10, "DIEZ") // error, si es vacio e inmutable no se puede agregar valores, siempre queda vacio

        // mapa vacio con longitud variable
        val mapa4 = mutableMapOf<Int, String>()
    mapa4.put(10, "DIEZ") // se agrega un nuevo valor al mapa
    mapa4.put(20, "VEINTE") // se agrega un nuevo valor al mapa
    mapa4.put(30, "TREINTA") // se agrega un nuevo valor al mapa

    // Operadores de colección
    // in, !in, containsKey, containsValue, isEmpty, isNotEmpty, size, keys, values
    1 in mapa1 // true
    1 !in mapa1 // false
    mapa1.containsKey(1) // true
    mapa1.containsValue("uno") // false, contiene a "UNO"
    mapa1.isEmpty() // false
    mapa1.isNotEmpty() // true
    mapa1.size // 3
    mapa1.keys // [1, 2, 3] -> un array con las llaves del mapa
    mapa1.values // ["uno", "dos", "tres"] -> un array con los valores del mapa

    // Operadores de iteración
    // forEach, iterator, next, hasNext
    mapa1.forEach { (key, value) -> println("key: $key, value: $value") } // imprime cada valor del mapa

    // Ejemplo de iteración
    val iteratorMap = mapa1.iterator()
    while(iteratorMap.hasNext()) {
        val (key, value) = iteratorMap.next()
        println("While iterator: key: $key, value: $value")
    }


    // Sets -> colecciones que no permiten elementos duplicados
    // con logitud fija
    val set1 = setOf<Int>(1, 2, 3, 4, 5)
    // con longitud variable
    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)

    // manipulando sets
    set2.add(6) // se agrega un nuevo valor al set
    set2.remove(1) // se elimina el valor 1 del set
    set2.removeIf { it > 3 } // elimina los valores mayores a 3 del set
    set2.contains(3) // true
    set2.isEmpty() // false
    set2.isNotEmpty() // true
    set2.size // 4
    set2.clear() // elimina todos los valores del set
    set2.add(6) // como este valor ya existe no se agrega
    set2.toSortedSet() // [2, 3, 4, 5, 6] -> ordena el set

    var union : Set<Int> = set1.union(set2)


    // Funciones

    // Funciones sin retorno
    fun saludar() {
        println("Hola mundo")
    }
    // Funciones con retorno
    fun sumar(a: Int, b: Int): Int { // es recomendable especificar el tipo de retorno
        return a + b
    }
    sumar(1, 2) // 3
    sumar(a=1, b=2) // Parámetros nombrados, sirve como convención para saber qué parámetro es qué

    // Funciones con retorno simplificado
    fun sumar2(a: Int, b: Int) = a + b

    // Funciones con parámetros por defecto
    fun saludar2(nombre: String = "Mundo") {
        println("Hola $nombre")
    }
    // Funciones con parámetros por defecto y retorno
    fun sumar3(a: Int = 0, b: Int = 0) = a + b

    // Funciones con parámetros variables
    fun sumar4(vararg numeros: Int): Int { // permite que la función reciba una cantidad variable de parámetros
        var suma = 0
        for (num in numeros) {
            suma += num
        }
        return suma
    }
    println(sumar4(1, 2, 3, 4, 5)) // 15

    // Funciones con parámetros variables y parámetros por defecto
    fun sumar5(a: Int = 0, vararg numeros: Int): Int {
        var suma = a
        for (num in numeros) {
            suma += num
        }
        return suma
    }
    println(sumar5(1, 2, 3, 4, 5)) // 15


    // funciones de Extension

    fun String.saludar() { // hace que la función saludar() esté disponible para cualquier String
        println("Hola $this")
    }
    "Leonardo".saludar() // "Hola leonardo"

    fun Int.esPar(): Boolean { // hace que la función esPar() esté disponible para cualquier Int
        return this % 2 == 0
    }
    println(10.esPar()) // true


    // Lambdas

    // Sintaxis
    // { parámetros -> cuerpo de la función }

    // Ejemplo
    // la fecha (->) indica qué devuelve la función, un Int
    val miLambdaPotencia2: (Int) -> Int = { it -> Math.pow(it.toDouble(), 2.0).toInt()}

    // Empleando lambda en una Lista con .map
    val lista8 = listOf(1, 2, 3, 4, 5)
    var lista9 = lista8.map(miLambdaPotencia2)


    // Funciones de orden superior
    // Son funciones que reciben otras funciones como parámetros o devuelven funciones
    // Ejemplo
    fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }
    val sumar2 = operar(1, 2) { a, b -> a + b } // 3
    val restar2 = operar(1, 2) { a, b -> a - b } // -1
    //otra forma de escribirlas:
    val sumar3 = operar(1, 2, { a, b -> a + b }) // 3

    // Funciones de orden superior con parámetros por defecto
    fun operar2(a: Int, b: Int, operacion: (Int, Int) -> Int = { a, b -> a + b }): Int {
        return operacion(a, b)
    }
    val sumar4 = operar2(1, 2) // 3
    val restar4 = operar2(1, 2) { a, b -> a - b } // -1

    // si ya se tienen lambas definidas, se pueden usar directamente:
        val miLambdaSuma: (Int, Int) -> Int = { a, b -> a + b }
        val miLambdaResta: (Int, Int) -> Int = { a, b -> a - b }
    val sumar5 = operar2(1, 2, miLambdaSuma) // 3
    val restar5 = operar2(1, 2, miLambdaResta) // -1







    // Estrucuturas de control

    // If
    val edad = 18
    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }

    // When
    when(edad) {
        18 -> println("Tienes 18 años")
        in 19..30 -> {
            println("Tienes entre 19 y 30 años") // rango y multi-línea
        }
        31, 32, 33 -> println("Qué haces aquí?") // múltiples valores
        else -> println("Tienes más de 33 años") // default
    }

    // For
    for (j in 1..10 step 2) {
        println("$j")
    }

    // While
    var k = 0
    while (k < 10) {
        println("$k")
        k++
    }

    // Do-While
    var l = 0
    do {
        println("$l")
        l++
    } while (l < 10)

    // Break y Continue
    for (m in 1..10) {
        if (m == 5) {
            break // termina el ciclo
        }
        if (m == 3) {
            continue // salta a la siguiente iteración
        }
        println("$m")
    }

    // Try-Catch
    try {
        val num = "10"
        val num2 = num.toInt()
        println(num2)
    } catch (e: NumberFormatException) {
        println("Error: ${e.message}")
    } finally {
        println("Esto siempre se ejecuta")
    }



    // Safe calls -> ?
    var nombre2: String? = null // el signo de interrogación indica que la variable puede ser nula
    println("Safe calls " + nombre2?.length) // null, no se ejecuta la función length y retorna null

    // Double bang -> !!
        //println("Double bang " + nombre2!!.length) // error, se ejecuta la función length y lanza una excepción si la variable es nula
        // ayuda a evitar el error de NullPointerException, pero se debe TENER CUIDADO al usarlo
        // sirve cuando estemos seguros de que la variable no es nula.
    try {
        println("Double bang " + nombre2!!.length)
    } catch (e: NullPointerException) {
        println("Error desde Double bang !!: '${e.message}'")
    }


    // Operador Elvis -> ?:
    val nombre3: String? = null
    val nombreLargo = nombre3?.length ?: "Nombre vacío"
    // Sirve como un if-else pero para asignar un valor en caso de que la variable sea nula
    println("Nombre largo: $nombreLargo")


    // Interopeabilidad con Java
    // Se puede usar código de Java en Kotlin y viceversa



    // let -> ejecuta un bloque de código si la variable no es nula
    // relacionado con el Safe calls
    // esto permite ejecutar funciones lambda si la variable no es nula

    var fruta : String? = null
    fruta?.let{
        it -> it + " es una fruta"
    }

    // with -> ejecuta un bloque de código y retorna el último valor
    // se puede usar para simplificar el acceso a propiedades de un objeto
    val myCar = Car()
    with(myCar) {
        make = "Toyota"
        model = "Corolla"
        year = 2020
        color = "Blue"
        startEngine()
    }
        //otro ejemplo:
        var colores: MutableList<String> = mutableListOf<String>("Rojo", "Azul", "Verde")
        with(colores){
            add("Amarillo")
            add("Blanco")
            println(this)
        }
    //


    // run -> ejecuta un bloque de código y retorna el último valor
    // se puede usar para inicializar variables
    val persona = run {
        val nombre = "Juan"
        val edad = 30
        "$nombre tiene $edad años"
    }
    println(persona) // "Juan tiene 30 años"
        //ejemplo con la lista colores
        var colores2: MutableList<String> = mutableListOf<String>("Rojo", "Azul", "Verde")
        var resultado = colores2.run {
            add("Amarillo")
            add("Blanco")
            this
        }
    //



    // apply -> ejecuta un bloque de código y retorna el objeto
    // se puede usar para inicializar objetos
    val myCar2 = Car().apply {
        make = "Toyota"
        model = "Corolla"
        year = 2020
        color = "Blue"
        startEngine()
    }
        //otro ejemplo
        var colores3: MutableList<String> = mutableListOf<String>("Rojo", "Azul", "Verde").apply {
            add("Amarillo")
            add("Blanco")
            println(this)
        }

        var animales : MutableList<String>? = null
        animales?.apply { // convierte de tipo nulable a no nulable automáticamente
            add("Perro")
            add("Gato")
            println(this)
        }
    //

    // also -> ejecuta un bloque de código y retorna el objeto
    // se puede usar para realizar operaciones adicionales
    val myCar3 = Car().also {
        it.make = "Toyota"
        it.model = "Corolla"
        it.year = 2020
        it.color = "Blue"
        it.startEngine()
    }
        //otro ejemplo
        var colores4: MutableList<String> = mutableListOf<String>("Rojo", "Azul", "Verde")
        colores4.also {
            it.add("Amarillo")
            it.add("Blanco")
            println(it)
        }.asReversed()
    //




    // practicando en leetcode
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()
        for (i in 0..nums.size-1){
            var complemento = target - nums[i]
            if (map.containsKey(complemento)){
                var encontrado: Int? = map[complemento]
                encontrado.let{
                    return intArrayOf(encontrado!!, i)
                }
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }


    // llamando a una clase java
    // tuve que crear un paquete Java en src/main/ java
    var myClass = MyClass("Clase Java")
    var name: String = myClass.getName()
    println(name)
}

class Car {
    var make: String = ""
    var model: String = ""
    var year: Int = 0
    var color: String = ""

    fun startEngine() {
        println("Starting engine...")
    }

    fun stopEngine() {
        println("Stopping engine...")
    }
}
