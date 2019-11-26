package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zra */
final /* synthetic */ class zra implements OnClickListener {
    private final zqx a;
    private final avas b;

    zra(zqx zqx, avas avas) {
        this.a = zqx;
        this.b = avas;
    }

    public final void onClick(View view) {
        zqx zqx = this.a;
        avas avas = this.b;
        zqx.s.a();
        zqo zqo = zqx.r.b;
        String str = avas.b;
        arml arml = avas.c;
        if (arml == null) {
            arml = arml.f;
        }
        zqo.a(new zrb(str, ajqy.a(arml).toString()));
    }
}
