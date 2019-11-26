package defpackage;

/* renamed from: vxn */
final class vxn extends vxf {
    private Boolean a;
    private Boolean b;
    private Integer c;
    private Integer d;
    private Integer e;
    private vyg f;
    private vye g;
    private vxe h;
    private vyc i;
    private vxi j;
    private vxg k;
    private vya l;

    vxn() {
    }

    public final vxf a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final boolean a() {
        Boolean bool = this.a;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Property \"adOverlayShown\" has not been set");
    }

    public final vxf b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final vxf a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final vxf b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final vxf c(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final vxf a(vyg vyg) {
        if (vyg != null) {
            this.f = vyg;
            return this;
        }
        throw new NullPointerException("Null skipButtonState");
    }

    public final vyg b() {
        vyg vyg = this.f;
        if (vyg != null) {
            return vyg;
        }
        throw new IllegalStateException("Property \"skipButtonState\" has not been set");
    }

    public final vxf a(vye vye) {
        if (vye != null) {
            this.g = vye;
            return this;
        }
        throw new NullPointerException("Null mdxAdOverlayState");
    }

    public final vye c() {
        vye vye = this.g;
        if (vye != null) {
            return vye;
        }
        throw new IllegalStateException("Property \"mdxAdOverlayState\" has not been set");
    }

    public final vxf a(vxe vxe) {
        if (vxe != null) {
            this.h = vxe;
            return this;
        }
        throw new NullPointerException("Null adProgressTextState");
    }

    public final vxe d() {
        vxe vxe = this.h;
        if (vxe != null) {
            return vxe;
        }
        throw new IllegalStateException("Property \"adProgressTextState\" has not been set");
    }

    public final vxf a(vyc vyc) {
        if (vyc != null) {
            this.i = vyc;
            return this;
        }
        throw new NullPointerException("Null learnMoreOverlayState");
    }

    public final vyc e() {
        vyc vyc = this.i;
        if (vyc != null) {
            return vyc;
        }
        throw new IllegalStateException("Property \"learnMoreOverlayState\" has not been set");
    }

    public final vxf a(vxi vxi) {
        if (vxi != null) {
            this.j = vxi;
            return this;
        }
        throw new NullPointerException("Null adTitleOverlayState");
    }

    public final vxi f() {
        vxi vxi = this.j;
        if (vxi != null) {
            return vxi;
        }
        throw new IllegalStateException("Property \"adTitleOverlayState\" has not been set");
    }

    public final vxf a(vxg vxg) {
        if (vxg != null) {
            this.k = vxg;
            return this;
        }
        throw new NullPointerException("Null adReEngagementState");
    }

    public final vxg g() {
        vxg vxg = this.k;
        if (vxg != null) {
            return vxg;
        }
        throw new IllegalStateException("Property \"adReEngagementState\" has not been set");
    }

    public final vxf a(vya vya) {
        if (vya != null) {
            this.l = vya;
            return this;
        }
        throw new NullPointerException("Null brandInteractionState");
    }

    public final vya h() {
        vya vya = this.l;
        if (vya != null) {
            return vya;
        }
        throw new IllegalStateException("Property \"brandInteractionState\" has not been set");
    }

    public final vxc i() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" adOverlayShown");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" overflowMenuShown");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" currentPositionMillis");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" bufferedPositionMillis");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" durationMillis");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" skipButtonState");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" mdxAdOverlayState");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" adProgressTextState");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" learnMoreOverlayState");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" adTitleOverlayState");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" adReEngagementState");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" brandInteractionState");
        }
        if (str.isEmpty()) {
            return new vxk(this.a.booleanValue(), this.b.booleanValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
