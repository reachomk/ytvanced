package defpackage;

/* renamed from: vxr */
final class vxr extends vxj {
    private aphg a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;

    vxr() {
    }

    public final vxj a(aphg aphg) {
        if (aphg != null) {
            this.a = aphg;
            return this;
        }
        throw new NullPointerException("Null renderer");
    }

    public final vxj a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final vxj b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final vxj c(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final vxj d(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final vxg a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" renderer");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" enabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" fullscreen");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" annotationEnabled");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" appPromoEnabled");
        }
        if (str.isEmpty()) {
            return new vxo(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
