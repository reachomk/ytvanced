package defpackage;

import java.nio.charset.Charset;
import java.util.Collection;

/* renamed from: bawr */
final class bawr implements bawz {
    private final /* synthetic */ bawq a;

    bawr(bawq bawq) {
        this.a = bawq;
    }

    public final void a(byte[] bArr) {
        this.a.h.run();
        bawq bawq = this.a;
        if (bawq.o != null) {
            String a;
            bawp bawp = new bawp(bawq);
            String str = this.a.b;
            if (bArr != null) {
                str = String.valueOf(str);
                a = anar.a.a(bArr);
                StringBuilder stringBuilder = new StringBuilder((str.length() + 1) + String.valueOf(a).length());
                stringBuilder.append(str);
                stringBuilder.append("?");
                stringBuilder.append(a);
                str = stringBuilder.toString();
            }
            bawq bawq2 = this.a;
            bciy a2 = bawq2.o.a(str, bawp, bawq2.e);
            if (bArr != null) {
                a2.a("GET");
            } else if (this.a.i) {
                a2.a("PUT");
            }
            if (this.a.k) {
                a2.a();
            }
            Object obj = this.a.l;
            if (obj != null) {
                ((bcji) a2).a(obj);
            }
            Collection<Object> collection = this.a.m;
            if (collection != null) {
                for (Object a3 : collection) {
                    ((bcji) a2).a(a3);
                }
            }
            bawq bawq3 = this.a;
            a2.a(bbby.i.a, bawq3.c);
            a2.a(bbby.g.a, "application/grpc");
            a2.a("te", "trailers");
            byte[][] a4 = bbhu.a(bawq3.f);
            for (int i = 0; i < a4.length; i += 2) {
                String str2 = "UTF-8";
                a = new String(a4[i], Charset.forName(str2));
                if (!(bbby.g.a.equalsIgnoreCase(a) || bbby.i.a.equalsIgnoreCase(a) || bbby.h.a.equalsIgnoreCase(a))) {
                    a2.a(a, new String(a4[i + 1], Charset.forName(str2)));
                }
            }
            this.a.j = a2.b();
            this.a.j.a();
        }
    }

    /* JADX WARNING: Missing block: B:21:0x0047, code skipped:
            return;
     */
    public final void a(defpackage.bbhv r6, boolean r7, boolean r8) {
        /*
        r5 = this;
        r0 = r5.a;
        r0 = r0.n;
        r0 = r0.a;
        monitor-enter(r0);
        r1 = r5.a;	 Catch:{ all -> 0x004b }
        r1 = r1.n;	 Catch:{ all -> 0x004b }
        r1 = r1.d;	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        return;
    L_0x0011:
        if (r6 == 0) goto L_0x001b;
    L_0x0013:
        r6 = (defpackage.bawy) r6;	 Catch:{ all -> 0x004b }
        r6 = r6.a;	 Catch:{ all -> 0x004b }
        r6.flip();	 Catch:{ all -> 0x004b }
        goto L_0x001d;
    L_0x001b:
        r6 = defpackage.bawq.a;	 Catch:{ all -> 0x004b }
    L_0x001d:
        r1 = r5.a;	 Catch:{ all -> 0x004b }
        r2 = r6.remaining();	 Catch:{ all -> 0x004b }
        r1 = r1.c();	 Catch:{ all -> 0x004b }
        r3 = r1.t;	 Catch:{ all -> 0x004b }
        monitor-enter(r3);	 Catch:{ all -> 0x004b }
        r4 = r1.v;	 Catch:{ all -> 0x0048 }
        r4 = r4 + r2;
        r1.v = r4;	 Catch:{ all -> 0x0048 }
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        r1 = r5.a;	 Catch:{ all -> 0x004b }
        r2 = r1.n;	 Catch:{ all -> 0x004b }
        r3 = r2.c;	 Catch:{ all -> 0x004b }
        if (r3 != 0) goto L_0x0043;
    L_0x0038:
        r1 = new baws;	 Catch:{ all -> 0x004b }
        r1.<init>(r6, r7, r8);	 Catch:{ all -> 0x004b }
        r6 = r2.b;	 Catch:{ all -> 0x004b }
        r6.add(r1);	 Catch:{ all -> 0x004b }
        goto L_0x0046;
    L_0x0043:
        r1.a(r6, r7, r8);	 Catch:{ all -> 0x004b }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        return;
    L_0x0048:
        r6 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        throw r6;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bawr.a(bbhv, boolean, boolean):void");
    }

    public final void a(int i) {
        synchronized (this.a.n.a) {
            bawu bawu = this.a.n;
            try {
                bawu.s.c(i);
            } catch (Throwable th) {
                bawu.a(th);
            }
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0041, code skipped:
            return;
     */
    public final void a(defpackage.bavx r5) {
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.n;
        r0 = r0.a;
        monitor-enter(r0);
        r1 = r4.a;	 Catch:{ all -> 0x0044 }
        r1 = r1.n;	 Catch:{ all -> 0x0044 }
        r2 = r1.d;	 Catch:{ all -> 0x0044 }
        if (r2 != 0) goto L_0x0042;
    L_0x000f:
        r2 = 1;
        r1.d = r2;	 Catch:{ all -> 0x0044 }
        r1.f = r5;	 Catch:{ all -> 0x0044 }
        r2 = r1.b;	 Catch:{ all -> 0x0044 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0044 }
    L_0x001a:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x002c;
    L_0x0020:
        r3 = r2.next();	 Catch:{ all -> 0x0044 }
        r3 = (defpackage.baws) r3;	 Catch:{ all -> 0x0044 }
        r3 = r3.a;	 Catch:{ all -> 0x0044 }
        r3.clear();	 Catch:{ all -> 0x0044 }
        goto L_0x001a;
    L_0x002c:
        r1 = r1.b;	 Catch:{ all -> 0x0044 }
        r1.clear();	 Catch:{ all -> 0x0044 }
        r1 = r4.a;	 Catch:{ all -> 0x0044 }
        r2 = r1.j;	 Catch:{ all -> 0x0044 }
        if (r2 != 0) goto L_0x003d;
    L_0x0037:
        r2 = r1.g;	 Catch:{ all -> 0x0044 }
        r2.a(r1, r5);	 Catch:{ all -> 0x0044 }
        goto L_0x0040;
    L_0x003d:
        r2.c();	 Catch:{ all -> 0x0044 }
    L_0x0040:
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0042:
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        goto L_0x0048;
    L_0x0047:
        throw r5;
    L_0x0048:
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bawr.a(bavx):void");
    }
}
