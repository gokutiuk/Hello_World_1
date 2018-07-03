public interface Interface
{
    public void switchOnOff();
    default public void switchOnOffD()
    {
        System.out.println(" Я дефолтный метод интерфеса");
    }

}
