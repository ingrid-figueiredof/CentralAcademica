Central de Atendimento Universitário

1. Apresentação

O projeto **Central de Atendimento Universitário** foi desenvolvido em Java como atividade prática da disciplina de Estruturas de Dados. A proposta consiste em simular o gerenciamento de solicitações de atendimento, utilizando estruturas de dados para organizar e manipular as informações.

Durante o desenvolvimento, foram trabalhadas três estruturas principais: lista encadeada, fila e pilha. Cada uma possui uma finalidade específica no sistema, permitindo aplicar na prática os conceitos estudados em sala de aula.

2. Objetivos

O objetivo do projeto é implementar e compreender o funcionamento de diferentes estruturas de dados, utilizando a linguagem Java.

Entre os objetivos específicos estão:

- Implementar uma lista encadeada para armazenar solicitações;
- Utilizar uma fila para organizar a ordem de atendimento;
- Utilizar uma pilha para representar o histórico de atendimentos;
- Desenvolver operações de inserção, busca, remoção e consulta;
- Trabalhar com classes, objetos, nós e referências;
- Analisar a complexidade das principais operações;
- Verificar o funcionamento das estruturas por meio de testes.

3. Estruturas de Dados

   3.1 Lista Encadeada

A lista encadeada é utilizada para armazenar e organizar as solicitações cadastradas. Cada elemento é representado por um nó, que contém os dados de uma solicitação e uma referência para o próximo elemento.

As operações relacionadas à lista incluem:

- Adicionar solicitações;
- Buscar solicitações;
- Remover solicitações;
- Exibir as solicitações armazenadas.

  3.2 Fila (FIFO)

A fila organiza as solicitações que aguardam atendimento. Seu funcionamento segue o princípio FIFO (*First In, First Out*), no qual o primeiro elemento inserido é o primeiro a ser removido.

Exemplo de funcionamento:

Entrada: A → B → C
Saída:   A → B → C
As principais operações são enfileirar, desenfileirar, consultar o início da fila e verificar se ela está vazia.

   3.3 Pilha (LIFO)

A pilha representa o histórico de atendimentos e segue o princípio LIFO (*Last In, First Out*), no qual o último elemento inserido é o primeiro a ser removido.

Exemplo de funcionamento:
Entrada: A → B → C
Saída:   C → B → A
As principais operações são empilhar, desempilhar, consultar o topo da pilha e verificar se ela está vazia.

  4. Funcionamento do Sistema

O projeto reúne as estruturas de dados em um cenário de gerenciamento de solicitações universitárias.

De forma geral, o fluxo previsto é:

Cadastro de solicitações
          ↓
    Lista encadeada
          ↓
       Fila FIFO
          ↓
       Atendimento
          ↓
       Pilha LIFO
          ↓
  Histórico de atendimentos


A lista permite manter as solicitações cadastradas, enquanto a fila organiza a ordem de atendimento. Após o atendimento, a pilha permite consultar os registros seguindo a lógica LIFO.

  5. Organização dos Arquivos

O projeto está organizado nas seguintes classes:

| Classe | Responsabilidade |
|---|---|
| `Solicitacao.java` | Representa uma solicitação de atendimento. |
| `No.java` | Representa um nó e mantém a referência para o próximo elemento. |
| `ListaSolicitacoes.java` | Gerencia as solicitações armazenadas na lista encadeada. |
| `FilaSolicitacoes.java` | Gerencia a fila de solicitações seguindo FIFO. |
| `PilhaSolicitacoes.java` | Gerencia a pilha de solicitações seguindo LIFO. |
| `CentralAcademica.java` | Contém o ponto de entrada do programa. |

  6. Análise de Complexidade

A tabela apresenta as complexidades esperadas para as operações, considerando implementações convencionais das estruturas.

| Estrutura | Operação | Complexidade |
| Lista encadeada | Inserção no início | O(1) |
| Lista encadeada | Busca | O(n) |
| Lista encadeada | Remoção por valor | O(n) |
| Lista encadeada | Percorrer todos os elementos | O(n) |
| Fila | Enfileirar | O(1) |
| Fila | Desenfileirar | O(1) |
| Fila | Consultar o início | O(1) |
| Pilha | Empilhar | O(1) |
| Pilha | Desempilhar | O(1) |
| Pilha | Consultar o topo | O(1) |

As complexidades podem variar conforme a implementação utilizada. Por exemplo, a inserção no final de uma lista encadeada depende da existência de uma referência para o último nó.

  7. Testes

Os testes do projeto devem verificar o comportamento das estruturas em situações comuns e em casos-limite, como:

- Inserção de uma ou mais solicitações;
- Busca de elementos existentes e inexistentes;
- Remoção de elementos;
- Atendimento na ordem de chegada, utilizando FIFO;
- Remoção dos elementos na ordem inversa de inserção, utilizando LIFO;
- Consulta ao início da fila e ao topo da pilha;
- Tentativa de remoção ou consulta em estruturas vazias.

Esses cenários ajudam a identificar possíveis erros e a verificar se cada estrutura respeita suas regras de funcionamento.

  8. Tecnologias Utilizadas

- Linguagem: Java
- Ambiente de desenvolvimento:Apache NetBeans
- Paradigma:Programação Orientada a Objetos
- Conteúdos:Estruturas de Dados e análise de complexidade.

 9. Como Executar

1. Abra o projeto no Apache NetBeans.
2. Aguarde a conclusão do carregamento do projeto.
3. Compile os arquivos Java.
4. Execute a classe `CentralAcademica.java`.
5. Utilize as opções disponíveis no programa para testar as operações implementadas.

  10. Considerações Finais

O desenvolvimento da Central de Atendimento Universitário permitiu aplicar os conceitos de lista encadeada, fila e pilha em uma situação prática. A implementação contribui para compreender como essas estruturas organizam e manipulam dados de maneiras diferentes.
O projeto também reforça a importância da organização do código em classes e da análise da complexidade das operações, conhecimentos fundamentais para o desenvolvimento de programas eficientes.

  Autoria:
Guilherme Machado
Ingrid Figueiredo Alves
Kamilly Mariana 
Patrick Amaral 
