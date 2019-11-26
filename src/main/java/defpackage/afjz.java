package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: afjz */
public abstract class afjz extends afki implements afhf, afkh {
    private final Runnable a;
    private final Runnable b;
    private final Point c = new Point();
    public int d;
    public int e;
    public afkj f;
    private final afhc h;
    private final Handler i;
    private int j;
    private int k;
    private Window l;
    private boolean m;
    private boolean n;
    private float o = -1.0f;
    private float p;

    public afjz(Context context) {
        super(context);
        if (getContext() instanceof Activity) {
            this.l = ((Activity) getContext()).getWindow();
            Window window = this.l;
            if (window != null) {
                this.m = window.getAttributes().screenBrightness == 1.0f;
            }
        }
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(this.c);
            Point point = this.c;
            if (point.y > point.x) {
                int i = point.y;
                point.y = point.x;
                point.x = i;
            }
        }
        this.a = new afjy(this);
        this.b = new afkb(this);
        this.h = afhn.a(context);
        this.i = new Handler(context.getMainLooper());
    }

    public void a(afkm afkm) {
    }

    public final void a(afkn afkn, boolean z, boolean z2) {
        afkg.a(this, afkn);
    }

    public final void a(Surface surface) {
    }

    public void a(boolean z, byte[] bArr, long j) {
    }

    public final void e() {
    }

    public final View f() {
        return this;
    }

    public aewz g() {
        return null;
    }

    public ofb h() {
        return null;
    }

    public void i() {
    }

    public SurfaceHolder l() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public boolean q() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean r() {
        return false;
    }

    public abstract void s();

    public abstract void t();

    public final void a(afkj afkj) {
        this.f = afkj;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (q()) {
            int defaultSize = afjz.getDefaultSize(this.j, i);
            int defaultSize2 = afjz.getDefaultSize(this.k, i2);
            int i3 = this.j;
            if (i3 > 0) {
                int i4 = this.k;
                if (i4 > 0) {
                    int i5 = i3 * defaultSize2;
                    int i6 = defaultSize * i4;
                    float f = (((float) i5) / ((float) i6)) - 4.0f;
                    if (f > 0.01f) {
                        defaultSize2 = i6 / i3;
                    } else if (f < -0.01f) {
                        defaultSize = i5 / i4;
                    }
                }
            }
            this.d = afjz.resolveSize(defaultSize, i);
            this.e = afjz.resolveSize(defaultSize2, i2);
        } else {
            this.e = MeasureSpec.getSize(i2);
            this.d = MeasureSpec.getSize(i);
        }
        setMeasuredDimension(this.d, this.e);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4);
    }

    /* JADX WARNING: Missing block: B:31:0x0060, code skipped:
            if (r0 != 1.0f) goto L_0x0062;
     */
    public final void a(int r8, int r9, int r10, int r11) {
        /*
        r7 = this;
        r0 = r7.n;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m;
        if (r0 == 0) goto L_0x00a5;
    L_0x0008:
        r0 = r7.l;
        if (r0 == 0) goto L_0x00a5;
    L_0x000c:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r8 == 0) goto L_0x0012;
    L_0x0010:
        goto L_0x008f;
    L_0x0012:
        if (r9 != 0) goto L_0x008f;
    L_0x0014:
        r8 = r7.c;
        r8 = r8.x;
        if (r10 >= r8) goto L_0x0020;
    L_0x001a:
        r8 = r7.c;
        r8 = r8.y;
        if (r11 < r8) goto L_0x008f;
    L_0x0020:
        r8 = r7.n;
        if (r8 == 0) goto L_0x008f;
    L_0x0024:
        r8 = r7.r();
        if (r8 != 0) goto L_0x008f;
    L_0x002a:
        r8 = r7.h;
        r8 = r8.a();
        r9 = r7.p;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r11 <= 0) goto L_0x005c;
    L_0x0038:
        r11 = r7.o;
        r1 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x004e;
    L_0x003e:
        r1 = (double) r8;
        r3 = (double) r9;
        r5 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        java.lang.Double.isNaN(r3);
        r3 = r3 * r5;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x004e;
    L_0x004b:
        r7.o = r0;
        goto L_0x0062;
    L_0x004e:
        r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r11 != 0) goto L_0x005b;
    L_0x0052:
        r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r9 <= 0) goto L_0x005b;
    L_0x0056:
        r7.o = r10;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0062;
    L_0x005b:
        return;
    L_0x005c:
        r0 = r7.o;
        r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r9 == 0) goto L_0x008e;
    L_0x0062:
        r9 = new java.lang.StringBuilder;
        r10 = 46;
        r9.<init>(r10);
        r10 = "ambient=";
        r9.append(r10);
        r9.append(r8);
        r8 = ", final=";
        r9.append(r8);
        r9.append(r0);
        r9.toString();
        r8 = r7.l;
        r8 = r8.getAttributes();
        r9 = r7.o;
        r8.screenBrightness = r9;
        r9 = r7.l;
        r9.setAttributes(r8);
        r8 = 1;
        r7.m = r8;
    L_0x008e:
        return;
    L_0x008f:
        r8 = r7.m;
        if (r8 == 0) goto L_0x00a5;
    L_0x0093:
        r8 = r7.l;
        r8 = r8.getAttributes();
        r8.screenBrightness = r0;
        r7.o = r0;
        r9 = r7.l;
        r9.setAttributes(r8);
        r8 = 0;
        r7.m = r8;
    L_0x00a5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjz.a(int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, int i, int i2) {
        int i3 = this.d;
        i = (i - i3) / 2;
        int i4 = this.e;
        i2 = (i2 - i4) / 2;
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void a(boolean z, float f, float f2) {
        this.n = z;
        this.p = f2;
        a(getLeft(), getTop(), getRight(), getBottom());
        if (z) {
            this.h.a(this);
        } else {
            this.h.b(this);
        }
    }

    public void a(int i, int i2) {
        this.j = i;
        this.k = i2;
        requestLayout();
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final void c(int i) {
        a(this.b, this.a, i);
    }

    public final void c() {
        a(this.a, this.b, 0);
    }

    public final void a(afkn afkn) {
        if (afkn != o()) {
            throw new UnsupportedOperationException();
        }
    }

    @Deprecated
    public final boolean j() {
        return o() == afkn.GL_GVR || o() == afkn.GL_VPX;
    }

    public final void p() {
        this.i.post(new afka(this));
    }
}
