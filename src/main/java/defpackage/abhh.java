package defpackage;

import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: abhh */
public final class abhh implements aaap {
    private final abhl a;
    private final bcaa b;
    private final Executor c;

    public abhh(abhl abhl, bcaa bcaa, Executor executor) {
        this.a = (abhl) amqw.a((Object) abhl);
        this.b = bcaa;
        this.c = executor;
    }

    public final void a(apxu apxu, Map map) {
        Object c;
        Object obj = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        afsw afsw = (afsw) xsb.a(map, obj, afsw.class);
        if (afsw == null) {
            bcaa bcaa = this.b;
            if (bcaa != null) {
                abhn abhn = (abhn) bcaa.get();
                c = xsb.c(map, obj);
                if (abhn != null) {
                    abhn.b(c);
                    afsw = abhn;
                }
            }
        }
        if (afsw != null) {
            abhl abhl = this.a;
            abhi abhi = new abhi(abhl.c, abhl.d.c());
            anxr access$000 = anxl.checkIsLite(GetReportFormEndpointOuterClass$GetReportFormEndpoint.getReportFormEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                c = access$000.b;
            } else {
                c = access$000.a(b);
            }
            abhi.a = aali.b(((GetReportFormEndpointOuterClass$GetReportFormEndpoint) c).b);
            abhi.a(aabc.a(apxu));
            anjv a = this.a.a.a(abhi);
            Executor executor = this.c;
            abhg abhg = new abhg(afsw);
            afsw.getClass();
            xan.a(a, executor, abhg, new abhj(afsw), ankh.a);
        }
    }
}
