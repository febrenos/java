package br.com.fernandoalmeida.model.bo;
import java.util.ArrayList;
import java.util.List;
import br.com.fernandoalmeida.model.vo.Passos;

public Ordenation bubbleSort(int num){

try{
  char[] digits = String.valueOf(num).toCharArray();
  //var aux for before change
  char aux;
  
  char[] antes;
  
  int qntChange = 0;
  
  //vector (lst) ordenation proccess
  List<Passos> passos = new ArrayList<Passos>();
  //ctrl var have change?
  boolean running = true;
  for(int i = 0; i<digits.length; i++){
    if(!running){
      break;//stop
    }
    passos.add(new Passos(null, null, "Inicio da verificacao do num"
                          .concat(String.valueOf(i).concat("\n-----------------\n"))))
    running = false;
    
    for(int j = 0; j<digits.length - 1; j++){
      if(digits[j] > digits[j+1]){
        //is <? change
        vectorCopy = new String(digits).toCharArray();
        aux = digits[j];
        digits[j] = digits[j+1];
        digits[j+1] = aux;
        qntChange++;
        
        //obj,obj,String
        passos.add(new Passos(new String(before),new String(digits),"change digit"
                  .concat(String.valueOf(digit[j+1]))
                  .concat(" to ".concat(String.valueOf(digit[j])))));
        continua = true;
       }else{
          passos.add(new Passos(new String(digits), new String(digits), "not change digit"
            .concat(String.valueOf(digits[j+1]))
            .concat(" ja e menor ou igual que ")
            .concat(String.valueOf(digits[j]))));
       }
    }
  }
  
  //persist data values
  Ordenation ordenation = new Ordenation(num, new String(digits), qntChange);
  new OrdenarionDAO().Salvar(ordenation);
  new PassosDAO().salvarPassos(ordenation);
  
  //return ordenation obj
  return ordenation;
  
  }catch(Exception e){
    e.printStackTrace();
    return null;
  }
}
