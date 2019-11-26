package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: ics */
public final class ics {
    private final xto a;
    private final zzl b;
    private final zyw c;
    private final View d;
    private final int e;
    private boolean f;
    private boolean g;

    public ics(zzl zzl, zyw zyw, ViewStub viewStub, long j, View view) {
        this.b = zzl;
        this.c = zyw;
        this.a = new icu("LazySwipeyEduView", viewStub, j);
        this.d = view;
        view.addOnLayoutChangeListener(new icr(this));
        this.e = view.getResources().getDimensionPixelSize(R.dimen.swipey_edu_min_player_view_height);
    }

    public final void a(boolean z, boolean z2) {
        this.g = z;
        a(z2);
    }

    public final void a(boolean z) {
        if (this.g) {
            zzl zzl = this.b;
            zyw zyw = this.c;
            arvt b = zzl.b();
            if (b != null) {
                aume aume = b.e;
                if (aume == null) {
                    aume = aume.af;
                }
                if (aume.p && foh.f(zyw) && this.d.getHeight() >= this.e) {
                    ((iet) this.a.get()).a(true, z);
                    this.f = true;
                    return;
                }
            }
        }
        if (this.f) {
            ((iet) this.a.get()).a(false, z);
        }
    }
}
