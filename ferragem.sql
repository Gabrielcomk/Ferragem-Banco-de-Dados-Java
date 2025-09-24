-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 02-Jul-2015 às 02:21
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ferragem`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `ID_Cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `data_nasc` date DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `fone1` int(11) DEFAULT NULL,
  `fone2` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Cliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`ID_Cliente`, `nome`, `sexo`, `data_nasc`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `fone1`, `fone2`) VALUES
(1, 'Ana Santos', 'f', '1995-08-23', 'Rua Pitanga', 45, 'Apto 678', 'Centro', 'Canoas', 111, 1111),
(2, 'Paulo Brittes', 'm', '1987-01-22', 'Av. Goiania', 89, '', 'Ipe', 'Gravatai', 222, 0),
(3, 'Lucas Oliveira', 'm', '1986-05-20', 'Rua Inga', 36, 'Apto 102', 'Ferrari', 'Porto Alegre', 333, 0),
(4, 'Oscar Lima', 'm', '1992-04-12', 'Av. Minas', 76, '', 'Cristal', 'Porto Alegre', 444, 0),
(5, 'Marta Emel', 'f', '1991-06-10', 'Rua Ipe', 85, 'Apto 203', 'Centro', 'Sapucaia', 555, 0),
(6, 'Danilo Silas', 'm', '1978-06-12', 'Av. Bahia', 37, 'Bloco B', 'Pio 23', 'Alvorada', 666, 667),
(7, 'Maria Jarbas', 'f', '1980-07-20', 'Rua Pinho', 91, 'Fundos', 'Centro', 'Alvorada', 777, 0),
(8, 'Carlos Noes', 'm', '1982-05-02', 'Av. Alagoas', 64, 'Apto 302', 'LBV', 'Canoas', 888, 0),
(9, 'Lais Bastos', 'f', '1989-09-03', 'Rua Manga', 68, 'Apto 23', 'Centro', 'Gravatai', 999, 998),
(10, 'Nair Lopes', 'f', '1982-12-11', 'Av. Parana', 23, '', 'Luz', 'Canoas', 100, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `entregador`
--

CREATE TABLE IF NOT EXISTS `entregador` (
  `ID_Entregador` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `contato` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Entregador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `entregador`
--

INSERT INTO `entregador` (`ID_Entregador`, `nome`, `contato`) VALUES
(1, 'Bernardo Gomes', 123),
(2, 'Breno Gaspar', 456),
(3, 'Altair Almeida', 654),
(4, 'Gustavo Nover', 321),
(5, 'Leandro Tormes', 789);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoque`
--

CREATE TABLE IF NOT EXISTS `estoque` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(100) DEFAULT NULL,
  `unidade` varchar(5) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `ID_fornecedor` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `ID_Fornecedor` (`ID_fornecedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `estoque`
--

INSERT INTO `estoque` (`codigo`, `item`, `unidade`, `preco`, `ID_fornecedor`) VALUES
(1, 'Caneta', 'UN', 2, 3),
(2, 'Borracha', 'UN', 2.33, 3),
(3, 'Papel A4', 'RSM', 10, 2),
(4, 'Tinta para Carimbo', 'TB', 4.56, 5),
(5, 'Lápis de cor', 'CX', 8, 7),
(6, 'Grampeador', 'UN', 8.78, 4),
(7, 'Papel manteiga', 'DZ', 5, 2),
(8, 'Compasso', 'UN', 3, 1),
(9, 'Régua', 'UN', 1.1, 6),
(10, 'Apagador', 'UN', 6, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fones_forn`
--

CREATE TABLE IF NOT EXISTS `fones_forn` (
  `ID_fornecedor` int(11) NOT NULL,
  `DDD` int(11) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  KEY `ID_Forn` (`ID_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fones_forn`
--

INSERT INTO `fones_forn` (`ID_fornecedor`, `DDD`, `numero`) VALUES
(1, 51, 9999),
(1, 51, 8888),
(1, 51, 7777),
(2, 51, 6666),
(2, 51, 5555),
(7, 51, 4444),
(7, 51, 3333),
(7, 51, 2222),
(3, 51, 1111),
(4, 51, 9998),
(4, 51, 8887),
(5, 51, 7776),
(5, 51, 6665),
(5, 51, 5554),
(6, 51, 4443),
(5, 51, 3332),
(6, 51, 2221),
(3, 51, 1110);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `ID_Forn` int(11) NOT NULL AUTO_INCREMENT,
  `fornecedor` varchar(150) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `nr` int(11) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Forn`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`ID_Forn`, `fornecedor`, `endereco`, `nr`, `complemento`, `bairro`, `cidade`) VALUES
(1, 'Ferrara LTDA', 'Rua Agostinho', 154, 'Bloco A', 'Sarandi', 'Gravatai'),
(2, 'Tabajara S/A', 'Av. Parque Jardim', 365, '', 'Pq. Jardim', 'Porto Alegre'),
(3, 'Liptos LTDA', 'Rua Kennedy', 233, '', 'Centro', 'Canoas'),
(4, 'Bruno Miles', 'Av. Matinho Lutero', 854, '2andar', 'Restinga', 'Porto Alegre'),
(5, 'Canoas distribuidora', 'Av. Matias Velho', 523, '', 'Floresta', 'Porto Alegre'),
(6, 'Gebasa LTDA', 'Rua Angelita', 25, 'Sala 102', 'Luiz IV', 'Canoas'),
(7, 'Atacado Jarbas', 'Av. Brasil', 452, '', 'Cristal', 'Porto Alegre');

-- --------------------------------------------------------

--
-- Estrutura da tabela `nota_fiscal`
--

CREATE TABLE IF NOT EXISTS `nota_fiscal` (
  `NF` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `ID_entrega` int(11) NOT NULL,
  `ID_cliente` int(11) NOT NULL,
  PRIMARY KEY (`NF`),
  KEY `ID_entr` (`ID_entrega`),
  KEY `ID_cli` (`ID_cliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `nota_fiscal`
--

INSERT INTO `nota_fiscal` (`NF`, `data`, `ID_entrega`, `ID_cliente`) VALUES
(1, '2012-06-04', 1, 8),
(2, '2012-06-04', 2, 9),
(3, '2012-06-05', 3, 3),
(4, '2012-06-05', 4, 4),
(5, '2012-06-06', 5, 5),
(6, '2012-06-06', 1, 1),
(7, '2012-06-08', 2, 2),
(8, '2012-06-08', 3, 7),
(9, '2012-06-09', 4, 6),
(10, '2012-06-09', 4, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `codigo_item` int(11) NOT NULL,
  `NR_NF` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  KEY `cod_item` (`codigo_item`),
  KEY `nr_nf` (`NR_NF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`codigo_item`, `NR_NF`, `quantidade`) VALUES
(1, 1, 1),
(2, 1, 2),
(5, 1, 1),
(3, 2, 2),
(8, 2, 1),
(5, 2, 2),
(3, 3, 2),
(5, 3, 1),
(8, 3, 2),
(4, 4, 1),
(3, 4, 2),
(6, 4, 3),
(8, 4, 1),
(5, 4, 2),
(3, 5, 3),
(5, 5, 2),
(7, 5, 1),
(8, 6, 1),
(5, 7, 2),
(5, 7, 3),
(9, 7, 3),
(10, 8, 2),
(5, 8, 1),
(7, 8, 1),
(8, 9, 2),
(4, 9, 3),
(5, 10, 2),
(7, 10, 3);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `estoque`
--
ALTER TABLE `estoque`
  ADD CONSTRAINT `chave_forn_estoque` FOREIGN KEY (`ID_fornecedor`) REFERENCES `fornecedor` (`ID_Forn`);

--
-- Limitadores para a tabela `fones_forn`
--
ALTER TABLE `fones_forn`
  ADD CONSTRAINT `chave_forn_fones` FOREIGN KEY (`ID_fornecedor`) REFERENCES `fornecedor` (`ID_Forn`);

--
-- Limitadores para a tabela `nota_fiscal`
--
ALTER TABLE `nota_fiscal`
  ADD CONSTRAINT `chave_cli` FOREIGN KEY (`ID_cliente`) REFERENCES `clientes` (`ID_Cliente`),
  ADD CONSTRAINT `chave_entre` FOREIGN KEY (`ID_entrega`) REFERENCES `entregador` (`ID_Entregador`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `chave_item` FOREIGN KEY (`codigo_item`) REFERENCES `estoque` (`codigo`),
  ADD CONSTRAINT `chave_nr_nf` FOREIGN KEY (`NR_NF`) REFERENCES `nota_fiscal` (`NF`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
