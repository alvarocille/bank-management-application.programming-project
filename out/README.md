# Sistema de Gestión de Cuentas Bancarias

Este proyecto es una aplicación de gestión de cuentas bancarias en Java, que permite a los usuarios crear y gestionar diferentes tipos de cuentas, como cuentas de ahorro y cuentas corrientes (personales y empresariales). Los usuarios pueden realizar operaciones como abrir nuevas cuentas, ver cuentas disponibles, realizar ingresos, retirar efectivo y consultar saldos.

## Características

- Registro y gestión de clientes.
- Creación de diferentes tipos de cuentas bancarias.
    - **Cuentas de Ahorro**: con un tipo de interés anual.
    - **Cuentas Corrientes Personales**: con una comisión de mantenimiento.
    - **Cuentas Corrientes Empresariales**: con interés por descubierto y un máximo de descubierto permitido.
- Operaciones de cuentas:
    - Ingresos y retiradas de efectivo.
    - Consulta de saldo de cuentas.

## Estructura del Proyecto

- **Cuentas**
    - `CuentaAhorro`: Clase para cuentas de ahorro.
    - `CuentaCorrientePersonal`: Clase para cuentas corrientes personales.
    - `CuentaCorrienteEmpresa`: Clase para cuentas corrientes empresariales.

- **Clientes**
    - `Persona`: Clase que representa a los clientes de las cuentas.

- **Utilidades**
    - `CRUDCuenta`: Clase para gestionar la creación y búsqueda de cuentas.
    - `CRUDPersona`: Clase para gestionar la creación y búsqueda de clientes.
    - `Otro`: Clase con métodos utilitarios.

## Requisitos

- Java 11 o superior.
- IntelliJ IDEA (opcional, pero recomendado para el desarrollo).

## Instrucciones de Ejecución

1. Clona este repositorio o descarga el proyecto.
2. Abre el proyecto en IntelliJ IDEA.
3. Compila el proyecto y ejecuta la clase `Main`.
4. Sigue las instrucciones en la consola para interactuar con la aplicación.

## Ejemplo de Uso

Al ejecutar la aplicación, verás un menú con las siguientes opciones:

1. Abrir nueva cuenta.
2. Ver cuentas disponibles.
3. Obtener datos de cuenta.
4. Realizar ingreso.
5. Retirar efectivo.
6. Consultar saldo de cuenta.
7. Salir.

Elige la opción deseada y sigue las instrucciones que se te proporcionan.

## Autor

Álvaro Cilleruelo Sinovas   
cillegta111202@gmail.com
