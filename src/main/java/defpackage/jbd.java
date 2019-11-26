package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

/* renamed from: jbd */
public final /* synthetic */ class jbd implements OnClickListener {
    private final OfflinePrefsFragment a;

    public jbd(OfflinePrefsFragment offlinePrefsFragment) {
        this.a = offlinePrefsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.b().s();
    }
}
