package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: abw */
public final class abw extends ClickableSpan {
    private final int a;
    private final aca b;
    private final int c;

    public abw(int i, aca aca, int i2) {
        this.a = i;
        this.b = aca;
        this.c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        aca aca = this.b;
        aca.a.performAction(this.c, bundle);
    }
}
