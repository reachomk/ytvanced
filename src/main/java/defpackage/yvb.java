package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: yvb */
public final class yvb {
    public final aarh a;
    public final aadw b;
    public final Executor c;

    public yvb(aarh aarh, aadw aadw, Executor executor) {
        this.a = aarh;
        this.b = aadw;
        this.c = executor;
    }

    public final void a(String str) {
        a(str, null);
    }

    public final void a(String str, List list) {
        anxo anxo;
        String str2 = "technodrome_metadata";
        ymh ymh = (ymh) this.b.c(str).a(str2, ymh.d.getParserForType());
        if (ymh != null) {
            anxo = (ymk) ((anxo) ymh.toBuilder());
            anxo.copyOnWrite();
            ((ymh) anxo.instance).c = anxl.emptyProtobufList();
        } else {
            anxo = (ymk) ymh.d.createBuilder();
        }
        if (list != null) {
            for (ymr ymr : list) {
                int i = ymr.a;
                if (!((i & 2) == 0 || (i & 16) == 0 || (i & 32) == 0)) {
                    ymu ymu = (ymu) ((anxo) ymr.toBuilder());
                    anxo.copyOnWrite();
                    ymh ymh2 = (ymh) anxo.instance;
                    if (!ymh2.c.a()) {
                        ymh2.c = anxl.mutableCopy(ymh2.c);
                    }
                    ymh2.c.add((ymr) ((anxl) ymu.build()));
                }
            }
        }
        this.b.b().a(str, aadu.a(str2, (anxl) anxo.build())).a();
    }
}
