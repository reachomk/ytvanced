package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.AsyncTask;

/* renamed from: acad */
final class acad extends AsyncTask {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Point c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ znq e;
    private final /* synthetic */ zos f;
    private final /* synthetic */ acab g;

    acad(acab acab, Context context, String str, Point point, boolean z, znq znq, zos zos) {
        this.g = acab;
        this.a = context;
        this.b = str;
        this.c = point;
        this.d = z;
        this.e = znq;
        this.f = zos;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0005 A:{LOOP_START, SYNTHETIC, LOOP:0: B:2:0x0005->B:36:0x0005} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
        r8 = this;
        r9 = r8.g;
        r9 = r9.g;
        monitor-enter(r9);
    L_0x0005:
        r0 = r8.g;	 Catch:{ all -> 0x00f3 }
        r1 = r0.e;	 Catch:{ all -> 0x00f3 }
        if (r1 != 0) goto L_0x0015;
    L_0x000b:
        r1 = r0.h;	 Catch:{ all -> 0x00f3 }
        if (r1 != 0) goto L_0x0015;
    L_0x000f:
        r0 = r0.g;	 Catch:{ InterruptedException -> 0x0005 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0005 }
        goto L_0x0005;
    L_0x0015:
        monitor-exit(r9);	 Catch:{ all -> 0x00f3 }
        r9 = r8.g;
        r9 = r9.h;
        if (r9 != 0) goto L_0x00f1;
    L_0x001c:
        r9 = r8.a;
        r0 = new xvf;
        r0.<init>();
        r1 = new abzv;
        r1.<init>(r9, r0);
        r9 = r8.b;
        r9 = r1.b(r9);
        if (r9 == 0) goto L_0x00e9;
    L_0x0030:
        r0 = r8.g;
        r0 = r0.i;
        r0.c();
        r0 = r8.c;
        r1 = r8.d;
        defpackage.acab.a(r0, r1);
        r2 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        r3 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        if (r1 == 0) goto L_0x0054;
    L_0x0044:
        r1 = r0.x;
        r1 = java.lang.Math.min(r1, r2);
        r2 = r0.y;
        r2 = java.lang.Math.min(r2, r3);
        r0.set(r1, r2);
        goto L_0x0063;
    L_0x0054:
        r1 = r0.x;
        r1 = java.lang.Math.min(r1, r3);
        r3 = r0.y;
        r2 = java.lang.Math.min(r3, r2);
        r0.set(r1, r2);
    L_0x0063:
        r0 = r8.c;
        r0 = r0.x;
        r1 = r8.c;
        r1 = r1.y;
        r2 = r8.g;
        r3 = r8.a;
        r4 = new zld;
        r5 = r2.d;
        r4.<init>(r3, r2, r5);
        r2.f = r4;
        r2 = r8.g;
        r2 = r2.f;
        r3 = r8.e;
        r4 = r8.f;
        r2.a(r3, r4);
        r2 = r8.g;
        r2 = r2.f;
        r2.d();
        r2 = r8.g;
        r3 = r2.f;
        r4 = r2.e;
        r5 = r3.k;
        r6 = 1;
        r5 = r5 ^ r6;
        defpackage.amqw.b(r5);
        r5 = 0;
        if (r0 <= 0) goto L_0x009c;
    L_0x009a:
        r7 = 1;
        goto L_0x009d;
    L_0x009c:
        r7 = 0;
    L_0x009d:
        defpackage.amqw.a(r7);
        if (r1 <= 0) goto L_0x00a3;
    L_0x00a2:
        r5 = 1;
    L_0x00a3:
        defpackage.amqw.a(r5);
        r5 = r3.i;
        r5.N = r2;
        r2 = r5.b;
        r5 = 7;
        r4 = r2.obtainMessage(r5, r0, r1, r4);
        r2.sendMessage(r4);
        r3.p();
        r2 = r3.i;
        r2.a(r0, r1);
        r0 = r8.g;
        r0 = r0.f;
        r0.r = r9;
        r1 = 10;
        r0.s = r1;
        r0.q();
        r9 = r8.g;
        r0 = r9.f;
        r9 = r9.b;
        r0.a(r9);
        r9 = r8.g;
        r0 = r9.f;
        r9 = r9.g();
        r0.a(r9);
        r9 = r8.g;
        r0 = r9.f;
        r1 = r0.i;
        r1.M = r9;
        r0.k();
        goto L_0x00f1;
    L_0x00e9:
        r9 = new java.lang.IllegalStateException;
        r0 = "Thumbnail not found";
        r9.<init>(r0);
        throw r9;
    L_0x00f1:
        r9 = 0;
        return r9;
    L_0x00f3:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x00f3 }
        goto L_0x00f7;
    L_0x00f6:
        throw r0;
    L_0x00f7:
        goto L_0x00f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acad.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
