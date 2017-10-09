import java.util.ArrayList;


public class problem9 {

    public static void main(String[] args){
        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(new User("Happy",null,null,null,null));
        listUser.add(new User("Nicole",null,null,null,null));
        listUser.add(new User("Dutch",null,null,null,null));
        listUser.add(new User("Apple",null,null,null,null));
        // We use heap and comparable to sort the users by its username
        GenericHeap<User> heap = new GenericHeap<>();

        for (int i = 0; i<listUser.size(); i++){
            heap.add(listUser.get(i));
        }

        for (int i = listUser.size()-1; i>=0;i--){
            listUser.set(i, heap.remove());

        }

        for (User output: listUser){
            System.out.println(output+" ");
        }
        System.out.println("");

        //Here we use heap and comparator. You're able to add your own comparator to the parameter.
        //My comparator here sorts the usernames of Users backwords.
        HeapComparator<User> heap1 = new HeapComparator<>(new UserComparator());

        for (int i = 0; i<listUser.size(); i++){
            heap1.add(listUser.get(i));
        }

        for (int i = listUser.size()-1; i>=0;i--){
            listUser.set(i, heap1.remove());

        }

        for (User output: listUser){
            System.out.println(output+" ");
        }
        System.out.println("");



    }
}
