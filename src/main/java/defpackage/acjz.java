package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acjz */
public final /* synthetic */ class acjz implements OnClickListener {
    private final LiveCreationActivity a;

    public acjz(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LiveCreationActivity liveCreationActivity = this.a;
        acjk acjk = liveCreationActivity.G;
        liveCreationActivity.d(true);
        liveCreationActivity.V = false;
        liveCreationActivity.q();
    }
}
