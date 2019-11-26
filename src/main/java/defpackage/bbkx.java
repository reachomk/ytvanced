package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: bbkx */
public final class bbkx {
    public static final List a;
    public static final bbkx b = bbla.OK.a();
    public static final bbkx c = bbla.CANCELLED.a();
    public static final bbkx d = bbla.UNKNOWN.a();
    public static final bbkx e = bbla.INVALID_ARGUMENT.a();
    public static final bbkx f = bbla.DEADLINE_EXCEEDED.a();
    public static final bbkx g = bbla.NOT_FOUND.a();
    public static final bbkx h = bbla.ALREADY_EXISTS.a();
    public static final bbkx i = bbla.PERMISSION_DENIED.a();
    public static final bbkx j = bbla.UNAUTHENTICATED.a();
    public static final bbkx k = bbla.RESOURCE_EXHAUSTED.a();
    public static final bbkx l = bbla.FAILED_PRECONDITION.a();
    public static final bbkx m = bbla.ABORTED.a();
    public static final bbkx n = bbla.OUT_OF_RANGE.a();
    public static final bbkx o = bbla.UNIMPLEMENTED.a();
    public static final bbkx p = bbla.INTERNAL.a();
    public static final bbkx q = bbla.UNAVAILABLE.a();
    public static final bbkx r = bbla.DATA_LOSS.a();
    public final bbla s;
    public final String t;

    public bbkx(bbla bbla, String str) {
        this.s = (bbla) bbit.a((Object) bbla, (Object) "canonicalCode");
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbkx) {
            bbkx bbkx = (bbkx) obj;
            return this.s == bbkx.s && bbit.b(this.t, bbkx.t);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, this.t});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.s);
        String str = this.t;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 36) + String.valueOf(str).length());
        stringBuilder.append("Status{canonicalCode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", description=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static {
        TreeMap treeMap = new TreeMap();
        bbla[] values = bbla.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            bbla bbla = values[i];
            bbkx bbkx = (bbkx) treeMap.put(Integer.valueOf(bbla.r), new bbkx(bbla, null));
            if (bbkx == null) {
                i++;
            } else {
                String name = bbkx.s.name();
                String name2 = bbla.name();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 34) + String.valueOf(name2).length());
                stringBuilder.append("Code value duplication between ");
                stringBuilder.append(name);
                stringBuilder.append(" & ");
                stringBuilder.append(name2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }
}
