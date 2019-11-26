package defpackage;

import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: aqg */
public final class aqg implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d = RecyclerView.S;
    public final /* synthetic */ RecyclerView e;
    private boolean f = false;
    private boolean g = false;

    public aqg(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.S);
    }

    public final void run() {
        RecyclerView recyclerView = this.e;
        if (recyclerView.n == null) {
            b();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.e();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int[] iArr;
            int i;
            int i2;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.a;
            int i4 = currY - this.b;
            this.a = currX;
            this.b = currY;
            RecyclerView recyclerView2 = this.e;
            int[] iArr2 = recyclerView2.R;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView2.a(i3, i4, iArr2, null, 1)) {
                iArr = this.e.R;
                i3 -= iArr[0];
                i4 -= iArr[1];
            }
            if (this.e.getOverScrollMode() != 2) {
                this.e.c(i3, i4);
            }
            RecyclerView recyclerView3 = this.e;
            if (recyclerView3.m != null) {
                int[] iArr3 = recyclerView3.R;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.a(i3, i4, iArr3);
                recyclerView3 = this.e;
                iArr3 = recyclerView3.R;
                i = iArr3[0];
                i2 = iArr3[1];
                i3 -= i;
                i4 -= i2;
                aqc aqc = recyclerView3.n.m;
                if (!(aqc == null || aqc.e || !aqc.f)) {
                    currX = recyclerView3.L.b();
                    if (currX == 0) {
                        aqc.e();
                    } else if (aqc.b >= currX) {
                        aqc.b = currX - 1;
                        aqc.a(i, i2);
                    } else {
                        aqc.a(i, i2);
                    }
                }
            } else {
                i2 = 0;
                i = 0;
            }
            if (!this.e.p.isEmpty()) {
                this.e.invalidate();
            }
            RecyclerView recyclerView4 = this.e;
            iArr = recyclerView4.R;
            iArr[0] = 0;
            iArr[1] = 0;
            recyclerView4.a(i, i2, i3, i4, null, 1, iArr);
            recyclerView3 = this.e;
            int[] iArr4 = recyclerView3.R;
            i3 -= iArr4[0];
            i4 -= iArr4[1];
            if (!(i == 0 && i2 == 0)) {
                recyclerView3.e(i, i2);
            }
            if (!this.e.awakenScrollBars()) {
                this.e.invalidate();
            }
            Object obj = (!overScroller.isFinished() && ((overScroller.getCurrX() != overScroller.getFinalX() && i3 == 0) || (overScroller.getCurrY() != overScroller.getFinalY() && i4 == 0))) ? null : 1;
            recyclerView2 = this.e;
            aqc aqc2 = recyclerView2.n.m;
            if ((aqc2 != null && aqc2.e) || obj == null) {
                a();
                recyclerView = this.e;
                ani ani = recyclerView.J;
                if (ani != null) {
                    ani.a(recyclerView, i3, i4);
                }
            } else {
                if (recyclerView2.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    currX = i3 < 0 ? -currVelocity : i3 <= 0 ? 0 : currVelocity;
                    if (i4 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i4 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView5 = this.e;
                    if (currX < 0) {
                        recyclerView5.g();
                        if (recyclerView5.z.isFinished()) {
                            recyclerView5.z.onAbsorb(-currX);
                        }
                    } else if (currX > 0) {
                        recyclerView5.h();
                        if (recyclerView5.B.isFinished()) {
                            recyclerView5.B.onAbsorb(currX);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView5.i();
                        if (recyclerView5.A.isFinished()) {
                            recyclerView5.A.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView5.j();
                        if (recyclerView5.C.isFinished()) {
                            recyclerView5.C.onAbsorb(currVelocity);
                        }
                    }
                    if (!(currX == 0 && currVelocity == 0)) {
                        abe.e(recyclerView5);
                    }
                }
                if (RecyclerView.d) {
                    this.e.K.a();
                }
            }
        }
        aqc aqc3 = this.e.n.m;
        if (aqc3 != null && aqc3.e) {
            aqc3.a(0, 0);
        }
        this.f = false;
        if (this.g) {
            c();
            return;
        }
        this.e.b(0);
        this.e.g(1);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            c();
        }
    }

    private final void c() {
        this.e.removeCallbacks(this);
        abe.a(this.e, (Runnable) this);
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == aocf.UNSET_ENUM_VALUE) {
            int height;
            i3 = Math.abs(i);
            int abs = Math.abs(i2);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            if (i3 <= abs) {
                height = this.e.getHeight();
            } else {
                height = this.e.getWidth();
            }
            float f = (float) height;
            float f2 = (float) (height / 2);
            f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f) - 8.0f) * 0.47123894f))) * f2;
            if (sqrt > 0) {
                i3 = Math.round(Math.abs(f2 / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (i3 <= abs) {
                    i3 = abs;
                }
                i3 = (int) (((((float) i3) / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i3, 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.S;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.b(2);
        this.c.startScroll(0, 0, i, i2, i4);
        if (VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    public final void b() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }
}
