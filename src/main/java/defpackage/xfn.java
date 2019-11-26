package defpackage;

/* renamed from: xfn */
public final class xfn extends xho {
    private final String a;
    private final int b;
    private final String c;
    private final xgy d;
    private final xhn e;

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final xgy d() {
        return this.d;
    }

    public final xhn e() {
        return this.e;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 79) + length2) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("HttpResponse{protocol=");
        stringBuilder.append(str);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(i);
        stringBuilder.append(", reasonPhrase=");
        stringBuilder.append(str2);
        stringBuilder.append(", headers=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", body=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xho) {
            xho xho = (xho) obj;
            if (this.a.equals(xho.a()) && this.b == xho.b() && this.c.equals(xho.c()) && this.d.equals(xho.d())) {
                xhn xhn = this.e;
                if (xhn == null ? xho.e() == null : xhn.equals(xho.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        xhn xhn = this.e;
        return hashCode ^ (xhn != null ? xhn.hashCode() : 0);
    }

    public /* synthetic */ xfn(String str, int i, String str2, xgy xgy, xhn xhn) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = xgy;
        this.e = xhn;
    }
}
