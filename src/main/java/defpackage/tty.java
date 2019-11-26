package defpackage;

import android.app.Application;

/* renamed from: tty */
public final class tty {
    public static volatile tty a;
    public final tub b = new tub();

    public static tty a(Application application) {
        if (a == null) {
            synchronized (tty.class) {
                if (a == null) {
                    tty tty = new tty();
                    tty.b.a(application);
                    a = tty;
                }
            }
        }
        return a;
    }

    private tty() {
    }

    public final void a(ttp ttp) {
        this.b.a(ttp);
    }

    public final void b(ttp ttp) {
        this.b.b(ttp);
    }
}
