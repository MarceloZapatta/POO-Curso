
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author notebook
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        //Váriaveis
        int opcao = 0, limiteMatriz = 0, formaPagamento = 0;

        //Matrizes
        Curso[] cadCurso = new Curso[20];
        Turma[] cadTurma = new Turma[20];
        Aluno[] cadAluno = new Aluno[50];
        Matricula[] cadMatricula = new Matricula[50];
        Instrutor[] cadInstrutor = new Instrutor[50];

        //APrazo
        double valorAprazo, taxaJuros;
        int qtdeMensalidade;
        String dtVencimento;

        //Avista
        double valorAvista;
        int agencia, nCheque;
        String preData;

        //Aluno
        String escolaridade;

        //Curso
        String siglaCurso, nomeCurso, dataVigencia, programa;
        int cargaHoraria;
        double valor, valorHoraInstrutor;

        //Instrutor
        String formacao, areaAtuacao;

        //Matricula
        String dataMatricula;
        int qtdeFaltas;
        double nota;

        //Pessoa
        String nome, dataNasc, endereco, bairro, cidade,
                estado, CEP, telefone, celular, sexo,
                estadoCivil, RG, CPF, Email;
        int numero;
        //Turma
        String siglaTurma, descricacao, dataInicio, dataTermino, periodo, observacoes;
        int qtdVagas;

        do {
            System.out.println("\n\n1 - Cadastrar Curso");
            System.out.println("2 - Montar Turma");
            System.out.println("3 - Cadastrar Instrutor");
            System.out.println("4 - Emitir Controle de Frequência");
            System.out.println("5 - Cadastrar Aluno");
            System.out.println("6 - Matricular Aluno");
            System.out.println("7 - Definir Forma de Pagamento");
            System.out.println("8 - Exibir Cursos");
            System.out.println("9 - Exibir Turmas");
            System.out.println("10 - Exibir Controle de Frequencia");
            System.out.println("11 - Exibir Alunos");

            System.out.println("\nOpção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                //CURSO
                case 1:
                    if (limiteMatriz == cadCurso.length) {
                        System.out.println("Limite de cursos excedido\n");
                    } else {
                        //Sigla
                        System.out.println("Digite a Sigla do Curso");
                        siglaCurso = entrada.next();
                        //Nome
                        System.out.println("Digite o nome");
                        nomeCurso = entrada.next();
                        //Carga Horaria
                        System.out.println("Digite a carga Horaria");
                        cargaHoraria = entrada.nextInt();
                        //Valor
                        System.out.println("Digite o valor");
                        valor = entrada.nextDouble();
                        //Data Vigência
                        System.out.println("Digite a data de Vigência");
                        dataVigencia = entrada.next();
                        //Valor Hora Instrutor
                        System.out.println("Digite o valor da hora do instrutor");
                        valorHoraInstrutor = entrada.nextDouble();
                        //Programa
                        System.out.println("Digite o programa");
                        programa = entrada.next();
                        //Incluindo um novo Curso
                        cadCurso[limiteMatriz] = new Curso(siglaCurso, nomeCurso);
                        limiteMatriz++;
                    }
                    break;
                //TURMA
                case 2:
                    if (limiteMatriz == cadTurma.length) {
                        System.out.println("Limite de turmas excedido\n");
                    } else {
                        //Sigla
                        System.out.println("Digite a Sigla da Turma");
                        siglaTurma = entrada.next();
                        //Descrição
                        System.out.println("Digite uma descrição");
                        descricacao = entrada.next();
                        //Data Inicio
                        System.out.println("Digite a data de Inicio");
                        dataInicio = entrada.next();
                        //Data Termino
                        System.out.println("Digite a data de Término");
                        dataTermino = entrada.next();
                        //Período
                        System.out.println("Digite o Período");
                        periodo = entrada.next();
                        //Quantidade de Vagas
                        System.out.println("Digite a quantidade de vagas");
                        qtdVagas = entrada.nextInt();
                        //Observações
                        System.out.println("Observações");
                        observacoes = entrada.next();
                        //Incluindo uma nova Turma
                        cadTurma[limiteMatriz] = new Turma(siglaTurma, descricacao);
                        limiteMatriz++;
                    }
                    break;
                //INSTRUTOR
                case 3:
                    if (limiteMatriz == cadInstrutor.length) {
                        System.out.println("Limite de instrutores excedido\n");
                    } else {
                        //Nome
                        System.out.println("Digite o nome do instrutor");
                        nome = entrada.next();
                        //Data de Nascimento
                        System.out.println("Digite a data de nascimento");
                        dataNasc = entrada.next();
                        //Endereço
                        System.out.println("Digite o endereço");
                        endereco = entrada.next();
                        //Numero
                        System.out.println("Digite o numero");
                        numero = entrada.nextInt();
                        //Bairro
                        System.out.println("Bairro");
                        bairro = entrada.next();
                        //Cidade
                        System.out.println("Digite a Cidade");
                        cidade = entrada.next();
                        //Estado
                        System.out.println("Digite o Estado");
                        estado = entrada.next();
                        //CEP
                        System.out.println("Digite o CEP");
                        CEP = entrada.next();
                        //Telefone
                        System.out.println("Digite o Telefone");
                        telefone = entrada.next();
                        //Celular
                        System.out.println("Digite o Celular");
                        celular = entrada.next();
                        //Sexo
                        System.out.println("Digite o Sexo");
                        sexo = entrada.next();
                        //Estado Civil
                        System.out.println("Digite o Estado Civil");
                        estadoCivil = entrada.next();
                        //RG
                        System.out.println("Digite o RG");
                        RG = entrada.next();
                        //CPF
                        System.out.println("Digite o CPF");
                        CPF = entrada.next();
                        //EMAIL
                        System.out.println("Digite o Email");
                        Email = entrada.next();
                        //Fomração
                        System.out.println("Digite a Formação");
                        formacao = entrada.next();
                        //Area de Atuação
                        System.out.println("Digite a Area de Atuacao");
                        areaAtuacao = entrada.next();
                        cadInstrutor[limiteMatriz] = new Instrutor(CPF, nome);
                        limiteMatriz++;
                    }
                    break;
                //Aluno
                case 5:
                    if (limiteMatriz == cadAluno.length) {
                        System.out.println("Limite de alunos excedido\n");
                    } else {
                        //Nome
                        System.out.println("Digite o nome do instrutor");
                        nome = entrada.next();
                        //Data de Nascimento
                        System.out.println("Digite a data de nascimento");
                        dataNasc = entrada.next();
                        //Endereço
                        System.out.println("Digite o endereço");
                        endereco = entrada.next();
                        //Numero
                        System.out.println("Digite o numero");
                        numero = entrada.nextInt();
                        //Bairro
                        System.out.println("Bairro");
                        bairro = entrada.next();
                        //Cidade
                        System.out.println("Digite a Cidade");
                        cidade = entrada.next();
                        //Estado
                        System.out.println("Digite o Estado");
                        estado = entrada.next();
                        //CEP
                        System.out.println("Digite o CEP");
                        CEP = entrada.next();
                        //Telefone
                        System.out.println("Digite o Telefone");
                        telefone = entrada.next();
                        //Celular
                        System.out.println("Digite o Celular");
                        celular = entrada.next();
                        //Sexo
                        System.out.println("Digite o Sexo");
                        sexo = entrada.next();
                        //Estado Civil
                        System.out.println("Digite o Estado Civil");
                        estadoCivil = entrada.next();
                        //RG
                        System.out.println("Digite o RG");
                        RG = entrada.next();
                        //CPF
                        System.out.println("Digite o CPF");
                        CPF = entrada.next();
                        //EMAIL
                        System.out.println("Digite o Email");
                        Email = entrada.next();
                        //Escolaridade
                        System.out.println("Digite a Escolaridade");
                        escolaridade = entrada.next();

                        cadAluno[limiteMatriz] = new Aluno(CPF, nome);
                        limiteMatriz++;
                    }
                    break;
                //Matricular Aluno
                case 6:
                    if (limiteMatriz == cadMatricula.length) {
                        System.out.println("Limite de matriculas excedida\n");
                    } else {
                        //Data
                        System.out.println("Digite a data de matricula");
                        dataMatricula = entrada.next();
                        //Quantidade de Faltas
                        System.out.println("Digite a quantidade de faltas");
                        qtdeFaltas = entrada.nextInt();
                        //Nota
                        System.out.println("Digite a nota");
                        nota = entrada.nextDouble();
                    }
                    break;
                case 7:
                    do {
                        System.out.println("Qual é a forma de pagamento? +"
                                + "1 - À vista, 2 - À prazo");
                        formaPagamento = entrada.nextInt();
                        if (formaPagamento == 1) {
                            //Valor
                              System.out.println("Digite o valor");
                              valorAvista = entrada.nextDouble();
                              //Agência
                              System.out.println("Digite a agencia");
                              agencia = entrada.nextInt();
                              //Número Cheque
                              System.out.println("Nº do Cheque");
                              nCheque = entrada.nextInt();
                              //Predata
                              System.out.println("Digite a Pre data");
                              preData = entrada.next();
                        }
                        if (formaPagamento == 2) {
                              //Valor
                              System.out.println("Digite o valor");
                              valorAprazo = entrada.nextDouble();
                              //Data de Vencimento
                              System.out.println("Digite a data de vencimento");
                              dtVencimento = entrada.next();
                              //Taxa de Juros
                              System.out.println("Digite a taxa de juros");
                              taxaJuros = entrada.nextDouble();
                              //QTDE mensalidade
                              System.out.println("Digite a quantidade de mensalidades");
                              qtdeMensalidade = entrada.nextInt(); 
                        } else {
                            System.out.println("Forma de pagamento inválida. Por favor"
                                    + "digite 1 para à vista 2 para à prazo");
                        }
                    } while (formaPagamento != 1 || formaPagamento != 2);

            }

        } while (opcao != 99);
    }
}
