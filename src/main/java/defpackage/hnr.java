package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hnr */
public final class hnr extends hnn {
    private final Context a;

    public hnr(Context context) {
        super(eki.class, apaj.class);
        this.a = context;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        eki eki = (eki) obj;
        String str = "downloads_page_filter_type";
        amqw.a(hnn.a(amur, str));
        int a = aqxx.a(((Integer) amur.get(str)).intValue());
        ejt ejt = new ejt(this.a);
        ejt.a(arwh.DOWNLOADS_PAGE_EMPTY);
        if (eki.f()) {
            ejt.b(hnr.a(a));
            ejt.c(3);
        } else {
            ejt.a(hnr.a(a));
            ejt.b(a == 3 ? R.string.no_offline_playlists_subtitle : R.string.no_offline_videos_subtitle);
            ejt.c(2);
        }
        return ejt.a();
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 2) {
            return i2 != 3 ? R.string.no_offline_content_title : R.string.no_offline_videos_title;
        } else {
            return R.string.no_offline_playlists_title;
        }
    }
}
