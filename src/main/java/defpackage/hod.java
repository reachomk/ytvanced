package defpackage;

import java.util.ArrayList;

/* renamed from: hod */
public final class hod extends hnn {
    private final bcaa a;
    private final bcaa b;

    public hod(bcaa bcaa, bcaa bcaa2) {
        super(agqk.class, akab.class);
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqk agqk = (agqk) obj;
        String str = agqk.a.a;
        hoc hoc = (hoc) this.b.get();
        agwh k = ((agwc) this.a.get()).b().k();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String h : agqk.b) {
            Object h2 = k.h(h);
            if (h2 != null) {
                awlq awlq = (awlq) hoc.a(agqp.class, awlq.class, (agqp) amqw.a(h2), amur.a("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(i)));
                if (awlq != null) {
                    arrayList.add(awlq);
                    i++;
                }
            }
        }
        ajyf ajyf = new ajyf();
        ajyf.c = str;
        ajyf.b = new ajyi[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ajyi ajyi = new ajyi();
            ajyi.b = (awlq) arrayList.get(i2);
            ajyf.b[i2] = ajyi;
        }
        akab akab = new akab();
        new akad().h = ajyf;
        akab.b = new akad[]{r0};
        return akab;
    }
}
