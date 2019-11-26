package defpackage;

import java.util.List;

/* renamed from: nfi */
final class nfi implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ List b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ nfe d;

    nfi(nfe nfe, String str, List list, boolean z) {
        this.d = nfe;
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
