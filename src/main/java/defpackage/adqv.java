package defpackage;

/* renamed from: adqv */
final class adqv extends adto {
    private Long a;
    private Long b;
    private String c;
    private adtd d;
    private String e;
    private String f;
    private int g;
    private int h;

    adqv() {
    }

    public final adto a(long j) {
        this.a = Long.valueOf(j);
        return this;
    }

    public final adto b(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final adto a(String str) {
        this.c = str;
        return this;
    }

    public final adto a(adtd adtd) {
        this.d = adtd;
        return this;
    }

    public final adto b(String str) {
        if (str != null) {
            this.e = str;
            return this;
        }
        throw new NullPointerException("Null mediaRouteId");
    }

    public final adto c(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Null screenName");
    }

    public final adtl a() {
        String str = "";
        if (this.g == 0) {
            str = str.concat(" sessionType");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" lastConnectedTimeMs");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" recoveryExpirationTimeMs");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" mediaRouteId");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" screenName");
        }
        if (this.h == 0) {
            str = String.valueOf(str).concat(" disconnectReason");
        }
        if (str.isEmpty()) {
            return new adqw(this.g, this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.h);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final adto a(int i) {
        if (i != 0) {
            this.g = i;
            return this;
        }
        throw new NullPointerException("Null sessionType");
    }

    public final adto b(int i) {
        if (i != 0) {
            this.h = i;
            return this;
        }
        throw new NullPointerException("Null disconnectReason");
    }
}
