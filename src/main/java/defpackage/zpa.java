package defpackage;

import android.database.DataSetObserver;
import android.widget.HorizontalScrollView;

/* renamed from: zpa */
public final class zpa extends DataSetObserver {
    private final /* synthetic */ HorizontalScrollView a;
    private final /* synthetic */ zos b;

    public zpa(zos zos, HorizontalScrollView horizontalScrollView) {
        this.b = zos;
        this.a = horizontalScrollView;
    }

    public final void onChanged() {
        this.a.post(new zoz(this.b));
    }
}
