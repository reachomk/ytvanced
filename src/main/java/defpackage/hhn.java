package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

/* renamed from: hhn */
final class hhn implements OnClickListener {
    private final /* synthetic */ CheckBox a;
    private final /* synthetic */ ahcr b;
    private final /* synthetic */ hhk c;

    hhn(hhk hhk, CheckBox checkBox, ahcr ahcr) {
        this.c = hhk;
        this.a = checkBox;
        this.b = ahcr;
    }

    public final void onClick(View view) {
        if (this.a.isChecked()) {
            this.c.b.h();
        }
        this.c.d.dismiss();
        this.b.a();
    }
}
