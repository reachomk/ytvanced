package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izg */
final /* synthetic */ class izg implements OnClickListener {
    private final DeveloperPrefsFragment a;

    izg(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jca.a(this.a.getActivity());
    }
}
