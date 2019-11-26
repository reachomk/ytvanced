package defpackage;

import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;

/* renamed from: agmw */
final /* synthetic */ class agmw implements OnScanCompletedListener {
    private final agmt a;

    agmw(agmt agmt) {
        this.a = agmt;
    }

    public final void onScanCompleted(String str, Uri uri) {
        agmt agmt = this.a;
        String[] strArr = new String[]{str};
        agmt.a(agmt.c, agmt.a, strArr);
        agmt.a(agmt.b, agmt.a, strArr);
    }
}
