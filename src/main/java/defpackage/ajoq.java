package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ajoq */
final class ajoq implements ajov, Runnable {
    public ScheduledFuture a;
    public atdv b;
    public boolean c;
    public final List d = new ArrayList();
    private final String e;
    private final /* synthetic */ ajoo f;

    public ajoq(ajoo ajoo, String str, atdv atdv) {
        this.f = ajoo;
        this.e = (String) amqw.a((Object) str);
        this.b = atdv;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amqq.a(this.b, ((ajoq) obj).b);
    }

    public final void a() {
        this.c = true;
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.a = null;
        }
        List list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    public final boolean b() {
        if (!this.c) {
            ScheduledFuture scheduledFuture = this.a;
            if (!(scheduledFuture == null || scheduledFuture.isDone())) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.c;
    }

    public final atdv d() {
        return this.b;
    }

    public final void run() {
        xak.b();
        if (!this.c) {
            ajos ajos = (ajos) ((ajop) this.f.b.get()).a();
            ajos.c(this.e);
            ajos.a(this.f.d);
            ajos.d = this.d;
            try {
                atce a = ((ajop) this.f.b.get()).a(ajos);
                atdv atdv = null;
                if (!(a == null || (a.a & 2) == 0)) {
                    atdv = a.c;
                    if (atdv == null) {
                        atdv = atdv.o;
                    }
                }
                this.b = atdv;
                if (this.c || this.b == null || this.f.a(this)) {
                    this.f.a(this, ajoo.a);
                }
            } catch (aanq unused) {
                this.f.a(this, ajoo.a);
            }
        }
    }
}
