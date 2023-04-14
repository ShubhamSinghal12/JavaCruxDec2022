package Lec51;

import java.util.HashMap;

public class Trie {
	
	
	private class Node{
		
		char value;
		HashMap<Character,Node> children;
		boolean isWord;
		int count = 0;
		
//		Node()
//		{
//			value = '*';
//			isWord = false;
//			children = new HashMap<>();
//		}
		Node(char ch)
		{
			value = ch;
			isWord = false;
			children = new HashMap<>();
		}
	}
	Node root;
	public Trie() {
        root = new Node('*');
    }
    
    public void insert(String word) {
        Node temp = root;
        temp.count++;
        for(int i = 0; i < word.length(); i++)
        {
        	if(temp.children.containsKey(word.charAt(i)))
        	{
        		temp = temp.children.get(word.charAt(i));
        	}
        	else
        	{
        		Node n = new Node(word.charAt(i));
        		temp.children.put(word.charAt(i), n);
        		temp = n;
        	}
        	temp.count++;
        }
        temp.isWord = true;
    }
    
    public boolean search(String word) {
    	Node temp = root;
        for(int i = 0; i < word.length(); i++)
        {
        	if(temp.children.containsKey(word.charAt(i)))
        	{
        		temp = temp.children.get(word.charAt(i));
        	}
        	else
        	{
        		return false;
        	}
        }
        return temp.isWord;
    }
    
    public boolean startsWith(String word) {
    	Node temp = root;
        for(int i = 0; i < word.length(); i++)
        {
        	if(temp.children.containsKey(word.charAt(i)))
        	{
        		temp = temp.children.get(word.charAt(i));
        	}
        	else
        	{
        		return false;
        	}
        }
        return true;
    }
    
    public void removeWord(String word)
    {
    	Node temp = root;
        for(int i = 0; i < word.length(); i++)
        {
        	if(temp.children.containsKey(word.charAt(i)))
        	{
        		temp = temp.children.get(word.charAt(i));
        	}
        	else
        	{
        		return;
        	}
        }
        temp.isWord = false;
    }
    
    public int prefixCount(String word) {
    	Node temp = root;
        for(int i = 0; i < word.length(); i++)
        {
        	if(temp.children.containsKey(word.charAt(i)))
        	{
        		temp = temp.children.get(word.charAt(i));
        	}
        	else
        	{
        		return 0;
        	}
        }
        return temp.count;
    }
    
    
}

