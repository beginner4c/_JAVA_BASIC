package _08_postEvaluator;

// 직접 만든 스택 클래스

class Stack 
{
   static class StackItem {
      private int _value;
      private StackItem _next;
      StackItem(int v) {
         _value = v;
         _next = null;
      }
      int getValue() {
         return _value;
      }
      StackItem getNextItem() {
         return _next;
      }
      void setNextItem(StackItem item) {
         _next = item;
      }
   }
   // Attributes
   /** a pointer to the top item of the Stack 
    */
   private StackItem _top;
   // Operations
   /** initialization procedure for new stack
    */
   void initialize() {  
      _top = null;
   }
   /** this function is called for stack empty exception
    */
   void emptyError() {
      System.err.println("Stack empty error occurs.");
      System.exit(-1);
   }
   /** the constructor for stack object
    */
   Stack() {
      initialize();
   }
   /**   the function to insert new item on stack
    */
   void push(int i) {
      if (_top == null) 
         _top = new StackItem(i);
      else {
         StackItem item = new StackItem(i);
         item.setNextItem(_top);
         _top = item;
      }
   }
   /** the function to delete an item at the top position of the stack
    */
   int pop() {
      if (_top == null) emptyError();
      StackItem topItem = _top;
      _top = _top.getNextItem();
      return topItem.getValue();
   }
   /** the function to get the top element of the stack
    */
   int peek() {
      if (_top == null) emptyError();
      return (_top.getValue());
   }
   /** the fuction to clear an exisiting stack
    */
   void reset() {
      initialize();
   }
	/** the funtion to check if the stack is empty
	 */
   boolean isEmpty() {
	   if (_top == null) return true;
	   else return false;
   }
}
