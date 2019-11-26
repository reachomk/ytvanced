package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: xjt */
final class xjt extends bckz {
    public final xsc a;
    public final xjy b;
    public final xky c;
    public volatile int d = 0;
    public long e = -1;
    private final xlg f;
    private final xji g;
    private final Executor h;
    private final xle i;
    private final bpz j;
    private final ArrayDeque k = new ArrayDeque(2);
    private long l = -1;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private long p = -1;

    xjt(xsc xsc, xlg xlg, xji xji, Executor executor, xle xle, bpz bpz, xjy xjy, xky xky) {
        this.a = xsc;
        this.f = xlg;
        this.g = xji;
        this.h = executor;
        this.i = xle;
        this.j = bpz;
        this.b = xjy;
        this.c = xky;
    }

    public final void a(bckx bckx, bclb bclb, String str) {
        this.c.a();
        if (this.f != null) {
            xlg.a(str);
        }
        bckx.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    public final void a(defpackage.bckx r10, defpackage.bclb r11) {
        /*
        r9 = this;
        r0 = r9.c;
        r0.b();
        r0 = r9.b;
        r0.a();
        r0 = r9.g;
        r0.a(r11);
        r0 = r9.i;
        r0 = r0.g;
        if (r0 != 0) goto L_0x00b3;
    L_0x0015:
        r11 = r11.e();
        r0 = 0;
        if (r11 != 0) goto L_0x001f;
    L_0x001c:
        r1 = r0;
        r2 = r1;
        goto L_0x0061;
    L_0x001f:
        r1 = "Content-Length";
        r2 = r11.containsKey(r1);
        r3 = 0;
        if (r2 == 0) goto L_0x0035;
    L_0x0028:
        r1 = r11.get(r1);
        r1 = (java.util.List) r1;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        goto L_0x0036;
    L_0x0035:
        r1 = r0;
    L_0x0036:
        r2 = "Content-Encoding";
        r4 = r11.containsKey(r2);
        if (r4 == 0) goto L_0x004b;
    L_0x003e:
        r2 = r11.get(r2);
        r2 = (java.util.List) r2;
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        goto L_0x004c;
    L_0x004b:
        r2 = r0;
    L_0x004c:
        r4 = "Content-Type";
        r5 = r11.containsKey(r4);
        if (r5 == 0) goto L_0x0061;
    L_0x0054:
        r11 = r11.get(r4);
        r11 = (java.util.List) r11;
        r11 = r11.get(r3);
        r0 = r11;
        r0 = (java.lang.String) r0;
    L_0x0061:
        r11 = android.text.TextUtils.isEmpty(r1);
        r3 = -9223372036854775808;
        if (r11 != 0) goto L_0x006e;
    L_0x0069:
        r5 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x006e }
        goto L_0x006f;
    L_0x006e:
        r5 = r3;
    L_0x006f:
        r7 = 0;
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x00a0;
    L_0x0075:
        r11 = android.text.TextUtils.isEmpty(r2);
        if (r11 != 0) goto L_0x009c;
    L_0x007b:
        r11 = "identity";
        r11 = r11.equals(r2);
        if (r11 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x009c;
    L_0x0084:
        r11 = "application/x-protobuf";
        r11 = r11.equals(r0);
        if (r11 != 0) goto L_0x0097;
    L_0x008c:
        r0 = (double) r5;
        r2 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        java.lang.Double.isNaN(r0);
        r0 = r0 * r2;
        r0 = (long) r0;
        r3 = r0;
        goto L_0x00a0;
    L_0x0097:
        r0 = 3;
        r5 = r5 * r0;
        goto L_0x009f;
    L_0x009c:
        r11 = 1;
        r9.o = r11;
    L_0x009f:
        r3 = r5;
    L_0x00a0:
        r9.l = r3;
        r11 = r9.a(r3);
        r11 = java.nio.ByteBuffer.allocateDirect(r11);
        r0 = r9.k;
        r0.add(r11);
        r10.a(r11);
        return;
    L_0x00b3:
        r10.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjt.a(bckx, bclb):void");
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        this.c.c();
        if (this.i.g) {
            bckx.c();
            return;
        }
        int position = byteBuffer.position();
        this.l -= (long) (position - this.m);
        this.m = position;
        if (byteBuffer.hasRemaining()) {
            bckx.a(byteBuffer);
            return;
        }
        byteBuffer.flip();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a(this.l));
        this.m = 0;
        this.k.add(allocateDirect);
        bckx.a(allocateDirect);
    }

    public final void b(bckx bckx, bclb bclb) {
        this.c.d();
        if (this.i.g) {
            c(bckx, bclb);
            return;
        }
        this.p = this.a.b();
        ByteBuffer byteBuffer = (ByteBuffer) this.k.peekLast();
        byteBuffer.flip();
        if (!byteBuffer.hasRemaining()) {
            this.k.removeLast();
        }
        a(bclb, null);
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        this.c.e();
        if (this.i.g) {
            c(bckx, bclb);
            return;
        }
        this.p = this.a.b();
        a(bclb, bcjd);
    }

    public final void c(bckx bckx, bclb bclb) {
        this.c.f();
        this.p = this.a.b();
        this.k.clear();
        if (this.d != 0) {
            bcjd xkz;
            int i = this.d;
            if (i == 1) {
                xkz = new xkz(6);
            } else if (i != 2) {
                xkz = new xkz(11);
            } else {
                xkz = new xkz(4);
            }
            a(null, xkz);
            return;
        }
        a(null, null);
    }

    private final void a(bclb bclb, bcjd bcjd) {
        if (bclb != null && bcjd == null) {
            long j = this.p - this.e;
            xgx b;
            byte[] bArr;
            bqd bqd;
            if (bclb.b() == 304) {
                b = xgy.b();
                bpz bpz = this.j;
                if (bpz != null) {
                    b.a(bpz.g.entrySet());
                    bArr = this.j.a;
                } else {
                    bArr = null;
                }
                b.a(bclb.d());
                bqd = new bqd(304, bArr, b.a().a(), true, j);
            } else {
                b = xgy.b();
                b.a(bclb.d());
                xgy a = b.a();
                try {
                    bArr = xhn.a(this.k).e();
                    this.k.clear();
                    bqd = new bqd(bclb.b(), bArr, a.a(), false, j);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.k.clear();
                }
            }
            a(r1, bclb, null);
            return;
        }
        a(null, null, bcjd);
    }

    private final void a(bqd bqd, bclb bclb, bcjd bcjd) {
        this.h.execute(new xjv(this, bqd, bcjd));
    }

    private final int a(long j) {
        if (j > 393216) {
            return 393216;
        }
        if (j > 256) {
            return (int) j;
        }
        if (!this.o || this.n) {
            return 8192;
        }
        this.n = true;
        return 256;
    }
}
