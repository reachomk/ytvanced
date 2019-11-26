package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dry */
final /* synthetic */ class dry implements OnClickListener {
    private final drw a;

    dry(drw drw) {
        this.a = drw;
    }

    public final void onClick(View view) {
        uza uza = this.a.f;
        if (uza != null) {
            uza.j();
        }
    }
}
