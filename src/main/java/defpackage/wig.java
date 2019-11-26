package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wig */
final /* synthetic */ class wig implements OnClickListener {
    private final wih a;
    private final ajsn b;
    private final Map c;
    private final acvx d;

    wig(wih wih, ajsn ajsn, Map map, acvx acvx) {
        this.a = wih;
        this.b = ajsn;
        this.c = map;
        this.d = acvx;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        ajsn ajsn = this.b;
        Map map = this.c;
        acvx acvx = this.d;
        apxu apxu = ajsn.n;
        if (apxu != null) {
            wih.d.a(apxu, map);
            return;
        }
        apxu = ajsn.r;
        if (apxu != null) {
            wih.d.a(apxu, map);
            return;
        }
        byte[] bArr = ajsn.j;
        if (bArr != null) {
            acvx.a(3, new acvs(bArr), null);
        }
        wih.b(ajsn);
    }
}
