package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: twn */
final class twn extends ttj implements ttx {
    public final Object d = new Object();
    public final int e;
    public final twl f;
    public final List g;
    public final AtomicInteger h;

    public final void b(Activity activity) {
        e();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (this.h.get() > 0) {
            c().schedule(new twp(this), 1, TimeUnit.SECONDS);
            return;
        }
        twm[] twmArr;
        synchronized (this.d) {
            if (this.g.isEmpty()) {
                twmArr = null;
            } else {
                List list = this.g;
                twmArr = (twm[]) list.toArray(new twm[list.size()]);
                this.g.clear();
            }
        }
        if (twmArr != null) {
            c().submit(new tws(this, twmArr));
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        tty.a(this.a).b(this);
        synchronized (this.d) {
            this.g.clear();
        }
    }

    twn(udc udc, Application application, tzu tzu, tzu tzu2, int i, boolean z, tzv tzv, amqp amqp) {
        super(udc, application, tzu, tzu2, 1, Integer.MAX_VALUE);
        this.e = i;
        this.g = new ArrayList(i);
        this.f = new twl(z, tzv, amqp);
        this.h = new AtomicInteger();
        tty.a(this.a).a((ttp) this);
    }
}
