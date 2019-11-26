package defpackage;

import java.util.List;

/* renamed from: bbey */
final class bbey extends batv {
    private final batx b;
    private baue c;

    bbey(batx batx) {
        this.b = (batx) amqw.a((Object) batx, (Object) "helper");
    }

    public final void a(bauc bauc) {
        List list = bauc.a;
        baue baue = this.c;
        if (baue == null) {
            this.c = this.b.a(list, barq.b);
            this.b.a(basp.CONNECTING, new bbex(baua.a(this.c)));
            this.c.b();
            return;
        }
        this.b.a(baue, list);
    }

    public final void a(bavx bavx) {
        baue baue = this.c;
        if (baue != null) {
            baue.a();
            this.c = null;
        }
        this.b.a(basp.TRANSIENT_FAILURE, new bbex(baua.a(bavx)));
    }

    public final void a(baue baue, bass bass) {
        basp basp = bass.a;
        if (baue == this.c && basp != basp.SHUTDOWN) {
            baud bbex;
            int ordinal = basp.ordinal();
            if (ordinal == 0) {
                bbex = new bbex(baua.a);
            } else if (ordinal == 1) {
                bbex = new bbex(baua.a(baue));
            } else if (ordinal == 2) {
                bbex = new bbex(baua.a(bass.b));
            } else if (ordinal == 3) {
                bbex = new bbfa(baue);
            } else {
                String valueOf = String.valueOf(basp);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
                stringBuilder.append("Unsupported state:");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.b.a(basp, bbex);
        }
    }

    public final void a() {
        baue baue = this.c;
        if (baue != null) {
            baue.a();
        }
    }
}
