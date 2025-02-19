# Escenario ASO
##Descripción

Este proyecto contiene la implementación y pruebas de un servicio en Java, con despliegue de archivos JAR y pruebas realizadas con Postman.

##Despliegue de JARs

La siguiente imagen muestra el despliegue de los JARs utilizados en el proyecto:
![Despliegue de Jares](Captura de pantalla (27).png)


##Pruebas con Postman

En la siguiente imagen se puede ver una prueba exitosa realizada con Postman:
![Postman](Captura de pantalla (28).png)



##JSON Utilizado para la Prueba

{
  "details": {
    "offerType": "CARD_HOLDER",
    "limitAmount": {
      "amount": 20000,
      "currency": "EUR"
    },
    "product": {
      "id": "TDC",
      "subproduct": {
        "id": "AV"
      }
    }
  }
}

##Parámetro Utilizado

Para la prueba, se usó el valor 12345 como {nuip}.

##Tecnologías Utilizadas

-Java 1.8
-IntelliJ IDEA
-Postman
-Git y GitHub

##Autor

Angel Sierra
