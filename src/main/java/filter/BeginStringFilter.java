package filter;

//Класс BeginStringFilter, реализующий этот интерфейс, со следующим поведением.
//При создании объекта класса конструктор получает на вход и сохраняет строку
//pattern. Метод apply(str) проверяет, что строка str начинается с подстроки pattern.
//Т.е. должен работать следующий фрагмент кода:
//String str = “Мама мыла раму”;
//BeginStringFilter filter1 = new BeginStringFilter(“Мама”);
//BeginStringFilter filter2 = new BeginStringFilter(“мыла”);
//boolean res1 = filter1.apply(str); // результат — true
//boolean res2 = filter2.apply(str); // результат — false

public class BeginStringFilter implements Filter{
    private String pattern;

    public BeginStringFilter(String pattern){
        if(pattern == null || pattern.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.pattern = pattern;
    }


    @Override
    public boolean apply(String string) {
        return string != null && string.startsWith(pattern);
    }
}
