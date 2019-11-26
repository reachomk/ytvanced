package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackd */
public final /* synthetic */ class ackd implements Runnable {
    private final LiveCreationActivity a;
    private final int b;

    public ackd(LiveCreationActivity liveCreationActivity, int i) {
        this.a = liveCreationActivity;
        this.b = i;
    }

    public final void run() {
        this.a.c(this.b - 1);
    }
}
