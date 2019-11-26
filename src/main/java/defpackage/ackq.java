package defpackage;

import android.hardware.display.DisplayManager.DisplayListener;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackq */
public final class ackq implements DisplayListener {
    private final /* synthetic */ LiveCreationActivity a;

    public ackq(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        this.a.p();
    }
}
