package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: amdf */
public final class amdf implements Runnable {
    private final Context a;
    private final tgv b;
    private final String c;
    private final Map d;

    public amdf(Context context, tgv tgv, String str, Map map) {
        this.a = context;
        this.b = tgv;
        this.c = str;
        this.d = map;
    }

    public final void run() {
        tgu a = this.b.a(this.a, "youtube_uploads_android");
        HashMap hashMap = new HashMap();
        hashMap.put("frontend_id", this.c);
        String a2 = a.a(hashMap);
        a.a();
        this.d.put(this.c, a2);
    }
}
