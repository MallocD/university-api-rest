CREATE TABLE `stockbr_purchase_history` (
  `stock_name` varchar(8) NOT NULL,
  `quantity_purchased` float NOT NULL,
  `price_paid` float NOT NULL,
  `data_purchase` datetime DEFAULT NULL,
  `companie_name` varchar(255) NOT NULL,
  `id_purchase` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_purchase`),
  UNIQUE KEY `id_purchase_UNIQUE` (`id_purchase`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
