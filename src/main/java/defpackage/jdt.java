package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jdt */
final /* synthetic */ class jdt implements OnClickListener {
    private final jds a;

    jdt(jds jds) {
        this.a = jds;
    }

    public final void onClick(View view) {
        jds jds = this.a;
        boolean a = jds.a.a() ^ 1;
        jds.a.a(a);
        jds.b.setChecked(a);
        axgk axgk = jds.c;
        if ((axgk.a & 32768) != 0) {
            jds.d.a(3, new acvs(axgk.o.d()), null);
        }
    }
}
