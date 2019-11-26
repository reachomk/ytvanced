package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.util.HashSet;
import java.util.List;

/* renamed from: agjr */
public final class agjr extends AsyncTask {
    private final /* synthetic */ DebugOfflineAdActivity a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        xpr.a(this.a, (CharSequence) "All offline ad playback counts have been reset to 0!", 1);
        new agjm(this.a).execute(new Void[]{null});
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        agfi h = this.a.d.h();
        for (agqy agqy : this.a.d.k().a()) {
            List<vsd> v = h.v(agqy.a());
            if (!v.isEmpty()) {
                for (vsd vsd : v) {
                    String a = agqy.a();
                    String str = vsd.g;
                    h.f.c.a().execSQL("UPDATE ads SET vast_playback_count = 0 WHERE original_video_id = ? AND ad_break_id = ?", new Object[]{a, str});
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (ageu ageu : h.e()) {
            agep agep = ageu.b;
            if (!(agep == null || hashSet.contains(agep.a))) {
                h.x(ageu.b.a);
                hashSet.add(ageu.b.a);
            }
        }
        return null;
    }

    /* synthetic */ agjr(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }
}
