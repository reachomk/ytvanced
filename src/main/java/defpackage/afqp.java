package defpackage;

import java.util.Locale;

/* renamed from: afqp */
final /* synthetic */ class afqp implements Runnable {
    private final afqk a;
    private final nkf b;

    afqp(afqk afqk, nkf nkf) {
        this.a = afqk;
        this.b = nkf;
    }

    public final void run() {
        afqk afqk = this.a;
        nkf nkf = this.b;
        afqk.a.a();
        try {
            String.format(Locale.US, "Requeue request with %d errors to %s", new Object[]{Integer.valueOf(nkf.b()), ((nkg) nkf.instance).d});
            afqk.a.a(nkf.a(), (nkg) ((anxl) nkf.build()));
            afqk.a.c();
        } finally {
            afqk.a.b();
        }
    }
}
