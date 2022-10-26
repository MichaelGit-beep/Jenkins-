package cars

class Fruits {

   private String fruitName
   private String fruitColor

   def setFruitName(String name) {
      fruitName = name
   }
   
   def setFruitColor(String color) {
      fruitColor = color
   }

   def getFruitName() {
      return "Name of the fruit is $fruitName"
   }

   def getFruitColor() {
      return "Color of the fruit is $fruitColor"
   }

   static void main(args) { }
}

def a = new Fruits()
println(a.getFruitColor())