package defpackage;

import android.os.AsyncTask;

/* renamed from: adfu */
final class adfu extends AsyncTask {
    private final /* synthetic */ adfv a;

    adfu(adfv adfv) {
        this.a = adfv;
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        bax bax = (bax) obj;
        if (bax != null) {
            this.a.a(bax);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Object obj = ((bao[]) objArr)[0];
        String.valueOf(obj).length();
        baz a = obj != null ? obj.a() : null;
        adfv adfv;
        if (a == null || !a.a().contains("MDX_MEDIA_ROUTE_CONTROL_CATEGORY")) {
            ((adqc) this.a.j.get()).b(this.a.s);
            adfv = this.a;
            adfv.o = false;
            adfv.b();
            return null;
        }
        ((adqc) this.a.j.get()).a(this.a.s);
        adfv = this.a;
        adfv.o = true;
        adfv.b();
        return this.a.a();
    }
}
