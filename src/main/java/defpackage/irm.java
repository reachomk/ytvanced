package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: irm */
final class irm implements anjg {
    private final /* synthetic */ iqu a;

    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            xtl.b("Error fetching cached zero-prefix search suggestions", th.toString());
        }
    }

    /* synthetic */ irm(iqu iqu) {
        this.a = iqu;
    }
}
