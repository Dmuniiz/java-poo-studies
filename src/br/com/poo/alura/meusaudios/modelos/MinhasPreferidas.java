package br.com.poo.alura.meusaudios.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto!");
        }else{
            System.out.println(audio.getTitulo() + " gosto peculiar de muitos");
        }
    }

}
