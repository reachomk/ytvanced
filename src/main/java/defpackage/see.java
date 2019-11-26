package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: see */
public final class see extends AsyncTask {
    public final anko a = anko.f();
    private final sfj b;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a_((sfq) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        try {
            sfg.a();
            return sfg.a(contextArr[0], this.b);
        } catch (IOException e) {
            return new sfq(102, e);
        } catch (sfs e2) {
            return new sfq(e2.a, e2.getMessage(), e2);
        }
    }

    public see(sgz sgz, String str, int i) {
        sfm sfm = new sfm(sgz.a, sgz.i);
        sfm.a = str;
        sfm.b = sgz.f;
        sfm.c = sgz.j;
        sfm.f = 3;
        if (sfm.b == null) {
            sfm.b = new String[0];
        }
        this.b = new sfj(sfm);
    }
}
