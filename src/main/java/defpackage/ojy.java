package defpackage;

/* renamed from: ojy */
public final class ojy implements ojx {
    private ozo a;
    private ofy b;
    private boolean c;

    public final void a(ozo ozo, ofo ofo, okl okl) {
        this.a = ozo;
        okl.a();
        this.b = ofo.a(okl.b(), 4);
        this.b.a(nzw.a(okl.c(), "application/x-scte35"));
    }

    public final void a(oza oza) {
        long j;
        long j2;
        if (!this.c) {
            if (this.a.a() != -9223372036854775807L) {
                this.b.a(nzw.a(null, "application/x-scte35", this.a.a()));
                this.c = true;
            } else {
                return;
            }
        }
        int b = oza.b();
        this.b.a(oza, b);
        ofy ofy = this.b;
        ozo ozo = this.a;
        if (ozo.c != -9223372036854775807L) {
            j = ozo.c + ozo.b;
        } else {
            j2 = ozo.a;
            if (j2 == Long.MAX_VALUE) {
                j = -9223372036854775807L;
            }
            ofy.a(j2, 1, b, 0, null);
        }
        j2 = j;
        ofy.a(j2, 1, b, 0, null);
    }
}
