package defpackage;

import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: anqg */
final /* synthetic */ class anqg implements Runnable {
    private final anqd a;
    private final Bundle b;
    private final ryl c;

    anqg(anqd anqd, Bundle bundle, ryl ryl) {
        this.a = anqd;
        this.b = bundle;
        this.c = ryl;
    }

    public final void run() {
        anqd anqd = this.a;
        Bundle bundle = this.b;
        ryl ryl = this.c;
        try {
            anpi anpi = anqd.a;
            Object obj = null;
            if (anpi.c.d() >= 12000000) {
                anqn a = anqn.a(anpi.b);
                try {
                    obj = (Bundle) rym.a(a.a(new anoz(a.a(), bundle)));
                } catch (InterruptedException | ExecutionException e) {
                    if ((e.getCause() instanceof anpa) && ((anpa) e.getCause()).a == 4) {
                        obj = anpi.a(bundle);
                    }
                }
            } else {
                obj = anpi.a(bundle);
            }
            ryl.a(obj);
        } catch (IOException e2) {
            ryl.a(e2);
        }
    }
}
