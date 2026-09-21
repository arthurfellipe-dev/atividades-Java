void main() {
    Calendar birthday = Calendar.getInstance();
    Calendar today = Calendar.getInstance();
    int idade, diferenca = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("ano: ");
    int ano = input.nextInt();
    System.out.println("mês: ");
    int mes = input.nextInt();
    System.out.println("dia: ");
    int dia = input.nextInt();

    birthday.set(ano,mes,dia);

    if (today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) ||
       (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birthday.get(Calendar.DAY_OF_MONTH))) {
        diferenca = 1;
    }

    idade = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR) - diferenca;
    System.out.println("Idade: " + idade);

}
