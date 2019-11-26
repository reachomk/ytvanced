package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aail */
final class aail extends xto {
    aail(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.m());
        hashSet.addAll(aahv.l());
        hashSet.addAll(aahv.j());
        return Collections.unmodifiableSet(hashSet);
    }
}
