package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ywk */
public final class ywk implements yjd {
    public final Context a;
    public final aadw b;
    public final ywf c;
    public final aaas d;
    public final Map e = new HashMap();
    public final yue f;
    public final yvo g;
    public final yuh h;
    public final yir i;
    public final yip j;
    public final zzl k;
    public final yvb l;
    public final yvg m;
    public String n;
    public Object o;
    private final aauh p;

    public ywk(Context context, aadw aadw, aauh aauh, ywf ywf, aaas aaas, yue yue, yvo yvo, yuh yuh, yir yir, yip yip, zzl zzl, yvb yvb, yvg yvg) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aadw) amqw.a((Object) aadw);
        this.p = (aauh) amqw.a((Object) aauh);
        this.c = (ywf) amqw.a((Object) ywf);
        this.d = (aaas) amqw.a((Object) aaas);
        this.f = yue;
        this.g = yvo;
        this.h = yuh;
        this.i = yir;
        this.j = yip;
        this.k = zzl;
        this.l = yvb;
        this.m = yvg;
    }

    public final void a(Collection collection, xsd xsd) {
        a(collection, null, ywj.a, xsd);
    }

    public final void a(String str) {
        this.g.a(str, yvn.a, amuw.a(aqkt.CONTACT_STATUS_UNCONNECTED), 2);
    }

    public final void b(String str) {
        this.g.a(str, yvr.a, amuw.a(aqkt.CONTACT_STATUS_INVITE_SENT), 2);
    }

    public final void a(Collection collection, Collection collection2, Runnable runnable, xsd xsd) {
        if (collection == null) {
            collection = Collections.emptySet();
        }
        if (collection2 == null) {
            collection2 = Collections.emptySet();
        }
        if (!TextUtils.isEmpty(this.n)) {
            amuv i = amuw.i();
            i.b(collection2);
            i.c(this.n);
            collection2 = i.a();
        }
        aauh aauh = this.p;
        afsw a = afsy.a(new ywq(runnable), new ywp(this, xsd));
        aauh.a(atie.d, aauh.a, aaug.a, aauj.a).a(new aaui(aauh.c, aauh.d.c(), collection, collection2), a);
    }
}
