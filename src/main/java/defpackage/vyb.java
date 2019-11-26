package defpackage;

/* renamed from: vyb */
final class vyb extends vyj {
    private axop a;
    private vzc b;
    private vrd c;
    private Integer d;
    private Boolean e;
    private Float f;
    private Integer g;
    private Integer h;
    private vsm i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Integer o;

    vyb() {
    }

    public final vyj a(axop axop) {
        if (axop != null) {
            this.a = axop;
            return this;
        }
        throw new NullPointerException("Null skipAdRenderer");
    }

    public final vyj a(vzc vzc) {
        if (vzc != null) {
            this.b = vzc;
            return this;
        }
        throw new NullPointerException("Null contentMetadata");
    }

    public final vyj a(vrd vrd) {
        if (vrd != null) {
            this.c = vrd;
            return this;
        }
        throw new NullPointerException("Null adCountMetadata");
    }

    public final vyj a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final vyj a(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final vyj a(float f) {
        this.f = Float.valueOf(f);
        return this;
    }

    public final vyj b(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final vyj c(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final vyj a(vsm vsm) {
        if (vsm != null) {
            this.i = vsm;
            return this;
        }
        throw new NullPointerException("Null breakType");
    }

    public final vyj b(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final vyj c(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final vyj d(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final vyj e(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public final vyj b(float f) {
        this.n = Float.valueOf(f);
        return this;
    }

    public final vyj d(int i) {
        this.o = Integer.valueOf(i);
        return this;
    }

    public final vyg a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" skipAdRenderer");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" contentMetadata");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" adCountMetadata");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" skipState");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" hidden");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" swipeToSkipProgress");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" timeRemainingUntilSkippableMillis");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" timeRemainingInAdMillis");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" breakType");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" DRCtaEnabled");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" fullscreen");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" countdownOnThumbnail");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" countdownNextToThumbnail");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" preskipScalingFactor");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" preskipPadding");
        }
        if (str.isEmpty()) {
            return new vxy(this.a, this.b, this.c, this.d.intValue(), this.e.booleanValue(), this.f.floatValue(), this.g.intValue(), this.h.intValue(), this.i, this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.floatValue(), this.o.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
