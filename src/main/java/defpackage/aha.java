package defpackage;

import java.util.Comparator;

/* renamed from: aha */
final class aha implements Comparator {
    aha() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ahh ahh = (ahh) obj;
        ahh ahh2 = (ahh) obj2;
        int i = ahh.a - ahh2.a;
        return i == 0 ? ahh.b - ahh2.b : i;
    }
}
