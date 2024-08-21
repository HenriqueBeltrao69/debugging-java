# Debugging Java

Este projeto faz parte de um curso que apresenta conceitos introdutórios sobre como trabalhar com debugging na linguagem Java. O objetivo é ensinar técnicas de depuração de código, utilizando exemplos práticos e explicações detalhadas.

## 🛑 Pré-requisitos

- [x] Java JDK 8 ou superior
- [x] IDE para desenvolvimento Java

## 📚 Ementa

1. Visão Geral do Debugging
2. Pilha de Execução de um Programa Java
3. Ferramentas de Depuração
4. Stack Trace
5. Tratamento de Exceções

## Visão Geral

Erros de programação são denominados bugs, e o processo de encontrar e corrigir bugs é chamado de depuração ou debugging. A depuração é uma tarefa essencial no desenvolvimento de software, e envolve a identificação, análise e correção de erros no código.

## Tipos de Erros

- **Erros de Sintaxe:** Falhas nas regras da linguagem, como esquecer de fechar parênteses ou não terminar uma instrução com ponto-e-vírgula.
- **Erros de Semântica:** Falhas na lógica do código, onde o programa é sintaticamente correto, mas não funciona como esperado.

## Ferramentas de Depuração

- **Depuradores em IDEs:** Ferramentas como IntelliJ IDEA e Eclipse permitem pausar a execução do código, inspecionar variáveis e analisar a pilha de chamadas.
- **Pontos de Interrupção (Breakpoints):** Utilizados para parar a execução em pontos específicos e inspecionar o estado do programa.
- **Stack Trace:** Ajuda a rastrear a origem de exceções e erros no código.

## Exemplo Prático de Tratamento de Exceções

A classe `TratamentoDeExcecoes` demonstra como capturar e tratar exceções comuns em Java.

### Explicação

- **Objetivo:** Esta classe demonstra como tratar uma exceção comum em Java, `ArithmeticException`, que ocorre ao tentar dividir um número por zero.
- **Uso:** Ao executar essa classe, a exceção será capturada no bloco `catch`, e uma mensagem de erro será exibida.

## Exemplo Prático de Stack Trace

A classe `ExemploStackTrace` demonstra como um stack trace é gerado quando uma exceção é lançada e como ele pode ser usado para rastrear o caminho de execução do código.

### Explicação

- **Objetivo:** Esta classe ilustra como um stack trace é gerado e como ele pode ser usado para rastrear o caminho de execução do código até o ponto onde uma exceção foi lançada.
- **Uso:** Ao executar essa classe, uma exceção será lançada no `metodoC`, e o stack trace resultante mostrará a sequência de chamadas de métodos que levaram à exceção.

## 🔗 Links Úteis

- [JetBrains Depurador](https://confluence.jetbrains.com/display/IntelliJIDEA/14.+Depurador)
- [Eclipse Newsletter](https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php)

## 🔎 Referências

- [HostGator Blog sobre Debug](https://www.hostgator.com.br/blog/debug-desenvolvimento-web/)
- [Dio Exceções em Java](https://web.dio.me/articles/exception-java?back=%2Farticles&open-modal=true&page=1&order=oldest)
- [Wikipedia sobre Depuração](https://pt.wikipedia.org/wiki/Depura%C3%A7%C3%A3o)

## ✨ Redes Sociais

[Cami-la no LinkedIn](https://www.linkedin.com/in/cami-la/)

## 🤝 Contribuindo

Este repositório foi criado para fins de estudo. Se você foi ajudado de alguma forma, ficarei feliz em saber. E caso conheça alguém que se identifique com o conteúdo, não deixe de compartilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues
