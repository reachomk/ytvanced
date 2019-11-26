package defpackage;

import android.app.Notification.BigPictureStyle;
import android.graphics.Bitmap;

/* renamed from: qe */
public final class qe extends qj {
    public Bitmap a;
    private Bitmap f;
    private boolean g;

    public final qe a(CharSequence charSequence) {
        this.c = qg.f(charSequence);
        return this;
    }

    public final qe b(CharSequence charSequence) {
        this.d = qg.f(charSequence);
        this.e = true;
        return this;
    }

    public final qe a(Bitmap bitmap) {
        this.f = bitmap;
        this.g = true;
        return this;
    }

    public final void a(qd qdVar) {
        BigPictureStyle bigPicture = new BigPictureStyle(((qi) qdVar).a).setBigContentTitle(this.c).bigPicture(this.a);
        if (this.g) {
            bigPicture.bigLargeIcon(this.f);
        }
        if (this.e) {
            bigPicture.setSummaryText(this.d);
        }
    }
}
