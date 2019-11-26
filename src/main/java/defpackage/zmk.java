package defpackage;

import android.os.AsyncTask;

/* renamed from: zmk */
final class zmk extends AsyncTask {
    private final znv a;
    private final zml b;

    zmk(znv znv, zml zml) {
        this.a = znv;
        this.b = zml;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] a = this.a.a.a();
        if (a != null) {
            for (Object a2 : a) {
                this.b.a(a2);
            }
        }
        return null;
    }
}
