package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: agcb */
final /* synthetic */ class agcb implements Runnable {
    private final agca a;
    private final String b;
    private final List c;
    private final aghw d;
    private final agqz e;

    agcb(agca agca, String str, List list, aghw aghw, agqz agqz) {
        this.a = agca;
        this.b = str;
        this.c = list;
        this.d = aghw;
        this.e = agqz;
    }

    public final void run() {
        agca agca = this.a;
        String str = this.b;
        List list = this.c;
        aghw aghw = this.d;
        agqz agqz = this.e;
        agbu agbu = agca.a;
        avrp c = aghw.c(str);
        long d = agca.a.h.d();
        long c2 = agca.a.h.c();
        if (d != 0) {
            long j;
            agdq agdq = (agdq) agca.a.c.get();
            amqw.a(str != null, (Object) "Either specify playlistId or videoListId");
            agqt a = ((agbu) agdq.b.get()).a(str);
            if (a == null) {
                j = 0;
            } else {
                agwh agwh = (agwh) agdq.a.get();
                j = 0;
                for (String a2 : a.b) {
                    agqy a3 = agwh.a(a2);
                    if (a3 != null) {
                        j += a3.g();
                    }
                }
            }
            d = Math.min(c2, d - j);
        } else {
            d = c2;
        }
        avsi d2 = aghw.d(str);
        Cursor query = aghw.a.a().query("video_listsV13", new String[]{"stream_transfer_condition"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            agqq a4;
            if (query.moveToNext()) {
                a4 = agqq.a(query.getInt(0));
            } else {
                a4 = agqq.OFFLINE_IMMEDIATELY;
                query.close();
            }
            agbu.a(str, list, c, d, true, false, 1, d2, a4, aghw.e(str), aghw.f(str), agxj.k(agqz.f));
        } finally {
            query.close();
        }
    }
}
