package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: sex */
public final class sex {
    public sez a;
    private anjv b;
    private final sev c;

    public sex(sev sev) {
        this.c = sev;
    }

    public final void a(sez sez) {
        this.a = sez;
        if (sez != null && b() != null) {
            sez.a(b());
        }
    }

    public final void a() {
        if (this.b == null) {
            sey sey = new sey(this.c);
            sey.execute(new Object[0]);
            this.b = sey.a;
            this.b.a(new sfa(this), sfv.a());
        }
    }

    public final sfq b() {
        try {
            anjv anjv = this.b;
            return (anjv == null || !anjv.isDone()) ? null : (sfq) anjf.a(this.b);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
