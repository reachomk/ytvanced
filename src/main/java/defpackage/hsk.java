package defpackage;

import com.google.android.youtube.R;

/* renamed from: hsk */
final /* synthetic */ class hsk implements akoq {
    private final hsf a;

    hsk(hsf hsf) {
        this.a = hsf;
    }

    public final void a(akor akor, aknh aknh, int i) {
        hsf hsf = this.a;
        String str = "setBackgroundColor";
        if (hsf.g()) {
            akor.a(str, Integer.valueOf(xwe.a(hsf.a, R.attr.ytGeneralBackgroundA, 0)));
        } else {
            akor.a(str, Integer.valueOf(0));
        }
    }
}
