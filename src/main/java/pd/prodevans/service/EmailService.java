package pd.prodevans.service;

public class EmailService {
    public void sendEmail(String receiver, String message){
        System.out.println(message + "is being sent to "+receiver);
    }
}
