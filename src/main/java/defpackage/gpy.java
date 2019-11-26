package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gpy */
final /* synthetic */ class gpy implements OnClickListener {
    private final gpt a;
    private final awge b;

    gpy(gpt gpt, awge awge) {
        this.a = gpt;
        this.b = awge;
    }

    public final void onClick(View view) {
        gpt gpt = this.a;
        awge awge = this.b;
        gpt.b(awge.d);
        gpt.i.dismiss();
        gpt.i = null;
        aaas aaas = gpt.d;
        apxu apxu = awge.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
