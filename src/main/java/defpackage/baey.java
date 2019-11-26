package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: baey */
final class baey implements OnClickListener {
    private final /* synthetic */ Context a;

    baey(Context context) {
        this.a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
    }
}
