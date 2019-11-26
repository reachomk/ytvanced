package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: kcu */
final class kcu extends ilg {
    private final akoj h;

    public kcu(Context context, akkq akkq, aaas aaas, akvo akvo, int i, akou akou, akvp akvp) {
        super(context, akkq, akvo, i, akvp);
        this.h = new akoj(aaas, akou);
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, arsa arsa) {
        apxu apxu;
        akoj akoj = this.h;
        acvx acvx = akor.a;
        if ((arsa.a & 512) != 0) {
            apxu = arsa.j;
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
