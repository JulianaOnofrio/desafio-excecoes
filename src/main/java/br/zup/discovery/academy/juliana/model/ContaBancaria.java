package br.zup.discovery.academy.juliana.model;

public class ContaBancaria {

        private double saldo; // Determina o saldo da conta.
        private double limite;// Determina o limite de credito do cheque especial.

        // Construtor
        public ContaBancaria(double valorSaldo, double valorLimite){
            this.saldo = valorSaldo;
            this.limite = valorLimite;
        }

        // Retorna o saldo da conta.
        public double getSaldo(){
            return saldo;
        }

        // Retorna o limite da conta.
        protected double getLimite(){
            return limite;
        }

        // Retorna o saldo da conta somado ao limite.
        public double getSaldoComLimite(){
            double saldolim;
            saldolim = saldo + limite;
            return saldolim;
        }

        // Deve decrementar o valor do saque da Conta. Retorna "true" caso a operacao tenha sido bem sucedida, ou seja, a conta possui este valor (lembre-se de considerar o limite).
        public boolean sacar(double valor) throws ContaException {
            double valorpossaque;
            valorpossaque = saldo - valor;
            try{
                if(valor > 500 || valorpossaque < 0) {
                    throw new ContaException("A operacao nao pode ser realizada. Saques apenas ate 500 reais.");
                }

            }catch(ContaException e){
                return false;
            }
            return true;

        }

        // Deve incrementar o valor a Conta.
        public void depositar(double valor) throws ContaException {

            double valorposdeposito;
            valorposdeposito = valor + saldo;
// não permitir depositos superiores a 1000, try - tentei, catch não deu certo.Mensagem de erro.
            try{
                if(valor > 1000) {
                    throw new ContaException("A operacao nao pode ser realizada. Depositos apenas ate 1000 reais.");
                }

            }catch(ContaException e){
                System.out.println("Operacao cancelada. Valor " + valorposdeposito + "nao depositado.");
            }

        }

    }
