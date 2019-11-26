package defpackage;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbdx */
final class bbdx implements Runnable {
    private final /* synthetic */ bavg a;
    private final /* synthetic */ bbdv b;

    bbdx(bbdv bbdv, bavg bavg) {
        this.b = bbdv;
        this.a = bavg;
    }

    public final void run() {
        Map map;
        bavg bavg = this.a;
        List list = bavg.a;
        barq barq = bavg.b;
        this.b.c.C.a(1, "Resolved address: {0}, config={1}", list, barq);
        Boolean bool = this.b.c.E;
        if (bool == null || !bool.booleanValue()) {
            this.b.c.C.a(2, "Address resolved: {0}", list);
            this.b.c.E = Boolean.valueOf(true);
        }
        this.b.c.P = null;
        Map map2 = (Map) barq.a(bbbv.a);
        bbde bbde = this.b.c;
        if (bbde.H) {
            Map map3;
            if (map2 == null) {
                map3 = bbde.G;
                if (map3 != null) {
                    bbde.C.a(2, "Received no service config, using default service config");
                }
            } else {
                map3 = map2;
            }
            bbde = this.b.c;
            if (map3 != bbde.F) {
                basa basa = bbde.C;
                Object[] objArr = new Object[1];
                objArr[0] = map3 != null ? "" : " to null";
                basa.a(2, "Service config changed{0}", objArr);
                this.b.c.F = map3;
            }
            try {
                this.b.c.j();
            } catch (RuntimeException e) {
                Throwable th = e;
                Logger logger = bbde.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.b.c.d);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 51);
                stringBuilder.append("[");
                stringBuilder.append(valueOf);
                stringBuilder.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", stringBuilder.toString(), th);
            }
            map = map3;
        } else {
            if (map2 != null) {
                bbde.C.a(2, "Service config from name resolver discarded by channel settings");
            }
            map = this.b.c.G;
        }
        bbdv bbdv = this.b;
        if (bbdv.a == bbdv.c.p) {
            if (!list.isEmpty() || this.b.a.a.b()) {
                if (map != map2) {
                    barp b = barq.b();
                    b.a(bbbv.a, map);
                    barq = b.a();
                }
                batv batv = this.b.a.a;
                baub a = bauc.a();
                a.a = list;
                a.b = barq;
                batv.a(a.a());
                return;
            }
            bbdv bbdv2 = this.b;
            bavx bavx = bavx.j;
            String valueOf2 = String.valueOf(this.b.b);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 37);
            stringBuilder2.append("Name resolver ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(" returned an empty list");
            bbdv2.b(bavx.a(stringBuilder2.toString()));
        }
    }
}
