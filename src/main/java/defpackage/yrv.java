package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: yrv */
final class yrv extends ahd implements yij {
    public final Executor a;
    public final apa b;
    public final List c;
    public final ysa d;
    public boolean e;
    public boolean f;
    public List g;
    public List h;
    private final Executor i;

    yrv(Executor executor, Executor executor2, apa apa, List list, ysa ysa) {
        this.i = (Executor) amqw.a((Object) executor);
        this.a = (Executor) amqw.a((Object) executor2);
        this.b = (apa) amqw.a((Object) apa);
        this.d = (ysa) amqw.a((Object) ysa);
        this.c = (List) amqw.a((Object) list);
    }

    public final void a(List list, Map map) {
        xak.a();
        if (this.e) {
            if (this.f) {
                this.h = list;
                return;
            }
            this.f = true;
            this.g = list;
            this.i.execute(new yry(this, map));
        }
    }

    public final void bk_() {
        this.e = true;
    }

    public final void bl_() {
        this.e = false;
    }

    public final int a() {
        return this.c.size();
    }

    public final int b() {
        return this.g.size();
    }

    public final boolean a(int i, int i2) {
        yki yki = (yki) this.c.get(i);
        yki yki2 = (yki) this.g.get(i2);
        if (yki.b && !yki2.b && (yki2 instanceof ylf) && TextUtils.equals(yki.a, ((ylf) yki2).getTemporaryClientId())) {
            return true;
        }
        return TextUtils.equals(yki.a, yki2.a);
    }

    public final boolean b(int i, int i2) {
        if ((i == 0 || i2 == 0) && ((this.c.get(i) instanceof yla) || (this.g.get(i2) instanceof yla))) {
            return ((yki) this.c.get(i)).equals(this.g.get(i2));
        }
        if ((this.c.get(i) instanceof yle) && (this.g.get(i2) instanceof yle)) {
            return TextUtils.equals(((yle) this.c.get(i)).getReadReceiptText(), ((yle) this.g.get(i2)).getReadReceiptText());
        }
        return ((yki) this.c.get(i)).g() == ((yki) this.g.get(i2)).g();
    }
}
