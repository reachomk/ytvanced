package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acri */
public final class acri extends abub {
    private final bcaa a;
    private final aaas b;

    public final aaas b() {
        return this.b;
    }

    public final int d() {
        return R.layout.live_chat_light_overlay_viewer_engagement_message;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", (abox) this.a.get());
        return hashMap;
    }

    public acri(bcaa bcaa, Context context, aaas aaas, akvp akvp) {
        super(context, akvp);
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (aaas) amqw.a((Object) aaas);
    }
}
