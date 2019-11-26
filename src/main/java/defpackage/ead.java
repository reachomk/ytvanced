package defpackage;

import android.content.Intent;

/* renamed from: ead */
final /* synthetic */ class ead implements wxe {
    private final eae a;
    private final apxu b;

    ead(eae eae, apxu apxu) {
        this.a = eae;
        this.b = apxu;
    }

    public final boolean a(int i, int i2, Intent intent) {
        eae eae = this.a;
        apxu apxu = this.b;
        boolean z = false;
        if (i == 901 && i2 == -1) {
            Intent a = amjn.a(eae.a, intent);
            if (a == null) {
                z = true;
            } else {
                a.putExtra("navigation_endpoint", apxu.toByteArray());
                eae.a.startActivityForResult(a, 902);
                return true;
            }
        }
        return z;
    }
}
