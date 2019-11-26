package defpackage;

import android.net.Uri;

/* renamed from: afsp */
public final class afsp implements afsk {
    public final afsk a;
    public volatile boolean b;
    private final afsk c;

    public afsp(afsk afsk, afsk afsk2) {
        this.c = (afsk) amqw.a((Object) afsk);
        this.a = (afsk) amqw.a((Object) afsk2);
    }

    public final /* synthetic */ void a(Object obj, wxg wxg) {
        Uri uri = (Uri) obj;
        if (this.b) {
            this.a.a(uri, new afsr(this, wxg, false));
        } else {
            this.c.a(uri, new afsr(this, wxg, true));
        }
    }
}
