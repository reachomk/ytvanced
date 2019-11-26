package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adwv */
public final /* synthetic */ class adwv implements OnClickListener {
    private final adwl a;

    public adwv(adwl adwl) {
        this.a = adwl;
    }

    public final void onClick(View view) {
        adwl adwl = this.a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", adwl.a.getPackageName(), null));
        intent.addFlags(268435456);
        adwl.a.startActivity(intent);
    }
}
