# EXERCÍCIO 2

- Qual a diferença entre o throw e throws? Justifique explicado o que cada comando faz

*Resposta:* O comando throw é utilizado para lançar uma exceção manualmente em um bloco de código. Usa-se throw seguido de uma instância de uma classe de exceção para indicar que ocorreu um erro ou uma condição excepcional no código. O objetivo do throw é forçar a execução a sair do bloco atual e a procurar um bloco try-catch que possa lidar com a exceção

Já o comando throws é usado na declaração de um método para indicar que esse método pode lançar exceções de um determinado tipo. Ela faz parte da assinatura do método e informa aos chamadores do método que eles devem estar preparados para lidar com essas exceções ou declarar que também podem lançá-las. A palavra-chave throws não lança exceções, mas apenas especifica quais tipos de exceções podem ser lançados pelo método

- Indique a diferença entre checked e uncheked exceptions

*Resposta:* A principal diferença entre exceções verificadas e não verificadas é a obrigatoriedade de tratamento no código. Exceções verificadas devem ser tratadas explicitamente, enquanto nas exceções não verificadas não é obrigatório incluir blocos try-catch para lidar com elas, embora você possa fazer isso se desejar. 