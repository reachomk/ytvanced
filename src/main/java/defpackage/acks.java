package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acks */
public final class acks implements OnCancelListener, OnClickListener {
    private final /* synthetic */ LiveCreationActivity a;

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                this.a.c(true);
            }
            return;
        }
        onCancel(dialogInterface);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        aclq aclq = this.a.M;
        if (aclq != null && aclq.v()) {
            this.a.M.f();
        }
    }

    public /* synthetic */ acks(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }
}
