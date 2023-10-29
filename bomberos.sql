-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 02:38:27
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos`
--
CREATE DATABASE IF NOT EXISTS `bomberos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombrero` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `fecha_nac` date NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `dni` int(8) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `grupo_sanguineo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombrero`, `nombre`, `fecha_nac`, `codBrigada`, `dni`, `celular`, `estado`, `apellido`, `grupo_sanguineo`) VALUES
(5, 'Esteban ', '1980-04-25', 2, 3333333, '+54 9 666 444 5556', 1, 'Cornejo', 'O-'),
(6, 'maria ', '1990-06-11', 1, 44444444, '+54 9 342 151 4444 ', 1, 'paz ', 'O-'),
(12, 'pepe', '2023-10-18', 10, 22228888, '+54 9 789 456 1232', 0, 'argento', 'A+'),
(13, 'Jose', '2017-10-11', 1, 66666666, '123456', 1, 'Sanchez', 'A-'),
(14, 'mateo', '1980-04-25', 1, 22222222, '4323453', 1, 'alverto', 'B-'),
(15, 'Cordoba', '1980-04-25', 1, 12347777, '5555', 1, 'Martinez', 'A+'),
(16, 'Luis', '2023-10-11', 1, 43211111, '222', 0, 'Perez', 'B-'),
(18, 'Alejandro', '2023-10-05', 1, 1112312, '123123', 1, 'Romero', 'B-'),
(19, 'Cordoba', '1980-04-25', 1, 33337777, '5555', 1, 'Martinez', 'A+'),
(20, 'debo', '2023-10-17', 2, 12777777, '1333', 1, 'rodriguez', 'A+'),
(21, 'Daniel', '2023-10-10', 2, 12345678, '+54 9 342 524 5631', 1, 'Garcia', 'A-'),
(22, 'este', '2023-10-13', 2, 11111111, '+54 9 666 444 5556', 1, 'ban', 'B+'),
(23, 'Bauti', '2013-10-10', 5, 40000000, '123', 1, 'cor', 'A+'),
(24, 'Laura', '2023-10-06', 1, 11117777, '123', 1, 'Fernandez', 'B+'),
(33, 'Ana', '2023-10-13', 2, 34121691, '+54 9 123 456 7820', 1, 'Gonzalez', 'AB-');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(60) NOT NULL,
  `libre` tinyint(4) NOT NULL,
  `nro_cuartel` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`, `estado`) VALUES
(1, 'sin asignar', 'sin asignar', 0, 2, 1),
(2, 'delta', 'rescates en montaña', 0, 3, 1),
(4, 'start', 'socorrer inundaciones', 1, 5, 1),
(5, 'netbean', 'operativos de prevención', 1, 7, 1),
(7, 'HeroesDelFuego', 'inundaciones', 1, 7, 1),
(8, 'mechoque', 'accidentes de tráfico', 1, 2, 1),
(9, 'CampeonesDelSocorro', 'prevención', 1, 7, 1),
(10, 'Bravo', 'salvamento', 1, 9, 1),
(11, 'ValientesDeLaEmergen', 'salvamento', 0, 7, 1),
(12, 'RescateUnidao', 'salvamento', 1, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `cod_Cuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`cod_Cuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(2, 'cuartelNumero1', 'cordoba 7444', 23, 2, '+54 9 321 423 5120', 'correo@hotmai.com', 1),
(3, 'cuartelNumero2', 'mendoza 5555', 2, 3, '+54 9 321 456 9632', 'correo@hotmail.com', 1),
(5, 'cuartelNumero3', 'San martin 6666', 3, 4, '7777777', 'correo3', 1),
(7, 'cuartelNumero4', '9  de julio 1019', 5, 9, '+54 9 888 888 8888', 'correo4@hotmail.com', 1),
(9, 'Cocacola', 'por ahi', 55, 44, '+54 9 455 005 5820', 'radiotaxi@hotmail.com', 1),
(10, 'grupo17', 'santa fe', 15, 17, '+54 9 123 123 7890', 'asdas@hotmail.com', 0),
(11, 'delta', 'asdasda', 321, 15, '+54 9 123 456 7891', 'asda@gotmail.com', 0),
(12, 'samsung', 'Las Heras 1200', 590, 480, '+54 9 321 456 3216', 'asdsad@hotmal.com', 0),
(13, 'commodare', 'San martin 4511', 600, 415, '+54 9 123 456 7891 ', 'grupo17@hotmail.com', 0),
(14, 'noga', 'alverdi 7455', 600, 400, '+54 9 321 456 3212', 'asdasda@hotmail.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `fecha_resol` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalle`, `fecha_resol`, `puntuacion`, `codBrigada`, `estado`) VALUES
(1, 'incendios', '2023-10-20', 12, 15, 'se que el rancho', '2023-10-16', 8, 4, 1),
(2, 'incendios', '2023-10-16', 14, 12, 'incedio de casa 2 pisos', '2023-10-16', 6, 5, 1),
(4, 'rescates en montaña', '1980-04-20', 0, 0, 'se que el rancho', '2023-10-05', 9, 4, 1),
(5, 'rescates en montaña', '2023-10-18', 15, 12, 'en la altura', '0000-00-00', 0, 2, 1),
(6, 'incendios', '2023-10-16', 15, 32, 'fuego mucho', '0000-00-00', 0, 1, 1),
(7, 'incendios', '2023-10-16', 12, 12, 'incendio de casa', '0000-00-00', 0, 1, 1),
(8, 'accidentes de tráfico', '2023-10-20', 45, 582, 'asdasdbobo', '2023-10-19', 7, 8, 1),
(9, 'rescates en montaña', '2023-10-26', 454, 12, 'rescate2', '0000-00-00', 0, 2, 1),
(10, 'prevención', '2023-10-26', 14, 24, 'asd', '2023-10-27', 9, 9, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombrero`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `nro_cuartel` (`nro_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`cod_Cuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombrero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `cod_Cuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`nro_cuartel`) REFERENCES `cuartel` (`cod_Cuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
