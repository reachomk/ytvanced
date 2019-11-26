package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: pxs */
public abstract class pxs implements pxt {
    public final DataHolder a;

    protected pxs(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public final int a() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.e;
    }

    @Deprecated
    public final void c() {
        b();
    }

    public final Iterator iterator() {
        return new pxx(this);
    }

    public final void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
