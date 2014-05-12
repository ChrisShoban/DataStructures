
public class TrieMapImpl implements Trie {
	
	public static final NodeMap<String> root = new NodeMap<String>("");

	public void add(String word) {
		NodeMap<String> current = root;
		String letter;
		for(int i = 0; i < word.length(); i++) {
			letter = String.valueOf(word.charAt(i));
			if(current.getNeighbors() != null && current.getNeighbors().get(letter) == null) {
				NodeMap<String> n = new NodeMap<String>(letter);
				current.getNeighbors().put(letter, n);
			}
			current = current.getNeighbors().get(letter);
		}
	}

	public boolean contains(String word) {
		NodeMap<String> current = root;	
		String letter;
		for(int i = 0; i < word.length(); i++) {
			letter = String.valueOf(word.charAt(i));
			if(current.getNeighbors() != null && current.getNeighbors().get(letter) == null) {
				return false;
			}
			current = current.getNeighbors().get(letter);
		}
		return true;
	}

	@Override
	public boolean remove(String word) {
		return false;
	}
}
