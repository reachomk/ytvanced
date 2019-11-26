package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: sec */
public final class sec extends AsyncTask {
    public final anko a = anko.f();
    private final sgz b;

    public sec(sgz sgz) {
        this.b = sgz;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a_((sfq) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        sfg.a();
        Context context = contextArr[0];
        sgz sgz = this.b;
        return sfg.a(context, sgz.a, sgz.i, sgz.f, false, sgz.j);
    }
}
