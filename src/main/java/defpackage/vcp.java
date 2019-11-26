package defpackage;

import android.view.View;

/* renamed from: vcp */
public final class vcp {
    public final tqd a;
    public vcq b;

    public vcp(tpr tpr, View view, tpq tpq) {
        this.a = new tqd((tpr) amqw.a((Object) tpr), (View) amqw.a((Object) view), new vco(this), tpq);
    }

    public final tps a() {
        return this.a.a(tqh.RESUME);
    }

    public final tps b() {
        return this.a.a(tqh.PAUSE);
    }

    public final tps c() {
        return this.a.a(tqh.START);
    }

    public final tps a(int i) {
        if (i == 1) {
            return this.a.a(tqh.FIRST_QUARTILE);
        }
        if (i != 2) {
            return i != 3 ? null : this.a.a(tqh.THIRD_QUARTILE);
        } else {
            return this.a.a(tqh.MIDPOINT);
        }
    }

    public final tps d() {
        return this.a.a(tqh.COMPLETE);
    }

    public final tps e() {
        return this.a.a(tqh.FULLSCREEN);
    }

    public final tps f() {
        return this.a.a(tqh.EXIT_FULLSCREEN);
    }

    public final void g() {
        this.a.a(tqh.SUSPEND);
    }

    public final void h() {
        tqd tqd = this.a;
        tqd.a();
        tqd.b = true;
    }
}
