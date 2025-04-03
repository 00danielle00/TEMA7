# Servicio de compra online en MERCADAM

## ÍNDICE

1. [Resumen](#resumen-)
2. [Estructura de clases](#estructura-de-clases)
3. [Programa principal](#programa-principal)
   
   1.[Clase Producto](#clase-producto-enum)

   2.[Clase Pedido](#clase-pedido)

   3.[Clase Mercadam](#clase-mercadam)

   4.[Clase Cliente](#clase-cliente)

4. [Pruebas](#pruebas)
5. [Entrega](#entrega)

## Resumen

> Este proyecto consiste en una app de compra online para un supermercado ficticio llamado **MERCADAM**

El programa se divide en 2 partes:

- **App de gestion**: crear clientes y productos.
- **App de zona de clientes**: autentificación, selección de productos y realización de pedidos.

## Estructura de clases

El programa sigue el paradigma de **Programación Orientada a Objetos (POO)** y se basa en la siguiente estructura:

**Diagrama de clases**

![foto de diagrama uml](img/uml.png)

***

## Programa principal
> El programa principal consta de 4 clases y un main en dónde se ejecutará la aplicación completa.

### Clase Producto (Enum)
![foto de la clase enum](img/claseProducto.png)

Esta clase de tipo enum consta de los nombres de los productos y sus precios como atributo que son de tipo **double**,
y consta tambien del getter del producto lo que nos servirá más adelante para coger el precio de los productos.


### Clase Pedido
![foto de la clase Pedido](img/clasePedido.png)

![foto de la clase Pedido](img/clasePedido2.png)

![foto de la clase Pedido](img/clasePedido3.png)

Esta clase representa el pedido del cliente, comienzo declarando los atributos y dentro del constructor del Pedido, le he puesto un
valor predeterminado al atributo de **importe_total** de 0.0 y seguidamente genero los setters y getters.
Después creo un método dentro de esta clase para anñadir productos al pedido en el cual actualizo el valor total cada vez que introduzco un producto y
utilizo el método **getorDefault** en el caso de haber introducido un producto existente en la lista, se incremente su valor.

En el método **aplicarpromo 3x2** , básicamente recorro el mapa con el **.Entry** para obtener ambos valores (clave y valor),
a una variable le asigno el **value()** a una variable para poderlo dividirlo entre 3 y en caso de que la división de 0, eso significa que no hay ningún producto con 3 elementos, en caso contrario, se aplicará el descuento.

En el método **aplicar 10% de descuento** hago lo mismo que en el de aplicar primo 3x2, por último, está el **método mostrarResumenPedido**
que en este necesitamos mostrar los productos de manera descendente por lo que hago una lista para recorrer los productos y seguidamente utilizo el método compareTo
para compararar los productos que los represento con e1, y e2 y los comparo y los ordena por la cantidad de unidades del producto.

(esta linea:**mapa.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()))** me tuvo que ayudar un amigo que estudia en el superior de San Vicente ya que no se me ordenaba por unidades)

### Clase Mercadam

![foto de la clase Pedido](img/claseMercadam.png)

En esta clase genero el usuario y la contraseña de manera aleatoria, genero un bucle de longitud 8 y concateno 
los valores aleatorios que tengo en la variable caracteres, seguidamente añado los valores a **clientes** creando
un nuevo cliente y imprimo los valores. Y. también he aplicado el **Colletions.unmodifiableSet para que no se pueda modificar**.

### Clase Cliente
![foto de la clase Pedido](img/claseCliente.png)

![foto de la clase Pedido](img/claseCliente2.png)

![foto de la clase Pedido](img/claseCliente3.png)

En esta clase, tengo los atributos, los getters, el método crear nuevo pedido en el cual creo un pedido con **new Pedido()** y valido con una condición, de que si es null, que se cree un nuevo pedido.
También esta el método **importe pedido** en el cual solo muestro por pantalla mediante un bucle for y el método **.Entry** para obtener la clave y el valor
y muestro el valor total de los productos añadido al carrito y, en el método **insertarProducto** sirve para controlar el error de escribir un producto no existente,
por lo que recorro mediante un bucle for para recorrer los productos y en caso de que el producto introducido no exista, se mostrará el siguiente mensaje, y, por último, 
he aplicado el **equals() y hashcode()** para que el usuario y la contraseña no se pueda repetir.

## Pruebas
Prueba normal:
![foto de la clase Pedido](img/cap1.png)

![foto de la clase Pedido](img/cap2.png)

Aplicar Descuento:

![foto de la clase Pedido](img/descuento.png)

Error de Autenticación:

![foto de la clase Pedido](img/ErrorAutenticacion.png)

Mostrar Productos por Unidades:

![foto de la clase Pedido](img/mostrarPorUnidades.png)

Error en el nombre de un Producto:

![foto de la clase Pedido](img/nombreProductoError.png)

Opción de Salir:

![foto de la clase Pedido](img/terminarPedido.png)


## Entrega
- [ ] **Codigo fuente**: []()
- [ ] **Vídeo demostrativo**:[]()

@pbemdom3