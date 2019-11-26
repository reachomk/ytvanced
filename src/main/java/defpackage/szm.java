package defpackage;

/* renamed from: szm */
final class szm extends szu {
    private String a;
    private Long b;
    private Long c;
    private Long d;
    private Integer e;
    private szt f;

    szm() {
    }

    public final szu a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw new NullPointerException("Null name");
    }

    public final szu a(Long l) {
        this.b = l;
        return this;
    }

    public final szu b(Long l) {
        this.c = l;
        return this;
    }

    public final szu c(Long l) {
        this.d = l;
        return this;
    }

    public final szu a(Integer num) {
        this.e = num;
        return this;
    }

    public final szu a(szt szt) {
        this.f = szt;
        return this;
    }

    public final szr a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" name");
        }
        if (str.isEmpty()) {
            return new szj(this.a, this.b, this.c, this.d, this.e, this.f);
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
