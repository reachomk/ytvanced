package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackk */
public final /* synthetic */ class ackk implements OnClickListener {
    private final LiveCreationActivity a;

    public ackk(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
