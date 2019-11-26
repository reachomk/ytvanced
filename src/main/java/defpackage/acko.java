package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acko */
public final class acko extends aclm {
    private final /* synthetic */ LiveCreationActivity a;

    public acko(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onAnimationStart(Animation animation) {
        this.a.P.setVisibility(0);
    }
}
