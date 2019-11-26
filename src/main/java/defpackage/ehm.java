package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: ehm */
public final class ehm implements aaey {
    public final afpo a;
    public final afpu b;
    public final tkh c;
    public final tkj d;
    public final bcaa e;
    public final teq f;
    public final tht g;
    public final thv h;
    private final ehn i;

    public ehm(afpo afpo, afpu afpu, ehn ehn, tkh tkh, tkj tkj, bcaa bcaa, teq teq, tht tht, thv thv) {
        this.a = (afpo) amqw.a((Object) afpo);
        this.b = (afpu) amqw.a((Object) afpu);
        this.i = (ehn) amqw.a((Object) ehn);
        this.c = (tkh) amqw.a((Object) tkh);
        this.d = (tkj) amqw.a((Object) tkj);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.f = (teq) amqw.a((Object) teq);
        this.g = (tht) amqw.a((Object) tht);
        this.h = (thv) amqw.a((Object) thv);
    }

    public final void a(Activity activity, String str) {
        amqw.a((Object) activity);
        if (TextUtils.isEmpty(str)) {
            str = "yt_android_default";
        }
        Uri parse = Uri.parse(activity.getResources().getString(R.string.youtube_help_uri));
        this.i.a(str, new ehl(this, xss.a(activity), str, parse, activity));
    }
}
