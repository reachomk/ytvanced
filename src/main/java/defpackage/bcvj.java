package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bcvj */
final class bcvj {
    public static final Set a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Boolean.class);
        hashSet.add(Character.class);
        hashSet.add(Byte.class);
        hashSet.add(Short.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        a = hashSet;
    }
}
