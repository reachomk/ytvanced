package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aahw */
final class aahw extends xto {
    aahw(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) aahv.av.get());
        hashSet.addAll(aahv.d());
        return Collections.unmodifiableSet(hashSet);
    }
}
