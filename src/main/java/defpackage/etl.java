package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: etl */
public final /* synthetic */ class etl implements OnClickListener {
    private final etm a;
    private final avkh b;

    public etl(etm etm, avkh avkh) {
        this.a = etm;
        this.b = avkh;
    }

    public final void onClick(View view) {
        etm etm = this.a;
        avkh avkh = this.b;
        if ((avkh.a & 8) != 0) {
            etm.b.a(3, new acvs(avkh.d), null);
        }
        aaas aaas = etm.a;
        aphj aphj = avkh.c;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
