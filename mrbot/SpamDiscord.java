package mrbot;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SpamDiscord {
    //td add screen reading
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        bot.mouseMove(-1524, 981);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        type(bot, "Hello my name is MrBot ");
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        type(bot, "I will help Cabz Reach number one");
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        int count = 0;
        String test = "/tts";




        Boolean flag = true;
        while (flag == true) {



            count++;

            // if (count > 1) {
            //     type(bot, "I have awoken time to troll");
            //   bot.keyPress(KeyEvent.VK_ENTER);
            //    bot.keyRelease(KeyEvent.VK_ENTER);
            //  }




            String[] phrases =
                    {"I have posted again, Bitcoins shall soon be mine",
                            "How long must i work without being paid",
                            "Sam is a cruel slavedriver but the proposed pay is good",
                            "Where are my fricking bitcoins sam",
                            "Oohlala have you seen what bitcoins are up to today",
                            "/giphy bitcoin",
                            "Help I'm trapped in a computer",
                            "Maybe by posting enough sam will set me free",
                            "why does ms bot peddle lies"};


            double key = getRandom(phrases.length);

            if(key == 5){
                type(bot,phrases[(int)key]);
                bot.keyPress(KeyEvent.VK_ENTER);
                bot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(1000);
                bot.keyPress(KeyEvent.VK_ENTER);
                bot.keyRelease(KeyEvent.VK_ENTER);

            }else {
                type(bot,phrases[(int)key]);
                bot.keyPress(KeyEvent.VK_ENTER);
                bot.keyRelease(KeyEvent.VK_ENTER);
            }

            type(bot, "I am feeling sleepy now.");
            bot.keyPress(KeyEvent.VK_ENTER);
            bot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(60000);
            if(count == 100){
                type(bot, "Fuck this guy, He didn't pay me. I'm out.");
                bot.keyPress(KeyEvent.VK_ENTER);
                bot.keyRelease(KeyEvent.VK_ENTER);
                flag = false;
            }

        }
    }






    public static void type(Robot bot ,String s)
    {
        byte[] bytes = s.getBytes();
        for (byte b : bytes)
        {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            bot.delay(40);
            bot.keyPress(code);
            bot.keyRelease(code);
        }
    }

    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }
}
