# PrimitiveAndReferenceTypes.java
The code demonstrated in this Java program shows the difference between primitive and reference types.

#### Primitive Types

We have two variables, variable a and b. Both variables are stored in memory, and have a unique location in memory, known 
as an address. (TODO: Find the proper definition of memory address)

The variable `a` has an address and stores a value, 10. `int a = 10;`
<br /> 
The variable `b` has an address is assigned teh value of `a`. It has an address and stores the *value* of `a`. So in memory, 
`b` will have the value of 10 as well. `int b = a;` This technique is known as *pass by copy*. 
<br /> 
Because we have performed the *pass by copy* technique, if `a` gets updated, the variable `b` will be unaffected. When the
Java program runs, as it goes line by line, the variables are assigned and put into memory. 
<br /> 
<br /> 
<br /> 
##### Memory Diagram

Before `a` gets updated: 

Addr:200 | Addr:201 
-------- | ---------
A : 10  | B : 10

After `a` gets updated: 

Addr:200 | Addr:201
-------- | ---------
A: 100   | B: 10
<br /> 
<br /> 

`b` just stores the value of `a` at that moment in runtime, so when `a` is created and set to the value of `10`, that is what the variable `b` will be copying. 
When `a` is then assigned to `100` in the next line, the value of `a` is `100`, and the value of `b` is `10`.    
<br /> 
This is a property of what are known as primitive types. Primitive types are the basic data types, cuch as `int, char, 
double, byte, long, short, float`, etc. 


Another type of data is known as a 'reference' type. Reference types are usually classes or objects; they are instantiable
classes or arrays. They store addresses to locations in memory for where data is stored.

You see a creation of a Person object.
The Person class contains a field name.
We create two Person object,s Alex and Mary.
When we create the object for Alex, we are assigning it to a reference variable. This variable
points to the object's location in memory.
So the value of alex is the value of the new Person object with name Alex.
In memory, the two reference variables (line 11 and 12), will have their own addresses in memory, and they will both
point to the object's location in memory.


Next, we create a variable mary with type Person, referencing the Person class. We assign that reference variable
to the alex, so it will store the value of the alex object.

If you run the code (before changing alex), you can see that we're accessing the name property
of both objectsand they are both alex.

However, unlike with primitive types, if we change alex or mary by accessing it's propery, both will change! This is because
they point to the same location, and if either is altered, then both are altered.


