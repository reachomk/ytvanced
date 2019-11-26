package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackh */
public final /* synthetic */ class ackh implements OnClickListener {
    private final LiveCreationActivity a;

    public ackh(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LiveCreationActivity.a(this.a, Uri.parse("https://support.google.com/youtube/answer/2474026"));
    }
}
