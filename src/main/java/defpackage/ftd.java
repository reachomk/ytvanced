package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;
import com.google.android.youtube.R;

/* renamed from: ftd */
public final class ftd implements fgz, zcm {
    public final jxr a;
    public StickyPlayerContainer b;
    public akor c;
    public ycp d;
    public int e;
    private final xpw f;
    private final zbe g;

    public ftd(Context context, xci xci, akkq akkq, eid eid, aaas aaas, elv elv, ffw ffw, hdd hdd, gal gal, xpw xpw, zbe zbe) {
        jxr jxr = new jxr(context, xci, akkq, eid, aaas, elv, ffw, hdd, gal, R.layout.chat_timebar_space);
        this.f = (xpw) amqw.a((Object) xpw);
        this.g = (zbe) amqw.a((Object) zbe);
        this.a = (jxr) amqw.a((Object) jxr);
    }

    public final fhc b() {
        return null;
    }

    public final void a(boolean z) {
        this.a.b = z;
    }

    public final View a() {
        return this.a.a();
    }

    public final void b(boolean z) {
        StickyPlayerContainer stickyPlayerContainer = this.b;
        int i = this.e;
        stickyPlayerContainer.e = true;
        stickyPlayerContainer.b.a(stickyPlayerContainer.a, new PointF(0.0f, (float) i));
    }

    public final void a(akor akor, ycp ycp) {
        this.a.a_(akor, ycp);
        this.a.b = true;
        this.b.setVisibility(0);
        this.f.a(a(), false);
        this.c = akor;
        this.d = ycp;
        this.b.b.cancel();
    }

    public final void c() {
        this.b.setVisibility(8);
        this.g.a(this);
    }

    public final void d() {
        this.d = null;
        this.c = null;
    }
}
