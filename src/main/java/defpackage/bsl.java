package defpackage;

/* renamed from: bsl */
public final class bsl {
    public static final bsn a = new bso();
    public final Object b;
    public final bsn c;
    public final String d;
    public volatile byte[] e;

    public static bsl a(String str, Object obj) {
        return new bsl(str, obj, a);
    }

    public static bsl a(String str, Object obj, bsn bsn) {
        return new bsl(str, obj, bsn);
    }

    public bsl(String str, Object obj, bsn bsn) {
        this.d = chw.a(str);
        this.b = obj;
        this.c = (bsn) chw.a((Object) bsn);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bsl)) {
            return false;
        }
        return this.d.equals(((bsl) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
        stringBuilder.append("Option{key='");
        stringBuilder.append(str);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}
