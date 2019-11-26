package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jyf */
final class jyf implements OnClickListener {
    private final /* synthetic */ apma a;
    private final /* synthetic */ jya b;

    jyf(jya jya, apma apma) {
        this.b = jya;
        this.a = apma;
    }

    public final void onClick(View view) {
        apma apma = this.a;
        if ((apma.a & 1) != 0) {
            aaas aaas = this.b.b;
            apxu apxu = apma.b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
