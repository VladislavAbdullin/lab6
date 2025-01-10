import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание (1 (2.1), 2 (2.2), 3 (2.3), 4 (2.4), 5 (2.5), 6 (2.6)):");
        int v = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                v = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите корректное целое число:");
                scanner.next(); // Очистка неверного ввода
            }
        }
        scanner.nextLine();
        switch (v) {
            case 1:
                InvokeClass obj = new InvokeClass();
                obj.InvokMethod();
                break;
            case 2:
                // Получаем аннотацию с класса
                Class<DefaultClass> clazz = DefaultClass.class;
                if (clazz.isAnnotationPresent(Default.class)) {
                    Default defaultAnnotation = clazz.getAnnotation(Default.class);
                    System.out.println("Аннотация на классе MyClass: " + defaultAnnotation.value());
                }

                // Получаем аннотацию с поля
                try {
                    java.lang.reflect.Field field = clazz.getDeclaredField("number");
                    if (field.isAnnotationPresent(Default.class)) {
                        Default defaultAnnotation = field.getAnnotation(Default.class);
                        System.out.println("Аннотация на поле number: " + defaultAnnotation.value());
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                // Получаем аннотацию с класса
                Class<ToStringClass> clazz2 = ToStringClass.class;
                if (clazz2.isAnnotationPresent(ToString.class)) {
                    ToString classAnnotation = clazz2.getAnnotation(ToString.class);
                    System.out.println("Аннотация на классе ToString: " + classAnnotation.value());
                }

                // Получаем аннотацию с поля
                try {
                    java.lang.reflect.Field field = clazz2.getDeclaredField("proverka");
                    if (field.isAnnotationPresent(ToString.class)) {
                        ToString fieldAnnotation = field.getAnnotation(ToString.class);
                        System.out.println("Аннотация на поле proverka: " + fieldAnnotation.value());
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }

                break;
            case 4:
                // Получаем аннотацию с класса
                Class<ValidateClass> clazz3 = ValidateClass.class;
                if (clazz3.isAnnotationPresent(Validate.class)) {
                    Validate annotation = clazz3.getAnnotation(Validate.class);
                    System.out.println("Аннотация на классе ValidateClass содержит следующие классы: ");
                    for (Class<?> validatedClass : annotation.value()) {
                        System.out.println(validatedClass.getName());
                    }
                }
                break;
            case 5:
                // Получаем аннотацию с класса
                Class<TwoClass> clazz4 = TwoClass.class;
                if (clazz4.isAnnotationPresent(Two.class)) {
                    Two annotation = clazz4.getAnnotation(Two.class);
                    System.out.println("Аннотация на классе TwoClass:");
                    System.out.println("first: " + annotation.first());
                    System.out.println("second: " + annotation.second());
                }
                break;
            case 6:
                // Получаем аннотацию с класса
                Class<CacheClass> clazz6 = CacheClass.class;
                if (clazz6.isAnnotationPresent(Cache.class)) {
                    Cache annotation = clazz6.getAnnotation(Cache.class);
                    System.out.println("Аннотация на классе MyClass:");
                    System.out.println("value: ");
                    for (String cacheName : annotation.value()) {
                        System.out.println(cacheName);
                    }
                } else {
                    System.out.println("Аннотация @Cache не найдена на классе CacheClass.");
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;

            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите задание (1 (1.1), 2 (3.1), 3 (4.1), 4 (5.1),5 (6.1) 6 (7.2))");
                break;
        }
        }
    }
