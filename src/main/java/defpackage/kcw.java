package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: kcw */
final class kcw extends ilg {
    private final akoj h;

    public kcw(Context context, akkq akkq, aaas aaas, akvo akvo, int i, akou akou, akvp akvp) {
        super(context, akkq, akvo, i, akvp);
        this.h = new akoj(aaas, akou);
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, arsg arsg) {
        apxu apxu;
        akoj akoj = this.h;
        acvx acvx = akor.a;
        if ((arsg.a & 16) != 0) {
            apxu = arsg.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.h.a();
    }
}
