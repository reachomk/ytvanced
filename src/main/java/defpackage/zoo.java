package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zoo */
public final class zoo extends AnimatorListenerAdapter {
    private final /* synthetic */ ChooseFilterView a;

    public zoo(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    public final void onAnimationEnd(Animator animator) {
        zos zos = this.a.a;
        View b = zos.b(zos.f);
        if (b != null) {
            b.sendAccessibilityEvent(8);
        }
    }
}
