package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wke */
final class wke implements OnClickListener {
    private final /* synthetic */ wjv a;

    wke(wjv wjv) {
        this.a = wjv;
    }

    public final void onClick(View view) {
        wkq wkq = this.a.ap;
        wkq.a.setImageDrawable(null);
        wkq.c = 0;
        wkq.a(1);
        wjv wjv = this.a;
        wjv.an = null;
        wjv.ac();
    }
}
