package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: algt */
public final class algt extends aktw implements algm, alif, allj, almu, almv, aloj {
    public final Map a;
    private final Context b;
    private final PackageManager c;
    private final aaas d;
    private final alha e;
    private final akpk f;
    private final int g;
    private final List h;
    private final xci i;
    private final akkq j;
    private final allh k;
    private final acvx l;
    private final Map m;
    private final boolean n;
    private final int o;
    private boolean p;
    private boolean q;
    private String r;

    public algt(aymk aymk, Context context, aaas aaas, aovk aovk, List list, alha alha, xci xci, akkq akkq, allh allh, acvx acvx, boolean z) {
        this.b = (Context) amqw.a((Object) context);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (alha) amqw.a((Object) alha);
        this.i = (xci) amqw.a((Object) xci);
        this.j = (akkq) amqw.a((Object) akkq);
        this.k = (allh) amqw.a((Object) allh);
        this.l = (acvx) amqw.a((Object) acvx);
        this.n = z;
        this.o = !alha.e() ? 4 : 1;
        this.m = new HashMap();
        this.a = new HashMap();
        this.f = new akpk();
        this.g = context.getResources().getInteger(R.integer.share_panel_third_party_columns);
        this.c = context.getPackageManager();
        Map hashMap = new HashMap();
        for (Object obj : list) {
            xsb.a(hashMap, alpq.a(obj.activityInfo.applicationInfo.packageName, aovk), obj);
        }
        this.h = new ArrayList();
        this.p = true;
        this.q = false;
        for (axih axih : aymk.b) {
            if ((axih.a & 2) != 0) {
                axif axif = axih.c;
                if (axif == null) {
                    axif = axif.h;
                }
                Set set = (Set) hashMap.get(Integer.valueOf(axif.b));
                if (set == null || set.isEmpty()) {
                    this.h.add(axif);
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        axif a = alpv.a(axif, resolveInfo);
                        this.m.put(a, resolveInfo);
                        this.h.add(a);
                        it.remove();
                    }
                }
            }
        }
        for (axhs axhs : aymk.d) {
            if (axhs != null) {
                hashMap.remove(Integer.valueOf(axhs.b));
            }
        }
        for (Set<ResolveInfo> it2 : hashMap.values()) {
            for (ResolveInfo resolveInfo2 : it2) {
                axif axif2;
                axij axij = aymk.c;
                if (axij == null) {
                    axij = axij.c;
                }
                if ((axij.a & 1) == 0) {
                    axif2 = null;
                } else {
                    axij = aymk.c;
                    if (axij == null) {
                        axij = axij.c;
                    }
                    axif2 = axij.b;
                    if (axif2 == null) {
                        axif2 = axif.h;
                    }
                }
                axif2 = alpv.a(axif2, resolveInfo2);
                this.m.put(axif2, resolveInfo2);
                this.h.add(axif2);
            }
        }
        g();
        allh.a((allj) this);
    }

    public final void a(List list) {
    }

    public final void b() {
    }

    public final void b(boolean z) {
    }

    public final void a(allh allh) {
        boolean z = false;
        if (!allh.c() && allh.d.isEmpty()) {
            z = true;
        }
        this.p = z;
        if (this.n) {
            g();
        } else {
            this.f.a();
        }
    }

    public final void a(boolean z) {
        this.q = z;
    }

    public final aknh a() {
        return this.f;
    }

    public final void a(akpb akpb) {
        algs algs = new algs();
        akpb.a(axif.class, new alog(this.b, this, this.j));
        akox aknn = new aknn(this.b, algs, akpb);
        akpb.a(akni.class, aknn);
        akpb.a(alkw.class, aknn);
    }

    public final void a(Configuration configuration) {
        g();
    }

    public final void c() {
        this.k.b((allj) this);
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void a(axif axif) {
        this.i.d(new alhj());
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        hashMap.put("endpoint_resolver_override", this.d);
        hashMap.put("interaction_logger_override", this.l);
        hashMap.put("click_tracking_params", axif.g.d());
        aaas aaas = this.d;
        String str = this.r;
        boolean z = this.q;
        anxl anxl = axif.e;
        if (anxl == null) {
            anxl = apxu.d;
        }
        apxx apxx = (apxx) ((anxo) anxl.toBuilder());
        if (apxx.a(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
            axfk axfk = (axfk) ((anxo) ((SendShareEndpoint$SendShareExternallyEndpoint) apxx.b(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder());
            SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) axfk.instance;
            if ((sendShareEndpoint$SendShareExternallyEndpoint.a & 1) != 0) {
                anxl anxl2 = sendShareEndpoint$SendShareExternallyEndpoint.b;
                if (anxl2 == null) {
                    anxl2 = asfa.f;
                }
                asfd asfd = (asfd) ((anxo) anxl2.toBuilder());
                asfd.a(xvd.f(str));
                axfk.copyOnWrite();
                SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) axfk.instance;
                sendShareEndpoint$SendShareExternallyEndpoint2.b = (asfa) ((anxl) asfd.build());
                sendShareEndpoint$SendShareExternallyEndpoint2.a |= 1;
            }
            if ((((SendShareEndpoint$SendShareExternallyEndpoint) axfk.instance).a & 2) != 0) {
                aset aset = (aset) ((anxo) axfk.a().toBuilder());
                aset.copyOnWrite();
                aseq aseq = (aseq) aset.instance;
                aseq.a |= 2;
                aseq.c = z;
                axfk.a(aset);
            }
            apxx.a(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) ((anxl) axfk.build()));
        }
        aaas.a((apxu) ((anxl) apxx.build()), hashMap);
        this.e.b(true);
    }

    public final boolean d() {
        return this.p;
    }

    public final boolean a(axif axif, aloh aloh) {
        zz zzVar = (zz) this.a.get(axif);
        if (zzVar != null) {
            aloh.a(axif, (CharSequence) zzVar.a, (Drawable) zzVar.b);
            return true;
        }
        ResolveInfo resolveInfo = (ResolveInfo) this.m.get(axif);
        if (resolveInfo == null) {
            return false;
        }
        new algu(this, axif, this.c, resolveInfo, aloh).execute(new Void[0]);
        return true;
    }

    public final void b(axif axif) {
        this.l.a(axif.g.d(), null);
    }

    public final void e() {
        this.e.b(false);
    }

    public final void f() {
        this.e.b(false);
        this.e.d();
        this.i.d(new alhc());
    }

    private final void g() {
        if (!this.n || this.p) {
            for (axif axif : this.h) {
                this.l.a(axif.g.d());
            }
            algv algv = new algv(this.h, this.g);
            this.f.clear();
            boolean e = this.e.e() ^ 1;
            for (int i = 0; i < algv.size(); i++) {
                List list = (List) algv.get(i);
                if (i < this.o) {
                    this.f.add(new alkw(this.g, list));
                } else {
                    akpk akpk = this.f;
                    aknl a = akni.a();
                    a.a = this.g;
                    a.b = list;
                    akpk.add(a.a());
                    e = false;
                }
            }
            this.e.d(e);
            return;
        }
        this.f.clear();
    }
}
