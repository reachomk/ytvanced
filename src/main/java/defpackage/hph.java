package defpackage;

import java.util.Collection;

/* renamed from: hph */
final /* synthetic */ class hph implements Runnable {
    private final wxg a;
    private final Collection b;

    hph(wxg wxg, Collection collection) {
        this.a = wxg;
        this.b = collection;
    }

    public final void run() {
        this.a.a(null, this.b);
    }
}
