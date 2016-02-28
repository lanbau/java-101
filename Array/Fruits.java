String[] biggerFruit = new String[3];

// wtf we have to use curly braces?!
String[] fruit = {"cherry", "apple"};

// System.arraycopy(source, start, target, start, how many)
System.arraycopy(fruit, 0, biggerFruit, 0, 2)

// biggerFruit = ["cherry", "apple", null]
