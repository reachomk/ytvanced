package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.Map;

/* renamed from: wmi */
public abstract class wmi implements aaap {
    private final wmh a;

    public wmi(wmh wmh) {
        this.a = wmh;
    }

    public abstract String a(apxu apxu);

    public abstract String b(apxu apxu);

    public void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) obj;
        anvu anvu = (unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a & 128) != 0 ? unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.h : null;
        wmh wmh = this.a;
        String a = a(apxu);
        String b2 = b(apxu);
        wmh.g = anvu;
        thd thd = wmh.d;
        String b3 = ((ust) wmh.b.c()).b();
        if (b2 == null) {
            b2 = "ytr";
        }
        tha a2 = thd.a(b3, b2);
        if (!(a == null || a.isEmpty())) {
            a2.b(a);
        }
        a2.a("youtube");
        Intent a3 = wmh.c.a(a2);
        if (anvu != null) {
            acum acum = wmh.f;
            wmo wmo = new wmo();
            wmo.a = anvu;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azlu a4 = wmo.a();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (a4 != null) {
                asmw.c = a4;
                asmw.b = 258;
                acum.a((asmw) ((anxl) asmz.build()));
            } else {
                throw new NullPointerException();
            }
        }
        wmh.a.a(a3, 2000, wmh);
    }
}
