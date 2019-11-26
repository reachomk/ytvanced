package defpackage;

import com.google.android.youtube.R;

/* renamed from: kow */
final /* synthetic */ class kow implements kpa {
    private final kov a;

    kow(kov kov) {
        this.a = kov;
    }

    public final void a(kpd kpd) {
        kov kov = this.a;
        kov.b.setText(kov.a.getResources().getString(R.string.region_with_calling_code, new Object[]{kpd.b(), Integer.valueOf(kpd.c())}));
        kov.e = kpd.b();
        kov.f();
        kov.f.dismiss();
    }
}
