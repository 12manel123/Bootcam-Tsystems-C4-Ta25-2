DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

CREATE TABLE departamentos (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    presupuesto INT NOT NULL
);

CREATE TABLE empleados (
    DNI VARCHAR(8) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    departamento INT NOT NULL,
    FOREIGN KEY (departamento) REFERENCES Departamentos(codigo)
);

INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (1, 'Ventas', 100000);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (2, 'Recursos Humanos', 75000);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (3, 'Tecnología', 150000);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (4, 'Finanzas', 120000);

INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES ('12345678', 'Juan', 'Pérez', 1);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES ('87654321', 'María', 'González', 1);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES ('98765432', 'Pedro', 'Ramírez', 2);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES ('54321678', 'Ana', 'Martínez', 3);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES ('45678901', 'Carlos', 'López', 4);
