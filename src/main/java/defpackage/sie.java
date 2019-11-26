package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: sie */
final /* synthetic */ class sie implements OnClickListener {
    private final shz a;

    sie(shz shz) {
        this.a = shz;
    }

    public final void onClick(View view) {
        shz shz = this.a;
        shz.j.a(view, shz.k, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        shz.setResult(0);
        shz.finish();
    }
}
