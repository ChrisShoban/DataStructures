
public class TrieArrayImpl implements Trie {

	private static final NodeArray root = new NodeArray('.');
	//private static final int LETTER_a = 97; // letter 'a'
	
	public void add(String word) {
		NodeArray current = root;
		NodeArray n;
		char letter;
		for(int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			if(current.getNeighbors()[letter] == null) {
				n = new NodeArray(letter);
				current.getNeighbors()[letter] = n;
			}
			current = current.getNeighbors()[letter];
		}
	}

	public boolean contains(String word) {
		NodeArray current = root;	
		char letter;
		for(int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			if(current.getNeighbors() == null || 
				current.getNeighbors()[letter] == null ||
				current.getNeighbors()[letter].getValue() != letter) {
				return false;
			}
			current = current.getNeighbors()[letter];
		}
		return true;
	}

	public boolean remove(String word) {
		return false;
	}
}
