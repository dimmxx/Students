package students;
import java.util.Random;

public class Generate {

    private static Student[] studentArray = new Student[1000];
    private static int studentArraySize = 0;

    public static Student[] getStudentArray() {
        return studentArray;
    }

    public static int getStudentArraySize() {
        return studentArraySize;
    }

    private static final String[] firstNames = {"Amelia", "Olivia", "Emily", "Ava", "Isla", "Jessica", "Poppy", "Isabella", "Sophie", "Mia", "Ruby", "Lily", "Grace", "Evie", "Sophia", "Ella", "Scarlett", "Chloe", "Isabelle", "Freya", "Charlotte", "Sienna", "Daisy", "Phoebe", "Millie", "Eva", "Alice", "Lucy", "Florence", "Sofia", "Layla", "Lola", "Holly", "Imogen", "Molly", "Matilda", "Lilly", "Rosie", "Elizabeth", "Erin", "Maisie", "Lexi", "Ellie", "Hannah", "Evelyn", "Abigail", "Elsie", "Summer", "Megan", "Jasmine", "Maya", "Amelie", "Lacey", "Willow", "Emma", "Bella", "Eleanor", "Esme", "Eliza", "Georgia", "Harriet", "Gracie", "Annabelle", "Emilia", "Amber", "Ivy", "Brooke", "Rose", "Anna", "Zara", "Leah", "Mollie", "Martha", "Faith", "Hollie", "Amy", "Bethany", "Violet", "Katie", "Maryam", "Francesca", "Julia", "Maria", "Darcey", "Isabel", "Tilly", "Maddison", "Victoria", "Isobel", "Niamh", "Skye", "Madison", "Darcy", "Aisha", "Beatrice", "Sarah", "Zoe", "Paige", "Heidi", "Lydia", "Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas", "Oscar", "William", "James", "George", "Alfie", "Joshua", "Noah", "Ethan", "Muhammad", "Archie", "Leo", "Henry", "Joseph", "Samuel", "Riley", "Daniel", "Mohammed", "Alexander", "Max", "Lucas", "Mason", "Logan", "Isaac", "Benjamin", "Dylan", "Jake", "Edward", "Finley", "Freddie", "Harrison", "Tyler", "Sebastian", "Zachary", "Adam", "Theo", "Jayden", "Arthur", "Toby", "Luke", "Lewis", "Matthew", "Harvey", "Harley", "David", "Ryan", "Tommy", "Michael", "Reuben", "Nathan", "Blake", "Mohammad", "Jenson", "Bobby", "Luca", "Charles", "Frankie", "Dexter", "Kai", "Alex", "Connor", "Liam", "Jamie", "Elijah", "Stanley", "Louie", "Jude", "Callum", "Hugo", "Leon", "Elliot", "Louis", "Theodore", "Gabriel", "Ollie", "Aaron", "Frederick", "Evan", "Elliott", "Owen", "Teddy", "Finlay", "Caleb", "Ibrahim", "Ronnie", "Felix", "Aiden", "Cameron", "Austin", "Kian", "Rory", "Seth", "Robert", "Albert", "Sonny"};
    private static final String[] secondNames = {"Abramson", "Adamson", "Adderiy", "Addington", "Adrian", "Albertson", "Aldridge", "Allford", "Alsopp", "Anderson", "Andrews", "Archibald", "Arnold", "Arthurs", "Atcheson", "Attwood", "Audley", "Austin", "Ayrton", "Babcock", "Backer", "Baldwin", "Bargeman", "Barnes", "Barrington", "Bawerman", "Becker", "Benson", "Berrington", "Birch", "Bishop", "Black", "Blare", "Blomfield", "Boolman", "Bootman", "Bosworth", "Bradberry", "Bradshaw", "Brickman", "Brooks", "Brown", "Bush", "Calhoun", "Campbell", "Carey", "Carrington", "Carroll", "Carter", "Chandter", "Chapman", "Charlson", "Chesterton", "Clapton", "Clifford", "Coleman", "Conors", "Cook", "Cramer", "Creighton", "Croftoon", "Crossman", "Daniels", "Davidson", "Day", "Dean", "Derrick", "Dickinson", "Dodson", "Donaldson", "Donovan", "Douglas", "Dowman", "Dutton", "Duncan", "Dunce", "Durham", "Dyson", "Eddington", "Edwards", "Ellington", "Elmers", "Enderson", "Erickson", "Evans", "Faber", "Fane", "Farmer", "Farrell", "Ferguson", "Finch", "Fisher", "Fitzgerald", "Flannagan", "Flatcher", "Fleming", "Ford", "Forman", "Forster", "Foster", "Francis", "Fraser", "Freeman", "Fulton", "Galbraith", "Gardner", "Garrison", "Gate", "Gerald", "Gibbs", "Gilbert", "Gill", "Gilmore", "Gilson", "Gimson", "Goldman", "Goodman", "Gustman", "Haig", "Hailey", "Hamphrey", "Hancock", "Hardman", "Harrison", "Hawkins", "Higgins", "Hodges", "Hoggarth", "Holiday", "Holmes", "Howard", "Jacobson", "James", "Jeff", "Jenkin", "Jerome", "Johnson", "Jones", "Keat", "Kelly", "Kendal", "Kennedy", "Kennett", "Kingsman", "Kirk", "Laird", "Lamberts", "Larkins", "Lawman", "Leapman", "Leman", "Lewin", "Little", "Livingston", "Longman", "MacAdam", "MacAlister", "MacDonald", "Macduff", "Macey", "Mackenzie", "Mansfield", "Marlow", "Marshman", "Mason", "Mathews", "Mercer", "Michaelson", "Miers", "Miller", "Miln", "Milton", "Molligan", "Morrison", "Murphy", "Nash", "Nathan", "Neal", "Nelson", "Nevill", "Nicholson", "Nyman", "Oakman", "Ogden", "Oldman", "Oldridge", "Oliver", "Osborne", "Oswald", "Otis", "Owen", "Page", "Palmer", "Parkinson", "Parson", "Pass", "Paterson", "Peacock", "Pearcy", "Peterson", "Philips", "Porter", "Quincy", "Raleigh", "Ralphs", "Ramacey", "Reynolds", "Richards", "Roberts", "Roger", "Russel", "Ryder", "Salisburry", "Salomon", "Samuels", "Saunder", "Shackley", "Sheldon", "Sherlock", "Shorter", "Simon", "Simpson", "Smith", "Stanley", "Stephen", "Stevenson", "Sykes", "Taft", "Taylor", "Thomson", "Thorndike", "Thornton", "Timmons", "Tracey", "Turner", "Vance", "Vaughan", "Wainwright", "Walkman", "Wallace", "Waller", "Walter", "Ward", "Warren", "Watson", "Wayne", "Webster", "Wesley", "White", "WifKinson", "Winter", "Wood", "Youmans", "Young"};
    private static final int[] quality = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};


    public static void generateStudent(int quantity) {
        if (quantity > 1000) {
            System.out.println("Cannot generate more than 1000 students");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            Random random = new Random();
            int rndName = random.nextInt(firstNames.length);
            int rndSurname = random.nextInt(secondNames.length);
            int rndPerformance = random.nextInt(quality.length);
            int rndAttendance = random.nextInt(quality.length);
            int rndActivity = random.nextInt(quality.length);

            String fName = firstNames[rndName];
            String sName = secondNames[rndSurname];
            int performance = quality[rndPerformance];
            int attendance = quality[rndAttendance];
            int activity = quality[rndActivity];

            studentArray[i] = new Student(fName, sName, performance, attendance, activity);
            studentArraySize++;
        }
    }




}
