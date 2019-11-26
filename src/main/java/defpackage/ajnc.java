package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: ajnc */
public final class ajnc implements Serializable, Comparator {
    public static int a(ajna ajna, ajna ajna2) {
        long j = ajna.a;
        long j2 = ajna2.a;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        } else {
            if (ajna.a() != ajna2.a()) {
                return ajna2.a() - ajna.a();
            }
            int i = ajna.c;
            int i2 = i - 1;
            if (i != 0) {
                int i3 = ajna2.c;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                } else if (i2 == i4) {
                    return ajna.b().compareTo(ajna2.b());
                } else {
                    if (i == 0) {
                        throw null;
                    } else if (i3 != 0) {
                        return i2 - i4;
                    } else {
                        throw null;
                    }
                }
            }
            throw null;
        }
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ajnc.a((ajna) obj, (ajna) obj2);
    }
}
