package defpackage;

/* renamed from: xfo */
final class xfo extends xhl {
    private final xgp a;
    private final xhk b;

    xfo(xgp xgp, xhk xhk) {
        if (xgp != null) {
            this.a = xgp;
            this.b = xhk;
            return;
        }
        throw new NullPointerException("Null httpClientConfig");
    }

    public final xhh c() {
        return null;
    }

    public final xhm d() {
        return null;
    }

    public final xgp a() {
        return this.a;
    }

    public final xhk b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = "null";
        StringBuilder stringBuilder = new StringBuilder((((length + 87) + length2) + str.length()) + str.length());
        stringBuilder.append("VolleyNetworkConfig{httpClientConfig=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", networkLogger=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", interceptor=");
        stringBuilder.append(str);
        stringBuilder.append(", responseModifier=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhl) {
            xhl xhl = (xhl) obj;
            if (this.a.equals(xhl.a())) {
                xhk xhk = this.b;
                if (xhk == null ? xhl.b() == null : xhk.equals(xhl.b())) {
                    xhl.c();
                    xhl.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        xhk xhk = this.b;
        return (hashCode ^ (xhk != null ? xhk.hashCode() : 0)) * -721379959;
    }
}
