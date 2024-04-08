class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       List<Integer> studentlist = new ArrayList<>();
        List<Integer> sandwicheslist = new ArrayList<>();
        
       
        for (int student : students) {
            studentlist.add(student);
        }
        for (int sandwich : sandwiches) {
            sandwicheslist.add(sandwich);
        }

        int count = 0;
        while (!studentlist.isEmpty()) {
            if (studentlist.get(0).equals(sandwicheslist.get(0))) {
               
                count = 0;
                studentlist.remove(0);
                sandwicheslist.remove(0);
            } else {
                
                count++;
                
                studentlist.add(studentlist.get(0));
                studentlist.remove(0);
            }

           
            if (count == studentlist.size()) {
                break;
            }
        }
        return count;
    }
}