import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Batalha b1 = new Batalha();
        List<Personagem> personagens = new ArrayList<>();

        // 1. Super-herói com identidade secreta
        SuperHeroi flecha = new SuperHeroi(
                "Flecha Negra",
                Sexo.HOMEM,
                1.83,
                true,
                new ArrayList<>(Arrays.asList("Tiro certeiro", "Visão noturna", "Combate corpo a corpo"))
        );

        // 2. Super-heroína com identidade revelada
        SuperHeroi tempestade = new SuperHeroi(
                "Tempestade",
                Sexo.MULHER,
                1.70,
                false,
                new ArrayList<>(Arrays.asList("Controle climático", "Voo", "Choque elétrico"))
        );

        // 3. Vilão de alta ameaça
        Vilao caos = new Vilao(
                "Lorde Caos",
                Sexo.HOMEM,
                2.05,
                9
        );

        // 4. Vilã de baixa ameaça
        Vilao sombra = new Vilao(
                "Sombra Sutil",
                Sexo.PREFIRO_NAO_DIZER,
                1.65,
                3
        );

        // 5. Civil
        Civil joao = new Civil(
                "João Pereira",
                Sexo.HOMEM,
                1.75
        );

        // 6. Civil
        Civil maria = new Civil(
                "Maria Souza",
                Sexo.MULHER,
                1.60
        );

        b1.adicionar(flecha);
        b1.adicionar(caos);
        b1.adicionar(tempestade);
        b1.adicionar(caos);
        b1.adicionar(sombra);
        b1.adicionar(joao);
        b1.adicionar(maria);
        b1.maisAlto().getNome();






    }
}