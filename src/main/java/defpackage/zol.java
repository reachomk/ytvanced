package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zol */
public final class zol extends AnimatorListenerAdapter {
    private final /* synthetic */ ChooseFilterView a;

    public zol(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}
