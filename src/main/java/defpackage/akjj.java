package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: akjj */
final /* synthetic */ class akjj implements OnClickListener {
    private final akjh a;
    private final swf b;
    private final aqwh c;
    private final swg d;

    akjj(akjh akjh, swf swf, aqwh aqwh, swg swg) {
        this.a = akjh;
        this.b = swf;
        this.c = aqwh;
        this.d = swg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        akjh akjh = this.a;
        swf swf = this.b;
        aqwh aqwh = this.c;
        swg swg = this.d;
        anvf anvf = aqwh.h;
        if (anvf == null) {
            anvf = azsr.a;
        }
        swf.a(anvf.toByteArray(), swg).a(akjh.a).c();
    }
}
