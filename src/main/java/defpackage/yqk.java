package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.EditConversationEndpointOuterClass$EditConversationEndpoint;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yqk */
public final class yqk extends yig implements yyj {
    public final Handler a;
    public final yps f;
    public final ynp g;
    public final xsd h;
    public final yty i;
    public final ywk j;
    public aqpp k;
    public final ynv l;
    public boolean m;
    private final String n;
    private final yyg o;
    private final acvx p;

    public yqk(Context context, Handler handler, yil yil, ywk ywk, ynp ynp, acvx acvx, String str, yps yps, xsd xsd, yty yty, aqpp aqpp, ynv ynv) {
        super(context, handler, ywk.i, ywk, yil);
        this.a = (Handler) amqw.a((Object) handler);
        this.n = xvd.a(str);
        this.f = (yps) amqw.a((Object) yps);
        this.o = (yyg) amqw.a(yps.a((yyj) this));
        this.g = (ynp) amqw.a((Object) ynp);
        this.p = (acvx) amqw.a((Object) acvx);
        this.h = (xsd) amqw.a((Object) xsd);
        this.i = (yty) amqw.a((Object) yty);
        this.l = (ynv) amqw.a((Object) ynv);
        this.j = (ywk) amqw.a((Object) ywk);
        this.k = aqpp;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return true;
    }

    public final void bk_() {
        a(null);
        super.bk_();
        ywk ywk = this.j;
        String str = this.n;
        aadq a = ywk.b.a(str);
        if (a instanceof yko) {
            aycb aycb;
            yko yko = (yko) a;
            ywk.n = yko.getForegroundChatToken();
            aadq a2 = ywk.b.a(yko.getBodyKey());
            if (a2 instanceof ykd) {
                String onViewToken = ((ykd) a2).getOnViewToken();
                if (!TextUtils.isEmpty(onViewToken)) {
                    apxx apxx = (apxx) apxu.d.createBuilder();
                    arat arat = (arat) EditConversationEndpointOuterClass$EditConversationEndpoint.e.createBuilder();
                    arat.a(onViewToken);
                    apxx.a(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint, (EditConversationEndpointOuterClass$EditConversationEndpoint) ((anxl) arat.build()));
                    ywk.d.a((apxu) ((anxl) apxx.build()), null);
                }
            }
            arvt b = ywk.k.b();
            if (b == null) {
                aycb = null;
            } else {
                awus awus = b.t;
                if (awus == null) {
                    awus = awus.e;
                }
                aycb = awus.c;
                if (aycb == null) {
                    aycb = aycb.d;
                }
            }
            aycd aycd = aycb.c;
            if (aycd == null) {
                aycd = aycd.d;
            }
            yis yis = new yis(TimeUnit.MILLISECONDS.toSeconds(aycb.b), TimeUnit.MILLISECONDS.toSeconds(aycd.b), TimeUnit.MILLISECONDS.toSeconds(aycd.c));
            if (yis != null) {
                yip yip = ywk.j;
                Collection singleton = Collections.singleton(str);
                Object obj = new Object();
                Map a3 = yip.a();
                Set set = (Set) a3.get(ywk);
                if (set == null) {
                    synchronized (yip.b) {
                        if (!a3.containsKey(ywk)) {
                            set = new HashSet();
                            a3.put(ywk, set);
                        }
                    }
                }
                set.isEmpty();
                yip.b.put(obj, zz.a(ywk, amuw.a(singleton)));
                yip.a.a("entity_polling_manager__fetch_entity", (long) ((int) yis.a), 0, true, 1, false, null, new wxy(0, (int) yis.b, (int) yis.c), false);
                ywk.o = obj;
            }
            yvg yvg = ywk.m;
            str = yko.getBodyKey();
            xvd.a(str);
            yvg.c(str);
            ykd ykd = (ykd) yvg.a.a(str);
            if (ykd != null) {
                atun invalidationId = ykd.getInvalidationId();
                if (invalidationId != null) {
                    yvi yvi = new yvi(yvg, str);
                    yvg.e.put(str, zz.a(invalidationId, yvi));
                    yvg.b.a(invalidationId, yvi);
                }
            }
        }
        this.p.a(acwl.ao, null, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.n, new yqj(this), new yqm(this));
    }

    public final void bl_() {
        super.bl_();
        ywk ywk = this.j;
        String str = this.n;
        ywk.n = null;
        Object obj = ywk.o;
        if (obj != null) {
            yip yip = ywk.j;
            yip.b.remove(obj);
            if (yip.b.isEmpty()) {
                synchronized (yip.b) {
                    if (yip.b.isEmpty()) {
                        yip.a.a("entity_polling_manager__fetch_entity");
                    }
                }
            }
            ywk.o = null;
        }
        aadq a = ywk.b.a(str);
        if (a instanceof yko) {
            yvg yvg = ywk.m;
            str = ((yko) a).getBodyKey();
            xvd.a(str);
            yvg.c(str);
        }
        this.p.a();
    }

    public final void f() {
        d();
    }

    public final void a(CharSequence charSequence) {
        yyg yyg = this.o;
        boolean z = false;
        boolean z2 = !this.m && TextUtils.isEmpty(charSequence);
        yyg.a(z2);
        this.o.a(charSequence);
        yyg = this.o;
        if (this.m && TextUtils.isEmpty(charSequence)) {
            z = true;
        }
        yyg.b(z);
        this.o.a();
    }
}
