/*----------Etapa 2.1----------*/
USE LABORATORIO;

ALTER TABLE CLIENTES_NEPTUNO
MODIFY IDCLIENTE VARCHAR(5) NOT NULL PRIMARY KEY,
MODIFY NOMBRECOMPANIA VARCHAR(100) NOT NULL,
MODIFY PAIS VARCHAR(15) NOT NULL;

SHOW TABLES;

RENAME TABLE CLIENTES TO CONTACTOS;

ALTER TABLE CLIENTES
MODIFY COD_CLIENTE VARCHAR(7) PRIMARY KEY,
MODIFY EMPRESA VARCHAR(100) NOT NULL,
MODIFY CIUDAD VARCHAR(25) NOT NULL,
MODIFY TELEFONO INT UNSIGNED,
MODIFY RESPONSABLE VARCHAR(30);

DROP TABLE PEDIDOS;

ALTER TABLE PEDIDOS
MODIFY NUMERO_PEDIDO INT UNSIGNED PRIMARY KEY,
MODIFY CODIGO_CLIENTE VARCHAR(7) NOT NULL,
MODIFY FECHA_PEDIDO DATE NOT NULL,
MODIFY FORMA_PAGO ENUM('CONTADO', 'APLAZADO', 'TARJETA'),
MODIFY ENVIADO ENUM ('SI', 'NO');

SELECT * FROM PEDIDOS;

ALTER TABLE PRODUCTOS
MODIFY COD_PRODUCTO INT UNSIGNED PRIMARY KEY,
MODIFY SECCION VARCHAR(20) NOT NULL,
MODIFY NOMBRE VARCHAR(40) NOT NULL,
MODIFY IMPORTADO ENUM('VERDADERO', 'FALSO') NOT NULL,
MODIFY ORIGEN VARCHAR(25) NOT NULL,
MODIFY DIA INT UNSIGNED NOT NULL, MODIFY MES INT UNSIGNED NOT NULL, MODIFY ANO INT UNSIGNED NOT NULL;

SELECT * FROM PRODUCTOS;


/*----------Etapa 2.3----------*/
SELECT * FROM CLIENTES_NEPTUNO;

SELECT NOMBRECOMPANIA, CIUDAD, PAIS FROM CLIENTES_NEPTUNO;

SELECT NOMBRECOMPANIA, CIUDAD, PAIS FROM CLIENTES_NEPTUNO ORDER BY PAIS;

SELECT NOMBRECOMPANIA, CIUDAD, PAIS FROM CLIENTES_NEPTUNO ORDER BY PAIS, CIUDAD;

SELECT NOMBRECOMPANIA, CIUDAD, PAIS FROM CLIENTES_NEPTUNO ORDER BY PAIS LIMIT 10;

SELECT NOMBRECOMPANIA, CIUDAD, PAIS FROM CLIENTES_NEPTUNO ORDER BY PAIS, CIUDAD LIMIT 5 OFFSET 10;

/*----------Etapa 2.4----------*/
SELECT * FROM NACIMIENTOS WHERE NACIONALIDAD = 'EXTRANJERA';

SELECT * FROM NACIMIENTOS WHERE EDAD_MADRE < 18 ORDER BY EDAD_MADRE;

SELECT * FROM NACIMIENTOS WHERE EDAD_MADRE = EDAD_PADRE;

SELECT * FROM NACIMIENTOS WHERE EDAD_PADRE-EDAD_MADRE > 40;

SELECT * FROM CLIENTES_NEPTUNO WHERE PAIS = 'ARGENTINA';

SELECT * FROM CLIENTES_NEPTUNO WHERE PAIS <> 'ARGENTINA' ORDER BY PAIS;

SELECT * FROM NACIMIENTOS WHERE SEMANAS < 20 ORDER BY SEMANAS DESC;

SELECT * FROM NACIMIENTOS WHERE SEXO = 'FEMENINO' AND NACIONALIDAD = 'EXTRANJERA' AND ESTADO_CIVIL_MADRE = 'SOLTERA'
AND EDAD_MADRE > 40;

SELECT * FROM CLIENTES_NEPTUNO WHERE PAIS = 'ARGENTINA' OR PAIS = 'VENEZUELA' OR PAIS = 'BRASIL' ORDER BY PAIS, CIUDAD;

SELECT * FROM NACIMIENTOS WHERE SEMANAS BETWEEN 20 AND 25 ORDER BY SEMANAS;

SELECT * FROM NACIMIENTOS WHERE COMUNA IN (1101, 3201, 5605, 8108, 9204, 13120, 15202)
ORDER BY COMUNA;

SELECT * FROM CLIENTES_NEPTUNO WHERE IDCLIENTE LIKE 'C%';

SELECT * FROM CLIENTES_NEPTUNO WHERE CIUDAD LIKE 'B____';

SELECT * FROM NACIMIENTOS WHERE HIJOS_TOTAL > 10;