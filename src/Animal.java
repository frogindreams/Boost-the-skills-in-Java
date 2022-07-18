public enum Animal
{
    DOG("Собака"), CAT("Кот"), FROG("Лягушка"), TOAD("Жаба");

    private String translation;

    Animal(String translation)
    {
        this.translation = translation;
    }

    public String getTranslation()
    {
        return translation;
    }

    @Override
    public String toString()
    {
        return "Translation to Russian: " + translation;
    }
}
