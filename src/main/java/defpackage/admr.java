package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: admr */
final /* synthetic */ class admr implements Runnable {
    private final adms a;
    private final adpy b;
    private final aagr c;

    admr(adms adms, adpy adpy, aagr aagr) {
        this.a = adms;
        this.b = adpy;
        this.c = aagr;
    }

    public final void run() {
        adms adms = this.a;
        adpy adpy = this.b;
        aagr aagr = this.c;
        try {
            adms.m = adms.f.B() != null ? (aakj) adms.f.B().get() : null;
        } catch (ExecutionException unused) {
            adms.m = null;
        }
        adms.e.post(new admu(adms, adpy, aagr));
    }
}
