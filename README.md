# JogoDaExplosao-Java
Jogo desenvolvido em conjunto com @Yasmin-Camargo para a disciplina de Programação Orientada a Objetos no terceiro semestre de Ciência da Computação na UFPel

## Instruções de uso
A utilização deste jogo se dá de maneira bem simples e intuitiva. Assim que o jogo é aberto a seguinte caixa é exibida na tela:

![image](https://user-images.githubusercontent.com/88253809/205053792-5f6cd7eb-f1be-4f28-a81c-056fc314cba0.png)

O usuário deve digitar a quantidade de jogadores que irão participar na partida, sendo que é permitido no mínimo dois e no máximo quatro jogadores. Depois de digitado corretamente a quantidade de jogadores a seguinte tela deve aparecer:

![image](https://user-images.githubusercontent.com/88253809/205053880-9983ba6c-9138-4823-b59f-0528e3910dc4.png)

### Tabuleiro
Essa é a tela em que ocorre todo o jogo, note que os peões são dispostos de forma automática pelo programa. No lado esquerdo da tela se encontra o tabuleiro em que ocorre a movimentação dos jogadores, vale destacar que em cinza escuro são as torres, cinza claro as pontes que ainda não foram construídas e em amarelo as pontes que já foram colocadas pelos jogadores. 

Além disso, no centro se encontra o detonador da explosão, toda vez que um usuário explode alguma ponte o detonador é ativado visualmente na tela e um dos lados da ponte é destruído. Os jogadores que estavam na ponte explodida são redirecionados para a torre anterior. Abaixo é possível observar melhor essas características:

![image](https://user-images.githubusercontent.com/88253809/205054114-cf779199-c14d-4688-bfb9-7715cee2bb5a.png)

### Informações visuais
No lado direito da tela são encontradas informações adicionais que complementam a jogabilidade. Na parte superior é indicado qual jogador deve jogar na rodada, logo ao lado é encontrado uma lista com os  power ups que cada jogador possui. Dessa forma se um usuário desejar consultar os poderes obtidos eles estarão disponíveis na sua vez de jogar.

![image](https://user-images.githubusercontent.com/88253809/205054244-6d43407b-a412-48d9-ad36-4e86e34e5633.png)

#### Log do Jogo
Além disso, mais abaixo, é possível perceber  uma caixa de texto denominada log do jogo, funcionando como um histórico de jogadas e ações que aconteceram no jogo.

![image](https://user-images.githubusercontent.com/88253809/205054316-03d64b1a-f7c1-4856-8b79-5b91361a3fa3.png)

### Dado
Por último, na interface gráfica temos o dado e logo abaixo um botão para sortear o número, toda dinâmica do jogo acontece em função deste botão que uma vez acionado ocorrem todas as ações da rodada. Números indicam quantidade de pontes construídas, pontos de interrogação indicam que um power up foi obtido e asterisco indica que uma detonação de alguma ponte foi ativada

![image](https://user-images.githubusercontent.com/88253809/205054490-4ce523c7-0922-4b3a-91e3-2d44a7f409b8.png)

## Power Ups
Quando um jogador ganha um power up o mesmo é informado ao usuário e se necessário ocorre a interação pedindo alguma informação que é requisitada pelo programa. Existem dois tipos de power up de forma mais geral, os itens instantâneos que são utilizados no momento da jogada e não permanecem no inventário depois da rodada e os passivos que são utilizados ao longo do jogo e permanecem durante as rodadas, apenas são excluídos depois que utilizados. Estes últimos são substituídos por novos quando adquiridos mais de um, sendo que o mais recente é o que permanece.
Abaixo serão descritos o que acontece em cada um destes itens:

### Velocidade
Neste power up o dado é jogado novamente, só que dessa vez apenas números podem ser sorteados (1 a 3). A quantidade de pontes construídas será o dobro da sorteada.

### Imobilizar
Neste power up um jogador, diferente de quem obteve o item, é mobilizado de forma aleatória. Dessa forma, o jogador atingido ficará uma jogada sem jogar. Sendo que o mesmo só irá descobrir quando for a sua vez.

### Sabotar
Quando este power up é obtido o jogador pode sabotar alguma explosão de um outro jogador, isso significa que uma explosão que viria ser feita é cancelada. Sendo que isso é feito de forma automática, assim que obtido o item fica ativado.

### Empurrar
Este power up, depois de obtido, possibilita que o jogador empurre uma casa para trás o jogador pelo qual cruzou. Se ocorrer de passar por mais de um será perguntado por quem ele deseja optar para empurrar.

### Escudo
Este item permite bloquear alguma ação que é realizada por outro jogador que afete a si mesmo. Logo, o escudo é utilizado de forma automática quando os itens empurrar, sabotar e mobilizar são acionados.

### Asas de Ícaro
Este power up permite que quando ocorra uma explosão e o jogador está sobre a ponte atingida o mesmo seja direcionado para a ponte a sua frente.

## Vitória
Por fim, toda vez que um jogador completa uma volta inteira no tabuleiro ele ganha, dessa forma uma mensagem é exibida na tela informando a vitória e depois o jogo é encerrado.


