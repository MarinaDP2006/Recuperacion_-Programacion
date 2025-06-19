CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `email`) VALUES
(1, 'Juan Pérez', 'juan.perez@email.com'),
(2, 'María García', 'maria.garcia@email.com'),
(3, 'Carlos López', 'carlos.lopez@email.com'),
(4, 'Ana Martinez', 'ana.martinez@email.com'),
(5, 'Luis Rodríguez', 'luis.rodriguez@email.com'),
(6, 'Sofía Hernández', 'sofia.hernandez@email.com'),
(7, 'Miguel González', 'miguel.gonzalez@email.com'),
(8, 'Elena Díaz', 'elena.diaz@email.com'),
(9, 'Jorge Sánchez', 'jorge.sanchez@email.com'),
(10, 'Laura Ruiz', 'laura.ruiz@email.com'),
(11, 'Marta Ortiz', 'marta.ortiz@email.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id_habitacion` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `precio` decimal(7,2) DEFAULT NULL,
  `disponible` tinyint(1) DEFAULT 1 COMMENT 'TRUE (1) = Libre, FALSE (0) = Ocupada'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`id_habitacion`, `numero`, `tipo`, `precio`, `disponible`) VALUES
(1, 101, 'Individual', 80.50, 1),
(2, 102, 'Individual', 80.50, 1),
(3, 103, 'Doble', 120.75, 1),
(4, 104, 'Doble', 120.75, 1),
(5, 105, 'Suite', 200.00, 1),
(6, 201, 'Individual', 85.25, 1),
(7, 202, 'Doble', 125.50, 1),
(8, 203, 'Doble', 125.50, 1),
(9, 204, 'Suite', 210.00, 1),
(10, 205, 'Familiar', 180.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_habitacion` int(11) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `fecha_salida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id_habitacion`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_habitacion` (`id_habitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id_habitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitacion` (`id_habitacion`);
COMMIT;
