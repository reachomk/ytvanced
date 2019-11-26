package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: txl */
final class txl implements tto, tzr {
    public final List a = new ArrayList();
    public boolean b;
    private final tty c;

    txl(tty tty) {
        this.c = tty;
        tty.a((ttp) this);
    }

    public final void a() {
        this.c.b(this);
    }

    public final void b() {
        synchronized (this) {
            this.b = true;
        }
        this.c.b(this);
        for (tzh f : this.a) {
            f.f();
        }
    }
}
