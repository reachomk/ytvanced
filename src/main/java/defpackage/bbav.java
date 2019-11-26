package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bbav */
final class bbav implements bazn {
    public final bazn a;
    public volatile boolean b;
    public List c = new ArrayList();

    public bbav(bazn bazn) {
        this.a = bazn;
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
                return;
            }
            this.c.add(runnable);
        }
    }

    public final void a(bbhp bbhp) {
        if (this.b) {
            this.a.a(bbhp);
        } else {
            a(new bbay(this, bbhp));
        }
    }

    public final void a() {
        if (this.b) {
            this.a.a();
        } else {
            a(new bbax(this));
        }
    }

    public final void a(baum baum) {
        a(new bbba(this, baum));
    }

    public final void b(bavx bavx, baum baum) {
        a(new bbaz(this, bavx, baum));
    }

    public final void a(bavx bavx, int i, baum baum) {
        a(new bbbc(this, bavx, i, baum));
    }
}
