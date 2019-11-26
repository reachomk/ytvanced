package defpackage;

import java.io.File;

/* renamed from: agmf */
public final class agmf implements agmh {
    private final File a;
    private final File b;

    public agmf(File file) {
        this.b = agmn.a(file, ".progtmp");
        this.a = agmn.b(file);
    }

    /* JADX WARNING: Missing block: B:9:0x001e, code skipped:
            defpackage.agmf.a(r4, r0);
     */
    public final void a(defpackage.azqp r4) {
        /*
        r3 = this;
        r0 = new java.io.BufferedOutputStream;
        r1 = new java.io.FileOutputStream;
        r2 = r3.b;
        r1.<init>(r2);
        r0.<init>(r1);
        r4.writeTo(r0);	 Catch:{ all -> 0x001b }
        r4 = 0;
        defpackage.agmf.a(r4, r0);
        r4 = r3.b;
        r0 = r3.a;
        r4.renameTo(r0);
        return;
    L_0x001b:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r1 = move-exception;
        defpackage.agmf.a(r4, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmf.a(azqp):void");
    }

    /* JADX WARNING: Missing block: B:19:0x0068, code skipped:
            defpackage.agmf.a(r0, r1);
     */
    public final defpackage.azqp a() {
        /*
        r6 = this;
        r0 = r6.a;
        r0 = r0.exists();
        r1 = r6.a;
        r2 = "progress file not found! %s";
        defpackage.amqw.a(r0, r2, r1);
        r0 = r6.a;
        r0 = r0.length();
        r2 = 0;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x001d;
    L_0x001b:
        r0 = 1;
        goto L_0x001e;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        r1 = "progress file too large!";
        defpackage.amqw.a(r0, r1);
        r0 = defpackage.azqp.h;
        r0 = r0.createBuilder();
        r0 = (defpackage.azqo) r0;
        r1 = new java.io.BufferedInputStream;
        r3 = new java.io.FileInputStream;
        r4 = r6.a;
        r3.<init>(r4);
        r1.<init>(r3);
        r3 = r6.a;	 Catch:{ all -> 0x0065 }
        r3 = r3.length();	 Catch:{ all -> 0x0065 }
        r4 = (int) r3;	 Catch:{ all -> 0x0065 }
        r3 = new byte[r4];	 Catch:{ all -> 0x0065 }
    L_0x0040:
        r4 = r3.length;	 Catch:{ all -> 0x0065 }
        if (r2 >= r4) goto L_0x004c;
    L_0x0043:
        r4 = r4 - r2;
        r4 = r1.read(r3, r2, r4);	 Catch:{ all -> 0x0065 }
        if (r4 < 0) goto L_0x004c;
    L_0x004a:
        r2 = r2 + r4;
        goto L_0x0040;
    L_0x004c:
        r2 = defpackage.anxa.c();	 Catch:{ all -> 0x0065 }
        r0 = r0.mergeFrom(r3, r2);	 Catch:{ all -> 0x0065 }
        r0 = (defpackage.anvi) r0;	 Catch:{ all -> 0x0065 }
        r0 = (defpackage.azqo) r0;	 Catch:{ all -> 0x0065 }
        r2 = 0;
        defpackage.agmf.a(r2, r1);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azqp) r0;
        return r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0067 }
    L_0x0067:
        r2 = move-exception;
        defpackage.agmf.a(r0, r1);
        goto L_0x006d;
    L_0x006c:
        throw r2;
    L_0x006d:
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmf.a():azqp");
    }

    public final void b() {
        if (!this.a.delete()) {
            xtl.c("Failed to delete progress file while finalizing YT4.");
        }
        if (this.b.exists()) {
            this.b.delete();
        }
        if (this.a.exists()) {
            xtl.c("WTF, Android? Failed to delete progress file while finalizing YT4.");
        }
    }

    public final boolean c() {
        return this.a.exists() && this.a.length() > 0;
    }
}
