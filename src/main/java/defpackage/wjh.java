package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wjh */
final /* synthetic */ class wjh implements OnClickListener {
    private final wje a;
    private final ajsr b;
    private final akvy c;

    wjh(wje wje, ajsr ajsr, akvy akvy) {
        this.a = wje;
        this.b = ajsr;
        this.c = akvy;
    }

    public final void onClick(View view) {
        wje wje = this.a;
        wje.a.a(this.b, this.c);
    }
}
