package test;
public class Example{
    public static void main(String[] args){
        int a, b, result;

        try{
            //
        }catch(Exeption e){//ArithmeticExeption e
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace().toString());
            System.out.println(e.printStackTrace());
            System.out.println(e.getLocalizedMessage());
        }finally{//ever executed
            //manipulate archives open/close secions 

        }
        if(adm == false){
            throw new ArithmeticExeption("Acess denied!");
        }else{
            System.out.println("Acesse lowed");
        }
        
        //Error /0
        result = 42/0;
        System.out.println("Result: " + result);

        //Error out of bound(index acess)
        int[] num = {1,2,3};
        System.out.println(num[3]);

        //null exception
        String test = null;
        System.out.println(test);

        for(i:arr){}//foreach
        for(int i=0; i<=numeros.lenght; i++){}//for
    }
}

package test;
public class Example{

    public void toCapsLock() throws NullPointerException{
        String word = null;
        System.out.println(test);
        newWord = word.toUpperCase();
    }

    public static void main(String[] args){
        Example e = new Example();//testString???

        try{
            e.toCapsLock();
        }catch{
            System.out.println("NullPointerException");
        }
    }
}

package test;
public class VerifyWord extends Exceptions{

    @override
    public void findLetter(){
        System.out.println("Not found");
    }

}

package test;
public static void main(String[] args) throws VerifyWord{

    String text = "testing an text";

    if(!text.contains("F") || !text.contains("f")){
        throw new VerifyWord();//obj
    }else{
        System.out.println("OK");
    }
}
