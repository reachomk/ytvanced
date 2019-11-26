package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: abts */
final class abts extends ClickableSpan {
    private final /* synthetic */ akor a;
    private final /* synthetic */ auej b;
    private final /* synthetic */ abtq c;

    abts(abtq abtq, akor akor, auej auej) {
        this.c = abtq;
        this.a = akor;
        this.b = auej;
    }

    public final void onClick(View view) {
        abtq abtq = this.c;
        abtq.q = true;
        abtq.a_(this.a, this.b);
    }
}
