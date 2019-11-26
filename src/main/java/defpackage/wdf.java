package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wdf */
final /* synthetic */ class wdf implements OnClickListener {
    private final wda a;
    private final wdj b;
    private final akvy c;
    private final wef d;
    private final wkt e;

    wdf(wda wda, wdj wdj, akvy akvy, wef wef, wkt wkt) {
        this.a = wda;
        this.b = wdj;
        this.c = akvy;
        this.d = wef;
        this.e = wkt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wda wda = this.a;
        wdj wdj = this.b;
        akvy akvy = this.c;
        wef wef = this.d;
        wkt wkt = this.e;
        dialogInterface.dismiss();
        wda.a(wdj, akvy, wef, wkt.c(), wkt.n, true);
    }
}
