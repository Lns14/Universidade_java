
# Sistema acadêmico de uma universidade

Este projeto implementa um sistema de cadastro acadêmico, permitindo a gestão de estudantes, professores, disciplinas e ofertas de cursos. A estrutura do sistema segue um modelo orientado a objetos, utilizando as seguintes classes:

-Cadastro (classe pai)

-Estudante (classe filha de Cadastro)

-Professor (classe filha de Cadastro)

-Disciplina

-Oferta

Cada classe possui atributos e métodos específicos para gerenciar informações e relacionamentos entre os elementos do sistema.




## Estrutura das classes

Classe Cadastro

Classe base que representa uma pessoa cadastrada no sistema. Contém os atributos essenciais, incluindo nome, endereço, telefone, entre outros.

Classe Estudante

Herda de Cadastro e adiciona:

Um ArrayList contendo os oferecimentos nos quais o estudante está matriculado além de informações de curso, RA, e-mail, entre outros.

Classe Professor

Herda de Cadastro e adiciona:

Um ArrayList contendo os oferecimentos sob sua responsabilidade. além de e-mail, DRT, unidade, entre outros.

Classe Disciplina

Seu objetivo é gerenciar informações sobre uma disciplina, incluindo:

Um ArrayList contendo todos os oferecimentos cadastrados para essa disciplina além de da unidade, curso, entre outros.

Classe Oferta

Seu objetivo é gerenciar informações de um oferecimento específico de uma disciplina, incluindo:

Um ArrayList contendo todos os alunos cadastrados, ano, semestre, DRT do professor responsável, entre outros.

Classe Principal

Responsável pela execução dos testes e chamadas dos métodos das classes.

## Métodos Implementados


Métodos de adicionar

Verifique se RA (Registro do Aluno), DRT (Registro do Professor), código da disciplina ou código do oferecimento já estão cadastrados.

Se não houver, o objeto será cadastrado e adicionado à lista correspondente.

No caso de um oferecimento, verifique se o professor responsável e a disciplina existem antes de adicioná-lo à lista de professores cadastrados.

Métodos de imprimir

Verifique se há objetos cadastrados na categoria solicitada.
Se houver, imprima apenas as informações principais da lista.

Para ofertas, imprima todas as informações gerais de cada um.

*Método específico imprimeOferDeDisc: exibe apenas as ofertas de uma determinada disciplina.

Métodos de buscar

Permite buscar um objeto específico com base em um parâmetro (RA, DRT, código da disciplina ou código do oferecimento). Caso encontrado, imprima todos os atributos do objeto.

Para oferecimentos, são necessários dois parâmetros: código do oferecimento e código da disciplina associada.

Método adicionaOfer

Associar um aluno a um oferecimento ou adicionar um oferecimento a uma disciplina.

Método email

Retorne o e-mail de um estudante a partir de um RA fornecido.



## Demonstração e Testes

![Teste 1](https://github.com/Lns14/Universidade_java/blob/main/assets/teste_1.jpg)
![Teste 2](https://github.com/Lns14/Universidade_java/blob/main/assets/teste_2.jpg)
![Teste 3](https://github.com/Lns14/Universidade_java/blob/main/assets/teste_3.jpg)



## Conclusão

O sistema permite a gestão eficiente de cadastros acadêmicos, utilizando princípios de POO, herança e listas dinâmicas, garantindo flexibilidade e organização dos dados.
