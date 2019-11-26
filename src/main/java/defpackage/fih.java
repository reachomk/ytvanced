package defpackage;

/* renamed from: fih */
final class fih extends fjb {
    public fiw a;
    private Integer b;
    private Boolean c;
    private fje d;

    fih() {
    }

    public final fjb a(fiw fiw) {
        this.a = fiw;
        return this;
    }

    public final fjb a(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final fjb a(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fjb a(fje fje) {
        if (fje != null) {
            this.d = fje;
            return this;
        }
        throw new NullPointerException("Null predictor");
    }

    public final fjc a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" navigationType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" clearHistory");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" predictor");
        }
        if (str.isEmpty()) {
            return new fii(this.a, this.b.intValue(), this.c.booleanValue(), this.d);
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
