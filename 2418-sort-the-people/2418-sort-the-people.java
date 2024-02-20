class Person implements Comparable<Person> {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Person other) {
        // Sort in descending order by height
        return Integer.compare(other.height, this.height);
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Person[] people = new Person[n];

        // Create Person objects and store in the array
        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

        // Sort the array of Person objects
        Arrays.sort(people);

        // Extract names from sorted Person objects
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = people[i].name;
        }

        return sortedNames;
    }
}

        
    