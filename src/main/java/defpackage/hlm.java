package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: hlm */
public final class hlm implements hmj {
    private final Context a;
    private final bcaa b;
    private final zyw c;
    private final hqc d;

    public hlm(Context context, bcaa bcaa, zyw zyw, hqc hqc) {
        this.a = context;
        this.b = bcaa;
        this.c = zyw;
        this.d = hqc;
    }

    public final hkt a(int i, agqy agqy) {
        return this.d.a(i, agqy);
    }

    public final hkt a(agqh agqh) {
        if (agqh == null) {
            return new hkt(R.attr.ytTextSecondary, "");
        } else if (agqh.e()) {
            amqw.a(agqh.e());
            return new hkt(R.attr.ytTextSecondary, hsv.a(this.a, agqh.a));
        } else {
            String string;
            amqw.a(agqh.e() ^ 1);
            if (agqh.c != 0) {
                string = this.a.getString(R.string.offline_adding_progress, new Object[]{Integer.valueOf(r6)});
            } else {
                string = this.a.getString(R.string.offline_playlist_waiting);
            }
            return new hkt(R.attr.ytStaticBlue, string);
        }
    }

    public final hkt a() {
        agqm f = ((agwc) this.b.get()).b().k().f();
        if (f == null) {
            return a(0);
        }
        if (f.e()) {
            return a(f.a);
        }
        return a(f.a);
    }

    public final hkt b() {
        String[] strArr;
        Collection<agqy> a = ((agwc) this.b.get()).b().k().a();
        ArrayList arrayList = new ArrayList();
        for (agqy agqy : a) {
            if (!agqy.i()) {
                arrayList.add(agqy);
            }
        }
        if (foh.u(this.c)) {
            long a2 = hsu.a(arrayList);
            if (a2 > 0) {
                strArr = new String[1];
                Context context = this.a;
                int size = arrayList.size();
                strArr[0] = hsu.a(context, context.getResources().getQuantityString(R.plurals.video_count, size, new Object[]{Integer.valueOf(size)}), a2);
                return new hkt(R.attr.ytTextSecondary, strArr);
            }
        }
        if (!arrayList.isEmpty()) {
            return a(arrayList.size());
        }
        if (a.isEmpty()) {
            return a(0);
        }
        int size2 = a.size();
        strArr = new String[1];
        strArr[0] = this.a.getResources().getQuantityString(R.plurals.recommendation_count, size2, new Object[]{Integer.valueOf(size2)});
        return new hkt(R.attr.ytTextSecondary, strArr);
    }

    private final hkt a(int i) {
        String[] strArr = new String[1];
        strArr[0] = this.a.getResources().getQuantityString(R.plurals.video_count, i, new Object[]{Integer.valueOf(i)});
        return new hkt(R.attr.ytTextSecondary, strArr);
    }
}
