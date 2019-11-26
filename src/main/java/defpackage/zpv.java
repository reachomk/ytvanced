package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zpv */
final /* synthetic */ class zpv implements OnClickListener {
    private final zpw a;

    zpv(zpw zpw) {
        this.a = zpw;
    }

    public final void onClick(View view) {
        zpw zpw = this.a;
        if (zpw.p.e != null) {
            int d = zpw.d();
            if (d != -1) {
                zpy zpy = zpw.p.e;
                view = zpw.a;
                zpy.a(d);
            }
        }
    }
}
