package defpackage;

/* renamed from: aebn */
final class aebn extends aebt {
    private CharSequence a;
    private CharSequence b;
    private Integer c;
    private Integer d;
    private aygk e;

    aebn() {
    }

    public final aebt a(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final aebt b(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final aebt a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final aebt b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final aebt a(aygk aygk) {
        this.e = aygk;
        return this;
    }

    public final aebu a() {
        String str = "";
        if (this.c == null) {
            str = str.concat(" adProgressMillis");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" skippableState");
        }
        if (str.isEmpty()) {
            return new aebo(this.a, this.b, this.c.intValue(), this.d.intValue(), this.e);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ aebn(aebu aebu) {
        aebo aebo = (aebo) aebu;
        this.a = aebo.a;
        this.b = aebo.b;
        this.c = Integer.valueOf(aebo.c);
        this.d = Integer.valueOf(aebo.d);
        this.e = aebo.e;
    }
}
