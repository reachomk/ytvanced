package defpackage;

import android.os.Handler;
import com.facebook.yoga.YogaFlexDirection;
import java.util.BitSet;
import java.util.List;

/* renamed from: eoj */
public final class eoj extends clz {
    private eoh a;
    private final String[] d = new String[]{"children", "flexDirection", "playerTrackerComponent", "uiHandler"};
    private final BitSet e = new BitSet(4);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final eoj a(List list) {
        this.a.a = list;
        this.e.set(0);
        return this;
    }

    public final eoj a(bapu bapu) {
        this.a.b = bapu;
        return this;
    }

    public final eoj a(YogaFlexDirection yogaFlexDirection) {
        this.a.c = yogaFlexDirection;
        this.e.set(1);
        return this;
    }

    public final eoj a(azsr azsr) {
        this.a.d = azsr;
        return this;
    }

    public final eoj b(azsr azsr) {
        this.a.e = azsr;
        return this;
    }

    public final eoj a(cma cma) {
        this.a.f = cma != null ? cma.g() : null;
        this.e.set(2);
        return this;
    }

    public final eoj b(bapu bapu) {
        this.a.g = bapu;
        return this;
    }

    public final eoj a(Handler handler) {
        this.a.u = handler;
        this.e.set(3);
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.e, this.d);
        eoh eoh = this.a;
        super.e();
        this.a = null;
        return eoh;
    }

    static /* synthetic */ void a(eoj eoj, cmg cmg, eoh eoh) {
        super.a(cmg, (cma) eoh);
        eoj.a = eoh;
        eoj.e.clear();
    }
}
