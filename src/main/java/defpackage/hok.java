package defpackage;

/* renamed from: hok */
public final class hok extends hnn {
    public hok() {
        super(agqy.class, auvp.class);
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        String a = ((agqy) obj).a();
        String str = null;
        if (amur != null) {
            str = (String) amur.getOrDefault("downloaded_video_playlist_id", null);
        }
        ets ets = new ets();
        ets.a = hnq.a(a, str, 1);
        return ets.a();
    }
}
