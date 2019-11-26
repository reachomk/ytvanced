package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ssj */
public final class ssj implements swd {
    private final bapu a;
    private final bbmn b;

    public ssj(bapu bapu, bbmn bbmn) {
        this.a = bapu;
        this.b = bbmn;
    }

    public final anwy a() {
        return azts.e;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        bblt a;
        azts azts = (azts) obj;
        if ((azts.a & 2) == 0 || azts.b < 0.0f) {
            a = bblt.a();
        } else {
            swf swf = (swf) this.a.get();
            azsr azsr = azts.c;
            if (azsr == null) {
                azsr = azsr.a;
            }
            a = swf.a(azsr, swg);
            double d = (double) azts.b;
            Double.isNaN(d);
            long j = (long) (d * 1000000.0d);
            if (((float) j) != 0.0f) {
                bbmi b = bbmi.b(Boolean.valueOf(true));
                Object obj2 = TimeUnit.MICROSECONDS;
                Object obj3 = this.b;
                bbow.a(obj2, "unit is null");
                bbow.a(obj3, "scheduler is null");
                Object bbwe = new bbwe(Math.max(j, 0), obj2, obj3);
                bbow.a(bbwe, "other is null");
                return new bbtl(b, bbwe).b(new ssm(a));
            }
        }
        return a;
    }
}
