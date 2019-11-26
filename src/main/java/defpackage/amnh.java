package defpackage;

import java.util.concurrent.Future;

/* renamed from: amnh */
final /* synthetic */ class amnh implements Runnable {
    private final amni a;
    private final anko b;
    private final amnl c;

    amnh(amni amni, anko anko, amnl amnl) {
        this.a = amni;
        this.b = anko;
        this.c = amnl;
    }

    public final void run() {
        amni amni = this.a;
        anjv anjv = this.b;
        amnl amnl = this.c;
        try {
            anjv = anjf.a((Future) anjv);
            amni.d.a_(anjv);
            amnl.a(amni.d);
        } catch (Throwable unused) {
            amnl.a(anjv);
        }
    }
}
