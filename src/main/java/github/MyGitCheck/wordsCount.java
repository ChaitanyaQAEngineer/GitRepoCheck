package github.MyGitCheck;

import java.util.Scanner;

public class wordsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your value ");
        String sentence = sc.nextLine();
        printingWordsCountFromSentence(sentence);
    }

    public static void printingWordsCountFromSentence(String sentence){

        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");

       String[] words =  sentence.split("\\s+");

       boolean[] visited = new boolean[words.length];

       System.out.println("Printing the duplicate values");

       for(int i=0;i< words.length;i++){
        if(visited[i]){
            continue;
        }

        int count= 1;
        for(int j=i+1;j<words.length;j++){
            if(words[i].equals(words[j])){
                count++;
                visited[j] = true;
            }
        }

        if(count>1){
            System.out.println(words[i] + ":" + count);
        }
       }

    }
}
