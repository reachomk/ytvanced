package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: hxn */
public final class hxn implements aigc {
    private static final amul d = amul.a("en_US", "en_CA", "es_MX");
    public final nn a;
    public final aizy b;
    public final hwr c;
    private final hxs e;

    public hxn(nn nnVar, aizy aizy, hxs hxs) {
        this.a = (nn) amqw.a((Object) nnVar);
        this.b = (aizy) amqw.a((Object) aizy);
        this.c = new hwr(R.id.controls_overlay_menu_subtitle_track, nnVar.getString(R.string.subtitles), new hxq(this));
        this.e = hxs;
    }

    public final void a(aigf aigf) {
        this.e.a(aigf);
    }

    public final void d(boolean z) {
        this.c.a(z);
    }

    public final void e(boolean z) {
        hwr hwr = this.c;
        Context context = this.a;
        int i = d.contains(context.getResources().getConfiguration().locale.toString()) ? z ? R.drawable.quantum_ic_closed_caption_googblue_24 : R.drawable.quantum_ic_closed_caption_grey600_24 : !z ? R.drawable.quantum_ic_subtitles_grey600_24 : R.drawable.quantum_ic_subtitles_googblue_24;
        hwr.d = ra.a(context, i);
    }

    public final void a(ajis ajis) {
        this.e.a(ajis);
        hwr hwr = this.c;
        String str = null;
        if (!(ajis == null || ajis.a() || ajis.k)) {
            str = ajis.toString();
        }
        hwr.a(str);
    }

    public final void a(List list) {
        this.e.a(list);
        this.e.a(this.a);
    }
}
