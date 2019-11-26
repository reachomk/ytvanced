package defpackage;

/* renamed from: bbky */
public final class bbky implements Comparable {
    public static final bbky a = new bbky();

    private bbky() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof bbky);
    }

    public final String toString() {
        char[] cArr = new char[16];
        bbkm.a(cArr, 0);
        String str = new String(cArr);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 15);
        stringBuilder.append("SpanId{spanId=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
