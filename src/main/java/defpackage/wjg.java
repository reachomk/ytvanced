package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wjg */
final /* synthetic */ class wjg implements OnClickListener {
    private final wje a;
    private final ajrq b;
    private final wef c;

    wjg(wje wje, ajrq ajrq, wef wef) {
        this.a = wje;
        this.b = ajrq;
        this.c = wef;
    }

    public final void onClick(View view) {
        wje wje = this.a;
        wje.g.a(this.b, this.c);
    }
}
