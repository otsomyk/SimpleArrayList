package simpleArrayList;

public class Launcher {

	public static void main(String[] args) {
		SimpleArrayList arr = new SimpleArrayList();

		arr.add("first");
		arr.add(1, "second");
		arr.add(2, "third");

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        arr.remove("second");

	}

}
