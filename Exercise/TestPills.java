public class TestPill{
    public static void main(String[] args){
        Pill<String> p = new Pill<>(10);
        String frase = "This is only a test"

        String[] words = frase.split(" ");
        int i = 0;
        while(i< frase.length && !p.isFull()){
            p.put(words[i]);
            i = i + 1
        }

        while (!p.isEmpty()){
            System.out.print(p.pop())
        }
    }
}

// javac TestPilha.java