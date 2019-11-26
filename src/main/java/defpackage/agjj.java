package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.util.HashSet;
import java.util.List;

/* renamed from: agjj */
public final class agjj extends AsyncTask {
    private final /* synthetic */ DebugOfflineAdActivity a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        xpr.a(this.a, (CharSequence) "All offline ad playback counts have been incremented!", 1);
        new agjm(this.a).execute(new Void[]{null});
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        agfi h = this.a.d.h();
        if (h != null) {
            for (agqy agqy : this.a.d.k().a()) {
                List<vsd> v = h.v(agqy.a());
                if (!v.isEmpty()) {
                    for (vsd vsd : v) {
                        h.b(agqy.a(), vsd.g);
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (ageu ageu : h.e()) {
                agep agep = ageu.b;
                if (!(agep == null || hashSet.contains(agep.a))) {
                    h.w(ageu.b.a);
                    hashSet.add(ageu.b.a);
                }
            }
        }
        return null;
    }

    /* synthetic */ agjj(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }
}
