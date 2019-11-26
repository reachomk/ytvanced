package defpackage;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: lnf */
public final class lnf implements lml, lnx, lny, lqw {
    public final zl a = new zl();
    public final lng b;
    public lmk c;
    private final lqt d;
    private final OnPreDrawListener e;
    private final zl f = new zl();
    private RecyclerView g;
    private lmk h;

    public lnf(lqt lqt, lni lni, Handler handler, exu exu) {
        this.d = lqt;
        lne lne = new lne();
        ffs ffs = new ffs();
        this.e = new lnk(this, lni);
        this.b = new lng(this, handler);
        exu.a(new lnh(this));
    }

    public final void a(lnj lnj) {
        amqw.a((Object) lnj);
        this.f.add(lnj);
    }

    public final void a(RecyclerView recyclerView) {
        this.g = recyclerView;
        this.d.a((lqw) this);
    }

    public final void a() {
        this.d.b((lqw) this);
        a(null);
        c(null);
        this.g = null;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            int i2 = 0;
            lmk lmk = null;
            int i3;
            if (recyclerView.E == 1) {
                apn apn = recyclerView.n;
                int w = apn.w();
                i3 = 0;
                while (w > 1 && i3 < w) {
                    View i4 = apn.i(i3);
                    if (i4 != null) {
                        lmk lmk2 = (lmk) this.g.a(i4);
                        if (!(lmk2 == null || lmk2 == this.c || !apn.a(lmk2.a, false))) {
                            lmk = lmk2;
                            break;
                        }
                    }
                    i3++;
                }
                c(lmk);
                return;
            }
            lmk lmk3;
            c(null);
            if (i == -1) {
                lmk3 = null;
            } else {
                lmk3 = (lmk) this.g.f(i);
                if (!(lmk3 == null || b(lmk3))) {
                    lng lng = this.b;
                    lng.a();
                    lng.b = lmk3;
                    lng.a.post(lng);
                    return;
                }
            }
            if (lmk3 == null) {
                View view;
                RecyclerView recyclerView2 = this.g;
                apn apn2 = recyclerView2.n;
                i3 = apn2.w();
                if (i3 != 0) {
                    int b = llr.b(recyclerView2);
                    aol a = llr.a(recyclerView2);
                    view = null;
                    int i5 = Integer.MAX_VALUE;
                    while (i2 < i3) {
                        View i6 = apn2.i(i2);
                        int abs = Math.abs((a.a(i6) + (a.e(i6) / 2)) - b);
                        if (abs < i5) {
                            view = i6;
                        }
                        if (abs < i5) {
                            i5 = abs;
                        }
                        i2++;
                    }
                } else {
                    view = null;
                }
                if (view != null) {
                    lmk = (lmk) recyclerView2.a(view);
                }
            } else {
                lmk = lmk3;
            }
            a(lmk);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(lmk lmk) {
        this.b.a();
        lmk lmk2 = this.c;
        if (lmk2 != lmk) {
            if (lmk2 != null) {
                lmk2.a.getViewTreeObserver().removeOnPreDrawListener(this.e);
            }
            this.c = lmk;
            lmk = this.c;
            int i = 0;
            if (lmk != null) {
                lmk.a.getViewTreeObserver().addOnPreDrawListener(this.e);
            }
            while (true) {
                zl zlVar = this.f;
                if (i < zlVar.b) {
                    ((lnj) zlVar.a(i)).a(this.c);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void c(lmk lmk) {
        if (this.h != lmk) {
            this.h = lmk;
            int i = 0;
            while (true) {
                zl zlVar = this.a;
                if (i < zlVar.b) {
                    ((lnl) zlVar.a(i)).a(this.h);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(lqz lqz) {
        int c = this.d.c();
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            if (c == -1) {
                a(null);
                c(null);
                return;
            }
            recyclerView.e(c);
        }
    }

    public final int a(View view) {
        RecyclerView recyclerView = this.g;
        int i = 0;
        if (recyclerView == null) {
            return 0;
        }
        apn apn = recyclerView.n;
        aol a = llr.a(recyclerView);
        int v = apn.v();
        int b = llr.b(recyclerView);
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            i = ((MarginLayoutParams) layoutParams).getMarginEnd();
        }
        int a2 = (a.a(view) + (a.e(view) / 2)) - b;
        b = 1;
        if (v != 1) {
            b = -1;
        }
        return a2 + ((b * i) / 2);
    }

    public final View b() {
        lmk lmk = this.c;
        return lmk != null ? lmk.a : null;
    }

    public final boolean b(lmk lmk) {
        View view = lmk.a;
        if (!view.isDirty()) {
            apn apn = this.g.n;
            if (apn != null) {
                boolean a = apn.a(view, false);
                boolean a2 = apn.a(view, true);
                if (a || a2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
