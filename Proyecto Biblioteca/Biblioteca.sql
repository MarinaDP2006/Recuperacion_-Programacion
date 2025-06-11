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

INSERT INTO Autor (nombre, pais) VALUES
('Stephen King', 'EE.UU.'),
('Duffer Brothers', 'EE.UU.'),
('Neil Gaiman', 'Reino Unido'),
('Margaret Atwood', 'Canadá'),
('Frank Herbert', 'EE.UU.');

INSERT INTO Libro (titulo, anio, id_autor) VALUES
('Stranger Things', 2025, 2),         
('The Sandman', 2025, 3),             
('Life of Chuck', 2025, 1),           
('The Handmaid\'s Tale', 2025, 4),    
('Dune', 2025, 5);                    
