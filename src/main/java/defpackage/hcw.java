package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hcw */
final class hcw implements OnClickListener {
    private final /* synthetic */ hct a;

    hcw(hct hct) {
        this.a = hct;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/7640706"));
        this.a.a.startActivity(intent);
    }
}
