import java.util.*;

public class AnagramMap {
    public static void main(String[] args) {
        String[] arr = {"tan", "nat", "bat", "tab", "cat", "act"};
        anagram(arr);
    }

    public static void anagram (String[] arr)
    {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String x : arr)
        {
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);

            if (hm.containsKey(sortedWord))
            {
                hm.get(sortedWord).add(x);
            }
            else
            {
                List<String> lt = new ArrayList<>();
                lt.add(x);
                hm.put(sortedWord, lt);
            }
        }

//        for (String key : hm.keySet())
//        {
//            System.out.print(key + " -> ");
//            for (String word : hm.get(key))
//            {
//                System.out.print(word + ", ");
//            }
//            System.out.println();
//        }

        for (List<String> l : hm.values())
        {
            System.out.println(l);
        }
    }
}
