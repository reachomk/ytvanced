package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: eto */
public final class eto implements albc {
    private final /* synthetic */ azdi a;
    private final /* synthetic */ avkh b;
    private final /* synthetic */ etm c;

    public eto(etm etm, azdi azdi, avkh avkh) {
        this.c = etm;
        this.a = azdi;
        this.b = avkh;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final /* synthetic */ void a(Object obj) {
        this.c.b.a(this.a.e.d(), null);
        this.c.b.a(this.b.d.d(), null);
        etm etm = this.c;
        Editor edit = etm.e.edit();
        edit.putLong(xay.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, etm.d.a());
        edit.apply();
    }
}
