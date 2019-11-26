package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aacf */
final /* synthetic */ class aacf implements Callable {
    private final aacc a;
    private final int b;

    aacf(aacc aacc, int i) {
        this.a = aacc;
        this.b = i;
    }

    public final Object call() {
        aacc aacc = this.a;
        int i = this.b;
        String.format("[ENTITY] About to put entity %s(%s)", new Object[]{aacc.a.getClass().getSimpleName(), aacc.a.a()});
        aabt aabt = (aabt) aacc.b.a.remove(aacc.a.a());
        if (aabt == null) {
            aabt = aabt.a;
        }
        aadq aadq = aabt.b;
        aadu aadu = aabt.c;
        boolean equals = aacc.a.equals(aadq);
        long a = aacc.b.a(i);
        if ((equals ^ 1) != 0) {
            aadq a2;
            if (aadq != null) {
                aabe aabe = aacc.b.e;
                aadq aadq2 = aacc.a;
                aacn aacn = (aacn) aabe.b.get(aadq2.getClass());
                a2 = aacn != null ? aacn.a(aadq, aadq2, aabe) : aadq2;
            } else {
                a2 = aacc.a;
            }
            aacc.b.a(a2.a(), a2, aadu, a);
            return aadz.f().a(a2.a()).a(aadq).b(a2).b(aadu).d();
        }
        aacc.b.a(aacc.a.a(), aacc.a, aadu, a);
        return null;
    }
}
