package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wic */
final class wic implements OnClickListener {
    private final /* synthetic */ ajsr a;
    private final /* synthetic */ wei b;
    private final /* synthetic */ wid c;

    wic(wid wid, ajsr ajsr, wei wei) {
        this.c = wid;
        this.a = ajsr;
        this.b = wei;
    }

    public final void onClick(View view) {
        this.c.a.a(this.a, this.b);
    }
}
