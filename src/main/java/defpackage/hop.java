package defpackage;

/* renamed from: hop */
public final class hop extends hnn {
    private final bcaa a;
    private final bcaa b;

    public hop(bcaa bcaa, bcaa bcaa2) {
        super(agqp.class, awlq.class);
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        obj = (agqp) obj;
        amqw.a((Object) amur);
        String str = "downloaded_video_list_index";
        amqw.a(hnn.a(amur, str));
        String str2 = "downloaded_video_playlist_id";
        amqw.a(hnn.a(amur, str2));
        int intValue = ((Integer) amur.get(str)).intValue();
        String str3 = (String) amur.get(str2);
        String a = obj.a();
        hoc hoc = (hoc) this.a.get();
        Object a2 = ((agwc) this.b.get()).b().k().a(a);
        if (a2 != null) {
            return (awlq) hoc.a(agqy.class, awlq.class, (agqy) amqw.a(a2), amur.a(str2, str3, str, Integer.valueOf(intValue)));
        }
        etu etu = new etu();
        etu.a = a;
        etu.b = obj.f();
        etu.a(obj.b());
        etu.a(intValue + 1);
        etu.b(obj.c());
        etu.c(a);
        etu.c = airn.a(a, str3, intValue, 0.0f);
        Class cls = agqp.class;
        Class cls2 = auvp.class;
        agqp agqp = (agqp) amqw.a(obj);
        if (amqu.a(str3)) {
            amur = null;
        } else {
            amur = amur.a(str2, xvd.a(str3));
        }
        etu.a((auvp) hoc.a(cls, cls2, agqp, amur));
        etu.a(ayfo.a);
        agpy agpy = obj.a;
        if (agpy != null) {
            etu.a(agpy.b, ebm.a(agpy.a));
        }
        return etu.a();
    }
}
