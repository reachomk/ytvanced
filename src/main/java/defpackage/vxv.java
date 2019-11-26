package defpackage;

/* renamed from: vxv */
final class vxv extends vyd {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private apfy f;
    private int g;

    vxv() {
    }

    public final vyd a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final vyd b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final vyd c(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final vyd d(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final vyd e(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final vyd a(apfy apfy) {
        if (apfy != null) {
            this.f = apfy;
            return this;
        }
        throw new NullPointerException("Null renderer");
    }

    public final vya a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" hidden");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" enabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" annotationEnabled");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" appPromoEnabled");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" fullscreen");
        }
        if (this.g == 0) {
            str = String.valueOf(str).concat(" activeButton");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" renderer");
        }
        if (str.isEmpty()) {
            return new vxs(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.g, this.f);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    public final vyd a(int i) {
        if (i != 0) {
            this.g = i;
            return this;
        }
        throw new NullPointerException("Null activeButton");
    }
}
