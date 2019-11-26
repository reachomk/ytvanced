package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acke */
public final /* synthetic */ class acke implements Runnable {
    private final LiveCreationActivity a;

    public acke(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        LiveCreationActivity liveCreationActivity = this.a;
        liveCreationActivity.v.a(liveCreationActivity.J.c, null);
    }
}
