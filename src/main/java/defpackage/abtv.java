package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: abtv */
final class abtv extends ClickableSpan {
    private final /* synthetic */ ClickableSpan a;
    private final /* synthetic */ abtq b;

    abtv(abtq abtq, ClickableSpan clickableSpan) {
        this.b = abtq;
        this.a = clickableSpan;
    }

    public final void onClick(View view) {
        this.b.r = true;
        this.a.onClick(view);
    }
}
