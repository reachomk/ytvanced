package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* renamed from: qnv */
public final class qnv extends AsyncTask {
    private static final pon a = new pon("FetchBitmapTask");
    private final qnz b;
    private final qny c;

    public qnv(Context context, qny qny) {
        this(context, 0, 0, qny, (byte) 0);
    }

    public qnv(Context context, int i, int i2, qny qny) {
        this(context, i, i2, qny, (byte) 0);
    }

    private qnv(Context context, int i, int i2, qny qny, byte b) {
        this.b = qnh.a(context.getApplicationContext(), this, new qoa(this), i, i2);
        this.c = qny;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qny qny = this.c;
        if (qny != null) {
            qny.a(bitmap);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        Object obj = null;
        if (uriArr.length != 1) {
            return null;
        }
        Uri uri = uriArr[0];
        if (uri == null) {
            return null;
        }
        try {
            obj = this.b.a(uri);
            return obj;
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "doFetch", qnz.class.getSimpleName());
            return obj;
        }
    }
}
