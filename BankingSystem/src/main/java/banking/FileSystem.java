import java.util.*;

public class FileSystem {

    class TrieNode{
        boolean isFile = false;
        HashMap<String, TrieNode> children = new HashMap();
        public TrieNode(){}
    }

    TrieNode root;

    public FileSystem(){
        root = new TrieNode();
        root.children.put("/", new TrieNode());
    }

    public TrieNode mkdir(String path){
        TrieNode curr = root;

        String[] paths = path.substring(1).split("/");
        for(String p : paths){
            if(curr.children.containsKey(p)){
                curr = curr.children.get(p);
            }else{
                TrieNode node = new TrieNode();
                curr.children.put(p, node);
                curr = node;
            }
        }
        return curr;
    }

    public void addContentToFile(String path){
        TrieNode curr = root;
        mkdir(path.substring(0, path.length() - 1));
        System.out.println(curr.children);
    }
}
