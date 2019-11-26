package defpackage;

import java.util.List;

/* renamed from: neh */
final class neh implements Runnable {
    private final /* synthetic */ List a;
    private final /* synthetic */ nei b;

    neh(nei nei, List list) {
        this.b = nei;
        this.a = list;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
