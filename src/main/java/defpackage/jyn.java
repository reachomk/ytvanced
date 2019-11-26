package defpackage;

import com.google.android.youtube.R;

/* renamed from: jyn */
final /* synthetic */ class jyn implements akoq {
    private final jyi a;

    jyn(jyi jyi) {
        this.a = jyi;
    }

    public final void a(akor akor, aknh aknh, int i) {
        float f;
        jyi jyi = this.a;
        if (jyi.l.c != null) {
            boolean a = fka.a(jyi.a.getResources().getConfiguration().orientation);
            boolean b = xss.b(jyi.a);
            apjo apjo = jyi.l.c;
            if (a) {
                if (b) {
                    f = apjo.d;
                } else {
                    f = apjo.b;
                }
            } else if (b) {
                f = apjo.e;
            } else {
                f = apjo.c;
            }
        } else {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            f = jyi.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
        }
        akor.a("carousel_aspect_ratio", Float.valueOf(f));
    }
}
