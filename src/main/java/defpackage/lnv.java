package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: lnv */
public final class lnv implements lnw, lod {
    private final boolean a = true;
    private final lli b;
    private final lnx c;
    private final lny d;
    private final lnr e;
    private final int f;
    private final int g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public lnv(RecyclerView recyclerView, lli lli, lnx lnx, lny lny, lnr lnr) {
        int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(R.dimen.swipey_ad_max_parallax_scroll_distance);
        int dimensionPixelOffset2 = recyclerView.getResources().getDimensionPixelOffset(R.dimen.swipey_ad_max_scroll_distance);
        this.b = (lli) amqw.a((Object) lli);
        this.c = (lnx) amqw.a((Object) lnx);
        this.d = (lny) amqw.a((Object) lny);
        this.e = lnr;
        this.f = dimensionPixelOffset;
        this.g = dimensionPixelOffset2;
    }

    private final int a() {
        View b = this.d.b();
        return b != null ? this.c.a(b) : 0;
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            if (i != 2) {
                this.h = false;
            } else if (this.i != 0) {
                this.h = true;
            }
            if (i == 0 && a() == 0) {
                this.j = 0;
                this.e.a(0);
            }
        }
    }

    public final int b(int i) {
        if (this.i == 0 && !this.h) {
            return i;
        }
        if (this.b.b() || this.b.aF_()) {
            return a();
        }
        if (!this.a) {
            return d(i);
        }
        int a;
        if (this.k != 1 && i <= 0) {
            i = d(i);
            a = a();
            a = Math.round(((float) this.j) * (a != 0 ? Math.abs(((float) i) / ((float) a)) : 0.0f));
            this.j = a;
            int i2 = a;
            a = i;
            i = i2;
        } else {
            a = this.j;
            if (a == 0) {
                a = d(i);
                i -= a;
                this.j = i;
            } else {
                i += a;
                if (i < 0) {
                    i = d(i);
                    this.j = 0;
                    a = i;
                    i = 0;
                } else {
                    this.j = i;
                    a = 0;
                }
            }
        }
        i = Math.max(0, Math.min(this.f, i));
        this.j = i;
        this.e.a(i);
        return a;
    }

    public final void c(int i) {
        this.i = i;
        if (i == 0) {
            this.e.a(0);
        }
    }

    private final int d(int i) {
        if (this.i != 0) {
            View b = this.d.b();
            if (b != null) {
                int a = this.c.a(b);
                i = a - i;
                int i2 = this.g;
                int i3 = -i2;
                if (i < i3) {
                    i = i3;
                } else if (i > i2 && this.i == 2) {
                    i = i2;
                }
                return a - i;
            }
        }
        return i;
    }
}
