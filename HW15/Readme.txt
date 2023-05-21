The abstract class has a method to convert the currency from USD to the other currencies: Ruppee, Yen.
The implementation class USD accepts the Convert interface as a parameter so that we can pass both new Ruppee(), and
new Yen() as a parameter to the convert method while executing it. The Yen, Rupee classes have their respective conversion logic.