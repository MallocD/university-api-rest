CREATE TABLE `finance`.`fundos_imobiliarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fund_name` VARCHAR(45) NOT NULL,
  `companie_name` VARCHAR(45) NOT NULL,
  `fund_price` BLOB NOT NULL,
  `amount` BLOB NULL,
  `purchased_quantity` INT NOT NULL,
  `purchase_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `name_stock_UNIQUE` (`fund_name` ASC) VISIBLE,
  UNIQUE INDEX `name_companie_UNIQUE` (`companie_name` ASC) VISIBLE);
