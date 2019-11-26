package defpackage;

/* renamed from: akjy */
final class akjy extends akkn {
    public akks a;
    private Boolean b;
    private Boolean c;
    private Integer d;
    private akkp e;
    private akkw f;

    akjy() {
    }

    public final akkn a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final akkn b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final akkn a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final akkn a(akks akks) {
        this.a = akks;
        return this;
    }

    public final akkn a(akkw akkw) {
        this.f = akkw;
        return this;
    }

    public final akko a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" shouldUpdateOnLayoutChange");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" shouldAnimate");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" placeholderResId");
        }
        if (str.isEmpty()) {
            return new akjv(this.b.booleanValue(), this.c.booleanValue(), this.d.intValue(), this.e, this.a, this.f);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ akjy(akko akko) {
        akjv akjv = (akjv) akko;
        this.b = Boolean.valueOf(akjv.a);
        this.c = Boolean.valueOf(akjv.b);
        this.d = Integer.valueOf(akjv.c);
        this.e = akjv.d;
        this.a = akjv.e;
        this.f = akjv.f;
    }
}
