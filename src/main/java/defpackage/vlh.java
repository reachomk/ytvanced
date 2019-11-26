package defpackage;

import java.util.HashSet;

/* renamed from: vlh */
final /* synthetic */ class vlh implements bcvk {
    private final vle a;

    vlh(vle vle) {
        this.a = vle;
    }

    public final void a(Object obj) {
        vle vle = this.a;
        HashSet<vll> hashSet = new HashSet();
        hashSet.addAll(vle.c.values());
        for (vll vll : hashSet) {
            ((vlx) vle.b.get()).a(vll.a);
        }
    }
}
