
CREATE DATABASE `db_manytoone` /*!40100 DEFAULT CHARACTER SET latin1 */;


-- db_manytoone.categorias definition

CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Campo para la llave primaria de la tabla.',
  `nombre` varchar(500) NOT NULL COMMENT 'Campor para el nombre de la categoria.',
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla para el almacenamiento de las categorias para los productos.';

-- db_manytoone.productos definition

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla.',
  `nombre` varchar(500) NOT NULL COMMENT 'Campo para el nombre del producto.',
  `precio` varchar(500) NOT NULL COMMENT 'Campo para el precio del producto',
  `imagen` varchar(500) NOT NULL COMMENT 'Campo para la imagen del producto',
  `id_categoria` int(11) NOT NULL COMMENT 'Llave foranea del catalogo del producto.',
  PRIMARY KEY (`id_producto`),
  KEY `fk_productocategoria` (`id_categoria`),
  CONSTRAINT `fk_productocategoria` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla de almacenamiento de los registro de los productos del cliente.';

