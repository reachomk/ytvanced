package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aajc */
final class aajc extends xto {
    aajc(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add("video/3gpp");
        hashSet.add("video/mp4");
        hashSet.add("video/webm");
        return Collections.unmodifiableSet(hashSet);
    }
}
