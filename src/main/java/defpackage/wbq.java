package defpackage;

import java.util.Comparator;

/* renamed from: wbq */
final /* synthetic */ class wbq implements Comparator {
    private final wbo a;

    wbq(wbo wbo) {
        this.a = wbo;
    }

    public final int compare(Object obj, Object obj2) {
        wbo wbo = this.a;
        return ((aagv) obj).a(wbo.b.n()) - ((aagv) obj2).a(wbo.b.n());
    }
}
