package defpackage;

import java.util.List;

/* renamed from: ojz */
final class ojz {
    private final List a;
    private final ofy[] b;

    public ojz(List list) {
        this.a = list;
        this.b = new ofy[list.size()];
    }

    public final void a(ofo ofo, okl okl) {
        for (int i = 0; i < this.b.length; i++) {
            Object str;
            okl.a();
            ofy a = ofo.a(okl.b(), 3);
            nzw nzw = (nzw) this.a.get(i);
            String str2 = nzw.i;
            boolean z = true;
            if (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2))) {
                z = false;
            }
            String valueOf = String.valueOf(str2);
            String str3 = "Invalid closed caption mime type provided: ";
            if (valueOf.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(valueOf);
            }
            oxz.a(z, str);
            valueOf = nzw.a;
            if (valueOf == null) {
                valueOf = okl.c();
            }
            a.a(nzw.a(valueOf, str2, nzw.c, nzw.A, nzw.B, null, Long.MAX_VALUE, nzw.k));
            this.b[i] = a;
        }
    }

    public final void a(long j, oza oza) {
        ose.a(j, oza, this.b);
    }
}
