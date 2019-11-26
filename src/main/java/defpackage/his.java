package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: his */
final /* synthetic */ class his implements OnClickListener {
    private final hir a;

    his(hir hir) {
        this.a = hir;
    }

    public final void onClick(View view) {
        auac auac;
        hir hir = this.a;
        iml iml = hir.a;
        if (hir.j) {
            auac = auac.INDIFFERENT;
        } else {
            auac = auac.LIKE;
        }
        String str = hir.e;
        amqw.a((Object) str);
        if (iml.b.a()) {
            iml.a(auac, str, zzp.b);
        } else {
            iml.c.a(iml.a, null, new ims(iml, auac, str));
        }
    }
}
