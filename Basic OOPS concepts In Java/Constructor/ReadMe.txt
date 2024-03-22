Constructor  
It is special member functions of a class which are used to initialize object.

So by initializing the object let's understand it like
suppose you get a new smartphone for the first time. So you personalize 
it by adding your contact info or choosing wallpaper or anything else.
Similarly when you create an object in java you want to set it up with some specific information or specific
condition. This setup process is object intitalization.

If you want to perform any task only once in the life cycle of an object then put the code inside constructor.
Or you want to provide certain resources to each object of your class like database connection or gui, file connection
etc then put the code in constructor.


 contructor are of two types
                             1. parameterized constructor
                             2. non- parameterized constructor or default constructor.

Constructor chaining 
It refers to process of calling one constructor from another constructor with respect to the current object.
This technique helps to reuse code among constructor and is a common practise to ensure that object initalization happens in a single place by which it reduces the liklihood of error and 
redundancy of code.

Constructor chaining can happen in two ways : 
                                              1. Within same class: Achieved via this keyword.
                                              2. Accross classes(inheritance hieracrchy) : Achieved through super keyword.

                                             
