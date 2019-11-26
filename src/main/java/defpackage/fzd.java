package defpackage;

import android.content.Intent;
import java.io.File;

/* renamed from: fzd */
final /* synthetic */ class fzd implements xar {
    private final fyy a;

    fzd(fyy fyy) {
        this.a = fyy;
    }

    public final void accept(Object obj) {
        fyy fyy = this.a;
        File file = (File) obj;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.putExtra("android.intent.extra.STREAM", rc.a(fyy.a, "com.google.android.youtube.fileprovider", file));
        fyy.a.startActivity(intent);
    }
}
