package defpackage;

import java.nio.IntBuffer;

/* renamed from: abyd */
public class abyd implements abyu, abzk {
    public final abyv a = new abyv(this);
    private abya b;
    private int[] c;
    private IntBuffer d;

    public final void a(int i) {
    }

    public final synchronized void a(abya abya) {
        this.b = abya;
    }

    public synchronized boolean a(boolean z, abzm abzm, abyq abyq) {
        if (this.b == null) {
            return false;
        }
        return this.a.a(z, abzm, abyq);
    }

    public final void a(abyq abyq) {
        this.a.a();
    }

    /* JADX WARNING: Missing block: B:6:0x0010, code skipped:
            if (r1.length < (r8 * r0)) goto L_0x0012;
     */
    public synchronized void a() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.a;	 Catch:{ all -> 0x005d }
        r8 = r0.a;	 Catch:{ all -> 0x005d }
        r0 = r0.b;	 Catch:{ all -> 0x005d }
        r1 = r10.c;	 Catch:{ all -> 0x005d }
        r9 = 0;
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0012;
    L_0x000d:
        r1 = r1.length;	 Catch:{ all -> 0x005d }
        r2 = r8 * r0;
        if (r1 >= r2) goto L_0x0020;
    L_0x0012:
        r1 = r8 * r0;
        r2 = new int[r1];	 Catch:{ all -> 0x005d }
        r10.c = r2;	 Catch:{ all -> 0x005d }
        r2 = r10.c;	 Catch:{ all -> 0x005d }
        r1 = java.nio.IntBuffer.wrap(r2, r9, r1);	 Catch:{ all -> 0x005d }
        r10.d = r1;	 Catch:{ all -> 0x005d }
    L_0x0020:
        r1 = 0;
        r2 = 0;
        r5 = 6408; // 0x1908 float:8.98E-42 double:3.166E-320;
        r6 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;
        r7 = r10.d;	 Catch:{ all -> 0x005d }
        r3 = r8;
        r4 = r0;
        android.opengl.GLES20.glReadPixels(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x005d }
    L_0x002d:
        r1 = r10.c;	 Catch:{ all -> 0x005d }
        r2 = r1.length;	 Catch:{ all -> 0x005d }
        if (r9 >= r2) goto L_0x0047;
    L_0x0032:
        r2 = r1[r9];	 Catch:{ all -> 0x005d }
        r3 = -16711936; // 0xffffffffff00ff00 float:-1.7146522E38 double:NaN;
        r3 = r3 & r2;
        r4 = r2 >> 16;
        r4 = r4 & 255;
        r3 = r3 | r4;
        r2 = r2 & 255;
        r2 = r2 << 16;
        r2 = r2 | r3;
        r1[r9] = r2;	 Catch:{ all -> 0x005d }
        r9 = r9 + 1;
        goto L_0x002d;
    L_0x0047:
        r6 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x005d }
        r1 = r10.c;	 Catch:{ all -> 0x005d }
        r2 = r0 + -1;
        r2 = r2 * r8;
        r3 = -r8;
        r4 = r8;
        r5 = r0;
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x005d }
        r1 = r10.b;	 Catch:{ all -> 0x005d }
        r1.a(r0);	 Catch:{ all -> 0x005d }
        monitor-exit(r10);
        return;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r10);
        goto L_0x0061;
    L_0x0060:
        throw r0;
    L_0x0061:
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyd.a():void");
    }
}
