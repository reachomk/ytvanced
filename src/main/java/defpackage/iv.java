package defpackage;

import android.os.Bundle;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* renamed from: iv */
public final class iv extends aaj {
    private final /* synthetic */ BaseTransientBottomBar b;

    public iv(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        aca.a(1048576);
        aca.i(true);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.b.d();
        return true;
    }
}
