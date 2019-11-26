package defpackage;

import java.util.List;

/* renamed from: ahus */
final class ahus implements Runnable {
    private final /* synthetic */ List a;
    private final /* synthetic */ ahuq b;

    ahus(ahuq ahuq, List list) {
        this.b = ahuq;
        this.a = list;
    }

    public final void run() {
        this.b.k.a(this.a);
    }
}
