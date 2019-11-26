package defpackage;

import android.text.Spanned;

/* renamed from: acng */
final /* synthetic */ class acng implements acao {
    private final acnc a;

    acng(acnc acnc) {
        this.a = acnc;
    }

    public final void a(acaz acaz) {
        acnc acnc = this.a;
        if (acaz != null && acnc.bb) {
            acar acar = (acar) acaz;
            Spanned spanned = acar.b;
            String obj = spanned != null ? spanned.toString() : null;
            String valueOf = String.valueOf(obj);
            String str = "onHealthStatusChanged: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            int i = acar.a;
            if (i != 2) {
                if (i != 3) {
                    if (!(i == 4 || i == 6)) {
                        acnc.a(acel.GOOD, obj);
                    }
                } else if (acnc.aa.d()) {
                    acnc.a(acel.BAD, obj);
                    return;
                } else {
                    acnc.a(acel.GOOD, obj);
                    return;
                }
            }
            acnc.a(acel.BAD, obj);
        }
    }
}
