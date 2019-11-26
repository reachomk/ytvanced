package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yhd */
final /* synthetic */ class yhd implements OnClickListener {
    private final yhe a;

    yhd(yhe yhe) {
        this.a = yhe;
    }

    public final void onClick(View view) {
        yhe yhe = this.a;
        zcy zcy = yhe.a;
        String b = yhe.b.b("conversation_id");
        awzr awzr = zcy.c;
        aqpp aqpp = null;
        if (awzr != null) {
            apxu apxu;
            if ((awzr.a & 4) != 0) {
                apxu = awzr.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aqpp = zcz.a(apxu);
        }
        if (!(TextUtils.isEmpty(b) || aqpp == null)) {
            Uri a = ycq.a(b);
            ycn ycn = new ycn((yco) zcy.a.a(a));
            ycn.b = aqpp;
            zcy.a.a(a, ycn.a());
        }
        zco zco = (zco) yhe.b.a("ATTACHMENT_PRESENTER_KEY");
        if (zco != null) {
            zco.a();
        }
    }
}
