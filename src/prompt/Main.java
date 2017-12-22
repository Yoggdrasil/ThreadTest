package prompt;

public class Main {

    static private AffableThread mSecondThread;

    public static void main(String[] args)
    {
        mSecondThread = new AffableThread();	//Создание побочного потока
        mSecondThread.start();					//Запуск потока

        System.out.println("Главный поток завершён...");

        // только потом завершится побочный поток
    }
}

class AffableThread extends Thread
{
    @Override
    public void run()	//Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}

