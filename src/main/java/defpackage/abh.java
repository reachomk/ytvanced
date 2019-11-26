package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* renamed from: abh */
final class abh implements OnApplyWindowInsetsListener {
    private final /* synthetic */ aba a;

    abh(aba aba) {
        this.a = aba;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) abx.a(this.a.a(view, abx.a((Object) windowInsets)));
    }
}
