package defpackage;

/* renamed from: fad */
final class fad extends fac {
    private ezo a;
    private ezo b;
    private Integer c;
    private ezo d;
    private Integer e;
    private ezo f;
    private ezo g;
    private ezo h;
    private Integer i;

    fad() {
    }

    public final fac a(ezo ezo) {
        if (ezo != null) {
            this.a = ezo;
            return this;
        }
        throw new NullPointerException("Null backgroundColor");
    }

    public final fac b(ezo ezo) {
        if (ezo != null) {
            this.b = ezo;
            return this;
        }
        throw new NullPointerException("Null statusBarColor");
    }

    public final fac a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final fac c(ezo ezo) {
        if (ezo != null) {
            this.d = ezo;
            return this;
        }
        throw new NullPointerException("Null primaryTextColor");
    }

    public final fac b(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final fac d(ezo ezo) {
        if (ezo != null) {
            this.f = ezo;
            return this;
        }
        throw new NullPointerException("Null secondaryTextColor");
    }

    public final fac e(ezo ezo) {
        if (ezo != null) {
            this.g = ezo;
            return this;
        }
        throw new NullPointerException("Null iconTintColor");
    }

    public final fac f(ezo ezo) {
        if (ezo != null) {
            this.h = ezo;
            return this;
        }
        throw new NullPointerException("Null indicatorColor");
    }

    public final fac c(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public final faa a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" backgroundColor");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" statusBarColor");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" primaryTextStyleResId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" primaryTextColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" secondaryTextStyleResId");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" secondaryTextColor");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" iconTintColor");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" indicatorColor");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" paddingStyle");
        }
        if (str.isEmpty()) {
            return new fae(this.a, this.b, this.c.intValue(), this.d, this.e.intValue(), this.f, this.g, this.h, this.i.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ fad(faa faa) {
        fae fae = (fae) faa;
        this.a = fae.a;
        this.b = fae.b;
        this.c = Integer.valueOf(fae.c);
        this.d = fae.d;
        this.e = Integer.valueOf(fae.e);
        this.f = fae.f;
        this.g = fae.g;
        this.h = fae.h;
        this.i = Integer.valueOf(fae.i);
    }
}
