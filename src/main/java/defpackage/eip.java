package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: eip */
final /* synthetic */ class eip implements OnClickListener {
    private final ein a;

    eip(ein ein) {
        this.a = ein;
    }

    public final void onClick(View view) {
        fom.a(this.a.b.a, Uri.parse("https://support.google.com/nexus/answer/2840815"));
    }
}
