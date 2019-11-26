package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: aiiq */
public final class aiiq extends xaq implements ajan, xcp {
    public final ajam d;
    public final bdfu e = new bdfu();
    private final apxu f;
    private final aijq g;
    private aafl h;
    private boolean i;
    private boolean j;

    public aiiq(xci xci, apxu apxu, aijq aijq, ajam ajam) {
        amqw.a((Object) xci);
        this.f = (apxu) amqw.a((Object) apxu);
        this.g = aijq;
        this.d = ajam;
    }

    public final long e() {
        return 16777216;
    }

    public final void c() {
        this.e.a();
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.p().a(ajcg.b(ajam.O(), 16777216)).a(ajcg.a()).a(new aiip(this), aiis.a), ajam.t().a(ajcg.b(ajam.O(), 16777216)).a(ajcg.a()).a(new aiir(this), aiiu.a)};
    }

    public final void a(ahkc ahkc) {
        this.i = ahkc.c;
        this.j = ahkc.d;
        d();
    }

    public final void a(ahkf ahkf) {
        if (airg.a(ahkf.e, 5)) {
            aafv aafv = ahkf.c;
            this.h = aafv != null ? aafv.i : null;
            d();
        }
    }

    private final void d() {
        aafl aafl = this.h;
        if (aafl == null) {
            this.c = false;
            return;
        }
        aafc a = aafl.a(this.i, this.j, false);
        if (a == null) {
            this.c = false;
        } else if (aiiq.a(a.a(), this.f) || (aiiq.a(a.d(), this.f) && this.g.a.getBoolean(ahhv.AUTONAV, true))) {
            this.c = true;
            b();
        } else {
            this.c = false;
        }
    }

    private static boolean a(apxu apxu, apxu apxu2) {
        if (!(apxu == null || apxu2 == null)) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            String str = ((azje) obj).b;
            anxr access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu2.a(access$0002);
            Object b2 = apxu2.h.b(access$0002.d);
            if (b2 == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b2);
            }
            String str2 = ((azje) b).b;
            if (apxu.b.equals(apxu2.b)) {
                anxr access$0003 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$0003);
                if (apxu.h.a(access$0003.d) && str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkc.class, ahkf.class};
        } else if (i == 0) {
            a((ahkc) obj);
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
