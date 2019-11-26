package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: qnt */
public final class qnt implements qny {
    public qnw a;
    private final Context b;
    private final plj c;
    private Uri d;
    private qnv e;
    private Bitmap f;
    private boolean g;

    public qnt(Context context) {
        this(context, new plj(-1, 0, 0));
    }

    public qnt(Context context, plj plj) {
        this.b = context;
        this.c = plj;
        qnx qnx = new qnx();
        b();
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            b();
            return true;
        } else if (uri.equals(this.d)) {
            return this.g;
        } else {
            qnv qnv;
            Uri uri2;
            b();
            this.d = uri;
            plj plj = this.c;
            int i = plj.b;
            if (i != 0) {
                int i2 = plj.c;
                if (i2 != 0) {
                    this.e = new qnv(this.b, i, i2, this);
                    qnv = this.e;
                    uri2 = this.d;
                    qnv.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri2});
                    return false;
                }
            }
            this.e = new qnv(this.b, this);
            qnv = this.e;
            uri2 = this.d;
            qnv.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri2});
            return false;
        }
    }

    public final void a() {
        b();
        this.a = null;
    }

    public final void a(Bitmap bitmap) {
        this.f = bitmap;
        this.g = true;
        qnw qnw = this.a;
        if (qnw != null) {
            qnw.a(this.f);
        }
        this.e = null;
    }

    private final void b() {
        qnv qnv = this.e;
        if (qnv != null) {
            qnv.cancel(true);
            this.e = null;
        }
        this.d = null;
        this.f = null;
        this.g = false;
    }
}
