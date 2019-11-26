package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackb */
public final /* synthetic */ class ackb implements OnKeyListener {
    private final LiveCreationActivity a;

    public ackb(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        LiveCreationActivity liveCreationActivity = this.a;
        if (i == 4) {
            liveCreationActivity.V = false;
            liveCreationActivity.finish();
        }
        return true;
    }
}
