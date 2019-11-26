package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xrg */
public final class xrg {
    public final Set a = new HashSet();
    public RecyclerView b;
    private aps c;
    private apv d;

    public final aps a() {
        if (this.c == null) {
            this.c = new xrf(this);
        }
        return this.c;
    }

    public final apv b() {
        if (this.d == null) {
            this.d = new xri(this);
        }
        return this.d;
    }
}
