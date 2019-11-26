package defpackage;

/* renamed from: acxq */
public final class acxq implements acxt {
    public final xsc a;
    private final acxw b;
    private final atyw c;
    private final acxp d;
    private final String e;
    private boolean f = false;
    private long g;

    acxq(acxw acxw, xsc xsc, atyw atyw, String str, boolean z) {
        this.b = (acxw) amqw.a((Object) acxw);
        this.a = (xsc) amqw.a((Object) xsc);
        this.c = atyw;
        this.e = str;
        this.d = new acxp(z, str);
        acxp acxp = this.d;
        if (acxp.a) {
            String valueOf = String.valueOf(atyw);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 12);
            stringBuilder.append("constructor ");
            stringBuilder.append(valueOf);
            acxp.a(stringBuilder.toString());
        }
        atyl atyl = (atyl) atyi.l.createBuilder();
        atyl.a(atyw);
        a((atyi) ((anxl) atyl.build()));
    }

    public final void a(long j) {
        if (this.f) {
            this.d.a("Attempted to log multiple Baseline Ticks with a single ActionLogger while disallowing multiple Baselines");
            return;
        }
        this.g = j;
        this.b.a(this.e, j);
        this.f = true;
        acxp acxp = this.d;
        long j2 = this.g;
        if (acxp.a) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("logBaseline ");
            stringBuilder.append(j2);
            acxp.a(stringBuilder.toString());
        }
    }

    public final void a(String str) {
        b(str, this.a.a());
    }

    public final void a(String str, long j) {
        b(str, j);
    }

    public final void a(atyi atyi) {
        if (atyi != null) {
            acxw acxw = this.b;
            atyl atyl = (atyl) ((anxo) atyi.toBuilder());
            atyl.a(this.e);
            acxw.a((atyi) ((anxl) atyl.build()));
            acxp acxp = this.d;
            atyw atyw = this.c;
            if (acxp.a) {
                String valueOf = String.valueOf(atyw);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
                stringBuilder.append("logActionInfo ");
                stringBuilder.append(valueOf);
                acxp.a(stringBuilder.toString());
            }
        }
    }

    private final void b(String str, long j) {
        this.b.a(str, this.e, j);
        acxp acxp = this.d;
        long j2 = this.g;
        if (acxp.a) {
            String concat = String.valueOf(Long.toString(j - j2)).concat(" ms");
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(concat).length());
            stringBuilder.append("logTick ");
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(concat);
            acxp.a(stringBuilder.toString());
        }
    }
}
