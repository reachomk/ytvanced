package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: hnu */
public final class hnu extends hnn {
    private final Context a;

    public hnu(Context context) {
        super(agqk.class, aqey.class);
        this.a = context;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqk agqk = (agqk) obj;
        agqi agqi = agqk.a;
        etq etq = new etq();
        etq.a(agqi.b);
        etq.a = ajqy.a(hsv.a(this.a, agqk.a));
        etr etr = new etr();
        etr.a = agqi.d.d();
        awkq awkq = (awkq) awkr.c.createBuilder();
        aygk aygk = etr.a;
        awkq.copyOnWrite();
        awkr awkr = (awkr) awkq.instance;
        if (aygk != null) {
            awkr.b = aygk;
            awkr.a |= 1;
            awkr awkr2 = (awkr) ((anxl) awkq.build());
            aqez aqez = (aqez) aqfa.f.createBuilder();
            aqez.copyOnWrite();
            aqfa aqfa = (aqfa) aqez.instance;
            if (awkr2 != null) {
                aqfa.c = awkr2;
                aqfa.a |= 2;
                etq.b = (aqfa) ((anxl) aqez.build());
                etq.b(agqi.a);
                etq.a(agqk.e);
                String str = agqi.a;
                apgd apgd = (apgd) apge.j.createBuilder();
                String str2 = "VL";
                str = String.valueOf(str);
                apgd.a(str.length() == 0 ? new String(str2) : str2.concat(str));
                apge apge = (apge) ((anxl) apgd.build());
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
                etq.c = (apxu) ((anxl) apxx.build());
                return etq.a();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
