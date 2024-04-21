# Conversor de Monedas

Este es un programa en Java que permite convertir valores entre diferentes tipos de monedas.

## Funcionalidades

El programa ofrece las siguientes opciones de conversión:

1. Dólar a Peso argentino
2. Peso argentino a Dólar
3. Dólar a Real brasileño
4. Real brasileño a Dólar
5. Dólar a Boliviano boliviano
6. Boliviano boliviano a Dólar

## Cómo usar

Al iniciar el programa, se muestra un menú con las opciones de conversión disponibles. El usuario debe ingresar el número de la opción deseada. 
Luego, se solicita al usuario que ingrese el valor que desea convertir. 
El programa devuelve el valor convertido.

## Clases

El programa consta de las siguientes clases:

- `Principal`: Esta es la clase principal que maneja la lógica del menú y las interacciones del usuario.
- `ConversorMonedas`: Esta clase se encarga de realizar las conversiones de moneda.
- `ConsultaMoneda`: Esta clase se encarga de buscar la tasa de cambio actual de una moneda específica utilizando la API de ExchangeRate.
- `Monedas` y `Currency_Code`: Estas clases se utilizan para mapear la respuesta de la API de ExchangeRate.

## Dependencias

Este programa utiliza la biblioteca Gson para parsear las respuestas de la API de ExchangeRate. 
Asegúrate de tenerla en tu classpath.

## Notas

Este programa utiliza la API de ExchangeRate para obtener las tasas de cambio actuales. Por lo tanto, necesitarás una conexión a internet para usar este programa.
