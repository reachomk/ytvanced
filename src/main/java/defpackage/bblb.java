package defpackage;

/* renamed from: bblb */
public final class bblb implements Comparable {
    public static final bblb a = new bblb();

    private bblb() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final int hashCode() {
        return 961;
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof bblb);
    }

    public final String toString() {
        char[] cArr = new char[32];
        bbkm.a(cArr, 0);
        bbkm.a(cArr, 16);
        String str = new String(cArr);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 17);
        stringBuilder.append("TraceId{traceId=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
