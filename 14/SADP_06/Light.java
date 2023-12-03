public class Light 
{
        public void on()
        {
            System.out.println("Light is on");
        }
        public void off()
        {
            System.out.println("Light is off");
        }
}
    
class LightOnCommand implements Command
{
        Light light;
     
        public LightOnCommand(Light light)
        {
           this.light = light;
        }
        public void execute()
        {
           light.on();
        }    
}
