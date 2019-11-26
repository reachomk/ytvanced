package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: sgy */
public final class sgy {
    public final sfc a;
    public sha b;
    private anjv c;

    public sgy(sfc sfc) {
        this.a = sfc;
    }

    public final void a(sha sha) {
        this.b = sha;
        if (sha != null && b() != null) {
            sha.a(b());
        }
    }

    public final void a() {
        if (this.c == null) {
            sfb sfb = new sfb(this.a);
            sfb.execute(new Object[0]);
            this.c = sfb.a;
            this.c.a(new sgx(this), sfv.a());
        }
    }

    public final sfq b() {
        try {
            anjv anjv = this.c;
            if (anjv == null || !anjv.isDone()) {
                return null;
            }
            return (sfq) anjf.a(this.c);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
