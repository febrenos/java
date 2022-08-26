# Java
java EE(Enterprise Edition)
java SE(Standard Edition)

#### install java and apk

1. cmd java -version
2. rm java painel de controle > Programas
3. https://www.java.com/en/download/help/windows_manual_download.html#download
                                                                                                   
- https://eclipse.org
- https://dist.springsource.com/release/STS/index.html                                                                                                                             
#### Primitive Class
| Type | Name | Code | Description |
| --- | --- | --- | --- |
| boolean | Logic | boolean myBool = true; | true, false or 1,0 |
| byte | integer | byte myByte = 5; | -128 at 127(8 bits) |
| short | integer | short bar = (short)0; | -32768 at 32767 (16 bits)|
| int | integer | int myNum = 5; | -231 at 231 – 1 |
| long | integer | long myLong = 5L; | -263 at 263 -1 |
| float | floating point | float myFloatNum = (float) 5.99f; | 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 | 
| double | floating point | double myDouble = 5.99d, 5.99; | 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308 |
| char | Character | char myChar = 'C'; |  character unicode(16 bits) or a integer 0 at 65535 |
| String | Character | String myString = "S"; | limit 200.000 characters |


#### keyboard shortcuts
- main
- sysou
                                                                                                                                                                     
- ctrl + space
- ctrl + shift + F
- ctrl + D
- ctrl + F11 = RunProject
- ctrl + /

#### RULES
- packge = lower case
- class = Upper case
- main = principal

#### Conditions
```java
if(){
}else if(){
}else{
}
//if ternary
(True/False) ? do 1 : do 2;
```


#### Kinds of Orientacao
- Orientacao Estruturada(serveless)
C, Cobol...

- Orientacao a Objetos(Objetificar virtualizado)
Java, Csharp...

- Orientacao a Eventos(microsservicos RQ RP)
API microservices

funcao exige retorno e metodo nao(void)

#### Syntax
```java
//name packege
package um;

//pacote dependente do array
import java.util.ArrayList;

//public
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello Word");
	}

}
```

#### Array
```java
    //dependency package
    import java.util.ArrayList;

		// defineArray<tipo_letras>QualquerNome = CriarLista<>();
		ArrayList<String> List = new ArrayList<>();
		
		//adiciona sempre 1 em baixo do outro
		List.add("hello world0");//0
		List.add("hello world1");//1
    
    		// get value
		String id1 = List.get(0);
		
		//return the value
		System.out.println(id1);
	}

}
```
#### loops
```java
for(int i=0; i<v.length; i++){
	//condition
}
	
while(3 > count){
	count++;
	//condition
}
```

### POO
- Class
- Object
- Encapsulamento
- Polimorfismo
- Herança
- Abstração

#### Class
```java
class ClassName{

}
```
#### Encapsulamento
```java
class Corpo{
	public float massa;
	protected float densidade;
	private float volume;
}
```
#### heranca
Todo o que for comum colocar na super classe e puxar as especificacao para subclasse
generalizacao possui outras classes, especializacao de uma classe principal

#### Polimorfismo
poli = many / morfismo = forms
sobescrever metodos, cosntrutores, reutilizando funcoes

#### Abstracao
Se nao herdar da super classe dara erro, todo o que tera em uma devera ter na subClass
```java
//superClass
public abstract class Car {
	private String name;
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
	}
}

//subClass
public class Lamborghini extends Car {
	public void turnOn();
}
```

