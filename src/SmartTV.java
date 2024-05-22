public class SmartTV {

Boolean ligada = false;
int canal = 1;
int volume = 25;     

public void selecionarCanal (int novoCanal){
canal = novoCanal;
}

public void avançarCanal(){
canal++;
}

public void retrocederCanal(){
canal++;
}

public void aumentarVolume(){
    volume++;
}

public void diminuirVolume(){
    volume--;
}

public void ligar (){
ligada=true;
}
public void desligar (){
ligada=false;



}
}

