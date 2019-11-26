package defpackage;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: adon */
final class adon implements Comparator {
    private final /* synthetic */ adoj a;

    adon(adoj adoj) {
        this.a = adoj;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((adog) this.a.c.get(((Pair) obj2).first)).b - ((adog) this.a.c.get(((Pair) obj).first)).b;
    }
}
