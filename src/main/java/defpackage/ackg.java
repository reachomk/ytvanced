package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackg */
public final /* synthetic */ class ackg implements Runnable {
    private final LiveCreationActivity a;

    public ackg(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        LiveCreationActivity liveCreationActivity = this.a;
        liveCreationActivity.a(liveCreationActivity.R, "EDIT_THUMBNAIL_FRAGMENT_NAME");
    }
}
