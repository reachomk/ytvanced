package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: agjm */
public final class agjm extends AsyncTask {
    private final /* synthetic */ DebugOfflineAdActivity a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            this.a.b.setText("No offline videos");
            this.a.b.setVisibility(0);
            this.a.a.setVisibility(8);
            return;
        }
        this.a.b.setVisibility(8);
        this.a.c.clear();
        this.a.c.addAll(list);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        DebugOfflineAdActivity debugOfflineAdActivity = this.a;
        if (debugOfflineAdActivity.d == null) {
            return Collections.emptyList();
        }
        long a = debugOfflineAdActivity.f.a();
        Map a2 = debugOfflineAdActivity.d.m().a();
        TreeMap treeMap = new TreeMap();
        for (agqy agqy : debugOfflineAdActivity.d.k().a()) {
            if (a2.containsKey(agqy.a())) {
                List arrayList = new ArrayList();
                for (atcs atcs : (List) a2.get(agqy.a())) {
                    if (atcs.a.size() > 0) {
                        arrayList.add(new agjl(atcs, a));
                    }
                }
                String a3 = agqy.a(debugOfflineAdActivity);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                treeMap.put(a3, new agjq(agqy, arrayList));
            } else {
                treeMap.put(agqy.a(debugOfflineAdActivity), new agjq(agqy, null));
            }
        }
        return new ArrayList(treeMap.values());
    }

    public /* synthetic */ agjm(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }
}
