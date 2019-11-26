package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: ors */
public final class ors extends nys implements Callback {
    private final Handler e;
    private final orp f;
    private final orl g;
    private final nzy h;
    private boolean i;
    private boolean j;
    private int k;
    private nzw l;
    private orj m;
    private orn n;
    private orq o;
    private orq p;
    private int q;

    public ors(orp orp, Looper looper) {
        orl orl = orl.a;
        super(3);
        this.f = (orp) oxz.a((Object) orp);
        this.e = looper != null ? ozp.a(looper, (Callback) this) : null;
        this.g = orl;
        this.h = new nzy();
    }

    public final boolean u() {
        return true;
    }

    public final int a(nzw nzw) {
        return this.g.a(nzw) ? !nys.a(null, nzw.l) ? 2 : 4 : oyu.c(nzw.i) ? 1 : 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
        this.l = nzwArr[0];
        if (this.m != null) {
            this.k = 1;
        } else {
            this.m = this.g.b(this.l);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        A();
        this.i = false;
        this.j = false;
        if (this.k != 0) {
            y();
            return;
        }
        w();
        this.m.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A:{LOOP_START, SYNTHETIC, Splitter:B:40:0x0093, LOOP:1: B:40:0x0093->B:69:0x0093} */
    /* JADX WARNING: Missing block: B:36:0x0084, code skipped:
            if (r9 != null) goto L_0x0086;
     */
    public final void a(long r7, long r9) {
        /*
        r6 = this;
        r9 = r6.j;
        if (r9 != 0) goto L_0x00f4;
    L_0x0004:
        r9 = r6.p;
        if (r9 != 0) goto L_0x001e;
    L_0x0008:
        r9 = r6.m;
        r9.a(r7);
        r9 = r6.m;	 Catch:{ orm -> 0x0018 }
        r9 = r9.c();	 Catch:{ orm -> 0x0018 }
        r9 = (defpackage.orq) r9;	 Catch:{ orm -> 0x0018 }
        r6.p = r9;	 Catch:{ orm -> 0x0018 }
        goto L_0x001e;
    L_0x0018:
        r7 = move-exception;
        r7 = defpackage.nyy.a(r7);
        throw r7;
    L_0x001e:
        r9 = r6.c;
        r10 = 2;
        if (r9 != r10) goto L_0x00f4;
    L_0x0023:
        r9 = r6.o;
        r0 = 0;
        r1 = 1;
        if (r9 == 0) goto L_0x003d;
    L_0x0029:
        r2 = r6.z();
        r9 = 0;
    L_0x002e:
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 > 0) goto L_0x003e;
    L_0x0032:
        r9 = r6.q;
        r9 = r9 + r1;
        r6.q = r9;
        r2 = r6.z();
        r9 = 1;
        goto L_0x002e;
    L_0x003d:
        r9 = 0;
    L_0x003e:
        r2 = r6.p;
        r3 = 0;
        if (r2 == 0) goto L_0x0084;
    L_0x0043:
        r2 = r2.isEndOfStream();
        if (r2 != 0) goto L_0x0067;
    L_0x0049:
        r2 = r6.p;
        r4 = r2.timeUs;
        r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r2 > 0) goto L_0x0084;
    L_0x0051:
        r9 = r6.o;
        if (r9 == 0) goto L_0x0058;
    L_0x0055:
        r9.release();
    L_0x0058:
        r9 = r6.p;
        r6.o = r9;
        r6.p = r3;
        r9 = r6.o;
        r9 = r9.a(r7);
        r6.q = r9;
        goto L_0x0086;
    L_0x0067:
        if (r9 != 0) goto L_0x0086;
    L_0x0069:
        r7 = r6.z();
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 != 0) goto L_0x008f;
    L_0x0076:
        r7 = r6.k;
        if (r7 != r10) goto L_0x007e;
    L_0x007a:
        r6.y();
        goto L_0x008f;
    L_0x007e:
        r6.w();
        r6.j = r1;
        goto L_0x008f;
    L_0x0084:
        if (r9 == 0) goto L_0x008f;
    L_0x0086:
        r9 = r6.o;
        r7 = r9.b(r7);
        r6.a(r7);
    L_0x008f:
        r7 = r6.k;
        if (r7 == r10) goto L_0x00f4;
    L_0x0093:
        r7 = r6.i;	 Catch:{ orm -> 0x00ee }
        if (r7 != 0) goto L_0x00ed;
    L_0x0097:
        r7 = r6.n;	 Catch:{ orm -> 0x00ee }
        if (r7 != 0) goto L_0x00ab;
    L_0x009b:
        r7 = r6.m;	 Catch:{ orm -> 0x00ee }
        r7 = r7.b();	 Catch:{ orm -> 0x00ee }
        r7 = (defpackage.orn) r7;	 Catch:{ orm -> 0x00ee }
        r6.n = r7;	 Catch:{ orm -> 0x00ee }
        r7 = r6.n;	 Catch:{ orm -> 0x00ee }
        if (r7 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00ab;
    L_0x00aa:
        return;
    L_0x00ab:
        r8 = r6.k;	 Catch:{ orm -> 0x00ee }
        if (r8 != r1) goto L_0x00bf;
    L_0x00af:
        r8 = 4;
        r7.setFlags(r8);	 Catch:{ orm -> 0x00ee }
        r7 = r6.m;	 Catch:{ orm -> 0x00ee }
        r8 = r6.n;	 Catch:{ orm -> 0x00ee }
        r7.a(r8);	 Catch:{ orm -> 0x00ee }
        r6.n = r3;	 Catch:{ orm -> 0x00ee }
        r6.k = r10;	 Catch:{ orm -> 0x00ee }
        return;
    L_0x00bf:
        r8 = r6.h;	 Catch:{ orm -> 0x00ee }
        r7 = r6.a(r8, r7, r0);	 Catch:{ orm -> 0x00ee }
        r8 = -4;
        if (r7 != r8) goto L_0x00ea;
    L_0x00c8:
        r7 = r6.n;	 Catch:{ orm -> 0x00ee }
        r7 = r7.isEndOfStream();	 Catch:{ orm -> 0x00ee }
        if (r7 == 0) goto L_0x00d3;
    L_0x00d0:
        r6.i = r1;	 Catch:{ orm -> 0x00ee }
        goto L_0x00e0;
    L_0x00d3:
        r7 = r6.n;	 Catch:{ orm -> 0x00ee }
        r8 = r6.h;	 Catch:{ orm -> 0x00ee }
        r8 = r8.a;	 Catch:{ orm -> 0x00ee }
        r8 = r8.m;	 Catch:{ orm -> 0x00ee }
        r7.d = r8;	 Catch:{ orm -> 0x00ee }
        r7.d();	 Catch:{ orm -> 0x00ee }
    L_0x00e0:
        r7 = r6.m;	 Catch:{ orm -> 0x00ee }
        r8 = r6.n;	 Catch:{ orm -> 0x00ee }
        r7.a(r8);	 Catch:{ orm -> 0x00ee }
        r6.n = r3;	 Catch:{ orm -> 0x00ee }
        goto L_0x0093;
    L_0x00ea:
        r8 = -3;
        if (r7 != r8) goto L_0x0093;
    L_0x00ed:
        return;
    L_0x00ee:
        r7 = move-exception;
        r7 = defpackage.nyy.a(r7);
        throw r7;
    L_0x00f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ors.a(long, long):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        this.l = null;
        A();
        x();
    }

    public final boolean v() {
        return this.j;
    }

    private final void w() {
        this.n = null;
        this.q = -1;
        orq orq = this.o;
        if (orq != null) {
            orq.release();
            this.o = null;
        }
        orq = this.p;
        if (orq != null) {
            orq.release();
            this.p = null;
        }
    }

    private final void x() {
        w();
        this.m.e();
        this.m = null;
        this.k = 0;
    }

    private final void y() {
        x();
        this.m = this.g.b(this.l);
    }

    private final long z() {
        int i = this.q;
        return (i == -1 || i >= this.o.a()) ? Long.MAX_VALUE : this.o.a(this.q);
    }

    private final void a(List list) {
        Handler handler = this.e;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private final void A() {
        a(Collections.emptyList());
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private final void b(List list) {
        this.f.a(list);
    }
}
