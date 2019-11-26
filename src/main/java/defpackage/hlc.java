package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hlc */
public final class hlc extends agtz {
    private final Context c;
    private final agvz d;
    private final hpr e;
    private final hsy f;

    public hlc(Context context, agvz agvz, xci xci, hpr hpr, hsy hsy, String str) {
        super(context, agvz, xci, str);
        this.c = (Context) amqw.a((Object) context);
        this.d = (agvz) amqw.a((Object) agvz);
        this.e = (hpr) amqw.a((Object) hpr);
        this.f = (hsy) amqw.a((Object) hsy);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        String str = hpr.a;
        hsy hsy = this.f;
        if (str.equals((String) hsy.a.get(this.b))) {
            ArrayList arrayList = new ArrayList();
            for (agqy agqy : this.e.a()) {
                if (agqy.u() == agqs.PLAYABLE) {
                    arrayList.add(agqy);
                }
            }
            a(agqi.a("PPMA", arrayList.size(), this.c.getString(R.string.auto_offline_videos_title)), arrayList);
        } else if (f()) {
            List c = this.d.k().c();
            if (c == null || c.isEmpty()) {
                a(null, Collections.emptyList());
                return;
            }
            ArrayList arrayList2 = new ArrayList(c);
            Collections.sort(arrayList2, hlf.a);
            a(agqi.a(arrayList2.size(), this.c.getString(R.string.single_videos_playlist_title)), arrayList2);
        } else {
            super.a();
        }
    }
}
