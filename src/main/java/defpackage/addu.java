package defpackage;

import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: addu */
final class addu implements Runnable {
    private final List a;
    private final MulticastSocket b;
    private final /* synthetic */ addo c;

    addu(addo addo, List list, MulticastSocket multicastSocket) {
        this.c = addo;
        this.a = list;
        this.b = multicastSocket;
    }

    public final void run() {
        long j = 9400;
        for (Future future : this.a) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                future.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0, j - (System.currentTimeMillis() - currentTimeMillis));
            } catch (InterruptedException | ExecutionException e) {
                xtl.a(addo.a, "Error waiting for reading device response task to complete", e);
            } catch (TimeoutException e2) {
                xtl.a(addo.a, "Timed out waiting for device response", e2);
                future.cancel(true);
            }
        }
        Iterator it = this.c.h.keySet().iterator();
        while (it.hasNext()) {
            if (!this.c.g.contains((String) it.next())) {
                it.remove();
            }
        }
        this.b.close();
        this.c.a();
        this.c.i = false;
    }
}
