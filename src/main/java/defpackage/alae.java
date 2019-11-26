package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alae */
final class alae implements OnClickListener {
    private final /* synthetic */ alaf a;

    alae(alaf alaf) {
        this.a = alaf;
    }

    public final void onClick(View view) {
        alaf alaf = this.a;
        if (alaf.Z) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", alaf.p().getPackageName(), null));
            alaf.p().startActivity(intent);
            return;
        }
        alaf.a(alaf.c, 1);
    }
}
