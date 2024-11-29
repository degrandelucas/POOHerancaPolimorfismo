# Projeto Herança e Polimorfismo em Java

Este projeto em Java demonstra conceitos de Herança e Polimorfismo, abordando o uso de classes e objetos para representar diferentes entidades, como veículos, animais e contas bancárias. O código utiliza herança para estender funcionalidades de classes base e polimorfismo para permitir comportamentos diferentes em subclasses.

---

## Funcionalidades Principais

1. **Classe Carro:**
    - Representa um carro com atributos como `modelo`, `precoAno1`, `precoAno2`, e `precoAno3`.
    - Método `informaMenorValorNoPeriodo()` retorna o menor valor entre os preços dos três anos.

2. **Classe ModeloCarro (Herança):**
    - Extende a classe `Carro`, adicionando o atributo `tipoCombustivel`.
    - Sobrescreve o método `informaMenorValorNoPeriodo()` para comparar os preços dos três anos e retornar o menor.
    - Método `exibirInformacoes()` exibe os detalhes do modelo do carro.

3. **Classe Animal:**
    - Representa um animal genérico com um método `emitirSom()` que pode ser sobrescrito pelas subclasses.

4. **Classes Cachorro e Gato (Polimorfismo):**
    - Subclasses de `Animal`, cada uma implementando o método `emitirSom()` de forma diferente (latindo para o `Cachorro` e miando para o `Gato`).
    - Métodos específicos de cada animal, como `abanarRabo()` para o `Cachorro` e `arranharMoveis()` para o `Gato`.

5. **Classe ContaBancaria:**
    - Representa uma conta bancária com métodos para depósito (`deposita()`), saque (`sacar()`) e consulta de saldo (`consultaSaldo()`).
    - Método `desconto()` permite descontar um valor do saldo.

6. **Classe ContaCorrente (Herança):**
    - Extende `ContaBancaria` e implementa funcionalidades específicas para a conta corrente, como tarifa mensal (`tarifaMensal`) e tarifa por saque (`tarifaSaque`).
    - Método `saqueContaCorrente()` aplica a tarifa de saque e chama o método `sacar()` da classe pai.
    - Método `descontoTarifa()` aplica a tarifa mensal ao saldo da conta.

---

## Estrutura de Pacotes

O projeto foi organizado em pacotes para refletir boas práticas de estruturação, separando as responsabilidades das classes de forma modular. A estrutura é a seguinte:

```plaintext
heranca-polimorfismo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── herancapolimorfismo/
│   │   │   │   │   ├── application/      # Contém a classe principal para execução
│   │   │   │   │   │   ├── App.java
│   │   │   │   │   ├── model/            # Contém as classes de entidades como Carro, Animal, etc.
│   │   │   │   │   │   ├── Carro.java
│   │   │   │   │   │   ├── Animal.java
│   │   │   │   │   │   ├── Cachorro.java
│   │   │   │   │   │   ├── Gato.java
│   │   │   │   │   ├── service/           # Contém as classes de serviço como ModeloCarro, ContaCorrente, etc.
│   │   │   │   │   │   ├── ModeloCarro.java
│   │   │   │   │   │   ├── ContaBancaria.java
│   │   │   │   │   │   ├── ContaCorrente.java
```

# Detalhes dos Pacotes

## application
Contém a classe `App.java`, responsável por interagir com o usuário e executar os exemplos de uso do sistema.

## model
Contém as classes que representam as entidades do sistema:

- **`Carro.java`**: Define os atributos e métodos comuns para qualquer tipo de carro.
- **`Animal.java`**: Classe base para os animais, com método genérico `emitirSom()`.
- **`Cachorro.java`**: Subclasse de `Animal`, implementa o som e o comportamento específico de um cachorro.
- **`Gato.java`**: Subclasse de `Animal`, implementa o som e o comportamento específico de um gato.

## service
Contém as classes de serviços que estendem ou adicionam funcionalidades específicas:

- **`ModeloCarro.java`**: Estende a classe `Carro` e adiciona informações sobre o tipo de combustível e o método para exibir informações detalhadas.
- **`ContaBancaria.java`**: Implementa a lógica básica de conta bancária, como depósito, saque e consulta de saldo.
- **`ContaCorrente.java`**: Estende `ContaBancaria` e adiciona funcionalidades específicas, como tarifas de saque e mensal.

---

# Exemplos de Uso

### Criar um Carro e verificar o menor valor:
```java
Carro meucarro = new ModeloCarro("HB20", 65000, 56000, 57500, "Gasolina");
double menorValor = meucarro.informaMenorValorNoPeriodo();
System.out.println(String.format("O menor valor do %s foi de R$ %.2f", meucarro.getModelo(), menorValor));
```

# Exemplos de Uso

### Criar um Animal (Cachorro e Gato) e emitir sons:
```java
Cachorro cachorro = new Cachorro();
Gato gato = new Gato();

cachorro.emitirSom();  // Saída: Cachorro latindo
cachorro.abanarRabo(); // Saída: Cachorro abanando o rabo

gato.emitirSom();      // Saída: Gato miando
gato.arranharMoveis(); // Saída: Gato arranhando os móveis
```

# Exemplos de Uso

### Criar uma Conta Corrente e realizar um saque:

```java
ContaCorrente conta1 = new ContaCorrente();
conta1.deposita(500);
conta1.saqueContaCorrente(100); // Saque com tarifa aplicada
conta1.descontoTarifa(); // Desconta a tarifa mensal
conta1.consultaSaldo(); // Exibe o saldo após as operações
```

# Como Executar o Projeto

1. Clone este repositório em sua máquina.
2. Configure o ambiente Java (versão 8 ou superior).
3. Navegue até a classe principal `App.java` e execute o programa para interagir com o console.

---


### **Autor: Lucas Degrande**

Este projeto foi desenvolvido para demonstrar os conceitos de herança e polimorfismo em Java, com exemplos práticos e uma estrutura modular que facilita a compreensão e extensão do código.
