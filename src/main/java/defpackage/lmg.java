package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import java.util.Set;

/* renamed from: lmg */
public final class lmg extends apa {
    private final Context c;
    private final Context d;
    private final luf e;
    private final lqt f;
    private final lmm g;
    private final Set h;
    private final SharedPreferences i;

    public lmg(Context context, Context context2, luf luf, SharedPreferences sharedPreferences, lqt lqt, Set set) {
        lmm lmm = lmj.a;
        this.c = context;
        this.d = context2;
        this.e = luf;
        this.f = lqt;
        this.g = lmm;
        this.i = sharedPreferences;
        this.h = set;
        ffs ffs = new ffs("SWAD");
        this.f.b(new lmi(this));
        a(true);
    }

    public final /* bridge */ /* synthetic */ boolean Y_() {
        return true;
    }

    public final int a(int i) {
        return lva.a((lqz) this.f.c(i), this.i) != 2 ? 1 : 2;
    }

    public final int a() {
        return this.f.d();
    }

    public final long b(int i) {
        lqz lqz = (lqz) this.f.c(i);
        if (lqz == null) {
            return -1;
        }
        return (long) lqz.a.hashCode();
    }

    public final void a(RecyclerView recyclerView) {
        for (lml a : this.h) {
            a.a(recyclerView);
        }
        recyclerView.e(this.f.c());
    }

    public final void Z_() {
        for (lml a : this.h) {
            a.a();
        }
    }
}
