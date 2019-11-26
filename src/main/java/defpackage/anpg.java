package defpackage;

import android.util.Pair;

/* renamed from: anpg */
final /* synthetic */ class anpg implements ryc {
    private final anpd a;
    private final Pair b;

    anpg(anpd anpd, Pair pair) {
        this.a = anpd;
        this.b = pair;
    }

    public final Object a(ryi ryi) {
        anpd anpd = this.a;
        Pair pair = this.b;
        synchronized (anpd) {
            anpd.a.remove(pair);
        }
        return ryi;
    }
}
