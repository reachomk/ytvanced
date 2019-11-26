package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdbj */
final class bdbj extends AtomicBoolean implements bcuo {
    public static final long serialVersionUID = 247232374289553518L;
    private final bdbe a;
    private final bdco b;

    public bdbj(bdbe bdbe, bdco bdco) {
        this.a = bdbe;
        this.b = bdco;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void b() {
        if (compareAndSet(false, true)) {
            bdco bdco = this.b;
            bdbe bdbe = this.a;
            if (!bdco.b) {
                synchronized (bdco) {
                    List list = bdco.a;
                    if (!bdco.b) {
                        if (list != null) {
                            boolean remove = list.remove(bdbe);
                            if (remove) {
                                bdbe.b();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
