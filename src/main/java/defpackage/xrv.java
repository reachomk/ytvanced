package defpackage;

/* renamed from: xrv */
public final class xrv extends xtv {
    private final String a;
    private final int b = 2;

    public xrv(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
        stringBuilder.append("Permission{name=");
        stringBuilder.append(str);
        stringBuilder.append(", protectionLevel=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xtv) {
            xtv xtv = (xtv) obj;
            return this.a.equals(xtv.a()) && this.b == xtv.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
