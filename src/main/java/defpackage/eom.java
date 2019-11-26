package defpackage;

import android.os.Handler;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaPositionType;
import java.util.List;

/* renamed from: eom */
public final class eom implements eop {
    private final /* synthetic */ bapu a;
    private final /* synthetic */ bapu b;
    private final /* synthetic */ Handler c;
    private final /* synthetic */ bcaa d;

    public eom(bapu bapu, bapu bapu2, Handler handler, bcaa bcaa) {
        this.a = bapu;
        this.b = bapu2;
        this.c = handler;
        this.d = bcaa;
    }

    public final clz a(cmg cmg, azxb azxb, bdho bdho, List list) {
        bdhp bdhp;
        azsr azsr;
        YogaFlexDirection yogaFlexDirection;
        azsr azsr2 = null;
        if (bdho != null) {
            Object extension;
            aobz aobz = bdhp.a;
            synchronized (bdho) {
                extension = bdho.getExtension(aobz);
            }
            bdhp = (bdhp) extension;
        } else {
            bdhp = null;
        }
        int i = bdhp != null ? bdhp.k : 0;
        if ((azxb.a & 2) != 0) {
            azsr = azxb.c;
            if (azsr == null) {
                azsr = azsr.a;
            }
        } else {
            azsr = null;
        }
        if ((azxb.a & 1) != 0) {
            azsr2 = azxb.b;
            if (azsr2 == null) {
                azsr2 = azsr.a;
            }
        }
        eoj a = eoh.a(cmg);
        a.a(this.a);
        a.b(this.b);
        a.a(this.c);
        eou a2 = eov.a(cmg);
        a2.a(this.d);
        a.a((eov) ((eou) ((eou) ((eou) a2.a(YogaPositionType.ABSOLUTE)).e(100.0f)).k(100.0f)).c());
        if (i == 1) {
            yogaFlexDirection = YogaFlexDirection.ROW;
        } else if (i == 2) {
            yogaFlexDirection = YogaFlexDirection.ROW_REVERSE;
        } else if (i != 4) {
            yogaFlexDirection = YogaFlexDirection.COLUMN;
        } else {
            yogaFlexDirection = YogaFlexDirection.COLUMN_REVERSE;
        }
        a.a(yogaFlexDirection);
        a.a(list);
        a.a(azsr);
        a.b(azsr2);
        return a;
    }
}
