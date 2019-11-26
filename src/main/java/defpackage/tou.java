package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: tou */
final class tou extends bckz {
    public final List a = new ArrayList(2);
    public bzc b;
    public bre c;
    public bckx d;
    public volatile boolean e;
    public toq f;
    public final /* synthetic */ tos g;

    public final void a(bckx bckx, bclb bclb, String str) {
        bckx.b();
    }

    /* JADX WARNING: Missing block: B:7:0x004c, code skipped:
            if ("identity".equals(((java.util.List) r8.get(r0)).get(0)) == false) goto L_0x004e;
     */
    public final void a(defpackage.bckx r7, defpackage.bclb r8) {
        /*
        r6 = this;
        java.lang.System.currentTimeMillis();
        r0 = new toq;
        r1 = 0;
        r0.<init>(r1);
        r6.f = r0;
        r8 = r8.e();
        r0 = "content-length";
        r2 = r8.containsKey(r0);
        if (r2 == 0) goto L_0x0054;
    L_0x0017:
        r0 = r8.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r2 = java.lang.Long.parseLong(r0);
        r0 = "content-encoding";
        r4 = r8.containsKey(r0);
        if (r4 == 0) goto L_0x0052;
    L_0x002f:
        r4 = r8.get(r0);
        r4 = (java.util.List) r4;
        r4 = r4.size();
        r5 = 1;
        if (r4 != r5) goto L_0x004e;
    L_0x003c:
        r8 = r8.get(r0);
        r8 = (java.util.List) r8;
        r8 = r8.get(r1);
        r0 = "identity";
        r8 = r0.equals(r8);
        if (r8 != 0) goto L_0x0052;
    L_0x004e:
        r0 = 1;
        r2 = r2 + r0;
        goto L_0x0056;
    L_0x0052:
        r2 = r2 + r2;
        goto L_0x0056;
    L_0x0054:
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
    L_0x0056:
        r0 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = java.lang.Math.min(r2, r0);
        r8 = (int) r0;
        r8 = java.nio.ByteBuffer.allocateDirect(r8);
        r7.a(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tou.a(bckx, bclb):void");
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        bckx = this.d;
        toq toq = this.f;
        ArrayDeque arrayDeque = toq.a;
        if (arrayDeque != null) {
            if (byteBuffer != arrayDeque.peekLast()) {
                toq.a.addLast(byteBuffer);
            }
            if (!byteBuffer.hasRemaining()) {
                byteBuffer = ByteBuffer.allocateDirect(8096);
            }
            bckx.a(byteBuffer);
            return;
        }
        throw new RuntimeException(toq.b);
    }

    public final void b(bckx bckx, bclb bclb) {
        ((Executor) tos.b.get()).execute(new tox(this, this.c, bclb));
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        ((Executor) tos.b.get()).execute(new tow(this, this.c, bclb, bcjd));
    }

    public final void c(bckx bckx, bclb bclb) {
        ((Executor) tos.b.get()).execute(new toz(this, this.c, bclb));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094 A:{SYNTHETIC} */
    public final void a(defpackage.bclb r4, defpackage.bcjd r5, boolean r6, java.nio.ByteBuffer r7) {
        /*
        r3 = this;
        r0 = r3.g;
        monitor-enter(r0);
        r1 = r3.g;	 Catch:{ all -> 0x00ab }
        r1 = r1.d;	 Catch:{ all -> 0x00ab }
        r2 = r3.b;	 Catch:{ all -> 0x00ab }
        r1.remove(r2);	 Catch:{ all -> 0x00ab }
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        r0 = 0;
        if (r6 == 0) goto L_0x0012;
    L_0x0010:
        r5 = r0;
        goto L_0x0026;
    L_0x0012:
        if (r5 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0026;
    L_0x0015:
        r5 = r4.b();
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r5 == r1) goto L_0x0010;
    L_0x001d:
        r5 = new bsj;
        r4 = r4.b();
        r5.<init>(r4);
    L_0x0026:
        r4 = 0;
        if (r5 == 0) goto L_0x002b;
    L_0x0029:
        r1 = 0;
        goto L_0x002e;
    L_0x002b:
        if (r6 != 0) goto L_0x0029;
    L_0x002d:
        r1 = 1;
    L_0x002e:
        java.lang.System.currentTimeMillis();
        if (r1 != 0) goto L_0x005d;
    L_0x0033:
        r7 = 6;
        r1 = "ChromiumSerializer";
        r7 = android.util.Log.isLoggable(r1, r7);
        if (r7 != 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0046;
    L_0x003d:
        if (r6 != 0) goto L_0x0046;
    L_0x003f:
        r6 = "ChromiumSerializer";
        r7 = "Request failed";
        android.util.Log.e(r6, r7, r5);
    L_0x0046:
        r6 = r3.a;
        r6 = r6.size();
        r7 = 0;
    L_0x004d:
        if (r7 >= r6) goto L_0x007e;
    L_0x004f:
        r1 = r3.a;
        r1 = r1.get(r7);
        r1 = (defpackage.tpb) r1;
        r1.a(r5);
        r7 = r7 + 1;
        goto L_0x004d;
    L_0x005d:
        r5 = r3.a;
        r5 = r5.size();
        r6 = 0;
    L_0x0064:
        if (r6 >= r5) goto L_0x007e;
    L_0x0066:
        r1 = r3.a;
        r1 = r1.get(r6);
        r1 = (defpackage.tpb) r1;
        r1.a(r7);
        r7 = r7.asReadOnlyBuffer();
        r7 = r7.position(r4);
        r7 = (java.nio.ByteBuffer) r7;
        r6 = r6 + 1;
        goto L_0x0064;
    L_0x007e:
        r5 = r3.g;
        r5 = r5.f;
        r3.f = r0;
        r5 = r3.g;
        r6 = r5.c;
        monitor-enter(r5);
        r7 = r3.a;	 Catch:{ all -> 0x00a8 }
        r7.clear();	 Catch:{ all -> 0x00a8 }
        r3.d = r0;	 Catch:{ all -> 0x00a8 }
        r3.e = r4;	 Catch:{ all -> 0x00a8 }
        monitor-exit(r5);	 Catch:{ all -> 0x00a8 }
        monitor-enter(r6);
        r4 = r6.a;	 Catch:{ all -> 0x00a5 }
        r4 = r4.size();	 Catch:{ all -> 0x00a5 }
        r5 = 50;
        if (r4 >= r5) goto L_0x00a3;
    L_0x009e:
        r4 = r6.a;	 Catch:{ all -> 0x00a5 }
        r4.offer(r3);	 Catch:{ all -> 0x00a5 }
    L_0x00a3:
        monitor-exit(r6);	 Catch:{ all -> 0x00a5 }
        return;
    L_0x00a5:
        r4 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00a5 }
        throw r4;
    L_0x00a8:
        r4 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00a8 }
        throw r4;
    L_0x00ab:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        goto L_0x00af;
    L_0x00ae:
        throw r4;
    L_0x00af:
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tou.a(bclb, bcjd, boolean, java.nio.ByteBuffer):void");
    }

    /* synthetic */ tou(tos tos) {
        this.g = tos;
    }
}
