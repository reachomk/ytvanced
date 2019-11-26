package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: akzr */
final class akzr extends cyc {
    private final akpd a;
    private final int b;
    private final Object c;

    akzr(akpd akpd, int i, Object obj) {
        this.a = akpd;
        this.b = i;
        this.c = obj;
    }

    public final void a(View view) {
        akot akot = (akot) view.getTag(R.id.litho_presenter_tag);
        akpd akpd = this.a;
        akpd.a(akot, akpd.a(akot, this.b), this.c);
    }

    public final void b(View view) {
        this.a.a(view);
    }
}
