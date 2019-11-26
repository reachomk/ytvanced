package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: urm */
final /* synthetic */ class urm implements OnClickListener {
    private final urj a;

    urm(urj urj) {
        this.a = urj;
    }

    public final void onClick(View view) {
        this.a.cancel();
    }
}
