package proxies;

import model.AutoPayment;
import org.springframework.stereotype.Component;

@Component
public class SmsAutoPayNotificationProxy implements AutoPayNotificationProxy {

    @Override
    public void sendNotification(AutoPayment autoPayment) {
        System.out.println("SMS: Завтра будет выполнен автоплатеж " + autoPayment.getOrganization()
                + " на сумму " + autoPayment.getSum() + " руб.");
    }
}
