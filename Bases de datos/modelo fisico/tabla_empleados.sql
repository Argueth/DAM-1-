CREATE TABLE empleados (
dni VARCHAR(10),
nombre VARCHAR(30),
especialidad VARCHAR(25),
fechaalta DATE, 
dpto VARCHAR(10),
PRIMARY KEY (dni),
FOREIGN KEY (dpto) REFERENCES departamentos(CodDpto)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB