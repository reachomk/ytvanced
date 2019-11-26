package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.google.android.youtube.R;

/* renamed from: iqz */
final /* synthetic */ class iqz implements OnItemLongClickListener {
    private final iqu a;

    iqz(iqu iqu) {
        this.a = iqu;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        iqu iqu = this.a;
        Object item = iqu.aD.getItem(i);
        if (item instanceof abnv) {
            abnv abnv = (abnv) item;
            if (abnv.a()) {
                new Builder(iqu.a).setTitle(abnv.a).setMessage(R.string.delete_search_suggestion_confirmation).setPositiveButton(R.string.remove, new ire(iqu, abnv)).setNegativeButton(17039360, null).create().show();
                return true;
            }
        }
        return false;
    }
}
