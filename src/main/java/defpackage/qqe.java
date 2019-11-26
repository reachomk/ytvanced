package defpackage;

import java.util.Map;

/* renamed from: qqe */
public final class qqe implements qcb {
    public volatile qqi a;
    public volatile String b;
    public final /* synthetic */ qqb c;
    private final long d;

    qqe(qqb qqb, qqi qqi, long j) {
        this.c = qqb;
        this.a = qqi;
        this.d = j;
        qqb.a++;
    }

    public qqe(qqb qqb, String str) {
        this.c = qqb;
        this.b = qqm.a(str);
        this.d = 0;
    }

    public final String a(Map map) {
        if (this.b != null) {
            return this.b;
        }
        qps qps = new qps();
        this.c.a(new qqd(this, map, qps));
        String str;
        try {
            str = (String) qps.a(this.d);
            if (str == null) {
                long j = this.d;
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Snapshot timeout: ");
                stringBuilder.append(j);
                stringBuilder.append(" ms");
                str = qqm.a(stringBuilder.toString());
            }
            return str;
        } catch (InterruptedException e) {
            str = String.valueOf(e.toString());
            String str2 = "Results transfer failed: ";
            return qqm.a(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }

    public final void a() {
        this.c.a(new qqg(this));
    }
}
