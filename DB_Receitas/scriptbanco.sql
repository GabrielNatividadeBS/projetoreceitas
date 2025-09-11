USE receitas_db;
INSERT INTO receita (nome, ingredientes, modo_preparo, tempo_preparo, categoria_id)
VALUES (
  'Pão Doce',
  '3 cenouras, 2 xícaras de farinha, 3 ovos, 1 xícara de óleo, 2 xícaras de açúcar',
  'Bata as cenouras com ovos e óleo, misture a farinha e o açúcar, adicione fermento e asse por 40 minutos',
  40,
  1
);

SELECT * FROM receita;CREATE DATABASE `receitas_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
