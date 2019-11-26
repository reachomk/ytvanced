package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: bpw */
public final class bpw implements Runnable {
    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private long i;
    private boolean j;

    public bpw(PhotoView photoView) {
        this.b = photoView;
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        if (this.a) {
            return false;
        }
        this.c = f3;
        this.d = f4;
        this.f = f2;
        this.i = System.currentTimeMillis();
        this.g = f;
        f2 = this.f;
        this.e = f2 > f;
        this.h = (f2 - f) / 200.0f;
        this.a = true;
        this.j = false;
        this.b.post(this);
        return true;
    }

    public final void a() {
        this.a = false;
        this.j = true;
    }

    /* JADX WARNING: Missing block: B:8:0x002b, code skipped:
            if (r6.e == (r4 > r0)) goto L_0x002d;
     */
    public final void run() {
        /*
        r6 = this;
        r0 = r6.j;
        if (r0 != 0) goto L_0x0042;
    L_0x0004:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r6.i;
        r4 = r6.g;
        r5 = r6.h;
        r0 = r0 - r2;
        r0 = (float) r0;
        r5 = r5 * r0;
        r4 = r4 + r5;
        r0 = r6.b;
        r1 = r6.c;
        r2 = r6.d;
        r0.a(r4, r1, r2);
        r0 = r6.f;
        r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r1 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r6.e;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x002a;
    L_0x0028:
        r2 = 0;
        goto L_0x002b;
    L_0x002a:
        r2 = 1;
    L_0x002b:
        if (r1 != r2) goto L_0x0039;
    L_0x002d:
        r1 = r6.b;
        r2 = r6.c;
        r3 = r6.d;
        r1.a(r0, r2, r3);
        r6.a();
    L_0x0039:
        r0 = r6.j;
        if (r0 != 0) goto L_0x0042;
    L_0x003d:
        r0 = r6.b;
        r0.post(r6);
    L_0x0042:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpw.run():void");
    }
}
