package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aaky */
public abstract class aaky implements aala, xau {
    public final List a = new ArrayList();
    public final Object b = new Object();
    private final bapu c;

    public aaky(bapu bapu) {
        this.c = (bapu) amqw.a((Object) bapu);
    }

    public abstract boolean b(Object obj);

    public final void a(Object obj) {
        if (b(obj)) {
            xav a = ((aalb) this.c.get()).a(obj, this);
            if (a != null) {
                synchronized (this.b) {
                    this.a.add(a);
                }
                a.c();
            }
        }
    }

    public final void a(xav xav) {
        synchronized (this.b) {
            this.a.remove(xav);
        }
    }
}
