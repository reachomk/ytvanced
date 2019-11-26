package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hon */
public final class hon extends hnn {
    private final Context a;
    private final bcaa b;
    private final zyw c;

    public hon(Context context, bcaa bcaa, zyw zyw) {
        super(agqy.class, awlq.class);
        this.a = context;
        this.b = bcaa;
        this.c = zyw;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqy agqy = (agqy) obj;
        amqw.a((Object) amur);
        String str = "downloaded_video_list_index";
        amqw.a(hnn.a(amur, str));
        String str2 = "downloaded_video_playlist_id";
        amqw.a(hnn.a(amur, str2));
        int intValue = ((Integer) amur.get(str)).intValue();
        boolean M = foh.M(this.c);
        String str3 = (String) amur.get(str2);
        str2 = agqy.a();
        etu etu = new etu();
        etu.a = str2;
        etu.b = agqy.e();
        etu.a(agqy.a(this.a));
        etu.a(intValue + 1);
        etu.b(agqy.c());
        etu.a(((hoc) this.b.get()).a(agqy, str3));
        etu.c(str2);
        etu.a(ayfo.a);
        if (M) {
            long b = agqy.b();
            long j = agqy.h;
            int a = hsz.a(b, j);
            etu.c = airn.a(str2, str3, intValue, hsz.b(b, j));
            ayfp ayfp = (ayfp) ayfq.c.createBuilder();
            ayfp.a(a);
            ayfq ayfq = (ayfq) ((anxl) ayfp.build());
            if (etu.e == null) {
                etu.e = new ArrayList();
            }
            List list = etu.e;
            ayft ayft = (ayft) ayfu.q.createBuilder();
            ayft.a(ayfq);
            list.add((ayfu) ((anxl) ayft.build()));
        } else {
            etu.c = airn.a(str2, str3, intValue, 0.0f);
        }
        atdv atdv = agqy.k;
        if (atdv != null) {
            atdl atdl = atdv.k;
            if (atdl == null) {
                atdl = atdl.c;
            }
            if (atdl.a == 60572968) {
                avsj avsj;
                atdl atdl2 = atdv.k;
                if (atdl2 == null) {
                    atdl2 = atdl.c;
                }
                if (atdl2.a == 60572968) {
                    avsj = (avsj) atdl2.b;
                } else {
                    avsj = avsj.h;
                }
                awlr awlr = (awlr) awlo.c.createBuilder();
                awlr.copyOnWrite();
                awlo awlo = (awlo) awlr.instance;
                if (avsj != null) {
                    awlo.b = avsj;
                    awlo.a |= 1;
                    etu.d = (awlo) ((anxl) awlr.build());
                } else {
                    throw new NullPointerException();
                }
            }
        }
        agpy d = agqy.d();
        if (d != null) {
            etu.a(d.b, ebm.a(d.a));
        }
        return etu.a();
    }
}
