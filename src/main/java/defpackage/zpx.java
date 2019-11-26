package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: zpx */
final class zpx extends AsyncTask {
    private final Context a;
    private final zpu b;
    private final zqa c;
    private final zix d;
    private final zpz e;
    private final int f;
    private final CancellationSignal g = new CancellationSignal();

    zpx(Context context, zpu zpu, zqa zqa, zix zix, zpz zpz, int i) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (zpu) amqw.a((Object) zpu);
        this.c = (zqa) amqw.a((Object) zqa);
        this.d = (zix) amqw.a((Object) zix);
        this.e = (zpz) amqw.a((Object) zpz);
        this.f = i;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        super.cancel(false);
        this.g.cancel();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        zpz zpz = this.e;
        if (zpz.d == this) {
            zpz.d = null;
        }
        this.c.a(this.d, amqp.c(bitmap));
        this.b.c(this.f);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Object obj = null;
        if (isCancelled()) {
            return null;
        }
        try {
            obj = zqc.a(this.a, this.d, this.g);
            return obj;
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                return obj;
            }
            String valueOf = String.valueOf(this.d.b());
            String valueOf2 = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 31) + valueOf2.length());
            stringBuilder.append("Failed to load thumbnail for ");
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf2);
            xtl.d(stringBuilder.toString());
            return obj;
        }
    }
}
