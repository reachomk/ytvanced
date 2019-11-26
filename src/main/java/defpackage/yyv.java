package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Map;

/* renamed from: yyv */
public final class yyv implements yxm {
    public final RecyclerView a;
    public final ans b;
    public yxp c;
    public boolean d = true;
    public boolean e;
    public boolean f = true;

    public yyv(RecyclerView recyclerView) {
        yyz yyz = new yyz();
        this.a = (RecyclerView) amqw.a((Object) recyclerView);
        this.b = new yyw(recyclerView.getContext(), this);
        recyclerView.a(this.b);
        recyclerView.a(new yyu(this));
    }

    public final boolean a() {
        apa apa = this.a.m;
        return apa == null || apa.a() == 0 || this.d;
    }

    public final void a(yxp yxp) {
        this.c = yxp;
    }

    public final void a(apa apa) {
        this.a.a(apa);
    }

    public final void a(boolean z) {
        this.f = z;
        apa apa = this.a.m;
        if (apa == null || apa.a() == 0) {
            this.e = true;
        } else if (z) {
            this.a.e(apa.a() - 1);
        } else {
            this.d = true;
            this.f = true;
            this.a.c(apa.a() - 1);
        }
    }

    public final void a(String str, Map map) {
        if (map.containsKey(str)) {
            int intValue = ((Integer) map.get(str)).intValue();
            aqc yyx = new yyx(this.a.getContext());
            yyx.b = intValue;
            this.a.n.a(yyx);
        }
    }

    public final boolean b() {
        apa apa = this.a.m;
        if (apa == null || this.b.r() == apa.a() - 1) {
            return true;
        }
        return false;
    }
}
