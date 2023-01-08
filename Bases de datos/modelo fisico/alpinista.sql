CREATE TABLE asociacion (
codigo VARCHAR(10),
nombre VARCHAR(20),
ubicacion VARCHAR(30),
CONSTRAINT aso_cod_pk PRIMARY KEY (codigo)
);

CREATE TABLE alpinistas (
nif CHAR(9),
nombre VARCHAR(20),
fecha_nacimiento DATE,
codigo VARCHAR(10),
fecha_ingreso DATE,
CONSTRAINT alp_nif_pk PRIMARY KEY (nif),
CONSTRAINT alp_cod_fk FOREIGN KEY (codigo) REFERENCES asociacion (codigo)
);

CREATE TABLE telefonos (
nif VARCHAR (9),
telefono CHAR(9),
CONSTRAINT tel_nif_pk PRIMARY KEY (nif, telefono),
CONSTRAINT tel_nif_fk FOREIGN KEY (nif) REFERENCES alpinistas (nif)
);

CREATE TABLE picos (
nombre VARCHAR (20), 
altura INTEGER,
coordenadas VARCHAR(10),
pais VARCHAR(20),
CONSTRAINT pic_nom_pk PRIMARY KEY (nombre)
);

CREATE TABLE escala (
nif CHAR(9),
nombre VARCHAR(20),
fecha_inicio DATE,
tiempo VARCHAR(10),
oxigeno DECIMAL(3,2),
cara VARCHAR(20),
CONSTRAINT esc_nif_pk PRIMARY KEY (nif, nombre),
CONSTRAINT esc_nif_fk FOREIGN KEY (nif) REFERENCES alpinistas (nif),
CONSTRAINT esc_nom_fk FOREIGN KEY (nombre) REFERENCES picos (nombre)
);
