package defpackage;

import java.util.Collection;

/* renamed from: hpg */
final /* synthetic */ class hpg implements Runnable {
    private final wxg a;
    private final Collection b;

    hpg(wxg wxg, Collection collection) {
        this.a = wxg;
        this.b = collection;
    }

    public final void run() {
        this.a.a(null, this.b);
    }
}
