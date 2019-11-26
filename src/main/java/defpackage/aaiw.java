package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaiw */
final class aaiw extends xto {
    aaiw(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.a());
        hashSet.addAll(aahv.d());
        return Collections.unmodifiableSet(hashSet);
    }
}
