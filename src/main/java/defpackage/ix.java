package defpackage;

import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* renamed from: ix */
final class ix implements eu {
    private final /* synthetic */ BaseTransientBottomBar a;

    ix(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a(View view) {
        view.setVisibility(8);
        this.a.a(0);
    }

    public final void a(int i) {
        if (i != 0) {
            jm.a().a(this.a.i);
        } else {
            jm.a().b(this.a.i);
        }
    }
}
