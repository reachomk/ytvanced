package defpackage;

import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;

/* renamed from: iql */
public final class iql {
    public final bqa a;
    public byte[] b;
    public String c;
    public final aamj d;
    private final abhw e;
    private final zzl f;

    public iql(bqa bqa, abhw abhw, zzl zzl, aamj aamj) {
        this.a = (bqa) amqw.a((Object) bqa);
        this.e = (abhw) amqw.a((Object) abhw);
        this.f = zzl;
        this.d = aamj;
    }

    public final apxu a(apxu apxu) {
        if (!iql.b(apxu)) {
            return apxu;
        }
        Object obj;
        anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        this.c = ((axcv) obj).b;
        access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        axcw axcw = ((axcv) obj).f;
        if (axcw == null) {
            axcw = axcw.c;
        }
        this.b = (axcw.a == 163011016 ? (axdc) axcw.b : axdc.c).b.d();
        if (!foh.j(this.f)) {
            asic a;
            String c = c(apxu);
            byte[] bArr = this.b;
            try {
                a = abmj.a(bArr);
            } catch (anyg e) {
                String valueOf = String.valueOf(e.getLocalizedMessage());
                String str = "Failed to parse inlined prefetch data: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.d(valueOf);
                a = null;
            }
            bpz a2 = abmj.a(bArr, a);
            if (a2 != null) {
                this.a.a(c, a2);
            }
        }
        access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b2);
        }
        axcx axcx = (axcx) ((anxo) ((axcv) obj).toBuilder());
        axcx.copyOnWrite();
        axcv axcv = (axcv) axcx.instance;
        axcv.f = null;
        axcv.a &= -17;
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a(SearchEndpointOuterClass.searchEndpoint, (axcv) ((anxl) axcx.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static boolean b(apxu apxu) {
        axdc axdc;
        anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axcw axcw = ((axcv) b).f;
        if (axcw == null) {
            axcw = axcw.c;
        }
        if (axcw.a == 163011016) {
            axdc = (axdc) axcw.b;
        } else {
            axdc = axdc.c;
        }
        return (axdc.a & 1) != 0;
    }

    public final void a() {
        this.c = null;
        this.b = null;
    }

    public final String c(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        return ise.g().a(((axcv) obj).b).a(this.e).a(apxu).a(atgl.b).a(true).a().h().a();
    }
}
