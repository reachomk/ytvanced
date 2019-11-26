package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

@Deprecated
/* renamed from: cb */
public final class cb {
    @Deprecated
    public final int a;
    @Deprecated
    private final Set b;
    @Deprecated
    private final boolean c;

    static cb a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else if (str.startsWith("decimal")) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        }
        boolean z = true;
        Object obj = null;
        for (String str2 : bt.b.split(str.substring(7).trim())) {
            String str3;
            if (str2.equals("…") || str2.equals("...")) {
                z = false;
                obj = 1;
            } else if (obj != null) {
                str3 = "Can only have … at the end of samples: ";
                throw new IllegalArgumentException(str2.length() == 0 ? new String(str3) : str3.concat(str2));
            } else {
                String[] split = bt.c.split(str2);
                int length = split.length;
                bz bzVar;
                if (length == 1) {
                    bzVar = new bz(split[0]);
                    cb.a(i, bzVar);
                    linkedHashSet.add(new cc(bzVar, bzVar));
                } else if (length != 2) {
                    str3 = "Ill-formed number range: ";
                    throw new IllegalArgumentException(str2.length() == 0 ? new String(str3) : str3.concat(str2));
                } else {
                    bzVar = new bz(split[0]);
                    bz bzVar2 = new bz(split[1]);
                    cb.a(i, bzVar);
                    cb.a(i, bzVar2);
                    linkedHashSet.add(new cc(bzVar, bzVar2));
                }
            }
        }
        return new cb(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    @Deprecated
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("@");
        int i = this.a;
        Object obj = 1;
        String str = i != 1 ? i != 2 ? "null" : "DECIMAL" : "INTEGER";
        if (i != 0) {
            stringBuilder.append(str.toLowerCase(Locale.ENGLISH));
            for (cc ccVar : this.b) {
                if (obj == null) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(' ');
                stringBuilder.append(ccVar);
                obj = null;
            }
            if (!this.c) {
                stringBuilder.append(", …");
            }
            return stringBuilder.toString();
        }
        throw null;
    }

    private cb(int i, Set set, boolean z) {
        this.a = i;
        this.b = set;
        this.c = z;
    }

    private static void a(int i, bz bzVar) {
        Object obj = null;
        Object obj2 = i != 1 ? null : 1;
        if (bzVar.b == 0) {
            obj = 1;
        }
        if (obj2 != obj) {
            String valueOf = String.valueOf(bzVar);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 25);
            stringBuilder.append("Ill-formed number range: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
