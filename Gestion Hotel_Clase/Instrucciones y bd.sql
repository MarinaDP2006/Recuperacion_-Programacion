-- Implementa un CRUD para gestionar un hotel, las tablas con las que trabajamos son clientes, Habitación, reserva. Os subo el script de la Base de Datos. Seguir modelo DTO, DAO.
CREATE DATABASE IF NOT EXISTS Hotel;
USE Hotel;

CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE Habitacion (
    id_habitacion INT AUTO_INCREMENT PRIMARY KEY,
    numero INT,
    tipo VARCHAR(50),
    precio DECIMAL(7,2)
);

CREATE TABLE Reserva (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_habitacion INT,
    fecha_entrada DATE,
    fecha_salida DATE,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente) ON DELETE RESTRICT,
    FOREIGN KEY (id_habitacion) REFERENCES Habitacion(id_habitacion) ON DELETE RESTRICT
);
