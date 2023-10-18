import java.io.File
import java.util.Properties

fun main() {
    // Crea un objeto Properties
    val props = Properties()

    // Lee el archivo .env desde la ruta especificada
    val file = File(".env")
    file.inputStream().use {
        props.load(it)
    }

    // Obtiene el valor de la variable OPENAI_API_KEY
    val apiKey = props.getProperty("OPENAI_API_KEY")

    // Imprime el valor o un mensaje de error si no se encuentra
    if (apiKey != null) {
        println("El valor de OPENAI_API_KEY es $apiKey")
    } else {
        println("No se encontró la variable OPENAI_API_KEY en el archivo .env")
    }
}
