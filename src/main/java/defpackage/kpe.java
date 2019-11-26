package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kpe */
final /* synthetic */ class kpe implements OnClickListener {
    private final kpa a;
    private final kpd b;

    kpe(kpa kpa, kpd kpd) {
        this.a = kpa;
        this.b = kpd;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
