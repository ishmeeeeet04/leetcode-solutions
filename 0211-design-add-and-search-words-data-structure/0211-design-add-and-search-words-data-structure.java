class WordDictionary {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    TrieNode root = new TrieNode();

    public WordDictionary() {
    }

    public void addWord(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEnd = true;
    }

    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int pos, TrieNode current) {

        if (pos == word.length()) {
            return current.isEnd;
        }

        char ch = word.charAt(pos);

        if (ch != '.') {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            return search(word, pos + 1, current.children[index]);
        }

        for (int i = 0; i < 26; i++) {

            if (current.children[i] != null) {

                if (search(word, pos + 1, current.children[i])) {
                    return true;
                }
            }
        }

        return false;
    }
}