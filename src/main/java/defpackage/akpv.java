package defpackage;

/* renamed from: akpv */
final class akpv extends akrc {
    private akot a;
    private Long b;
    private Runnable c;
    private Runnable d;

    akpv() {
    }

    public final akrc a(akot akot) {
        if (akot != null) {
            this.a = akot;
            return this;
        }
        throw new NullPointerException("Null presenter");
    }

    public final akrc a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final akrc a(Runnable runnable) {
        if (runnable != null) {
            this.c = runnable;
            return this;
        }
        throw new NullPointerException("Null onStart");
    }

    public final akrc b(Runnable runnable) {
        if (runnable != null) {
            this.d = runnable;
            return this;
        }
        throw new NullPointerException("Null onEnd");
    }

    public final akrd a() {
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
        if (str.isEmpty()) {
            return new akps(this.a, this.b.longValue(), this.c, this.d);
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
