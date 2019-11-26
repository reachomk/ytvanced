package defpackage;

import android.animation.LayoutTransition;
import android.animation.LayoutTransition.TransitionListener;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hjj */
final class hjj implements TransitionListener {
    hjj() {
    }

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        viewGroup.setLayoutTransition(null);
    }
}
