package defpackage;

import java.util.Set;

/* renamed from: gjo */
public final /* synthetic */ class gjo implements Runnable {
    private final gjm a;
    private final Set b;

    public gjo(gjm gjm, Set set) {
        this.a = gjm;
        this.b = set;
    }

    public final void run() {
        gjm gjm = this.a;
        gjm.a.a(this.b);
    }
}
