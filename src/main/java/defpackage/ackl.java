package defpackage;

import android.view.Choreographer.FrameCallback;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackl */
public final class ackl implements FrameCallback {
    private final /* synthetic */ LiveCreationActivity a;

    public ackl(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void doFrame(long j) {
        this.a.U.a();
        if (this.a.w()) {
            this.a.x.postFrameCallback(this);
        }
    }
}
