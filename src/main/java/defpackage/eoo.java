package defpackage;

import android.os.Handler;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaPositionType;
import java.util.List;

/* renamed from: eoo */
public final class eoo implements eor {
    private final /* synthetic */ bapu a;
    private final /* synthetic */ bapu b;
    private final /* synthetic */ Handler c;
    private final /* synthetic */ bcaa d;

    public eoo(bapu bapu, bapu bapu2, Handler handler, bcaa bcaa) {
        this.a = bapu;
        this.b = bapu2;
        this.c = handler;
        this.d = bcaa;
    }

    public final clz a(cmg cmg, azxb azxb, bapc bapc, List list) {
        azsr azsr;
        YogaFlexDirection yogaFlexDirection;
        int i = 0;
        for (int i2 = 0; i2 < bapc.a(); i2++) {
            baoz g = bapc.g(i2);
            if (g.a() == 168772996) {
                i = bapg.a(g.c()).a();
                break;
            }
        }
        azsr azsr2 = null;
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
