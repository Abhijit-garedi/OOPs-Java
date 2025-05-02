class FinalKeywordExample {

   // Using final with a variable makes the value constant.
   final int CONSTANT_VALUE = 100;

   // Using final with a method makes it unmodifiable in subclasses.
   final void displayMessage() {
      System.out.println("This method cannot be overridden.");
   }

   // Using final with a class makes it non-inheritable.
   final class FinalInnerClass {
      void show() {
         System.out.println("This is a final inner class.");
      }
   }

   public static void main(String[] args) {
      FinalKeywordExample obj = new FinalKeywordExample();

      // Attempt to change the constant value (will give error if uncommented)
      // obj.CONSTANT_VALUE = 200; // Error: Cannot assign a value to final variable
      // 'CONSTANT_VALUE'

      // Using the final method
      obj.displayMessage();

      // Creating instance of final inner class
      FinalKeywordExample.FinalInnerClass innerObj = obj.new FinalInnerClass();
      innerObj.show();
   }
}
