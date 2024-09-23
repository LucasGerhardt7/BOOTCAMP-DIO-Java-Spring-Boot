# DIO | Git e Github

## Tipos de Sistemas de Controle de Versão (VCS)

- ### VCS Centralizado (CVCS)

#### Pontos negativos ❌  

- Caso o servidor saia do ar, não é possível criar versionamentos.
- Se o servidor corromper os dados e não houver um backup, poderá perder o projeto.

- ### VCS Distribuído (DVCS)
  
  Contorna o problema do versionamento centralizado pois possui um backup local com cada usuário do repositório, sendo também possível a edição off-line, em caso de problemas de conexão com o servidor.

## Prmeiros passos com Git e Github

### Formas de obter Repositório Git na máquina 💻

- Transformando um diretório local num repositório Git (git Init)
- Clonando um repositório Git existente. (git clone)

### Clonar repositório alterando o nome

```shell
#clona o repositório todo
git clone <url> <novo_nome_repositorio>
```

```shell
#clona uma branch especifica
git clone <url> --branch <nome-da-branch> --single-branch
```

#### Exemplo

```shell
git clone https://github.com/exemplo/projeto-original.git meu-novo-repositorio
```

### Conectando a um repositório remoto

git remote add origin {url}

```shell
git remote add origin https://github.com/exemplo/meu-novo-repositorio.git
```

### Verificando status dos arquivos

```shell
git status
```

### Verificando log dos commits

```shell
git log
```

### Git ignore

O arquivo .gitignore nos da o direito de ignorar, como o nome sugere, um arquivo ou diretório na hora de fazer um commit. Para isso, basta digitar em seu interior o nome do arquivo/diretório a ser deixado de commitar. Para auxiliar o processo, podemos usar o comando “echo” do terminal, que nos possibilita inserir um texto no arquivo.

#### Escrever texto em um arquivo

##### Terminal

```shell
echo "Essa frase será adicionada ao arquivo" > arquivo.txt
```

#### Adicionar texto ao FINAL de um arquivo

```shell
echo "Esta frase será adicionada ao final" >> arquivo.txt
```

### Diretório Vazio

O git **NÃO** reconhece diretórios vazios.
Há uma convenção onde cria-se um arquivo chamado .gitkeep que pode ser utilizado quando se quer “commitar” um diretório vazio.

## Desfazendo alterações no repositório

### Remover versionamento da pasta

Caso tenha criado um repositório git na pasta errada e queira desfazer, basta excluir o diretório oculto .git/

Pode ser feito pelo terminal:

````shell
rm -rf .git
````

#### O que faz este comando?

#### rm -rf .git

rm: Comando para remover arquivos ou diretórios.

-r: Opção que indica a remoção recursiva, ou seja, remove todos os arquivos e subdiretórios dentro do diretório especificado.

-f: Força a remoção sem perguntar por confirmações.

.git: Diretório oculto onde o Git armazena todos os dados e metadados do repositório.

#### Efeitos do comando

Este comando remove o diretório .git e todo o seu conteúdo. Como o .git é o diretório que contém todas as informações de versionamento do Git, isso efetivamente "desfaz" o repositório Git, removendo todo o histórico de commits, branches, e outras informações de controle de versão. Após executar este comando, o diretório atual não será mais um repositório Git.

#### Uso Típico

Você pode querer usar este comando se precisar desconectar um diretório de um repositório Git, transformando-o em um diretório simples sem controle de versão. Isso é útil, por exemplo, se você clonou um repositório apenas para usar os arquivos como base e não deseja manter o histórico do Git.

### Restaurar arquivo

 ````shell
git restore nome-do-arquivo
````

Este comando é usado para restaurar arquivos no repositório Git para o estado em que estavam em um commit anterior, ou para desfazer mudanças feitas nos arquivos na working directory (diretório de trabalho) que ainda não foram adicionadas ao stage (área de preparação).

Podemos usar este comando quando deseja descartar mudanças feitas em um arquivo específico e **retornar ao estado original que o arquivo tinha no último commit ou no último stage**. Isso é útil, por exemplo, quando você começou a modificar um arquivo mas decide que não quer mais aplicar essas mudanças.

### Modificando última mensagem do commit

````shell
git commit --amend -m "nova mensagem aqui"   
````

### Cuidado 🚨🚨

***O Git substituirá o commit mais recente pelo novo commit***

A opção --amend é frequentemente usada para corrigir a mensagem do commit ou adicionar novos arquivos que foram esquecidos no commit anterior. O commit anterior é substituído por um novo commit com a nova mensagem fornecida.

***Atenção:***  Como este comando reescreve o histórico de commits, ele deve ser usado com cuidado, especialmente em repositórios compartilhados. Se o commit já foi enviado para um repositório remoto, alterar o commit pode causar problemas de sincronização para outros colaboradores.

### Voltar para um commit anterior

````shell
# Resetar o HEAD para um commit específico
git reset <opções> <commit>
````

O comando git reset é uma poderosa ferramenta no Git usada para desfazer mudanças no histórico de commits ou na área de staging (área de preparação). Dependendo das opções usadas, ele pode alterar o ponteiro do HEAD para um commit específico, modificar a área de staging e até mesmo mudar o conteúdo do diretório de trabalho.

#### Parâmetros

**commit:** Pode ser um identificador de commit (SHA-1 hash), uma referência como HEAD, HEAD~1, branch_name, ou um outro ponto do histórico.

#### Efeitos

- **--soft:** Mantém as mudanças no diretório de trabalho e na área de staging.

- **--mixed (PADRÃO):** Mantém as mudanças no diretório de trabalho, mas remove-as da área de staging.

- **--hard:** Desfaz todas as mudanças no diretório de trabalho e na área de staging, sincronizando tudo com o commit especificado.

#### Atenção 🚨🚨

Usar git reset --hard pode resultar na perda de trabalho não salvo. Deve ser usado com cautela.
git reset altera o histórico de commits locais, portanto, não deve ser usado em branches compartilhados sem coordenação com outros desenvolvedores.

## Enviando e Baixando Alterações com o Repositório Remoto

### Conectando-se a um repositório remoto

````shell
# Adicionar um repositório remoto chamado 'origin'
git remote add origin https://github.com/exemplo/meu-novo-repositorio.git
````

**Efeito:** Após executar este comando, seu repositório local estará conectado ao repositório remoto especificado.

````shell
# Renomear a branch atual para 'main'
git branch -M main
````

**Efeito:** Sua branch padrão é renomeada para main, que é uma convenção comum em novos repositórios (anteriormente, a branch padrão era frequentemente chamada de master).

````shell
# Enviar a branch 'main' para o repositório remoto e definir como padrão
git push -u origin main
````

**Efeito:** As mudanças na branch main são enviadas para o repositório remoto e essa branch é definida como a padrão para futuras operações de push e pull.

#### git push -u origin main

- **git push:**

    Envia as mudanças da branch local para o repositório remoto.
- **-u:**
  
    Define a branch remota como a upstream padrão para a branch local, o que simplifica futuros comandos git push e git pull.
- **origin:**

     Nome do repositório remoto (adicionado no primeiro comando).
- **main:**
  
    Nome da branch que está sendo enviada para o repositório remoto.

## Trabalhando com branches

### Exibindo branches

````shell
git branch
````

#### Opções Comuns

**-v:** Exibe informações mais detalhadas sobre cada branch, incluindo o último commit feito em cada uma delas. Mostra o hash abreviado e a mensagem do último commit para cada branch.`git branch -v`

**-a:** Lista todas as branches, incluindo as remotas.`git branch -a`

**-r:** Lista apenas as branches remotas.
`git branch -r`

### Criando branches

 ````shell
# Criar uma nova branch chamada 'nova-branch' sem mudar para ela
git branch nova-branch
````

**Efeito:** Este comando cria uma nova branch chamada nova-branch, mas você permanece na branch atual. Não há mudança de contexto para a nova branch.

`````shell
# Criar e mudar para uma nova branch chamada 'teste'
git checkout -b teste
`````

**Efeito:** Cria uma nova branch chamada teste a partir do estado atual da branch em que você estava (geralmente main) e alterna para essa nova branch. Esta é uma prática comum quando você quer desenvolver uma nova feature ou testar algo sem afetar a branch principal.

### Alternando entre as branches

`````shell
# Mudar para uma branch ou restaurar arquivos para um estado específico
git checkout <opções> <branch> | <commit> | <arquivo>
`````

#### O que faz este comando??

O comando git checkout é uma ferramenta versátil no Git que pode ser usada para mudar de branch, restaurar arquivos para um estado anterior ou até mesmo criar novas branches. Ele é amplamente utilizado em vários contextos durante o desenvolvimento.

#### Mudar para uma branch existente

````shell
git checkout <nome-da-branch>
````

**Efeito:** Troca para a branch especificada, alterando o diretório de trabalho para refletir o estado dessa branch.

#### Restaurar um arquivo específico para um estado anterior

```shell
git checkout <commit> -- <arquivo>
```

**Efeito:** Restaura o arquivo para o estado que ele tinha em um commit específico.

**Exemplo:**

```shell
git checkout 3fa4b9c -- config.yaml
```

Restaura o arquivo config.yaml para o estado que ele tinha no commit 3fa4b9c.

Opções Comuns:
-b: Cria uma nova branch e muda para ela.
`<branch>`: Nome da branch para a qual você deseja mudar.

`<commit>`: SHA-1 hash do commit ou referência de commit (por exemplo, HEAD, HEAD~1).

`-- <arquivo>`: Usado para restaurar um arquivo específico para o estado de um commit anterior.

##### Atenção 🚨

**Mudança de Contexto:** Quando você usa git checkout `<branch>`, ele muda o diretório de trabalho para refletir o estado dessa branch, o que pode afetar quais arquivos você vê e em que estado eles estão.

**Perda de Mudanças:** Se houver mudanças não comitadas, elas podem ser sobrescritas ou perdidas ao mudar de branch. É uma boa prática comitar ou stager as mudanças antes de usar git checkout.

#### Comando Substituto

Note que a partir do Git 2.23, o comando git checkout foi parcialmente substituído por dois comandos mais específicos: git switch (para trocar de branch) e git restore (para restaurar arquivos). No entanto, git checkout continua amplamente utilizado devido à sua versatilidade.

Esses exemplos mostram a flexibilidade do comando git checkout, sendo um dos comandos essenciais no fluxo de trabalho com Git.

### Mesclando branches

````shell
# Mesclar uma branch específica na branch atual
git merge <nome-da-branch>
````

**Efeito:** Mescla as mudanças da branch `<nome-da-branch>` na branch atual. O Git tentará combinar os históricos de commits das duas branches e aplicar as mudanças de forma integrada.

### Deletando branches

````shell
git branch -d <nome-da-branch>
````

**-d:** Deleta a branch especificada, mas apenas se ela já foi mesclada.

**-D:** Força a deleção da branch especificada, independentemente de ela ter sido mesclada.

### Faça o push da branch teste local para a branch main remota

Faça o push da branch teste local para a branch main remota:
Agora, você pode enviar diretamente as alterações da branch teste local para a branch main remota com o comando:

```shell
git push origin <branch-local>:<branch-remota>
#Exemplo
git push origin teste:main
```

> Esse comando vai pegar as alterações da sua branch teste local e fazer o push diretamente para a branch main remota, sem precisar passar pela branch main local.

### Forçar o push (se necessário)

Se houver conflitos ou a branch remota estiver à frente, o Git pode rejeitar o push. Para forçar o envio, use:

```git push origin teste:main --force```

>Use o force apenas se você tiver certeza de que deseja sobrescrever o histórico da branch main remota com o histórico da sua branch teste.
