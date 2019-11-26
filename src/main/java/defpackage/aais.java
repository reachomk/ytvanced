package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aais */
final class aais extends xto {
    aais(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.b());
        hashSet.addAll((Set) aahv.au.get());
        return Collections.unmodifiableSet(hashSet);
    }
}
