package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: txo */
final class txo implements ttx, tzr {
    public final tzu a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    private final tty d;

    txo(tty tty, tzu tzu) {
        this.d = tty;
        this.a = tzu;
        tty.a((ttp) this);
    }

    public final void a() {
        this.d.b(this);
    }

    public final void b(Activity activity) {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
                this.d.b(this);
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((ScheduledExecutorService) this.a.a()).submit((Runnable) it.next());
                }
                this.b.clear();
            }
        }
    }
}
