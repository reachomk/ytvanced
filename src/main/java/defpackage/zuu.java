package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zuu */
final class zuu implements OnClickListener {
    public final /* synthetic */ zwj a;
    public final /* synthetic */ zuq b;
    public final /* synthetic */ Runnable c;

    zuu(zwj zwj, zuq zuq, Runnable runnable) {
        this.a = zwj;
        this.b = zuq;
        this.c = runnable;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        zut zut = new zut(this);
        if (zwj.m.a()) {
            zut.run();
        } else {
            zwj.n.a(zwj.a, null, new zwm(zwj, zut));
        }
    }
}
