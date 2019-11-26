package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qsr */
public final class qsr extends qsu {
    public pcy a;

    public qsr(Context context) {
        super(context, "");
    }

    /* Access modifiers changed, original: protected|final */
    public final qpa b(Context context) {
        return null;
    }

    public static String a(String str, String str2) {
        byte[] a = qrk.a(str, str2);
        if (a != null) {
            return qri.a(a, true);
        }
        return Integer.toString(7);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(qui qui, Context context, qpa qpa, qoh qoh) {
        if (qui.m) {
            pcy pcy = this.a;
            if (pcy != null) {
                String str = pcy.a;
                if (!TextUtils.isEmpty(str)) {
                    qpa.Q = qyb.a(str);
                    qpa.R = Integer.valueOf(5);
                    qpa.S = Boolean.valueOf(this.a.b);
                }
                this.a = null;
            }
            return;
        }
        qsu.a(b(qui, context, qpa, qoh));
    }

    /* Access modifiers changed, original: protected|final */
    public final List b(qui qui, Context context, qpa qpa, qoh qoh) {
        ArrayList arrayList = new ArrayList();
        if (qui.b == null) {
            return arrayList;
        }
        qui qui2 = qui;
        arrayList.add(new rcd(qui2, "l9ngAoug++lwJa6/HPwzMXGSwMruOOnY/2d16zLXikST+QC8N56qn9rVBD9+3HYT", "J6ni0I45qHkdjFv0IWyYulPFtOX9+fEerwGdTgmifnQ=", qpa, qui.b()));
        return arrayList;
    }

    static {
        qsr.class.getSimpleName();
    }
}
