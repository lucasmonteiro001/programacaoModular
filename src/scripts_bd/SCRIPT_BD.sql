/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  lucas
 * Created: Jun 21, 2016
 */

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `cadastros` DEFAULT CHARACTER SET utf8 ;
USE `cadastros` ;

-- -----------------------------------------------------
-- Table `cadastros`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`cliente` (
  `idCliente` INT(10) NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(14) NOT NULL,
  `identidade` VARCHAR(10) NOT NULL,
  `nomeCliente` VARCHAR(30) NOT NULL,
  `dataNascimento` DATE NOT NULL DEFAULT '1900-01-01',
  `emailCliente` VARCHAR(20) NOT NULL,
  `enderecoCliente` VARCHAR(50) NOT NULL,
  `telefoneCliente` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cadastros`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`status` (
  `idStatus` INT(10) NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idStatus`),
  UNIQUE INDEX `status_UNIQUE` (`status` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cadastros`.`habilidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`habilidade` (
  `idHabilidade` INT(10) NOT NULL AUTO_INCREMENT,
  `habilidade` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idHabilidade`),
  UNIQUE INDEX `habilidade` (`habilidade` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cadastros`.`tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`tecnico` (
  `idTecnico` INT(10) NOT NULL AUTO_INCREMENT,
  `idHabilidade` INT(10) NOT NULL,
  `matriculaTecnico` INT(10) NOT NULL,
  `nomeTecnico` VARCHAR(30) NOT NULL,
  `emailTecnico` VARCHAR(20) NOT NULL,
  `telefoneTecnico` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`idTecnico`),
  INDEX `FK_tecnico_profissional` (`idHabilidade` ASC),
  UNIQUE INDEX `MatriculaTecnico_UNIQUE` (`matriculaTecnico` ASC),
  CONSTRAINT `FK_tecnico_profissional`
    FOREIGN KEY (`idHabilidade`)
    REFERENCES `cadastros`.`habilidade` (`idHabilidade`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cadastros`.`ordemservico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`ordemservico` (
  `idOS` INT(10) NOT NULL AUTO_INCREMENT,
  `idTecnico` INT(10) DEFAULT NULL,
  `idCliente` INT(10) NOT NULL,
  `idHabilidade` INT(10) NOT NULL,
  `descricaoServico` VARCHAR(300) NOT NULL,
  `idStatus` INT(10) NOT NULL,
  `dataOS` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `anotacoesOS` VARCHAR(45) NULL,
  PRIMARY KEY (`idOS`),
  INDEX `FK_ordemservico_cliente` (`idCliente` ASC),
  INDEX `FK_ordemservico_tecnico` (`idTecnico` ASC),
  INDEX `FK_ordemservico_status` (`idStatus` ASC),
  INDEX `fk_ordemservico_habilidade1_idx` (`idHabilidade` ASC),
  CONSTRAINT `FK_ordemservico_cliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `cadastros`.`cliente` (`idCliente`),
  CONSTRAINT `FK_ordemservico_status`
    FOREIGN KEY (`idStatus`)
    REFERENCES `cadastros`.`status` (`idStatus`),
  CONSTRAINT `FK_ordemservico_tecnico`
    FOREIGN KEY (`idTecnico`)
    REFERENCES `cadastros`.`tecnico` (`matriculaTecnico`),
  CONSTRAINT `fk_ordemservico_habilidade1`
    FOREIGN KEY (`idHabilidade`)
    REFERENCES `cadastros`.`habilidade` (`idHabilidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cadastros`.`orcamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`orcamento` (
  `idOrcamento` INT(10) NOT NULL AUTO_INCREMENT,
  `idOS` INT(10) NOT NULL,
  `idTecnico` INT(10) NOT NULL,
  `idCliente` INT(10) NOT NULL,
  `descricaoOrcamento` VARCHAR(45) NULL,
  `orcamentocol` VARCHAR(45) NULL,
  `numHoras` INT(10) NULL,
  `valorHora` DOUBLE NULL,
  `valorServico` DOUBLE NULL,
  `prazoOrcamento` DATETIME NULL,
  `autorizaOrcamento` VARCHAR(45) NULL,
  PRIMARY KEY (`idOrcamento`),
  INDEX `fk_orcamento_ordemservico1_idx` (`idOS` ASC),
  INDEX `fk_orcamento_tecnico1_idx` (`idTecnico` ASC),
  INDEX `fk_orcamento_cliente1_idx` (`idCliente` ASC),
  CONSTRAINT `fk_orcamento_ordemservico`
    FOREIGN KEY (`idOS`)
    REFERENCES `cadastros`.`ordemservico` (`idOS`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orcamento_tecnico1`
    FOREIGN KEY (`idTecnico`)
    REFERENCES `cadastros`.`tecnico` (`idTecnico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orcamento_cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `cadastros`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cadastros`.`produtoOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`produtoOS` (
  `idProduto` INT NOT NULL,
  `nomeProduto` VARCHAR(45) NULL,
  `precoProduto` VARCHAR(45) NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cadastros`.`produtoOrcamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cadastros`.`produtoOrcamento` (
  `idProduto` INT NOT NULL,
  `idOrcamento` INT NOT NULL,
  PRIMARY KEY (`idProduto`, `idOrcamento`),
  INDEX `fk_produtoOS_has_orcamento_orcamento1_idx` (`idOrcamento` ASC),
  INDEX `fk_produtoOS_has_orcamento_produtoOS1_idx` (`idProduto` ASC),
  CONSTRAINT `fk_produtoOS_has_orcamento_produtoOS1`
    FOREIGN KEY (`idProduto`)
    REFERENCES `cadastros`.`produtoOS` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_produtoOS_has_orcamento_orcamento1`
    FOREIGN KEY (`idOrcamento`)
    REFERENCES `cadastros`.`orcamento` (`idOrcamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


    SET SQL_MODE=@OLD_SQL_MODE;
    SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
    SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
