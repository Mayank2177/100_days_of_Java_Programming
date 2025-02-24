#### Printing Output
       System.out.println("/Enter the String/");

#### Managing Input and Output
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the element");

##### element can be Integer, String, Float etc.

|Method           |          Description|
|-----------------|---------------------------------------|
|nextBoolean()    |        Used for reading Boolean value.|
|nextByte()       |         Used for reading Byte value.  |
|nextDouble()     |         Used for reading Double value.|
|nextFloat()      |         Used for reading Float value. |
|nextInt()        |         Used for reading Int value.   |
|nextLine()       |         Used for reading Line value.  |
|nextLong()       |         Used for reading Long value.  |
|nextShort()      |         Used for reading Short value. |

       int element= obj.nextInt();
       System. out.println("THe element is"+ element);

### TypeCasting

       double var = 15.69;
       float obj = 15.69f;
       int mynew= (int)var;
       int newone = (int)obj;

### Operations

|Operator                |Signature                                                                         |
|------------------------|----------------------------------------------------------------------------------|
Arithmetic Operators     |              *,/,+,-,%                                                           |
Unary Operators          |            (post and pre):  ++,--,!                                              |
Assignment Operator      |       +=,-=,*=,/=,%=,^=,&=,|=,>>=,<<=,>>>=                                       |
Relational Operators     |             ==,!=,<,>,<=,>=                                                      |
Logical Operators        |   &&, Logical AND; ||, Logical OR; !, Logical NOT                                |
Ternary Operator         |       condition ? if true : if false                                             |
Bitwise Operators        |       & (Bitwise AND); | (Bitwise OR); ^ (Bitwise XOR); ~ (Bitwise Complement)   |
Shift Operators          |        << (Left shift); >> (Signed right shift); >>> (Unsigned right shift)      |
instance of operator     |       object instance of class/subclass/interface                                |

#### ternary operartor
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
       System.out.println("Max of three numbers = "+ result);
#### shift operator
       number shift_op number_of_places_to_shift; 

#### instance of operator
       Person obj1 = new Person();
       Person obj2 = new Boy();
       System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));              //true
       System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));                  //false
       System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));           //false
       System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));                //true
       System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));                   //true
       System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));            //true
       
#### Precedence and Associativity of Java Operators

![image](https://github.com/user-attachments/assets/f8412a33-d923-4a97-bcb0-c7782b17b80e)
