package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackc */
public final /* synthetic */ class ackc implements Runnable {
    private final LiveCreationActivity a;

    public ackc(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        LiveCreationActivity liveCreationActivity = this.a;
        liveCreationActivity.K.a().a(liveCreationActivity.O).a();
        liveCreationActivity.O.a = null;
        liveCreationActivity.O = null;
        liveCreationActivity.o();
    }
}
