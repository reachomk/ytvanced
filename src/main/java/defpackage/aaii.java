package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aaii */
final class aaii extends xto {
    aaii(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.i());
        hashSet.addAll((Set) aahv.ax.get());
        return Collections.unmodifiableSet(hashSet);
    }
}
