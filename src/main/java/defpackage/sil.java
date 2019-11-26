package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: sil */
final class sil extends AsyncTask {
    public final anko a = anko.f();
    private final ansx b;
    private final sgz c;

    sil(ansx ansx, sgz sgz) {
        this.b = ansx;
        this.c = sgz;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a_((sfq) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        sga a = sga.a();
        Context context = contextArr[0];
        sgz sgz = this.c;
        return a.a(context, sgz.i, this.b, sgz.f, sgz.j, sgz.m, sgz.n);
    }
}
