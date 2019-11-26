package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: drs */
public final class drs extends uqt implements xcp {
    public drs(uys uys, xci xci, afpu afpu) {
        super(uys, xci, afpu);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Activity activity, apxu apxu) {
        nt f = ((nn) activity).f();
        String str = "new-fusion-sign-in-flow-fragment";
        dru dru = (dru) f.a(str);
        or a = f.a();
        if (dru != null) {
            dru.a(apxu);
            if (!dru.v()) {
                a.c(dru);
            }
        } else {
            Bundle bundle = new Bundle();
            if (apxu != null) {
                bundle.putByteArray("endpoint", apxu.toByteArray());
            }
            nf dru2 = new dru();
            dru2.f(bundle);
            a.a(dru2, str);
        }
        a.b();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != drs.class) {
            return uqo.a(this, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{uyx.class, uyw.class, afqf.class};
        } else if (i == 0) {
            a((uyx) obj);
        } else if (i == 1) {
            a((uyw) obj);
        } else if (i == 2) {
            a();
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
