package defpackage;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* renamed from: afkh */
public interface afkh extends afjt {
    public static final boolean g;

    /* JADX WARNING: Missing block: B:5:0x0014, code skipped:
            if ("6.0.1".equals(android.os.Build.VERSION.RELEASE) != false) goto L_0x0016;
     */
    static {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 1;
        r3 = 23;
        if (r0 > r3) goto L_0x0016;
    L_0x0008:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 != r3) goto L_0x0017;
    L_0x000c:
        r0 = android.os.Build.VERSION.RELEASE;
        r3 = "6.0.1";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0017;
    L_0x0016:
        r1 = 1;
    L_0x0017:
        g = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afkh.<clinit>():void");
    }

    int a();

    void a(int i);

    void a(afkj afkj);

    void a(afkm afkm);

    void a(afkn afkn);

    void a(afkn afkn, boolean z, boolean z2);

    void a(Surface surface);

    void a(boolean z, float f, float f2);

    void a(boolean z, byte[] bArr, long j);

    int b();

    void b(int i);

    void c();

    void c(int i);

    void d();

    void e();

    View f();

    aewz g();

    ofb h();

    void i();

    Surface k();

    SurfaceHolder l();

    afkn o();
}
