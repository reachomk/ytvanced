package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aahx */
final class aahx extends xto {
    aahx(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet(aahv.f());
        hashSet.addAll(aahv.g());
        hashSet.add(Integer.valueOf(aahv.y));
        hashSet.add(Integer.valueOf(aahv.x));
        hashSet.add(Integer.valueOf(aahv.u));
        hashSet.add(Integer.valueOf(aahv.v));
        hashSet.add(Integer.valueOf(aahv.w));
        return Collections.unmodifiableSet(hashSet);
    }
}
