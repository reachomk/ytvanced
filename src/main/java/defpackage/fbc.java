package defpackage;

/* renamed from: fbc */
final class fbc extends fdo {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public aybc d;
    public ayao e;
    public axzw f;
    public ayaa g;
    public CharSequence h;
    public apxu i;
    private Integer j;
    private feb k;
    private Integer l;
    private String m;
    private int n;
    private int o;

    fbc() {
    }

    /* Access modifiers changed, original: final */
    public final fdo a(int i) {
        this.j = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fdo a(feb feb) {
        this.k = feb;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fdo b(int i) {
        this.l = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fdo a(String str) {
        this.m = str;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fdl a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" rateLimited");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" shownOnFullscreen");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" counterfactual");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" surveyType");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" surveySupportedRenderers");
        }
        if (this.n == 0) {
            str = String.valueOf(str).concat(" displayTime");
        }
        if (this.o == 0) {
            str = String.valueOf(str).concat(" displayStart");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" displayDelaySec");
        }
        if (str.isEmpty()) {
            return new fba(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.j.intValue(), this.d, this.e, this.f, this.g, this.k, this.h, this.n, this.o, this.l.intValue(), this.i, this.m);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ fbc(fdl fdl) {
        fba fba = (fba) fdl;
        this.a = Boolean.valueOf(fba.a);
        this.b = Boolean.valueOf(fba.b);
        this.c = Boolean.valueOf(fba.c);
        this.j = Integer.valueOf(fba.d);
        this.d = fba.e;
        this.e = fba.f;
        this.f = fba.g;
        this.g = fba.h;
        this.k = fba.i;
        this.h = fba.j;
        this.n = fba.n;
        this.o = fba.o;
        this.l = Integer.valueOf(fba.k);
        this.i = fba.l;
        this.m = fba.m;
    }

    /* Access modifiers changed, original: final */
    public final fdo c(int i) {
        if (i != 0) {
            this.n = i;
            return this;
        }
        throw new NullPointerException("Null displayTime");
    }

    /* Access modifiers changed, original: final */
    public final fdo d(int i) {
        if (i != 0) {
            this.o = i;
            return this;
        }
        throw new NullPointerException("Null displayStart");
    }
}
