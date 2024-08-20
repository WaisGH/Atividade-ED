package Josephus;


    class Pessoa {
        private int id;
        private String nome;
        private String telefone;
        private String endereco;
        private String cpf;

        Pessoa(int id, String nome, String telefone, String endereco, String cpf) {
            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "Id:" + id +
                    ", Nome:'" + nome + '\'' +
                    ", Telefone:'" + telefone + '\'' +
                    ", Endereço:'" + endereco + '\'' +
                    ", CPF:'" + cpf + '\'' +
                    '}';
        }
    }
