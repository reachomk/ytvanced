package defpackage;

import android.os.AsyncTask;

/* renamed from: pk */
final class pk extends AsyncTask {
    private final /* synthetic */ pl a;

    pk(pl plVar) {
        this.a = plVar;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onCancelled(Object obj) {
        this.a.b();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.b();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            po b;
            pl plVar = this.a;
            pn pnVar = plVar.a;
            if (pnVar != null) {
                b = pnVar.b();
            } else {
                synchronized (plVar.d) {
                    if (plVar.d.size() > 0) {
                        b = (po) plVar.d.remove(0);
                    } else {
                        b = null;
                    }
                }
            }
            if (b == null) {
                return null;
            }
            pl plVar2 = this.a;
            b.a();
            plVar2.a();
            b.b();
        }
        while (true) {
        }
    }
}
