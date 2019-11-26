package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: uwt */
final class uwt implements OnClickListener {
    private final /* synthetic */ uwq a;

    uwt(uwq uwq) {
        this.a = uwq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.p().getPackageName(), null));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        nf nfVar = this.a;
        nq nqVar = nfVar.w;
        if (nqVar != null) {
            nqVar.a(nfVar, intent, -1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(nfVar);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
