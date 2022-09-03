
# - - - - - - - - - - - E J E R C I C I O 1 - - - - - - - - - - -

/*1. Generar una consulta de actualización para lograr que todos los títulos de las canciones
y los nombres de los artistas de la tabla TOP_SPOTIFY queden cargados en la tabla 
en mayúsculas.
*/
USE BONUS_TRACK;
SELECT * FROM TOP_SPOTIFY;

SET SQL_SAFE_UPDATES = 0;

UPDATE TOP_SPOTIFY SET ID=UPPER(ID), TITULO=UPPER(TITULO),
ARTISTA=UPPER(ARTISTA), GENERO=UPPER(GENERO);

/*2. Agregar a la tabla TOP_SPOTIFY una columna llamada PERMANENCIA. Completar 
la columna con la cantidad de años (al año actual) de permanencia de cada canción
dentro de la plataforma digital.*/

ALTER TABLE TOP_SPOTIFY ADD PERMANENCIA INT;

UPDATE TOP_SPOTIFY SET PERMANENCIA = YEAR(CURDATE())-ANO;

SELECT * FROM TOP_SPOTIFY;
/*3. Crear una tabla nueva con el nombre ÚLTIMOS_LANZAMIENTOS a partir de la 
tabla TOP_SPOTIFY tomando todos los campos de la tabla original. Volcar en la 
tabla nueva todas aquellas canciones que tengan 3 años o menos de permanencia
en la plataforma digital. Una vez copiados los registros correspondientes en la tabla 
nueva, eliminarlos de la tabla original (TOP_SPOTIFY).*/

CREATE TABLE ULTIMOS_LANZAMIENTOS 
SELECT * FROM TOP_SPOTIFY
WHERE PERMANENCIA<=3;

SELECT * FROM ULTIMOS_LANZAMIENTOS;

DELETE FROM TOP_SPOTIFY
WHERE PERMANENCIA<=3;


#4. Agregar el siguiente registro a la tabla TOP_SPOTIFY:

INSERT INTO TOP_SPOTIFY
VALUES(610,'GOD CONTROL','MADONNA','POP',2018,3);

SELECT * FROM TOP_SPOTIFY;

/*5. Copiar a la tabla ÚLTIMOS_LANZAMIENTOS todas aquellas canciones que tengan 3 años 
o menos de permanencia en la plataforma digital. Una vez copiados los registros en la 
tabla nueva, eliminarlos de la tabla original (TOP_SPOTIFY).*/

INSERT INTO ULTIMOS_LANZAMIENTOS
SELECT ID, TITULO, ARTISTA, GENERO, ANO, PERMANENCIA 
FROM TOP_SPOTIFY
WHERE PERMANENCIA<=3;
DELETE FROM TOP_SPOTIFY
WHERE PERMANENCIA<=3;

SELECT * FROM TOP_SPOTIFY;
SELECT * FROM ULTIMOS_LANZAMIENTOS;



# - - - - - - - - - - - E J E R C I C I O 2 - - - - - - - - - - -



/*1. Generar una consulta de actualización en la que se modifique el nombre del autor de 
apellido ECHEVERRÍA por Esteban. Tener en cuenta que se debe modificar el nombre 
de este autor y no su apellido.*/
USE LIBRERIA;

SELECT * FROM AUTORES;

UPDATE AUTORES SET NOMBRE='Esteban'
WHERE APELLIDO ='ECHEVERRÍA';

SELECT * FROM AUTORES;
SELECT * FROM EMPLEADOS;
/*2. Agregar a la tabla EMPLEADOS una columna con el nombre PERMANENCIA. Completar 
la columna con la antigüedad (expresada en años) de cada empleado, tomando como base 
la fecha de ingreso de cada uno de ellos.*/
ALTER TABLE EMPLEADOS ADD PERMANENCIA INT;

UPDATE EMPLEADOS SET PERMANENCIA = YEAR(CURDATE())-YEAR(FECHA_INGRESO);
SELECT * FROM EMPLEADOS;

/*3. Agregar a la tabla LIBROS una columna con el nombre PRECIO_PÚBLICO. A continuación, 
completar la columna con el precio de venta al público de cada libro agregándole un 21%
en concepto de IVA a los precios originales. Mantener un máximo de 2 decimales.*/
ALTER TABLE LIBROS ADD PRECIO_PUBLICO FLOAT;

UPDATE LIBROS SET PRECIO_PUBLICO = ROUND(PRECIO*1.21,2);

SELECT * FROM LIBROS;


# - - - - - - - - - - - E J E R C I C I O 3 - - - - - - - - - - -

/*1. Generar una tabla nueva y nombrarla como EMPLEADOS_ANTERIORES, a partir de la 
tabla EMPLEADOS. Tomar todos los campos de la tabla original. Luego, volcar en la tabla 
nueva los empleados cuyos apellidos sean THOMAS, PEREIRA y DEVO. Una vez 
copiados estos 3 empleados en la tabla nueva, eliminarlos de la tabla original
(EMPLEADOS).*/

CREATE TABLE EMPLEADOS_ANTERIORES
SELECT * FROM EMPLEADOS
WHERE APELLIDO='THOMAS' OR APELLIDO='PEREIRA' OR APELLIDO='DEVO';

DELETE FROM EMPLEADOS
WHERE APELLIDO='THOMAS' OR APELLIDO='PEREIRA' OR APELLIDO='DEVO';

/*. Copiar a la tabla EMPLEADOS_ANTERIORES al empleado de apellido CRUZ desde la tabla 
EMPLEADOS. Una vez copiado a la tabla nueva, eliminarlo de la original.*/

INSERT INTO EMPLEADOS_ANTERIORES
SELECT * FROM EMPLEADOS
WHERE APELLIDO='CRUZ';
DELETE FROM EMPLEADOS
WHERE APELLIDO='CRUZ';
