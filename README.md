## Funcionalidades Modeladas
### Reprodutor Musical
A classe `ReprodutorMusical` possui os seguintes métodos:

- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução.
- `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.
**Exemplo de uso:**
```java
ReprodutorMusical reprodutor = new ReprodutorMusical();
reprodutor.tocar();
reprodutor.selecionarMusica("Bohemian Rhapsody");
reprodutor.pausar();
```

### Aparelho Telefônico
A classe `AparelhoTelefonico` possui os seguintes métodos:

- `ligar(String numero)`: Faz uma ligação para o número especificado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o correio de voz.
**Exemplo de uso:**
```java
AparelhoTelefonico telefone = new AparelhoTelefonico();
telefone.ligar("+55 123456789");
telefone.atender();
telefone.iniciarCorreioVoz();
```

### Navegador na Internet
A classe `NavegadorInternet` possui os seguintes métodos:

- `exibirPagina(String url)`: Exibe uma página da web com a URL especificada.
- `adicionarNovaAba()`: Abre uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.
**Exemplo de uso:**
```java
NavegadorInternet navegador = new NavegadorInternet();
navegador.exibirPagina("https://www.example.com");
navegador.adicionarNovaAba();
navegador.atualizarPagina();
```
### UML
mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    ReprodutorMusical --|> AparelhoTelefonico
    ReprodutorMusical --|> NavegadorInternet
