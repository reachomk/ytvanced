package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.io.IOException;

/* renamed from: wrn */
public final class wrn implements swd {
    public final wsa a;
    private final bapu b;

    public wrn(wsa wsa, bapu bapu) {
        this.a = wsa;
        this.b = bapu;
    }

    public final anwy a() {
        return axln.e;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        axln axln = (axln) obj;
        arbk arbk = axln.c;
        if (arbk == null) {
            arbk = arbk.d;
        }
        int i = arbk.a & 1;
        if ((axln.a & 1) == 0 && i == 0) {
            return bblt.a();
        }
        anvf anvf;
        arbr arbr = (arbr) arbs.g.createBuilder();
        if (i != 0) {
            arbk arbk2 = axln.c;
            if (arbk2 == null) {
                arbk2 = arbk.d;
            }
            anvf = arbk2.b;
            if (anvf == null) {
                anvf = azuj.c;
            }
        } else {
            anvf = axln.b;
            if (anvf == null) {
                anvf = azuj.c;
            }
        }
        byte[] toByteArray = anvf.toByteArray();
        try {
            byte[] bArr = new byte[(toByteArray.length + 8)];
            anwm a = anwm.a(bArr);
            a.a(172660663, toByteArray);
            a.i();
            arbr.mergeFrom(bArr, 0, bArr.length - a.a(), anxa.c());
            arbs arbs = (arbs) ((anxl) arbr.build());
            this.a.e = this.b;
            Pair pair = new Pair("ElementPresenterMatchParentHeight", Boolean.valueOf(true));
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return bblt.a(new wrm(this, arbs, pair)).b(bbmt.a());
            }
            this.a.a(arbs, pair);
            return bblt.a();
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to compose Element extension", e);
        }
    }
}
