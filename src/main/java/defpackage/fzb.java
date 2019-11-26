package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: fzb */
final /* synthetic */ class fzb implements xar {
    private final fyy a;

    fzb(fyy fyy) {
        this.a = fyy;
    }

    public final void accept(Object obj) {
        fyy fyy = this.a;
        File file = (File) obj;
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        fyy.a.sendBroadcast(intent);
    }
}
