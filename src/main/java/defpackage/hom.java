package defpackage;

/* renamed from: hom */
public final class hom extends hnn {
    private final bcaa a;
    private final bcaa b;

    public hom(bcaa bcaa, bcaa bcaa2) {
        super(agqp.class, auvp.class);
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        String a = ((agqp) obj).a();
        String str = null;
        if (amur != null) {
            str = (String) amur.getOrDefault("downloaded_video_playlist_id", null);
        }
        agqy a2 = ((agwc) this.b.get()).b().k().a(a);
        if (a2 != null) {
            return ((hoc) this.a.get()).a(a2, str);
        }
        ets ets = new ets();
        ets.a = hnq.a(a, str, 1);
        return ets.a();
    }
}
