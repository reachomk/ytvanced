package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: iqw */
final /* synthetic */ class iqw implements OnItemClickListener {
    private final iqu a;

    iqw(iqu iqu) {
        this.a = iqu;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        iqu iqu = this.a;
        Object item = iqu.aD.getItem(i);
        if (item instanceof abnv) {
            abnx abnx = iqu.at;
            String str = iqu.aK;
            abnx.t = 2;
            abnx.g = str;
            iqu.a(((abnv) item).b, i);
        }
    }
}
