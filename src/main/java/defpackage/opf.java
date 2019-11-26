package defpackage;

import android.net.Uri;

/* renamed from: opf */
final class opf implements oof, owm {
    public final owr a;
    public long b;
    public ovm c = a(0);
    public long d = -1;
    private final Uri e;
    private final ope f;
    private final ofo g;
    private final oyf h;
    private final ofv i = new ofv();
    private volatile boolean j;
    private boolean k = true;
    private ofy l;
    private boolean m;
    private final /* synthetic */ opa n;

    public opf(opa opa, Uri uri, ovi ovi, ope ope, ofo ofo, oyf oyf) {
        this.n = opa;
        this.e = uri;
        this.a = new owr(ovi);
        this.f = ope;
        this.g = ofo;
        this.h = oyf;
    }

    public final void a() {
        this.j = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A:{Catch:{ all -> 0x00ae }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A:{Catch:{ all -> 0x00ae }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d A:{Catch:{ all -> 0x00ae }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    public final void b() {
        /*
        r12 = this;
        r0 = 0;
        r1 = 0;
    L_0x0002:
        if (r1 != 0) goto L_0x00d3;
    L_0x0004:
        r2 = r12.j;
        if (r2 != 0) goto L_0x00d3;
    L_0x0008:
        r2 = 1;
        r3 = r12.i;	 Catch:{ all -> 0x00c1 }
        r10 = r3.a;	 Catch:{ all -> 0x00c1 }
        r3 = r12.a(r10);	 Catch:{ all -> 0x00c1 }
        r12.c = r3;	 Catch:{ all -> 0x00c1 }
        r3 = r12.a;	 Catch:{ all -> 0x00c1 }
        r4 = r12.c;	 Catch:{ all -> 0x00c1 }
        r3 = r3.a(r4);	 Catch:{ all -> 0x00c1 }
        r12.d = r3;	 Catch:{ all -> 0x00c1 }
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0026;
    L_0x0023:
        r3 = r3 + r10;
        r12.d = r3;	 Catch:{ all -> 0x00c1 }
    L_0x0026:
        r3 = r12.a;	 Catch:{ all -> 0x00c1 }
        r3 = r3.b();	 Catch:{ all -> 0x00c1 }
        defpackage.oxz.a(r3);	 Catch:{ all -> 0x00c1 }
        r3 = r12.n;	 Catch:{ all -> 0x00c1 }
        r4 = r12.a;	 Catch:{ all -> 0x00c1 }
        r4 = r4.c();	 Catch:{ all -> 0x00c1 }
        r4 = defpackage.olu.a(r4);	 Catch:{ all -> 0x00c1 }
        r3.l = r4;	 Catch:{ all -> 0x00c1 }
        r3 = r12.a;	 Catch:{ all -> 0x00c1 }
        r4 = r12.n;	 Catch:{ all -> 0x00c1 }
        r4 = r4.l;	 Catch:{ all -> 0x00c1 }
        if (r4 == 0) goto L_0x0064;
    L_0x0045:
        r4 = r4.b;	 Catch:{ all -> 0x00c1 }
        r5 = -1;
        if (r4 == r5) goto L_0x0064;
    L_0x004a:
        r5 = new ooc;	 Catch:{ all -> 0x00c1 }
        r5.<init>(r3, r4, r12);	 Catch:{ all -> 0x00c1 }
        r3 = r12.n;	 Catch:{ all -> 0x00c1 }
        r4 = new opi;	 Catch:{ all -> 0x00c1 }
        r4.<init>(r0, r2);	 Catch:{ all -> 0x00c1 }
        r3 = r3.a(r4);	 Catch:{ all -> 0x00c1 }
        r12.l = r3;	 Catch:{ all -> 0x00c1 }
        r3 = r12.l;	 Catch:{ all -> 0x00c1 }
        r4 = defpackage.opa.a;	 Catch:{ all -> 0x00c1 }
        r3.a(r4);	 Catch:{ all -> 0x00c1 }
        goto L_0x0065;
    L_0x0064:
        r5 = r3;
    L_0x0065:
        r3 = new ofl;	 Catch:{ all -> 0x00c1 }
        r8 = r12.d;	 Catch:{ all -> 0x00c1 }
        r4 = r3;
        r6 = r10;
        r4.<init>(r5, r6, r8);	 Catch:{ all -> 0x00c1 }
        r4 = r12.f;	 Catch:{ all -> 0x00ae }
        r5 = r12.g;	 Catch:{ all -> 0x00ae }
        r4 = r4.a(r3, r5);	 Catch:{ all -> 0x00ae }
        r5 = r12.k;	 Catch:{ all -> 0x00ae }
        if (r5 == 0) goto L_0x0081;
    L_0x007a:
        r5 = r12.b;	 Catch:{ all -> 0x00ae }
        r4.a(r10, r5);	 Catch:{ all -> 0x00ae }
        r12.k = r0;	 Catch:{ all -> 0x00ae }
    L_0x0081:
        if (r1 != 0) goto L_0x00b0;
    L_0x0083:
        r5 = r12.j;	 Catch:{ all -> 0x00ae }
        if (r5 != 0) goto L_0x00b0;
    L_0x0087:
        r5 = r12.h;	 Catch:{ all -> 0x00ae }
        r5.c();	 Catch:{ all -> 0x00ae }
        r5 = r12.i;	 Catch:{ all -> 0x00ae }
        r1 = r4.a(r3, r5);	 Catch:{ all -> 0x00ae }
        r5 = r3.c;	 Catch:{ all -> 0x00ae }
        r7 = r12.n;	 Catch:{ all -> 0x00ae }
        r7 = r7.e;	 Catch:{ all -> 0x00ae }
        r7 = r7 + r10;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x009e;
    L_0x009d:
        goto L_0x0081;
    L_0x009e:
        r7 = r12.h;	 Catch:{ all -> 0x00ae }
        r7.b();	 Catch:{ all -> 0x00ae }
        r7 = r12.n;	 Catch:{ all -> 0x00ae }
        r8 = r7.i;	 Catch:{ all -> 0x00ae }
        r7 = r7.h;	 Catch:{ all -> 0x00ae }
        r8.post(r7);	 Catch:{ all -> 0x00ae }
        r10 = r5;
        goto L_0x0081;
    L_0x00ae:
        r0 = move-exception;
        goto L_0x00c3;
    L_0x00b0:
        if (r1 == r2) goto L_0x00b9;
    L_0x00b2:
        r2 = r12.i;
        r3 = r3.c;
        r2.a = r3;
        goto L_0x00ba;
    L_0x00b9:
        r1 = 0;
    L_0x00ba:
        r2 = r12.a;
        defpackage.ozp.a(r2);
        goto L_0x0002;
    L_0x00c1:
        r0 = move-exception;
        r3 = 0;
    L_0x00c3:
        if (r1 == r2) goto L_0x00cd;
    L_0x00c5:
        if (r3 == 0) goto L_0x00cd;
    L_0x00c7:
        r1 = r12.i;
        r2 = r3.c;
        r1.a = r2;
    L_0x00cd:
        r1 = r12.a;
        defpackage.ozp.a(r1);
        throw r0;
    L_0x00d3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opf.b():void");
    }

    public final void a(oza oza) {
        long max;
        if (this.m) {
            max = Math.max(this.n.j(), this.b);
        } else {
            max = this.b;
        }
        long j = max;
        int b = oza.b();
        ofy ofy = (ofy) oxz.a(this.l);
        ofy.a(oza, b);
        ofy.a(j, 1, b, 0, null);
        this.m = true;
    }

    private final ovm a(long j) {
        return new ovm(this.e, j, -1, this.n.d, 22);
    }

    public final void a(long j, long j2) {
        this.i.a = j;
        this.b = j2;
        this.k = true;
        this.m = false;
    }
}
