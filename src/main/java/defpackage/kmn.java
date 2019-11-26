package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kmn */
final /* synthetic */ class kmn implements OnClickListener {
    private final kmk a;
    private final akbg b;
    private final akor c;

    kmn(kmk kmk, akbg akbg, akor akor) {
        this.a = kmk;
        this.b = akbg;
        this.c = akor;
    }

    public final void onClick(View view) {
        kmk kmk = this.a;
        akbg akbg = this.b;
        akor akor = this.c;
        akbg.c ^= 1;
        kmk.a(akbg);
        acvx acvx = akor.a;
        byte[] bArr = akbg.e;
        atss atss = (atss) atst.q.createBuilder();
        atsg atsg = (atsg) atsh.c.createBuilder();
        atsg.a(!akbg.c ? 3 : 2);
        atss.a(atsg);
        atst atst = (atst) ((anxl) atss.build());
        if (bArr != null) {
            acvx.a(3, new acvs(bArr), atst);
        }
    }
}
