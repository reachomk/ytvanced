package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbh */
public final class fbh implements OnLayoutChangeListener {
    private final /* synthetic */ BottomUiContainer a;

    public fbh(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.a(view);
        view.removeOnLayoutChangeListener(this);
    }
}
