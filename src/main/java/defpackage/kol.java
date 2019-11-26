package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: kol */
final /* synthetic */ class kol implements OnCheckedChangeListener {
    private final koi a;

    kol(koi koi) {
        this.a = koi;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        koi koi = this.a;
        atss atss = (atss) atst.q.createBuilder();
        atsg atsg = (atsg) atsh.c.createBuilder();
        atsg.a(!z ? 3 : 2);
        atss.a(atsg);
        koi.a.a(3, new acvs(koi.b.h), (atst) ((anxl) atss.build()));
    }
}
