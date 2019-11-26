package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: irp */
final class irp implements anjg {
    private final /* synthetic */ iqu a;

    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            xtl.b("Error fetching search suggestions", th.toString());
        }
    }

    /* synthetic */ irp(iqu iqu) {
        this.a = iqu;
    }
}
