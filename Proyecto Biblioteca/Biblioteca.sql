CREATE DATABASE IF NOT EXISTS Biblioteca;
USE Biblioteca;

CREATE TABLE Autor (
    id_autor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    pais VARCHAR(50)
);

CREATE TABLE Libro (
    id_libro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    anio INT,
    id_autor INT,
    FOREIGN KEY (id_autor) REFERENCES Autor(id_autor) ON DELETE RESTRICT
);

INSERT INTO Autor (nombre, pais) VALUES ('Stephen King', 'Estados Unidos');
INSERT INTO Autor (nombre, pais) VALUES ('Colleen Hoover', 'Estados Unidos');
INSERT INTO Autor (nombre, pais) VALUES ('Gillian Flynn', 'Estados Unidos');
INSERT INTO Autor (nombre, pais) VALUES ('J.K. Rowling', 'Reino Unido');
INSERT INTO Autor (nombre, pais) VALUES ('Neil Gaiman', 'Reino Unido');

INSERT INTO Libro (titulo, anio, id_autor) VALUES ('The Boogeyman', 2025, 1); 
INSERT INTO Libro (titulo, anio, id_autor) VALUES ('It Ends With Us', 2024, 2); 
INSERT INTO Libro (titulo, anio, id_autor) VALUES ('Gone Girl', 2024, 3); 
INSERT INTO Libro (titulo, anio, id_autor) VALUES ('Fantastic Beasts: The Secrets of Dumbledore', 2025, 4); 
INSERT INTO Libro (titulo, anio, id_autor) VALUES ('The Sandman', 2024, 5);
