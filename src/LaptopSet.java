import java.util.*;


public class LaptopSet {
    public static void main(String[] args) {
        HashSet<Laptops> laptops = new HashSet<>();
        laptops.add(new Laptops("Honor", "8", "Intel", "Black", "Windows"));
        laptops.add(new Laptops("Apple", "16", "macOS", "White", "Windows"));
        laptops.add(new Laptops("ASUS", "8", "Intel", "Blue", "Linux"));
        laptops.add(new Laptops("Honor", "16", "Intel", "Grey", "Linux"));
        laptops.add(new Laptops("Lenovo", "8", "Intel", "Grey", "Linux"));

        System.out.println(filter(laptops,userAns()));
    }

    public static HashMap<String, String> userAns() {
        HashMap<String, String> userAns = new HashMap<>();
        userAns.put("brand", null);
        userAns.put("RAM", null);
        userAns.put("videoProcessor", null);
        userAns.put("color", null);
        userAns.put("operatingSystem", null);

        Scanner scanner1 = new Scanner(System.in);
        int i = 0;
        System.out.println("ГЛАВНОЕ МЕНЮ \n"+
                           "Для выбора критерия фильтрации выбирите цифру:");
        while (i != 6) {
            System.out.println(
                    """
                            1. Бренд\s
                            2. Оперативная память\s
                            3. Видео процессор\s
                            4. Цвет\s
                            5. Операционная система\s
                            Для ПОИСКА нажмите 6""");
            i = scanner1.nextInt();
            if (i == 1) {
                System.out.println("Введите название бренда: ");
                Scanner brand = new Scanner(System.in);
                userAns.replace("brand", null, brand.next());
                System.out.println("Критерий добавлен! Вы можете добавить еще критерии или приступить к поиску.");
            }
            if (i == 2) {
                System.out.println("Введите оперативную память: ");
                Scanner raw = new Scanner(System.in);
                userAns.replace("RAM", null, raw.next());
                System.out.println("Критерий добавлен! Вы можете добавить еще критерии или приступить к поиску.");
            }
            if (i == 3) {
                System.out.println("Введите видео процессор: ");
                Scanner videoProcessor = new Scanner(System.in);
                userAns.replace("videoProcessor", null, videoProcessor.next());
                System.out.println("Критерий добавлен! Вы можете добавить еще критерии или приступить к поиску.");
            }
            if (i == 4) {
                System.out.println("Введите цвет: ");
                Scanner color = new Scanner(System.in);
                userAns.replace("color", null, color.next());
                System.out.println("Критерий добавлен! Вы можете добавить еще критерии или приступить к поиску.");
            }
            if (i == 5) {
                System.out.println("Введите операционную систему: ");
                Scanner operatingSystem = new Scanner(System.in);
                userAns.replace("operatingSystem", null, operatingSystem.next());
                System.out.println("Критерий добавлен! Вы можете добавить еще критерии или приступить к поиску.");
            }

        }
        return userAns;
    }

    public static List<Laptops> filter(HashSet<Laptops> laptops, HashMap<String, String> userAns) {
        List<Laptops> filterLaptops = new ArrayList<>();
        for (Laptops laptop : laptops) {
            String brand = userAns.get("brand");
            if (brand != null && !brand.equals(laptop.getBrand())) {
                continue;
            }

            String ram = userAns.get("RAM");
            if (ram != null && !ram.equals(laptop.getRAM())) {
                continue;
            }

            String videoProcessor = userAns.get("videoProcessor");
            if (videoProcessor != null && !videoProcessor.equals(laptop.getVideoProcessor())) {
                continue;
            }

            String color = userAns.get("color");
            if (color != null && !color.equals(laptop.getColor())) {
                continue;
            }

            String operatingSystem = userAns.get("operatingSystem");
            if (operatingSystem != null && !operatingSystem.equals(laptop.getOperatingSystem())) {
                continue;
            }
            filterLaptops.add(laptop);

        }
        return filterLaptops;
    }
}