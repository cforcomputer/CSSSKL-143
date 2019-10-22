
/**
 * Questions:
 * (2) Hover over the variables to see their values
 * Q: Where is the variable watch window on your screen?
 * A: I'm using intelliJ, so it's at the bottom where I put my debug window.
 *
 * Q: What information does this present you?
 * A: A screen with a Variables tab that displays things like
 * name, owner, balance, the memory reference; all shown as what the variable is = to.
 *
 * Q: Where is the method call stack on your screen?
 * A: The method call stack is present under frames in the intellij debugger, and is also visually represented
 * in the actual window present with the code. It describes the methods that are being called and the line in
 * which they are being executed.
 *
 * Q: Find the shortcut for the following debug commands, and describe what each of them does in the comments.
 * Step over: f8 = Skips through the program by function call instead of line by line
 * Step into: f7 = Executes the program line by line so you that you can see a detailed view of the program
 * execution.
 * Step out: shift+f8 = Executes the rest of the current function and then breaks when completed.
 * Continue/resume program: f9 = runs the rest of the program from the current point
 *
 *
 * */
class DebuggingExercise4
{
    public static void main(String[] args)
    {
        Account a = new Account("Henry"); // replaced null with String Henry so that Account.java works
        a.deposit(100);
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }
}
