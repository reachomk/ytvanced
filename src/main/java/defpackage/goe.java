package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;

/* renamed from: goe */
public final class goe implements aps {
    public god a;
    public gog b;
    public got c;
    public int d = 1;
    private final int e;
    private final int f;
    private final int g;
    private float h;
    private float i;
    private long j = -1;
    private boolean k;
    private int l = 0;
    private final int m;
    private final goq n;
    private final gor o;

    public goe(Context context, goq goq, gor gor) {
        this.n = goq;
        this.o = gor;
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f = Math.max(250, ViewConfiguration.getTapTimeout());
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        this.g = point.x;
        this.m = (int) (((float) point.y) * 0.1f);
    }

    public final void a(boolean z) {
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        b(motionEvent);
        int i = this.l;
        return (i == 0 || i == 1) ? false : true;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            gog gog = this.b;
            if (gog != null) {
                gog.a();
            }
        }
        b(motionEvent);
    }

    private final boolean a(int i) {
        return (i & this.d) != 0;
    }

    private final got a() {
        got got = this.c;
        if (got == null) {
            gpa ac = this.o.ac();
            if (ac != null) {
                return ac.c;
            }
            got = null;
        }
        return got;
    }

    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            float rawX;
            if (action == 1) {
                long eventTime = motionEvent.getEventTime();
                rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                long j = this.j;
                if (j >= -1) {
                    boolean z;
                    eventTime -= j;
                    god god = this.a;
                    if (god == null) {
                        god = this.o.ac();
                    }
                    int i = this.l;
                    if (i == 2 || i == 3) {
                        if (Math.abs(rawY - this.i) > ((float) this.m) && god != null && eventTime < 600) {
                            int i2 = this.l;
                            if (i2 == 2) {
                                god.e();
                                z = false;
                                this.l = 0;
                            } else if (i2 == 3) {
                                god.f();
                            }
                        }
                        z = true;
                        this.l = 0;
                    } else {
                        if (eventTime <= ((long) this.f) && god != null && a(1) && Math.hypot((double) (rawX - this.h), (double) (rawY - this.i)) <= ((double) this.e)) {
                            if (this.h > ((float) ((this.g * 3) / 10))) {
                                god.d();
                            } else {
                                god.c();
                            }
                        }
                        this.l = 0;
                        z = true;
                    }
                    b(z);
                } else {
                    b(false);
                }
            } else if (action == 2) {
                rawX = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                if (this.l == 1 && a(2)) {
                    rawX = Math.abs(rawX - this.h);
                    float abs = Math.abs(rawY2 - this.i);
                    if (rawX < 500.0f && abs > 150.0f) {
                        if (rawY2 < this.i) {
                            gog gog = this.b;
                            if (gog == null || gog.b() >= 0.75f) {
                                this.l = 3;
                            }
                        } else {
                            this.l = 2;
                        }
                        this.i = rawY2;
                    }
                }
                if (!this.k && a(4) && (motionEvent.getEventTime() - this.j > 5 || this.l != 1)) {
                    this.k = true;
                    this.n.a();
                    got a = a();
                    if (a != null) {
                        a.a(false);
                    }
                }
            }
            return true;
        }
        this.j = motionEvent.getDownTime();
        this.h = motionEvent.getRawX();
        this.i = motionEvent.getRawY();
        this.l = 1;
        this.k = false;
        return true;
    }

    public final void b(boolean z) {
        if (this.k) {
            if (z) {
                this.n.b();
                this.k = false;
            }
            this.j = -1;
        }
        got a = a();
        if (a != null) {
            a.a(true);
        }
        this.j = -1;
    }
}
