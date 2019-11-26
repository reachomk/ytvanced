package defpackage;

import android.os.Bundle;

/* renamed from: wxu */
public final class wxu {
    private final wxw a;
    private final wxz b;

    public wxu(wxw wxw, wxz wxz) {
        this.a = wxw;
        this.b = wxz;
    }

    public final int a(String str, Bundle bundle) {
        int a;
        xvd.a(str);
        String e = wxz.e(str);
        wxx a2 = this.a.a(e);
        if (a2 != null) {
            a = a2.a(bundle);
        } else {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Unknown task tag ");
            stringBuilder.append(str);
            stringBuilder.append("; aborting...");
            xtl.d(stringBuilder.toString());
            a = 1;
        }
        if (a != 2 && this.b.a(e)) {
            this.b.b(e, str);
        }
        return a;
    }
}
