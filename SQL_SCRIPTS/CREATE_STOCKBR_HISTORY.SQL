CREATE TABLE `portifolio_stock_br` (
  `stock_name` varchar(8) NOT NULL,
  `companie_name` varchar(255) NOT NULL,
  `amount` float NOT NULL,
  `total_value` float NOT NULL,
  PRIMARY KEY (`stock_name`),
  UNIQUE KEY `stock_name_UNIQUE` (`stock_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
