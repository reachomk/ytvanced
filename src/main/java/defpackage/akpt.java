package defpackage;

/* renamed from: akpt */
final class akpt extends akrb {
    private akot a;
    private Long b;
    private Runnable c;
    private Runnable d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    akpt() {
    }

    public final akrb a(akot akot) {
        if (akot != null) {
            this.a = akot;
            return this;
        }
        throw new NullPointerException("Null presenter");
    }

    public final akrb a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final akrb a(Runnable runnable) {
        if (runnable != null) {
            this.c = runnable;
            return this;
        }
        throw new NullPointerException("Null onStart");
    }

    public final akrb b(Runnable runnable) {
        if (runnable != null) {
            this.d = runnable;
            return this;
        }
        throw new NullPointerException("Null onEnd");
    }

    public final akrb a(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final akrb b(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final akrb c(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final akrb d(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final akqy a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" presenter");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" duration");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" onStart");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" onEnd");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" fromX");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" fromY");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" toX");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" toY");
        }
        if (str.isEmpty()) {
            return new akpq(this.a, this.b.longValue(), this.c, this.d, this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
