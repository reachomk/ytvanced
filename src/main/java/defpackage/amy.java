package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: amy */
public final class amy extends apk implements aps {
    private static final int[] p = new int[]{16842919};
    private static final int[] q = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D = new amx(this);
    private final apv E = new ana(this);
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public RecyclerView j;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public final ValueAnimator n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public int o = 0;
    private final int r;
    private final int s;
    private final int t;
    private final StateListDrawable u;
    private final Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;

    public amy(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.t = Math.max(i, drawable.getIntrinsicWidth());
        this.w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.x = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.r = i3;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new amz(this));
        this.n.addUpdateListener(new anb(this));
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b((apk) this);
                this.j.b((aps) this);
                this.j.b(this.E);
                d();
            }
            this.j = recyclerView;
            recyclerView = this.j;
            if (recyclerView != null) {
                recyclerView.a((apk) this);
                this.j.a((aps) this);
                this.j.a(this.E);
            }
        }
    }

    public final void a(boolean z) {
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.j.invalidate();
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (i == 2 && this.m != 2) {
            this.b.setState(p);
            d();
        }
        if (i == 0) {
            a();
        } else {
            c();
        }
        if (this.m == 2 && i != 2) {
            this.b.setState(q);
            b(1200);
        } else if (i == 1) {
            b(1500);
        }
        this.m = i;
    }

    private final boolean b() {
        return abe.g(this.j) == 1;
    }

    private final void c() {
        int i = this.o;
        if (i != 0) {
            if (i == 3) {
                this.n.cancel();
            } else {
                return;
            }
        }
        this.o = 1;
        this.n.setFloatValues(new float[]{((Float) this.n.getAnimatedValue()).floatValue(), 1.0f});
        this.n.setDuration(500);
        this.n.setStartDelay(0);
        this.n.start();
    }

    private final void d() {
        this.j.removeCallbacks(this.D);
    }

    private final void b(int i) {
        d();
        this.j.postDelayed(this.D, (long) i);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.h == this.j.getWidth() && this.i == this.j.getHeight()) {
            if (this.o != 0) {
                int i;
                int i2;
                int i3;
                int i4;
                if (this.k) {
                    i = this.h;
                    i2 = this.s;
                    i -= i2;
                    i3 = this.e;
                    i4 = this.d;
                    i3 -= i4 / 2;
                    this.b.setBounds(0, 0, i2, i4);
                    this.c.setBounds(0, 0, this.t, this.i);
                    if (b()) {
                        this.c.draw(canvas);
                        canvas.translate((float) this.s, (float) i3);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate((float) (-this.s), (float) (-i3));
                    } else {
                        canvas.translate((float) i, 0.0f);
                        this.c.draw(canvas);
                        canvas.translate(0.0f, (float) i3);
                        this.b.draw(canvas);
                        canvas.translate((float) (-i), (float) (-i3));
                    }
                }
                if (this.l) {
                    i = this.i;
                    i2 = this.w;
                    i -= i2;
                    i3 = this.g;
                    i4 = this.f;
                    i3 -= i4 / 2;
                    this.u.setBounds(0, 0, i4, i2);
                    this.v.setBounds(0, 0, this.h, this.x);
                    canvas.translate(0.0f, (float) i);
                    this.v.draw(canvas);
                    canvas.translate((float) i3, 0.0f);
                    this.u.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i));
                }
            }
            return;
        }
        this.h = this.j.getWidth();
        this.i = this.j.getHeight();
        a(0);
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.m;
        boolean z = false;
        if (i == 1) {
            boolean a = a(motionEvent.getX(), motionEvent.getY());
            boolean b = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (a || b)) {
                if (b) {
                    this.A = 1;
                    this.z = (float) ((int) motionEvent.getX());
                } else if (a) {
                    this.A = 2;
                    this.y = (float) ((int) motionEvent.getY());
                }
                a(2);
                z = true;
            }
        } else if (i != 2) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = a(motionEvent.getX(), motionEvent.getY());
                boolean b = b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.A = 1;
                        this.z = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.A = 2;
                        this.y = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.m == 2) {
                this.y = 0.0f;
                this.z = 0.0f;
                a(1);
                this.A = 0;
            } else if (motionEvent.getAction() == 2 && this.m == 2) {
                int[] iArr;
                c();
                if (this.A == 1) {
                    float x = motionEvent.getX();
                    iArr = this.C;
                    int i = this.r;
                    iArr[0] = i;
                    int i2 = this.h - i;
                    iArr[1] = i2;
                    x = Math.max((float) iArr[0], Math.min((float) i2, x));
                    if (Math.abs(((float) this.g) - x) >= 2.0f) {
                        i = amy.a(this.z, x, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                        if (i != 0) {
                            this.j.scrollBy(i, 0);
                        }
                        this.z = x;
                    }
                }
                if (this.A == 2) {
                    float y = motionEvent.getY();
                    iArr = this.B;
                    int i3 = this.r;
                    iArr[0] = i3;
                    int i4 = this.i - i3;
                    iArr[1] = i4;
                    y = Math.max((float) iArr[0], Math.min((float) i4, y));
                    if (Math.abs(((float) this.e) - y) >= 2.0f) {
                        i3 = amy.a(this.y, y, iArr, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                        if (i3 != 0) {
                            this.j.scrollBy(0, i3);
                        }
                        this.y = y;
                    }
                }
            }
        }
    }

    private static int a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            i -= i3;
            int i5 = (int) (((f2 - f) / ((float) i4)) * ((float) i));
            i2 += i5;
            return (i2 >= i || i2 < 0) ? 0 : i5;
        }
    }

    private final boolean a(float f, float f2) {
        if (b() ? f > ((float) (this.s / 2)) : f < ((float) (this.h - this.s))) {
            int i = this.e;
            int i2 = this.d / 2;
            if (f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2))) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(float f, float f2) {
        if (f2 >= ((float) (this.i - this.w))) {
            int i = this.g;
            int i2 = this.f / 2;
            if (f >= ((float) (i - i2)) && f <= ((float) (i + i2))) {
                return true;
            }
        }
        return false;
    }
}
