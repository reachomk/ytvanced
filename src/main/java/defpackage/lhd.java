package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: lhd */
public final class lhd implements lhg {
    public final lhj a;
    private final lhc b = new lhc(this);

    public lhd(SharedPreferences sharedPreferences, enl enl, alua alua, afpu afpu, Executor executor) {
        lhj lhj = new lhj(enl, new lhh(alua, afpu, executor));
        ffs ffs = new ffs("PBDS");
        this.a = lhj;
        sharedPreferences.edit().remove("navigation_list_pref_key").remove("queue_version").remove("queue_pref_key").remove("queue_position_key").apply();
    }

    public final void a(aikc aikc) {
        aikg aikg = this.b;
        aikc aikc2 = aikg.a;
        if (aikc2 != null) {
            aikc2.b((aike) aikg);
            aikg.a.b(aikg);
        }
        aikg.a = (aikc) amqw.a((Object) aikc);
        aikc.a((aike) aikg);
        aikc.a(aikg);
    }

    public final void b(aikc aikc) {
        lhj lhj = this.a;
        Object obj = lhj.b.a.get();
        Object obj2 = null;
        if (!(bbyy.b(obj) || bbyy.c(obj))) {
            obj2 = bbyy.d(obj);
        }
        lhr lhr = (lhr) obj2;
        if (lhr == null) {
            lhr = (lhr) amux.a(new bbsu(lhj.b, lhr.a), lhr.a);
        }
        if (!lhr.c.isEmpty() && lhr.a(lhr.b, lhr.c.size(), 4)) {
            synchronized (lhr.c) {
                Collection collection = lhr.d;
                if (collection == null) {
                    return;
                }
                int size = collection.size();
                int i;
                if (lhr.a(lhr.b, size, 4)) {
                    aikc.a(0, 0, collection);
                    aikc.b(lhr.b);
                    i = lhr.b;
                    StringBuilder stringBuilder = new StringBuilder(51);
                    stringBuilder.append("restoreIntoQueue pos: ");
                    stringBuilder.append(i);
                    stringBuilder.append(" size: ");
                    stringBuilder.append(size);
                    xtl.e(stringBuilder.toString());
                    return;
                }
                i = lhr.b;
            }
        }
    }
}
