package defpackage;

/* renamed from: xfl */
final class xfl extends xhc {
    private final String a;
    private final String b;
    private final xgy c;
    private final xhb d;
    private final int e;
    private final Integer f;
    private final Integer g;

    xfl(String str, String str2, xgy xgy, xhb xhb, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (xgy != null) {
                    this.c = xgy;
                    this.d = xhb;
                    this.e = i;
                    this.f = null;
                    this.g = null;
                    return;
                }
                throw new NullPointerException("Null headers");
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null method");
    }

    public final Integer f() {
        return null;
    }

    public final Integer g() {
        return null;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final xgy c() {
        return this.c;
    }

    public final xhb d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int i = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        String str3 = "null";
        StringBuilder stringBuilder = new StringBuilder((((((length + 103) + length2) + length3) + length4) + str3.length()) + str3.length());
        stringBuilder.append("HttpRequest{method=");
        stringBuilder.append(str);
        stringBuilder.append(", url=");
        stringBuilder.append(str2);
        stringBuilder.append(", headers=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", body=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", priority=");
        stringBuilder.append(i);
        stringBuilder.append(", readTimeoutMs=");
        stringBuilder.append(str3);
        stringBuilder.append(", connectionTimeoutMs=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhc) {
            xhc xhc = (xhc) obj;
            if (this.a.equals(xhc.a()) && this.b.equals(xhc.b()) && this.c.equals(xhc.c())) {
                xhb xhb = this.d;
                if (xhb == null ? xhc.d() == null : xhb.equals(xhc.d())) {
                    return this.e == xhc.e() && xhc.f() == null && xhc.g() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        xhb xhb = this.d;
        return (((hashCode ^ (xhb != null ? xhb.hashCode() : 0)) * 1000003) ^ this.e) * -721379959;
    }
}
