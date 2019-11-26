package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: hgd */
final class hgd implements OnClickListener {
    private final /* synthetic */ hfy a;

    hgd(hfy hfy) {
        this.a = hfy;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d.a(3, new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_OPEN_APP_SETTINGS_DIALOG), null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.c.getPackageName(), null));
        this.a.c.startActivity(intent);
    }
}
