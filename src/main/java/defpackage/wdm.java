package defpackage;

import com.google.android.youtube.R;
import java.util.List;

/* renamed from: wdm */
final class wdm implements aavd, wet {
    private final akvy a;
    private final wef b;
    private final wdj c;
    private final wkt d;
    private final String e;
    private final String f;
    private final /* synthetic */ wda g;

    wdm(wda wda, akvy akvy, wef wef, wdj wdj, wkt wkt, String str, String str2) {
        this.g = wda;
        this.a = akvy;
        this.b = wef;
        this.c = (wdj) amqw.a((Object) wdj);
        this.d = (wkt) amqw.a((Object) wkt);
        this.e = (String) amqw.a((Object) str);
        this.f = str2;
    }

    public final List b() {
        return null;
    }

    public final String c() {
        return null;
    }

    public final String d() {
        return null;
    }

    public final String e() {
        return null;
    }

    public final String f() {
        return null;
    }

    public final String g() {
        return null;
    }

    public final String a() {
        return this.e;
    }

    public final void a(ajua ajua) {
        this.d.d();
        this.g.e.a(ajua.b, wda.a(this.a), R.string.comment_added);
        ajtz ajtz = ajua.a;
        ajst ajst = ajtz != null ? ajtz.a : null;
        if (ajst != null) {
            ajsu ajsu = ajst.a;
            if (ajsu != null && ajsu.a != null) {
                if (!(ajst.c == null || this.g.c() == null)) {
                    this.g.c().a(new acvs(ajst.c));
                }
                this.b.a(ajst, false);
            }
        }
    }

    public final void a(bqn bqn) {
        this.g.a(this.d, bqn, this.c, this.a, this.b, this.e, this.f);
    }

    public final void a(ajty ajty) {
        this.d.d();
        wei wei = this.c.b;
        if (wei == null) {
            akor akor = this.g.c.b;
            wei = akor != null ? (wei) akor.a("commentThreadMutator") : null;
        }
        this.g.e.a(ajty.c, wda.a(this.a), R.string.reply_added);
        ajtx ajtx = ajty.a;
        if (ajtx != null) {
            ajsn ajsn = ajtx.a;
            if (!(ajsn == null || wei == null)) {
                if (ajty.d) {
                    wei.a(ajsn, this.c.c);
                } else {
                    wei.a(ajsn);
                }
            }
        }
        ajri ajri = ajty.c;
        if (ajri != null && ajri.e != apzc.COMMENT_POLL_STATUS_UNKNOWN) {
            wlx wlx = this.g.c;
            String str = this.c.c.g;
            ajri ajri2 = ajty.c;
            wlx.a(str, ajri2.f, ajri2.e);
            awlu awlu = ajty.b;
            if (awlu != null) {
                wlx = this.g.c;
                str = this.c.c.g;
                wlz wlz = (wlz) wlx.a.a(wlx.a(str));
                if (wlz != null) {
                    awmb awmb = (awmb) ((anxo) ((awly) wlz.a).toBuilder());
                    awmb.copyOnWrite();
                    awly awly = (awly) awmb.instance;
                    awly.h = awlu;
                    awly.a |= 32;
                    wlx.a.a(wlx.a(str), new wlz((awly) ((anxl) awmb.build())));
                }
            }
        }
    }

    public final void b(bqn bqn) {
        this.g.a(this.d, bqn, this.c, this.a, this.b, this.e, this.f);
    }

    public final void h() {
        this.d.d();
    }
}
