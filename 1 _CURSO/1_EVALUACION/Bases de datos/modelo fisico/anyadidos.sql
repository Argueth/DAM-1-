ALTER TABLE empleados
ADD( codp varchar(10),
FOREIGN KEY (codp) REFERENCES proyectos (codproy)
ON DELETE SET NULL ON UPDATE CASCADE);