import java.io.*;
import java.util.*;

public class Solution {
    
    Stack<Character> stack = new Stack<>();
    
    Queue<Character> queue = new LinkedList<>();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }
        
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    public char popCharacter(){
        return stack.pop();
    } 
    
    public char dequeueCharacter(){
        return (char) queue.remove();
    }

  
