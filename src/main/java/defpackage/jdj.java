package defpackage;

import android.os.AsyncTask;
import com.google.android.apps.youtube.app.settings.developer.DebugShowOfflineQueueActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jdj */
public final class jdj extends AsyncTask {
    private final /* synthetic */ DebugShowOfflineQueueActivity a;

    public jdj(DebugShowOfflineQueueActivity debugShowOfflineQueueActivity) {
        this.a = debugShowOfflineQueueActivity;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            this.a.n.setText("Queue is empty");
            return;
        }
        this.a.n.setVisibility(8);
        this.a.o.addAll(list);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        xbu d = this.a.l.d();
        ArrayList arrayList = new ArrayList();
        while (d.hasNext()) {
            arrayList.add(d.next());
        }
        d.a();
        return arrayList;
    }
}
