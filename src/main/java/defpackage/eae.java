package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.Map;

/* renamed from: eae */
public final class eae implements aaap {
    public final Activity a;
    private final wxd b;
    private final acvx c;

    public eae(Activity activity, wxd wxd, acvx acvx) {
        this.a = activity;
        this.b = wxd;
        this.c = acvx;
    }

    public final void a(apxu apxu, Map map) {
        this.c.a(acwl.aA, apxu, null);
        this.c.a(new acvs(acwc.UPLOAD_NATIVE_VIDEO_SELECTION));
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT", null);
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("video/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent = intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"video/*"}).addFlags(64).addFlags(1);
        String str = this.c.c().a;
        apxx apxx = (apxx) apxu.d.createBuilder();
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(this.c.c().e.aH);
        if (str != null) {
            avjh.a(str);
        }
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        this.b.a(intent, 901, new ead(this, (apxu) ((anxl) apxx.build())));
    }
}
