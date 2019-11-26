package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: ado */
public final class ado {
    private static final Interpolator u = new adr();
    public int a;
    public float b;
    private int c;
    private int d = -1;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int l;
    private VelocityTracker m;
    private final float n;
    private final int o;
    private final OverScroller p;
    private final adt q;
    private View r;
    private boolean s;
    private final ViewGroup t;
    private final Runnable v = new adq(this);

    public static ado a(ViewGroup viewGroup, adt adt) {
        return new ado(viewGroup.getContext(), viewGroup, adt);
    }

    public static ado a(ViewGroup viewGroup, float f, adt adt) {
        ado a = ado.a(viewGroup, adt);
        a.a = (int) (((float) a.a) * (1.0f / f));
        return a;
    }

    private ado(Context context, ViewGroup viewGroup, adt adt) {
        if (adt != null) {
            this.t = viewGroup;
            this.q = adt;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.a = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.b = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, u);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final void a(View view, int i) {
        if (view.getParent() == this.t) {
            this.r = view;
            this.d = i;
            this.q.b(view, i);
            b(1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        stringBuilder.append(this.t);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void a() {
        this.d = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public final boolean a(View view, int i, int i2) {
        this.r = view;
        this.d = -1;
        boolean a = a(i, i2, 0, 0);
        if (a || this.c != 0 || this.r == null) {
            return a;
        }
        this.r = null;
        return false;
    }

    public final boolean a(int i, int i2) {
        if (this.s) {
            return a(i, i2, (int) this.m.getXVelocity(this.d), (int) this.m.getYVelocity(this.d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private final boolean a(int i, int i2, int i3, int i4) {
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.p.abortAnimation();
            b(0);
            return false;
        }
        float f;
        float f2;
        float f3;
        View view = this.r;
        i2 = ado.b(i3, (int) this.b, (int) this.n);
        i3 = ado.b(i4, (int) this.b, (int) this.n);
        i4 = Math.abs(i5);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int i7 = abs2 + abs3;
        int i8 = i4 + abs;
        if (i2 != 0) {
            f = (float) abs2;
            f2 = (float) i7;
        } else {
            f = (float) i4;
            f2 = (float) i8;
        }
        f /= f2;
        if (i3 != 0) {
            f3 = (float) abs3;
            f2 = (float) i7;
        } else {
            f3 = (float) abs;
            f2 = (float) i8;
        }
        f3 /= f2;
        this.p.startScroll(left, top, i5, i6, (int) ((((float) a(i5, i2, this.q.a(view))) * f) + (((float) a(i6, i3, this.q.a())) * f3)));
        b(2);
        return true;
    }

    private final int a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f = (float) (width / 2);
        f += ((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 8.0f) * 0.47123894f))) * f;
        i2 = Math.abs(i2);
        if (i2 > 0) {
            i = Math.round(Math.abs(f / ((float) i2)) * 1000.0f) << 2;
        } else {
            i = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i, 600);
    }

    private static int b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i <= 0 ? -i3 : i3;
        } else {
            return i;
        }
    }

    private static float a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f <= 0.0f ? -f3 : f3;
        } else {
            return f;
        }
    }

    public final boolean b() {
        if (this.c == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                abe.e(this.r, left);
            }
            if (top != 0) {
                abe.d(this.r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.a(this.r, currX, currY, left);
            }
            if (computeScrollOffset) {
                if (currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                    this.p.abortAnimation();
                }
            }
            this.t.post(this.v);
        }
        return this.c == 2;
    }

    private final void a(float f, float f2) {
        this.s = true;
        this.q.a(this.r, f, f2);
        this.s = false;
        if (this.c == 1) {
            b(0);
        }
    }

    private final void c(int i) {
        if (this.e != null && a(i)) {
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0.0f;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k[i] = 0;
            this.l = ((1 << i) ^ -1) & this.l;
        }
    }

    private final void a(float f, float f2, int i) {
        int[] iArr;
        float[] fArr = this.e;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            int[] iArr4 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                fArr = this.f;
                System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                fArr = this.g;
                System.arraycopy(fArr, 0, fArr4, 0, fArr.length);
                fArr = this.h;
                System.arraycopy(fArr, 0, fArr5, 0, fArr.length);
                iArr = this.i;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iArr = this.j;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                iArr = this.k;
                System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            }
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = fArr5;
            this.i = iArr2;
            this.j = iArr3;
            this.k = iArr4;
        }
        fArr = this.e;
        this.g[i] = f;
        fArr[i] = f;
        fArr = this.f;
        this.h[i] = f2;
        fArr[i] = f2;
        iArr = this.i;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.t.getLeft() + this.o) {
            i2 = 1;
        }
        if (i5 < this.t.getTop() + this.o) {
            i2 |= 4;
        }
        if (i4 > this.t.getRight() - this.o) {
            i2 |= 2;
        }
        if (i5 > this.t.getBottom() - this.o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.l |= 1 << i;
    }

    private final void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.g[pointerId] = x;
                this.h[pointerId] = y;
            }
        }
    }

    public final boolean a(int i) {
        return ((1 << i) & this.l) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        this.t.removeCallbacks(this.v);
        if (this.c != i) {
            this.c = i;
            this.q.a(i);
            if (this.c == 0) {
                this.r = null;
            }
        }
    }

    private final boolean b(View view, int i) {
        if (view == this.r && this.d == i) {
            return true;
        }
        if (view == null || !this.q.a(view, i)) {
            return false;
        }
        this.d = i;
        a(view, i);
        return true;
    }

    /* JADX WARNING: Missing block: B:41:0x00ca, code skipped:
            if (r12 != r11) goto L_0x00d3;
     */
    public final boolean a(android.view.MotionEvent r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r17.getActionMasked();
        r3 = r17.getActionIndex();
        if (r2 != 0) goto L_0x0011;
    L_0x000e:
        r16.a();
    L_0x0011:
        r4 = r0.m;
        if (r4 != 0) goto L_0x001b;
    L_0x0015:
        r4 = android.view.VelocityTracker.obtain();
        r0.m = r4;
    L_0x001b:
        r4 = r0.m;
        r4.addMovement(r1);
        r4 = 2;
        r6 = 1;
        if (r2 == 0) goto L_0x00f0;
    L_0x0024:
        if (r2 == r6) goto L_0x00ec;
    L_0x0026:
        if (r2 == r4) goto L_0x0060;
    L_0x0028:
        r7 = 3;
        if (r2 == r7) goto L_0x00ec;
    L_0x002b:
        r7 = 5;
        if (r2 == r7) goto L_0x003c;
    L_0x002e:
        r4 = 6;
        if (r2 == r4) goto L_0x0033;
    L_0x0031:
        goto L_0x0111;
    L_0x0033:
        r1 = r1.getPointerId(r3);
        r0.c(r1);
        goto L_0x0111;
    L_0x003c:
        r2 = r1.getPointerId(r3);
        r7 = r1.getX(r3);
        r1 = r1.getY(r3);
        r0.a(r7, r1, r2);
        r3 = r0.c;
        if (r3 == 0) goto L_0x0111;
    L_0x004f:
        if (r3 != r4) goto L_0x0111;
    L_0x0051:
        r3 = (int) r7;
        r1 = (int) r1;
        r1 = r0.b(r3, r1);
        r3 = r0.r;
        if (r1 != r3) goto L_0x0111;
    L_0x005b:
        r0.b(r1, r2);
        goto L_0x0111;
    L_0x0060:
        r2 = r0.e;
        if (r2 == 0) goto L_0x0111;
    L_0x0064:
        r2 = r0.f;
        if (r2 == 0) goto L_0x0111;
    L_0x0068:
        r2 = r17.getPointerCount();
        r3 = 0;
    L_0x006d:
        if (r3 >= r2) goto L_0x00e8;
    L_0x006f:
        r4 = r1.getPointerId(r3);
        r7 = r0.d(r4);
        if (r7 == 0) goto L_0x00e5;
    L_0x0079:
        r7 = r1.getX(r3);
        r8 = r1.getY(r3);
        r9 = r0.e;
        r9 = r9[r4];
        r9 = r7 - r9;
        r10 = r0.f;
        r10 = r10[r4];
        r10 = r8 - r10;
        r7 = (int) r7;
        r8 = (int) r8;
        r7 = r0.b(r7, r8);
        if (r7 == 0) goto L_0x009e;
    L_0x0095:
        r8 = r0.a(r7, r9, r10);
        if (r8 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x009e;
    L_0x009c:
        r8 = 1;
        goto L_0x009f;
    L_0x009e:
        r8 = 0;
    L_0x009f:
        if (r8 == 0) goto L_0x00d3;
    L_0x00a1:
        r11 = r7.getLeft();
        r12 = r0.q;
        r13 = (int) r9;
        r13 = r13 + r11;
        r12 = r12.c(r7, r13);
        r13 = r7.getTop();
        r14 = r0.q;
        r15 = (int) r10;
        r15 = r15 + r13;
        r14 = r14.d(r7, r15);
        r15 = r0.q;
        r15 = r15.a(r7);
        r5 = r0.q;
        r5 = r5.a();
        if (r15 == 0) goto L_0x00cc;
    L_0x00c7:
        if (r15 > 0) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00d3;
    L_0x00ca:
        if (r12 != r11) goto L_0x00d3;
    L_0x00cc:
        if (r5 == 0) goto L_0x00e8;
    L_0x00ce:
        if (r5 <= 0) goto L_0x00d3;
    L_0x00d0:
        if (r14 != r13) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00e8;
    L_0x00d3:
        r0.b(r9, r10, r4);
        r5 = r0.c;
        if (r5 != r6) goto L_0x00db;
    L_0x00da:
        goto L_0x00e8;
    L_0x00db:
        if (r8 != 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00e5;
    L_0x00de:
        r4 = r0.b(r7, r4);
        if (r4 == 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e8;
    L_0x00e5:
        r3 = r3 + 1;
        goto L_0x006d;
    L_0x00e8:
        r16.c(r17);
        goto L_0x0111;
    L_0x00ec:
        r16.a();
        goto L_0x0111;
    L_0x00f0:
        r2 = r17.getX();
        r3 = r17.getY();
        r5 = 0;
        r1 = r1.getPointerId(r5);
        r0.a(r2, r3, r1);
        r2 = (int) r2;
        r3 = (int) r3;
        r2 = r0.b(r2, r3);
        r3 = r0.r;
        if (r2 != r3) goto L_0x0111;
    L_0x010a:
        r3 = r0.c;
        if (r3 != r4) goto L_0x0111;
    L_0x010e:
        r0.b(r2, r1);
    L_0x0111:
        r1 = r0.c;
        if (r1 != r6) goto L_0x0116;
    L_0x0115:
        return r6;
    L_0x0116:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ado.a(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:31:0x0066, code skipped:
            if (r9.d == -1) goto L_0x006c;
     */
    public final void b(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r0 = r10.getActionMasked();
        r1 = r10.getActionIndex();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r9.a();
    L_0x000d:
        r2 = r9.m;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r9.m = r2;
    L_0x0017:
        r2 = r9.m;
        r2.addMovement(r10);
        r2 = 0;
        if (r0 == 0) goto L_0x0187;
    L_0x001f:
        r3 = 1;
        if (r0 == r3) goto L_0x017c;
    L_0x0022:
        r4 = 2;
        if (r0 == r4) goto L_0x00c0;
    L_0x0025:
        r4 = 3;
        if (r0 == r4) goto L_0x00b4;
    L_0x0028:
        r4 = 5;
        if (r0 == r4) goto L_0x0073;
    L_0x002b:
        r4 = 6;
        if (r0 == r4) goto L_0x0030;
    L_0x002e:
        goto L_0x019f;
    L_0x0030:
        r0 = r10.getPointerId(r1);
        r1 = r9.c;
        if (r1 != r3) goto L_0x006f;
    L_0x0038:
        r1 = r9.d;
        if (r0 != r1) goto L_0x006f;
    L_0x003c:
        r1 = r10.getPointerCount();
    L_0x0040:
        if (r2 >= r1) goto L_0x006c;
    L_0x0042:
        r3 = r10.getPointerId(r2);
        r4 = r9.d;
        if (r3 == r4) goto L_0x0069;
    L_0x004a:
        r4 = r10.getX(r2);
        r5 = r10.getY(r2);
        r4 = (int) r4;
        r5 = (int) r5;
        r4 = r9.b(r4, r5);
        r5 = r9.r;
        if (r4 == r5) goto L_0x005d;
    L_0x005c:
        goto L_0x0069;
    L_0x005d:
        r3 = r9.b(r5, r3);
        if (r3 == 0) goto L_0x0069;
    L_0x0063:
        r10 = r9.d;
        r1 = -1;
        if (r10 != r1) goto L_0x006f;
    L_0x0068:
        goto L_0x006c;
    L_0x0069:
        r2 = r2 + 1;
        goto L_0x0040;
    L_0x006c:
        r9.c();
    L_0x006f:
        r9.c(r0);
        return;
    L_0x0073:
        r0 = r10.getPointerId(r1);
        r2 = r10.getX(r1);
        r10 = r10.getY(r1);
        r9.a(r2, r10, r0);
        r1 = r9.c;
        if (r1 != 0) goto L_0x0090;
    L_0x0086:
        r1 = (int) r2;
        r10 = (int) r10;
        r10 = r9.b(r1, r10);
        r9.b(r10, r0);
        return;
    L_0x0090:
        r1 = (int) r2;
        r10 = (int) r10;
        r2 = r9.r;
        if (r2 == 0) goto L_0x019f;
    L_0x0096:
        r3 = r2.getLeft();
        if (r1 < r3) goto L_0x019f;
    L_0x009c:
        r3 = r2.getRight();
        if (r1 >= r3) goto L_0x019f;
    L_0x00a2:
        r1 = r2.getTop();
        if (r10 < r1) goto L_0x019f;
    L_0x00a8:
        r1 = r2.getBottom();
        if (r10 >= r1) goto L_0x019f;
    L_0x00ae:
        r10 = r9.r;
        r9.b(r10, r0);
        return;
    L_0x00b4:
        r10 = r9.c;
        if (r10 != r3) goto L_0x00bc;
    L_0x00b8:
        r10 = 0;
        r9.a(r10, r10);
    L_0x00bc:
        r9.a();
        return;
    L_0x00c0:
        r0 = r9.c;
        if (r0 != r3) goto L_0x0136;
    L_0x00c4:
        r0 = r9.d;
        r0 = r9.d(r0);
        if (r0 == 0) goto L_0x019f;
    L_0x00cc:
        r0 = r9.d;
        r0 = r10.findPointerIndex(r0);
        r1 = r10.getX(r0);
        r0 = r10.getY(r0);
        r2 = r9.g;
        r3 = r9.d;
        r2 = r2[r3];
        r1 = r1 - r2;
        r1 = (int) r1;
        r2 = r9.h;
        r2 = r2[r3];
        r0 = r0 - r2;
        r0 = (int) r0;
        r2 = r9.r;
        r2 = r2.getLeft();
        r2 = r2 + r1;
        r3 = r9.r;
        r3 = r3.getTop();
        r3 = r3 + r0;
        r4 = r9.r;
        r4 = r4.getLeft();
        r5 = r9.r;
        r5 = r5.getTop();
        if (r1 == 0) goto L_0x0113;
    L_0x0104:
        r6 = r9.q;
        r7 = r9.r;
        r2 = r6.c(r7, r2);
        r6 = r9.r;
        r7 = r2 - r4;
        defpackage.abe.e(r6, r7);
    L_0x0113:
        if (r0 == 0) goto L_0x0124;
    L_0x0115:
        r6 = r9.q;
        r7 = r9.r;
        r3 = r6.d(r7, r3);
        r6 = r9.r;
        r5 = r3 - r5;
        defpackage.abe.d(r6, r5);
    L_0x0124:
        if (r1 == 0) goto L_0x0127;
    L_0x0126:
        goto L_0x0129;
    L_0x0127:
        if (r0 == 0) goto L_0x0132;
    L_0x0129:
        r0 = r9.q;
        r1 = r9.r;
        r4 = r2 - r4;
        r0.a(r1, r2, r3, r4);
    L_0x0132:
        r9.c(r10);
        return;
    L_0x0136:
        r0 = r10.getPointerCount();
    L_0x013a:
        if (r2 >= r0) goto L_0x0178;
    L_0x013c:
        r1 = r10.getPointerId(r2);
        r4 = r9.d(r1);
        if (r4 == 0) goto L_0x0175;
    L_0x0146:
        r4 = r10.getX(r2);
        r5 = r10.getY(r2);
        r6 = r9.e;
        r6 = r6[r1];
        r6 = r4 - r6;
        r7 = r9.f;
        r7 = r7[r1];
        r7 = r5 - r7;
        r9.b(r6, r7, r1);
        r8 = r9.c;
        if (r8 == r3) goto L_0x0178;
    L_0x0161:
        r4 = (int) r4;
        r5 = (int) r5;
        r4 = r9.b(r4, r5);
        r5 = r9.a(r4, r6, r7);
        if (r5 != 0) goto L_0x016e;
    L_0x016d:
        goto L_0x0175;
    L_0x016e:
        r1 = r9.b(r4, r1);
        if (r1 == 0) goto L_0x0175;
    L_0x0174:
        goto L_0x0178;
    L_0x0175:
        r2 = r2 + 1;
        goto L_0x013a;
    L_0x0178:
        r9.c(r10);
        return;
    L_0x017c:
        r10 = r9.c;
        if (r10 != r3) goto L_0x0183;
    L_0x0180:
        r9.c();
    L_0x0183:
        r9.a();
        return;
    L_0x0187:
        r0 = r10.getX();
        r1 = r10.getY();
        r10 = r10.getPointerId(r2);
        r2 = (int) r0;
        r3 = (int) r1;
        r2 = r9.b(r2, r3);
        r9.a(r0, r1, r10);
        r9.b(r2, r10);
    L_0x019f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ado.b(android.view.MotionEvent):void");
    }

    private final void b(float f, float f2, int i) {
        c(f, f2, i);
        c(f2, f, i);
        c(f, f2, i);
        c(f2, f, i);
    }

    private final boolean c(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        return false;
    }

    private final boolean a(View view, float f, float f2) {
        if (view != null) {
            Object obj = this.q.a(view) <= 0 ? null : 1;
            Object obj2 = this.q.a() <= 0 ? null : 1;
            if (obj == null || obj2 == null) {
                return obj != null ? Math.abs(f) > ((float) this.a) : obj2 != null && Math.abs(f2) > ((float) this.a);
            } else {
                int i = this.a;
                return (f * f) + (f2 * f2) > ((float) (i * i));
            }
        }
    }

    private final void c() {
        this.m.computeCurrentVelocity(1000, this.n);
        a(ado.a(this.m.getXVelocity(this.d), this.b, this.n), ado.a(this.m.getYVelocity(this.d), this.b, this.n));
    }

    private final View b(int i, int i2) {
        int childCount = this.t.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.t.getChildAt(childCount);
            if (i >= childAt.getLeft()) {
                if (i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            }
        }
    }

    private final boolean d(int i) {
        if (a(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }
}
