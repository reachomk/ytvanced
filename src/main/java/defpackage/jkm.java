package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: jkm */
final class jkm extends AsyncTask {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ fnp b;
    private final /* synthetic */ jkj c;

    jkm(jkj jkj, Uri uri, fnp fnp) {
        this.c = jkj;
        this.a = uri;
        this.b = fnp;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        obj = (Bitmap) obj;
        if (obj != null) {
            fnp fnp = this.b;
            amqw.a(obj);
            fnp.g = obj;
            if (this.c.g.contains(this.b)) {
                this.c.a(this.b);
            }
        }
        this.c.h.remove(this);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Object obj = null;
        try {
            obj = this.c.d.a(this.a, null).a(new Point(640, 360));
            return obj;
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return obj;
        }
    }
}
