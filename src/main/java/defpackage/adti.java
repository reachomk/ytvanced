package defpackage;

import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: adti */
final class adti extends AsyncTask {
    private final bbs a;
    private final /* synthetic */ adtf b;

    adti(adtf adtf, bbs bbs) {
        this.b = adtf;
        this.a = bbs;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        int b = ((adhw) obj).b();
        if (b == -2) {
            adtf adtf = this.b;
            if (!adtf.e.hasMessages(1)) {
                adtf.e.sendEmptyMessageDelayed(1, 1000);
            }
        } else if (b == -1) {
            xtl.b(adtf.j, "DIAL screen found but app is not found");
            this.b.a(7);
        } else if (b == 0) {
            xtl.b(adtf.j, "DIAL screen found but app is installable");
            this.b.a(6);
        } else if (b == 1) {
            this.b.b(this.a);
        } else if (b != 2) {
            amqw.b(false, (Object) "invalid status");
        } else {
            this.b.a(4);
        }
        this.b.l = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.b.k.a(((Uri[]) objArr)[0]);
    }
}
