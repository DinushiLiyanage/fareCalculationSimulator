/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 * @author D.U.Liyanage *
 */
public class FeedBackViewController {

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void redirectToHome() {

        final Runnable beeper = new Runnable() {
            @Override
            public void run() {
            }
        };
        final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 1, 1, SECONDS);
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                MainController.actionPanelNavigation("WELCOME");
            }
        }, 5, SECONDS);
    }

}
