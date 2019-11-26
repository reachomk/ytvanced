package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: heg */
final class heg implements OnClickListener {
    private final /* synthetic */ heb a;

    public final void onClick(View view) {
        this.a.a(view);
        heb heb = this.a;
        if (heb.m != null) {
            aiff aiff;
            if (view == heb.g) {
                aiff = heb.n;
                if (aiff != null) {
                    aiff.b();
                    return;
                }
            }
            if (view == heb.f) {
                aiff = heb.n;
                if (aiff != null) {
                    aiff.a();
                    return;
                }
            }
            if (view == heb.e) {
                int ordinal = heb.o.a.ordinal();
                if (ordinal == 1) {
                    this.a.m.d();
                    return;
                } else if (ordinal == 2) {
                    this.a.m.aJ_();
                    return;
                } else if (ordinal == 5) {
                    if (this.a.q.a() == 4) {
                        adqe c = this.a.s.c();
                        if (c != null) {
                            c.w();
                        }
                        return;
                    }
                    this.a.m.j();
                    return;
                }
            }
            heb = this.a;
            if (heb.d) {
                if (view == heb.i) {
                    heb.a(1);
                } else if (view == heb.h) {
                    heb.a(0);
                }
            }
        }
    }

    /* synthetic */ heg(heb heb) {
        this.a = heb;
    }
}
