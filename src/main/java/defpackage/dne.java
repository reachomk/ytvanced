package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.application.Shell$UploadActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: dne */
public final class dne implements dve {
    dne() {
    }

    public final int a(Context context) {
        if (context instanceof WatchWhileActivity) {
            return 1;
        }
        if (context instanceof Shell$UploadActivity) {
            return 2;
        }
        return context instanceof LiveCreationActivity ? 3 : 0;
    }
}
