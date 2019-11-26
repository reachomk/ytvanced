package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akdk */
public abstract class akdk implements akxt {
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private final afpi a;
    private final swm b;

    public akdk(Executor executor, afpi afpi, swm swm) {
        this.b = swm;
        this.a = afpi;
        if (c.compareAndSet(false, true)) {
            executor.execute(akdj.a);
            executor.execute(akdm.a);
        }
    }

    public abstract arbs a(Object obj);

    public final boolean b() {
        return false;
    }

    public final amqv a() {
        return new akdl(this);
    }

    public final byte[] a(arbs arbs) {
        try {
            for (arbg arbg : arbs.c) {
                if ((arbg.a & 2) != 0) {
                    anvf anvf = arbg.c;
                    if (anvf == null) {
                        anvf = arbi.a;
                    }
                    anwf a = anwf.a(anvf.toByteArray());
                    if (!a.u()) {
                        a.a();
                        this.b.a(arbg.b, a.m());
                    }
                }
            }
        } catch (IOException e) {
            this.a.a(2, afpf.elements, "Failed to parse ElementData", e);
        }
        try {
            anwf a2 = anwf.a(arbs.toByteArray());
            while (!a2.u()) {
                int a3 = a2.a();
                if (aobj.b(a3) == 172660663) {
                    return a2.m();
                }
                a2.b(a3);
            }
            return null;
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to parse ElementRenderer", e2);
        }
    }

    public final swo b(arbs arbs) {
        return akda.a(arbs, new akdo(this));
    }

    public final void a(Object obj, akxs akxs) {
        arbs a = a(obj);
        if ((a.a & 1) == 0) {
            akxs.a(akda.a(a, new akdn(this)));
            return;
        }
        throw new UnsupportedOperationException("Old Elements runtime is no longer supported");
    }
}
