package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: llj */
public final class llj extends llk {
    private final Context a;
    private final int c;
    private final int d = a(1.0f);
    private final zl e = new zl();
    private final List f = new ArrayList();
    private int g = 0;

    public llj(Context context, float f) {
        super("SWGT");
        this.a = context;
        this.c = a(f);
    }

    public final int a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = 0;
        if (!llk.a(motionEvent)) {
            return 0;
        }
        if (!this.b) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                b(motionEvent);
                a(0);
            } else if (actionMasked == 2) {
                int i2;
                if (this.g == 0) {
                    MotionEvent motionEvent2 = null;
                    if (!this.f.isEmpty()) {
                        this.e.clear();
                        for (actionMasked = this.f.size() - 1; actionMasked >= 0; actionMasked--) {
                            MotionEvent motionEvent3 = (MotionEvent) this.f.get(actionMasked);
                            Integer valueOf = Integer.valueOf(motionEvent3.getActionIndex());
                            if (motionEvent3.getActionMasked() == 6) {
                                this.e.add(valueOf);
                            } else if (!this.e.contains(valueOf)) {
                                motionEvent2 = motionEvent3;
                                break;
                            }
                        }
                    }
                    if (motionEvent2 == null) {
                        i2 = this.g;
                    } else {
                        actionMasked = motionEvent.findPointerIndex(motionEvent2.getPointerId(motionEvent2.getActionIndex()));
                        if (actionMasked == -1) {
                            i2 = this.g;
                        } else {
                            i2 = Math.abs(Math.round(motionEvent.getX(actionMasked) - motionEvent2.getX(actionMasked))) <= this.c ? Math.abs(Math.round(motionEvent.getY(actionMasked) - motionEvent2.getY(actionMasked))) <= this.d ? this.g : 2 : 1;
                        }
                    }
                    a(i2);
                }
                i2 = this.g;
                if (i2 != 1) {
                    if (i2 != 2) {
                        i = 2;
                    } else {
                        b();
                        c();
                        return 2;
                    }
                } else if (!this.f.isEmpty()) {
                    for (i2 = 0; i2 < this.f.size(); i2++) {
                        recyclerView.onInterceptTouchEvent((MotionEvent) this.f.get(i2));
                    }
                    c();
                }
                return i;
            } else if (actionMasked == 5) {
                b(motionEvent);
                return 2;
            } else if (actionMasked != 6) {
                return 0;
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 1 || actionMasked2 == 3) {
                    c();
                } else {
                    this.f.add(MotionEvent.obtain(motionEvent));
                }
                return 2;
            }
        }
        return 2;
    }

    public final void a() {
        super.a();
        c();
        a(0);
    }

    private final void a(int i) {
        if (this.g != i) {
            this.g = i;
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c();
        }
        this.f.add(MotionEvent.obtain(motionEvent));
    }

    private final void c() {
        if (!this.f.isEmpty()) {
            for (int i = 0; i < this.f.size(); i++) {
                ((MotionEvent) this.f.get(i)).recycle();
            }
            this.f.clear();
        }
    }

    private final int a(float f) {
        return (int) ((((float) ViewConfiguration.get(this.a).getScaledTouchSlop()) * f) + 0.5f);
    }
}
