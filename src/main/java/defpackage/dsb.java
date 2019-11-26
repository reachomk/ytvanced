package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dsb */
final /* synthetic */ class dsb implements OnClickListener {
    private final drw a;

    dsb(drw drw) {
        this.a = drw;
    }

    public final void onClick(View view) {
        uza uza = this.a.f;
        if (uza != null) {
            uza.h();
        }
    }
}
