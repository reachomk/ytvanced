package defpackage;

/* renamed from: aats */
public final class aats implements ajth {
    public final ajvp a;
    public azbj b;
    private final ajve c;
    private Object d;

    public aats(ajve ajve) {
        this.c = (ajve) amqw.a((Object) ajve);
        this.a = null;
    }

    public aats(ajvp ajvp) {
        this.c = null;
        this.a = (ajvp) amqw.a((Object) ajvp);
    }

    public final ajts d() {
        if (g() != null) {
            return g();
        }
        return h() != null ? h() : null;
    }

    public final ajtk a() {
        ajve ajve = this.c;
        if (ajve != null) {
            return ajve.c;
        }
        return this.a.a;
    }

    public final byte[] b() {
        ajve ajve = this.c;
        if (ajve != null) {
            return ajve.d;
        }
        return this.a.e;
    }

    public final void a(Object obj) {
        this.d = obj;
    }

    public final Object c() {
        return this.d;
    }

    private final ajts g() {
        ajve ajve = this.c;
        if (ajve != null) {
            ajtr ajtr = ajve.a;
            if (ajtr != null) {
                return ajtr.a;
            }
        }
        return null;
    }

    private final ajts h() {
        ajvp ajvp = this.a;
        if (ajvp != null) {
            ajvs ajvs = ajvp.b;
            if (ajvs != null) {
                akal akal = ajvs.a;
                if (akal != null) {
                    ajtr ajtr = akal.a;
                    if (ajtr != null) {
                        return ajtr.a;
                    }
                }
            }
        }
        return null;
    }

    public final azbj e() {
        ajve ajve = this.c;
        if (ajve != null) {
            azbh azbh = ajve.b;
            if (azbh != null) {
                azbj azbj = azbh.b;
                if (azbj == null) {
                    azbj = azbj.c;
                }
                return azbj;
            }
        }
        return null;
    }

    public final azbj f() {
        ajvp ajvp = this.a;
        if (ajvp != null) {
            ajvs ajvs = ajvp.b;
            if (ajvs != null) {
                akal akal = ajvs.a;
                if (akal != null) {
                    azbh azbh = akal.b;
                    if (!(azbh == null || (azbh.a & 1) == 0)) {
                        azbj azbj = azbh.b;
                        if (azbj == null) {
                            azbj = azbj.c;
                        }
                        return azbj;
                    }
                }
            }
        }
        return null;
    }
}
