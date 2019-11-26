package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdfe */
public final class bdfe {
    private static final AtomicReference d = new AtomicReference();
    private final bcuf a = bdfd.a();
    private final bcuf b = bdfd.b();
    private final bcuf c = bdfd.c();

    private static bdfe c() {
        bdfe bdfe;
        while (true) {
            bdfe = (bdfe) d.get();
            if (bdfe != null) {
                break;
            }
            bdfe = new bdfe();
            if (d.compareAndSet(null, bdfe)) {
                break;
            }
            bdfe.d();
        }
        return bdfe;
    }

    private bdfe() {
        bdey.a.e();
    }

    public static bcuf a() {
        return bdfe.c().a;
    }

    public static bcuf b() {
        return bdfe.c().b;
    }

    public static bcuf a(Executor executor) {
        return new bdav(executor);
    }

    private final synchronized void d() {
        bcuf bcuf = this.a;
        if (bcuf instanceof bdbi) {
            ((bdbi) bcuf).b();
        }
        bcuf = this.b;
        if (bcuf instanceof bdbi) {
            ((bdbi) bcuf).b();
        }
        bcuf = this.c;
        if (bcuf instanceof bdbi) {
            ((bdbi) bcuf).b();
        }
    }
}
