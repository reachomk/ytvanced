package defpackage;

/* renamed from: agog */
public final class agog implements agmm {
    private final agmh a;
    private final agmo b;
    private agof c;

    public agog(agmo agmo, agmh agmh) {
        this.b = agmo;
        this.a = agmh;
    }

    public final boolean a() {
        agno agno = new agno(this.a.a());
        this.c = new agof(agoq.a(agno.a, agno.e, agno.d), new agop(this.b));
        return true;
    }

    public final amul b() {
        agof agof = this.c;
        if (agof != null) {
            return agos.a(agof.a);
        }
        throw new IllegalStateException("Yt4File is not open!");
    }

    public final void close() {
        try {
            agof agof = this.c;
            if (agof != null) {
                agof.b.close();
            }
            this.c = null;
        } catch (Throwable th) {
            this.c = null;
        }
    }
}
