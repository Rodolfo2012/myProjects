package funcionarios;

public class TesteCalculos {
    public static void main(String[] args) {
        AssistenteAdministrativo assistenteAdministrativo = new AssistenteAdministrativo
                ("Rodolfo", "706156666477", 4858458, 25/12/1999);

        assistenteAdministrativo.setSalario(1350.35);
        assistenteAdministrativo.Calculo();

        System.out.println(assistenteAdministrativo.getNome());
        System.out.println(assistenteAdministrativo.getMatricula());
        System.out.println(assistenteAdministrativo.getSalario());
    }
}
