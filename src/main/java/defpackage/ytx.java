package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* renamed from: ytx */
public final class ytx extends yts implements yru, zaw {
    public final View g;
    public final yth i;
    private final zat j;
    private final ynv k;
    private final yoa t;
    private final acvx u;
    private yny v;
    private String w;

    ytx(Context context, ywk ywk, yil yil, ymx ymx, Handler handler, yth yth, yoa yoa, acvx acvx, zat zat, yyt yyt, yxg yxg, yxl yxl, String str, String str2, String str3, yty yty, ynv ynv, View view, amro amro) {
        super(context, handler, ywk, yil, zat, yyt, yxg, yxl, str, str2, str3, yty, ymx, amro, yua.a);
        this.i = (yth) amqw.a((Object) yth);
        this.j = (zat) amqw.a((Object) zat);
        this.g = (View) amqw.a((Object) view);
        this.k = (ynv) amqw.a((Object) ynv);
        this.t = (yoa) amqw.a((Object) yoa);
        this.u = (acvx) amqw.a((Object) acvx);
        zat.a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ytz(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ylh ylh) {
        yie yie = ylh;
        if (ylh.b()) {
            aygk videoThumbnail = ylh.getVideoThumbnail();
            this.j.a(videoThumbnail);
            this.j.a(ylh.getVideoTitle());
            this.w = ylh.getVideoId();
            String str = "related_video_replies_";
            String valueOf = String.valueOf(yie.a);
            a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new yuc(this, yie));
            yoa yoa = this.t;
            valueOf = yie.a;
            View view = this.g;
            yxd yxd = new yxd(this.e_, view, yie.a(this.l), abe.g(this.g) == 0);
            ykf ykf = new ykf(this.w, videoThumbnail, this.u);
            yvb yvb = (yvb) yoa.a((yvb) yoa.a.get(), 1);
            yoa.a((zad) yoa.b.get(), 2);
            this.v = new yny(yvb, (String) yoa.a(valueOf, 3), (View) yoa.a(view, 4), (yxd) yoa.a(yxd, 5), (ykf) yoa.a(ykf, 6));
            this.k.b(this.v);
            super.a((ylf) ylh);
        }
    }

    public final void f() {
        if (xrn.c(this.e_)) {
            g();
        } else {
            this.k.a(this.v);
        }
    }

    public final void g() {
        this.k.a(this.w);
    }
}
