package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* renamed from: lol */
public final class lol {
    public static final xto a = new lor();

    public static int a(int i) {
        return i != 1 ? i != 2 ? (i == 4 || i == 8 || i == 128 || i == 256) ? 2 : 0 : 1 : 3;
    }

    public static boolean a(int i, int i2) {
        return ((SparseArray) a.get()).get(i | i2) != null;
    }

    static lok a(View view, int i, lla lla, int i2, lla lla2) {
        int a = lol.a(i);
        lla lla3 = a != 2 ? lla2 : lla;
        if (a == 2) {
            lla = lla2;
        }
        Context context = view.getContext();
        if (a == 2) {
            i = i2;
        }
        lpf lpf = new lpf(context, i, lla3, lla);
        lla3.a(lpf);
        lla.a(lpf);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new lom(0.0f, new lpn(lla3)));
        arrayList.add(new lom(1.0f, lpf));
        lok lok = new lok(arrayList, new loo(lla3, lpf, lla));
        if (a != 2) {
            lok.a();
        }
        return lok;
    }

    static lok a(View view, lla lla, int i, lla lla2) {
        lla lla3 = i != 1 ? lla2 : lla;
        if (i == 1) {
            lla = lla2;
        }
        lpm lpm = new lpm(view, lla3, lla);
        lla3.a(lpm);
        lla.a(lpm);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new lom(0.0f, new lpn(lla3)));
        arrayList.add(new lom(1.0f, lpm));
        lok lok = new lok(arrayList, new lon(lla3, lpm, lla));
        if (i != 1) {
            lok.a();
        }
        return lok;
    }

    static lok a(int i, lla lla, lla lla2) {
        lla lla3 = i != 4 ? lla2 : lla;
        if (i == 4) {
            lla = lla2;
        }
        lpi lpi = new lpi(lla3, lla);
        lph lph = new lph(lpi, lla);
        lla3.a(lpi);
        lpi.a(lph);
        lla.a(lpi);
        lla.a(lph);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new lom(0.0f, new lpn(lla3)));
        arrayList.add(new lom(0.15f, lpi));
        arrayList.add(new lom(0.35f, lph));
        arrayList.add(new lom(1.0f, new lpg(lla)));
        lok lok = new lok(arrayList, new loq(lla3, lpi, lla, lph));
        if (i != 4) {
            lok.a();
        }
        return lok;
    }

    static lok a(View view, int i, lla lla, lla lla2) {
        lla lla3 = i != 8 ? lla2 : lla;
        if (i == 8) {
            lla = lla2;
        }
        view.getContext();
        lpo lpo = new lpo(lla3, lla);
        lla3.a(lpo);
        lla.a(lpo);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new lom(0.0f, lpo));
        arrayList.add(new lom(1.0f, new lpn(lla)));
        lok lok = new lok(arrayList, new lop(lla3, lpo, lla));
        if (i != 8) {
            lok.a();
        }
        return lok;
    }

    static lok b(int i, lla lla, lla lla2) {
        if (i == 128) {
            lla = lla2;
        }
        lpq lpq = new lpq(lla);
        lla2.a(lpq);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new lom(0.0f, lpq));
        arrayList.add(new lom(1.0f, lla2));
        return new lok(arrayList, new los(lla2, lpq));
    }

    static lok b(View view, int i, lla lla, lla lla2) {
        lla lla3 = i != 256 ? lla2 : lla;
        if (i == 256) {
            lla = lla2;
        }
        lpk lpk = new lpk(lla3, lla, view.getHeight());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lom(0.0f, new lpn(lla3)));
        arrayList.add(new lom(lpk.b(), lpk));
        arrayList.add(new lom(lpk.b() + 0.001f, new lpj(lla3, lla, view.getWidth(), view.getHeight())));
        arrayList.add(new lom(1.0f, new lpn(lla)));
        lok lok = new lok(arrayList, null);
        if (i != 256) {
            lok.a();
        }
        return lok;
    }
}
