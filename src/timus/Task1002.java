package timus;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringJoiner;

public class Task1002 {
	private static HashMap<Character, Character> mappings;
	static {
		mappings = new HashMap<Character, Character>();
		
		mappings.put('o', '0'); mappings.put('q', '0'); mappings.put('z', '0'); // 0 oqz
		mappings.put('i', '1'); mappings.put('j', '1');                         // 1 ij
		mappings.put('a', '2'); mappings.put('b', '2'); mappings.put('c', '2'); // 2 abc
		mappings.put('d', '3'); mappings.put('e', '3'); mappings.put('f', '3'); // 3 def
		mappings.put('g', '4'); mappings.put('h', '4');                         // 4 gh
		mappings.put('k', '5'); mappings.put('l', '5');                         // 5 kl
		mappings.put('m', '6'); mappings.put('n', '6');                         // 6 mn
		mappings.put('p', '7'); mappings.put('r', '7'); mappings.put('s', '7'); // 7 prs
		mappings.put('t', '8'); mappings.put('u', '8'); mappings.put('v', '8'); // 8 tuv
		mappings.put('w', '9'); mappings.put('x', '9'); mappings.put('y', '9'); // 9 wxy
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
    	HashMap<Integer, ArrayList<Node>> tree = new HashMap<Integer, ArrayList<Node>>();
        
        while (in.hasNextLine()) {
        	String phone = in.nextLine();
        	if (phone.equals("-1")) break;
        	        	
        	int wordsQuantity = Integer.parseInt(in.nextLine());
        	for (int i = 0; i < wordsQuantity; ++i) {
        		String word = in.nextLine();
        		
        		for (int begin: indexiesOf(encode(word), phone)) {
        			int end = begin + word.length();
        			
        			ArrayList<Node> bucket = tree.getOrDefault(end, new ArrayList<Node>());
            		if (bucket.isEmpty()) {
            			tree.put(end, bucket);
            		}
            		
            		bucket.add(new Node(begin, word));
        		}
        	}
        	
        	Path path = wideSearch(tree, phone.length());
        	String sequence = getSequence(path);
        	
        	out.println(
        		(!sequence.isEmpty()) ? sequence : "No solution."
        	);
        	
        	tree.clear();
        }
        
        out.flush();
        in.close();
    }
    
    private static ArrayList<Integer> indexiesOf(String needle, String haystack) {
    	ArrayList<Integer> occurences = new ArrayList<Integer>();

    	int lastIndex = 0;
    	while(lastIndex != -1) {
    	    lastIndex = haystack.indexOf(needle, lastIndex);

    	    if(lastIndex != -1){
    	        occurences.add(lastIndex);
    	        lastIndex += 1;
    	    }
    	}
    	
    	return occurences;
    }
    
    private static String encode(String word) {
    	StringBuilder encoded = new StringBuilder();
		for (int j = 0; j < word.length(); ++j) {
			encoded.append(mappings.get(word.charAt(j)));
		}
		
		return encoded.toString();
    }
    
    private static String getSequence(Path path) {
    	StringJoiner sequence = new StringJoiner(" ");
    	while (path != null) {
    		sequence.add(path.node.word);
    		path = path.parent;
    	}
    	
    	return sequence.toString();
    }
    
    private static Path wideSearch(HashMap<Integer, ArrayList<Node>> tree, int value) {
    	HashSet<Node> visited = new HashSet<Node>();
    	ArrayDeque<Path> queue = new ArrayDeque<Path>();
    	
    	ArrayList<Node> nodes = tree.get(value);
    	if (nodes == null || nodes.isEmpty()) return null;
    	
    	for (Node child: nodes) {
			queue.add(new Path(child, null));
		}
    	
    	while (!queue.isEmpty()) {
    		Path path = queue.poll();
    		if (path.node.begin == 0) return path;
    		if (visited.contains(path.node)) continue;
    		
    		visited.add(path.node);
    		
    		ArrayList<Node> nextNodes = tree.get(path.node.begin);
    		if (nextNodes != null && !nextNodes.isEmpty()) {
    			for (Node child: nextNodes) {
    				queue.add(new Path(child, path));
    			}
    		}
    	}
    	
    	return null;
    }
    
    static class Path {
    	public final Node node;
    	public final Path parent;
    	
    	public Path(Node node, Path parent) {
			this.node = node;
			this.parent = parent;
		}
    }
    
    static class Node {
    	public final int begin;
    	public final String word;
    	
		public Node(int begin, String word) {			
			this.begin = begin;
			this.word = word;
		}
    }
}