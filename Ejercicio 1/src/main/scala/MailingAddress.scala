object MailingAddress {
  def main(args: Array[String]): Unit = {
    val name = "Juan Pérez"
    val addressLine1 = "123 Calle Falsa"
    val addressLine2 = "Edificio ABC, Apt. 456"
    val city = "Ciudad de Ejemplo"
    val state = "Estado de Ejemplo"
    val postalCode = "12345"
    val country = "País de Ejemplo"

    println(name)
    println(addressLine1)
    println(addressLine2)
    println(city + ", " + state + " " + postalCode)
    println(country)
  }
}
