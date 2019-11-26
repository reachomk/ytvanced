package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackn */
public final class ackn extends aclm {
    private final /* synthetic */ LiveCreationActivity a;

    public ackn(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.P.setVisibility(8);
    }
}
