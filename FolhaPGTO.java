/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafhael Banuls Lopes - 11211101240@alunos.umc.br / Gabriel Paulosi de Freitas - 11211102827
 */
public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("EnderecoNome:" + men1.getEndereco());
        System.out.println("Salario: " + men1.getSalario());
        System.out.println("Desconto IRPF: " + men1.calcularIrpf());
        System.out.println("Desconto INSS: " + men1.calcularInss());
        
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        System.out.println("Nome: " + men2.getNome());
        System.out.println("EnderecoNome: " + men2.getEndereco());
        System.out.println("Salario: " + men2.getSalario());
        System.out.println("Desconto IRPF: " + men2.calcularIrpf());
        System.out.println("Desconto INSS: " + men2.calcularInss());

        //Emperegados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        System.out.println("Nome: " + hora1.getNome());
        System.out.println("EnderecoNome: " + hora1.getEndereco());
        System.out.println("Salario: " + hora1.getSalario());
        System.out.println("Desconto IRPF: " + hora1.calcularIrpf());
        System.out.println("Desconto INSS: " + hora1.calcularInss());

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        System.out.println("Nome: " + hora2.getNome());
        System.out.println("EnderecoNome: " + hora2.getEndereco());
        System.out.println("Salario: " + hora2.getSalario());
        System.out.println("Desconto IRPF: " + hora2.calcularIrpf());
        System.out.println("Desconto INSS: " + hora2.calcularInss());
    }

}


