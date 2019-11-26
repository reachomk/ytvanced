package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import java.util.Collections;

/* renamed from: ypf */
public final class ypf extends yig {
    public final String f;
    public final yxm g;
    public final LayoutInflater h;
    public final String i;
    public final String j;
    public final String k;
    public final yty l;
    public final ynv m;
    public final ywk n;
    public final ypg o;
    public final ysa p;
    public yoz q;
    public ykk r;
    public yml s;
    public bbnc t;
    public CharSequence u;
    private final String v;
    private final yio w;

    ypf(Context context, Handler handler, ywk ywk, ypg ypg, yil yil, yio yio, String str, String str2, String str3, yxm yxm, LayoutInflater layoutInflater, String str4, String str5, yty yty, ynv ynv, ysa ysa) {
        super(context, handler, ywk.i, ywk, yil);
        this.v = xvd.a(str);
        this.j = xvd.a(str2);
        this.f = xvd.a(str3);
        this.g = (yxm) amqw.a((Object) yxm);
        yxm.a(new ypi(this));
        this.w = (yio) amqw.a((Object) yio);
        this.h = (LayoutInflater) amqw.a((Object) layoutInflater);
        this.i = xvd.a(str4);
        this.k = xvd.a(str5);
        this.l = (yty) amqw.a((Object) yty);
        this.m = (ynv) amqw.a((Object) ynv);
        this.n = (ywk) amqw.a((Object) ywk);
        this.o = (ypg) amqw.a((Object) ypg);
        this.p = (ysa) amqw.a((Object) ysa);
    }

    public final void bk_() {
        super.bk_();
        yoz yoz = this.q;
        if (yoz != null) {
            yoz.bk_();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.v, null, new yph(this), null);
    }

    public final void bl_() {
        super.bl_();
        bbnc bbnc = this.t;
        if (bbnc != null) {
            if (!bbnc.c()) {
                this.t.bK_();
            }
            this.t = null;
        }
        this.w.a();
        yoz yoz = this.q;
        if (yoz != null) {
            yoz.bl_();
        }
    }

    public final void f() {
        amuo amuo = new amuo();
        amuo.b(this.r.getMessageKeys());
        amuo.c(yic.a("ChatTypingStatus", this.f));
        this.w.a(amuo.a(), new ypk(this), this.c);
    }

    public final void g() {
        if (bj_()) {
            ykk ykk = this.r;
            if (ykk != null) {
                axqf paginationToken = ykk.getPaginationToken();
                if (paginationToken != null && (paginationToken.a & 1) != 0 && !TextUtils.isEmpty(paginationToken.b)) {
                    ywk ywk = this.n;
                    ykk ykk2 = this.r;
                    String str = "technodrome_metadata";
                    yml yml = (yml) ywk.b.c(ykk2.a).a(str, yml.d.getParserForType());
                    if (!ykk.a(yml)) {
                        CharSequence charSequence;
                        if (ykk2.getPaginationToken() == null || (ykk2.getPaginationToken().a & 1) == 0) {
                            charSequence = null;
                        } else {
                            charSequence = ykk2.getPaginationToken().b;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            ymo ymo;
                            if (yml != null) {
                                ymo = (ymo) ((anxo) yml.toBuilder());
                            } else {
                                ymo = (ymo) yml.d.createBuilder();
                            }
                            aaea b = ywk.b.b();
                            String str2 = ykk2.a;
                            ymo.b(false);
                            ymo.a(true);
                            b.a(str2, aadu.a(str, (anxl) ymo.build())).a();
                            ywk.a(null, Collections.singleton(charSequence), new ywm(ywk, ykk2, ymo), new ywl(ywk, ykk2, ymo));
                        }
                    }
                }
            }
        }
    }
}
