package defpackage;

/* renamed from: iqa */
final class iqa extends ish {
    private Boolean a;
    private String b;
    private abhw c;
    private apxu d;
    private atgy e;
    private atgl f;

    iqa() {
    }

    public final ish a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final ish a(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        throw new NullPointerException("Null query");
    }

    public final ish a(abhw abhw) {
        if (abhw != null) {
            this.c = abhw;
            return this;
        }
        throw new NullPointerException("Null searchService");
    }

    public final ish a(apxu apxu) {
        this.d = apxu;
        return this;
    }

    public final ish a(atgy atgy) {
        this.e = atgy;
        return this;
    }

    public final ish a(atgl atgl) {
        this.f = atgl;
        return this;
    }

    public final ise a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" isPrefetch");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" query");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" searchService");
        }
        if (str.isEmpty()) {
            return new iqb(this.a.booleanValue(), this.b, this.c, this.d, this.e, this.f);
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
