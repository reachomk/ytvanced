package defpackage;

/* renamed from: xfk */
final class xfk implements xgs {
    public Boolean a;
    private Integer b;
    private Integer c;
    private Boolean d;

    xfk() {
    }

    public final xgs a(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final xgs b(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final xgs a(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final xgp a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" connectionTimeoutMs");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" readTimeoutMs");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" installSecureRequestEnforcer");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" followRedirects");
        }
        if (str.isEmpty()) {
            return new xfh(this.b.intValue(), this.c.intValue(), this.d.booleanValue(), this.a.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
