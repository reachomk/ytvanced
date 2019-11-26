package defpackage;

import android.net.Uri;

/* renamed from: alre */
final class alre extends alrk {
    private final String k;
    private final String l;
    private final boolean m;
    private final /* synthetic */ alrc n;

    alre(alrc alrc, Uri uri, afsw afsw, String str, String str2, boolean z) {
        this.n = alrc;
        super(alrc, uri, afsw);
        this.k = str;
        this.l = str2;
        this.m = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final bqm n() {
        return new bqc(this.n.b.i, 0, 1.0f);
    }

    public final bqh a(bqd bqd) {
        if (this.m) {
            this.n.l.d(new alsi());
        } else {
            this.n.l.d(new alsn());
        }
        return super.a(bqd);
    }

    public final void b(bqn bqn) {
        String str;
        xtl.a("Metadata error", (Throwable) bqn);
        bqd bqd = bqn.b;
        if (bqd != null) {
            int i = bqd.a;
            StringBuilder stringBuilder = new StringBuilder(24);
            stringBuilder.append("Status code: ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            byte[] bArr = bqn.b.b;
            if (bArr != null && bArr.length > 0) {
                str = new String(bArr, alrc.a);
                String str2 = "Network response: ";
                xtl.c(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
        }
        altd altd = new altd();
        altd.c(this.k);
        altd.a(this.l);
        altb a = altb.a((alsy) this);
        a.a(this.n.h);
        a.a(!(bqn instanceof bqo) ? 3 : 4);
        a.a(bqn);
        altd.a(a);
        str = this.l;
        if (str != null) {
            altd.b(str);
        }
        this.n.j.a(altd.a());
        if (this.m) {
            this.n.l.d(new alsg());
        } else {
            this.n.l.d(new alsl());
        }
        super.b(bqn);
    }
}
