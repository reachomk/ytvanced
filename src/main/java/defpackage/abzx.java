package defpackage;

import android.database.DataSetObserver;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: abzx */
final class abzx extends DataSetObserver {
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    public final Deque a = new ArrayDeque();
    public boolean b;
    private final zos d;
    private final xsc e;
    private final acef f = acef.a();
    private String g;
    private long h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private final aceh m = new abzw(this);

    abzx(zos zos) {
        xvf xvf = new xvf();
        this.d = zos;
        this.e = xvf;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        if (this.b) {
            if (!this.k) {
                this.j = this.e.c();
                this.k = true;
            }
            this.h++;
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:8:0x0011, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0014 }
        if (r0 == 0) goto L_0x0012;
    L_0x0005:
        r0 = r4.k;	 Catch:{ all -> 0x0014 }
        if (r0 == 0) goto L_0x0010;
    L_0x0009:
        r0 = r4.i;	 Catch:{ all -> 0x0014 }
        r2 = 1;
        r0 = r0 + r2;
        r4.i = r0;	 Catch:{ all -> 0x0014 }
    L_0x0010:
        monitor-exit(r4);
        return;
    L_0x0012:
        monitor-exit(r4);
        return;
    L_0x0014:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzx.b():void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:10:0x002d, code skipped:
            return;
     */
    public final synchronized void c() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x002c;
    L_0x0005:
        r0 = r4.l;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x002c;
    L_0x0009:
        r4.h();	 Catch:{ all -> 0x002e }
        r0 = r4.f;	 Catch:{ all -> 0x002e }
        r1 = defpackage.auht.class;
        r2 = defpackage.abzx.class;
        r3 = r4.m;	 Catch:{ all -> 0x002e }
        r0.a(r1, r2, r3);	 Catch:{ all -> 0x002e }
        r0 = r4.f;	 Catch:{ all -> 0x002e }
        r1 = defpackage.auht.class;
        r2 = c;	 Catch:{ all -> 0x002e }
        r0.a(r1, r2);	 Catch:{ all -> 0x002e }
        r0 = r4.d;	 Catch:{ all -> 0x002e }
        r0.registerObserver(r4);	 Catch:{ all -> 0x002e }
        r0 = 1;
        r4.b = r0;	 Catch:{ all -> 0x002e }
        r4.l = r0;	 Catch:{ all -> 0x002e }
        monitor-exit(r4);
        return;
    L_0x002c:
        monitor-exit(r4);
        return;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzx.c():void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:10:0x001d, code skipped:
            return;
     */
    public final synchronized void d() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x001c;
    L_0x0005:
        r0 = r2.l;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x001c;
    L_0x0009:
        r0 = r2.f;	 Catch:{ all -> 0x001e }
        r1 = defpackage.auht.class;
        r0.a(r1);	 Catch:{ all -> 0x001e }
        r0 = r2.f;	 Catch:{ all -> 0x001e }
        r1 = defpackage.auht.class;
        r0.b(r1);	 Catch:{ all -> 0x001e }
        r0 = 0;
        r2.l = r0;	 Catch:{ all -> 0x001e }
        monitor-exit(r2);
        return;
    L_0x001c:
        monitor-exit(r2);
        return;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzx.d():void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:10:0x001b, code skipped:
            return;
     */
    public final synchronized void e() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x001a;
    L_0x0005:
        r0 = r4.l;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x001a;
    L_0x0009:
        r4.h();	 Catch:{ all -> 0x001c }
        r0 = r4.f;	 Catch:{ all -> 0x001c }
        r1 = defpackage.auht.class;
        r2 = c;	 Catch:{ all -> 0x001c }
        r0.a(r1, r2);	 Catch:{ all -> 0x001c }
        r0 = 1;
        r4.l = r0;	 Catch:{ all -> 0x001c }
        monitor-exit(r4);
        return;
    L_0x001a:
        monitor-exit(r4);
        return;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzx.e():void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void f() {
        if (this.b) {
            this.f.a(auht.class);
            this.f.b(auht.class);
            this.f.a(auht.class, abzx.class, null);
            this.b = false;
            this.l = false;
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0012, code skipped:
            return;
     */
    public final synchronized void onChanged() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.b;	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0011;
    L_0x0005:
        r0 = r1.l;	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0011;
    L_0x0009:
        r1.g();	 Catch:{ all -> 0x0013 }
        r1.h();	 Catch:{ all -> 0x0013 }
        monitor-exit(r1);
        return;
    L_0x0011:
        monitor-exit(r1);
        return;
    L_0x0013:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzx.onChanged():void");
    }

    public final void g() {
        if (this.h > 0) {
            long c = this.e.c() - this.j;
            float f = ((float) c) / 1000.0f;
            this.a.addLast(new abzz(this.g, c, ((float) this.h) / f, ((float) this.i) / f));
        }
    }

    public final void h() {
        this.g = this.d.f;
        this.h = 0;
        this.i = 0;
        this.k = false;
    }
}
