package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dsd */
public final class dsd implements upt {
    private static final Set a;

    public final Set a() {
        return a;
    }

    static {
        HashSet hashSet = new HashSet(uzn.a);
        hashSet.add("https://www.googleapis.com/auth/accounts.reauth");
        hashSet.add("https://www.googleapis.com/auth/assistant-sdk-prototype");
        a = Collections.unmodifiableSet(hashSet);
    }
}
