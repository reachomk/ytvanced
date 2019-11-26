package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaiu */
final class aaiu extends xto {
    aaiu(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.a());
        hashSet.addAll(aahv.b());
        hashSet.addAll(aahv.c());
        return Collections.unmodifiableSet(hashSet);
    }
}
