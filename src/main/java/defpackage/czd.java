package defpackage;

import android.view.View.OnScrollChangeListener;
import java.util.BitSet;

/* renamed from: czd */
public final class czd extends clz {
    private cze a;
    private final String[] d = new String[]{"contentProps"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final czd a(clz clz) {
        this.a.a = clz != null ? (sne) clz.c() : null;
        this.e.set(0);
        return this;
    }

    public final czd a() {
        this.a.b = true;
        return this;
    }

    public final czd a(Integer num) {
        this.a.c = num;
        return this;
    }

    public final czd a(OnScrollChangeListener onScrollChangeListener) {
        this.a.d = onScrollChangeListener;
        return this;
    }

    public final czd b(boolean z) {
        this.a.e = z;
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(1, this.e, this.d);
        cze cze = this.a;
        super.e();
        this.a = null;
        return cze;
    }

    static /* synthetic */ void a(czd czd, cmg cmg, cze cze) {
        super.a(cmg, (cma) cze);
        czd.a = cze;
        czd.e.clear();
    }
}
