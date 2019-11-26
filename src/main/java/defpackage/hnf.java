package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: hnf */
public final class hnf implements ewm {
    public View a;
    private final Context b;
    private final albv c;
    private final afpu d;
    private final int e = R.string.offline_thumbnail_overlay_tooltip_details;
    private albu f;

    public hnf(Context context, albv albv, afpu afpu) {
        this.b = context;
        this.c = albv;
        this.d = afpu;
    }

    public final int a() {
        return 2800;
    }

    public final void d() {
    }

    public final boolean b() {
        return this.d.a();
    }

    public final void c() {
        if (this.a != null) {
            albv albv = this.c;
            if (this.f == null) {
                this.f = ((albx) albv.a().a(this.a).c(this.b.getResources().getString(this.e)).e(1).d(2).a(new hne()).f()).b();
            }
            albv.a(this.f);
        }
    }
}
