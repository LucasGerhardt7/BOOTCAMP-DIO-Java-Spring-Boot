# Colaborando no Github

## Formas de contribuir em um projeto open source

- Relatar algum problema ou bug;
- Sugerir melhorias ou adição de novos recursos;
- Escrever ou atualizar a documentação;
- Contribuir com o código;
- Divulgar e/ ou doar.
  
## Issues

É onde podemos enviar nossas sugestões de melhorias ou reportar bugs.

Importante ler o guia de contribuição, caso haja.

### Criando template de issue

Com o repositório aberto, vá em settings.
Em seguida, na seção Features, procure a opção issue e clique em set up template.

## Fork

> [!NOTE]  
> Um "fork" no GitHub é uma cópia de um repositório que pode ser criada por qualquer usuário. <br>
> Para mais detalhes, reveja a aula ou acesse a documentação do GitHub: [Criar fork de um repositório](https://docs.github.com/pt/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo).

Com essa opção podemos baixar o repositório para nossa maquina local.

```shell
# Clonando o repositório
git clone https://github.com/LucasGerhardt7/dio-lab-open-source.git
```

**Mas e se caso o repositório original for atualizado?**

Neste caso, temos que baixar a atualização do repositório original (remote upstream) e quando modificarmos localmente, temos que subir para nosso repositório em nossa conta do github (remote origin).

### Definindo

"***Remote upstream***" é um termo comumente usado no contexto de controle de versões com Git. Para entender o conceito, é importante ter em mente alguns termos básicos de Git:

- **Remote:**
  Um remote em Git é um repositório que está hospedado em um servidor remoto (como GitHub, GitLab, Bitbucket, etc.) e que pode ser usado como referência ou sincronização com o seu repositório local.O remote mais comum é chamado de origin, que é o nome padrão dado ao repositório remoto de onde você clonou o repositório local.

- **Upstream:**
  Upstream geralmente se refere ao repositório principal ou original de onde o seu repositório foi derivado.
  Quando você contribui para um projeto open-source, por exemplo, você pode criar um "fork" desse repositório. O repositório original do qual você fez o fork é o seu upstream.
  Você configuraria o repositório original como o remote chamado upstream para poder buscar (pull) atualizações ou enviar (push) alterações de volta para o repositório principal.

### Configuração do Remote Upstream

Após clonar ou fazer fork de um repositório, você pode adicionar o repositório original como upstream para manter seu fork atualizado com as alterações feitas no projeto original:

```shell
# Adiciona o repositório original para baixar atualizações
git remote add upstream https://url-do-repositorio-original.git
```

Suponha que você fez um fork de um projeto open-source no GitHub. Com o tempo, o repositório original pode ter recebido várias atualizações no branch main. Para incorporar essas atualizações no seu fork (ou repositório local), você executa:

````shell
# Puxa as atualizações do remote upstream
git pull upstream main
````

#### Resultado

O branch ativo do seu repositório local será atualizado com as últimas mudanças do branch ***main*** do repositório upstream.
Se houver conflitos entre as alterações locais e as do upstream, o Git solicitará que você resolva esses conflitos antes de concluir a operação.

#### Observações

Se você quiser manter seu histórico de commits limpo e linear, pode considerar usar `git pull --rebase upstream main`, que aplicará suas alterações locais sobre as do upstream em vez de fazer um merge.

#### Cria branch

Após esta etapa, você pode criar uma branch(opcional) e fazer suas alterações.

Utilize o comando `git checkout -b` para criar e alternar para a nova branch.
> Exemplo: `git checkout -b nome-da-branch`

#### Crie um Commit

Crie um commit e adicione a mensagem indicando a adição do seu perfil:

```bash
# commit com um padrão de mensagem
git commit -m"feat: add SEU_USERNAME profile"
```

>[!IMPORTANT]
> Verifique a [`Convenção de Commits`](https://github.com/digitalinnovationone/dio-lab-open-source/blob/main/CONTRIBUTING.md#conven%C3%A7%C3%A3o-de-commits) para escrever a mensagem do seu commit de forma clara e padronizada.

### Envie as Alterações para o seu Repositório Remoto

Envie as alterações realizadas no seu repositório local para a branch no seu repositório remoto com o comando:

```bash
git push origin nome-da-branch
```

>[!WARNING]
> Caso você tenha criado seu arquivo diretamente no repositório remoto no GitHub, esse processo não será necessário.

## Pull Requessts
