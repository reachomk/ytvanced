package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbi */
public final class fbi extends AnimatorListenerAdapter {
    private final /* synthetic */ fbr a;
    private final /* synthetic */ fbt b;
    private final /* synthetic */ fbn c;
    private final /* synthetic */ BottomUiContainer d;

    public fbi(BottomUiContainer bottomUiContainer, fbr fbr, fbt fbt, fbn fbn) {
        this.d = bottomUiContainer;
        this.a = fbr;
        this.b = fbt;
        this.c = fbn;
    }

    public final void onAnimationEnd(Animator animator) {
        this.d.b(this.a, this.b, this.c);
    }
}
