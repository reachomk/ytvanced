package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kga */
final /* synthetic */ class kga implements OnClickListener {
    private final kfy a;
    private final avls b;
    private final jme c;

    kga(kfy kfy, avls avls, jme jme) {
        this.a = kfy;
        this.b = avls;
        this.c = jme;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c);
    }
}
