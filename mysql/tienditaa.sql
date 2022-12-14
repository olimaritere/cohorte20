-- MySQL Script generated by MySQL Workbench
-- Mon Dec  5 16:18:13 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`productos` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`producto_categoria_R`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto_categoria_R` (
  `productos_id` INT UNSIGNED NOT NULL,
  `categoria_id` INT NOT NULL,
  INDEX `fk_producto_categoria_R_productos_idx` (`productos_id` ASC) VISIBLE,
  INDEX `fk_producto_categoria_R_categoria1_idx` (`categoria_id` ASC) VISIBLE,
  CONSTRAINT `fk_producto_categoria_R_productos`
    FOREIGN KEY (`productos_id`)
    REFERENCES `mydb`.`productos` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_producto_categoria_R_categoria1`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `mydb`.`categoria` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`perfil` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidol` VARCHAR(45) NOT NULL,
  `perfil_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuarios_perfil1_idx` (`perfil_id` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_perfil1`
    FOREIGN KEY (`perfil_id`)
    REFERENCES `mydb`.`perfil` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`sistemas_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sistemas_pago` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`orden` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `usuarios_id` INT NOT NULL,
  `sistemas_pago_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_orden_usuarios1_idx` (`usuarios_id` ASC) VISIBLE,
  INDEX `fk_orden_sistemas_pago1_idx` (`sistemas_pago_id` ASC) VISIBLE,
  CONSTRAINT `fk_orden_usuarios1`
    FOREIGN KEY (`usuarios_id`)
    REFERENCES `mydb`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orden_sistemas_pago1`
    FOREIGN KEY (`sistemas_pago_id`)
    REFERENCES `mydb`.`sistemas_pago` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`orden_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`orden_producto` (
  `id` INT NOT NULL,
  `orden_id` INT NOT NULL,
  `productos_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_orden_producto_orden1_idx` (`orden_id` ASC) VISIBLE,
  INDEX `fk_orden_producto_productos1_idx` (`productos_id` ASC) VISIBLE,
  CONSTRAINT `fk_orden_producto_orden1`
    FOREIGN KEY (`orden_id`)
    REFERENCES `mydb`.`orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orden_producto_productos1`
    FOREIGN KEY (`productos_id`)
    REFERENCES `mydb`.`productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`lugar_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`lugar_orden` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ciudad` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `orden_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_lugar_orden_orden1_idx` (`orden_id` ASC) VISIBLE,
  CONSTRAINT `fk_lugar_orden_orden1`
    FOREIGN KEY (`orden_id`)
    REFERENCES `mydb`.`orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
