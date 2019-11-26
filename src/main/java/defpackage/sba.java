package defpackage;

import com.google.android.gms.cast.CastDevice;

/* renamed from: sba */
final class sba implements pjj {
    private final /* synthetic */ sap a;

    sba(sap sap) {
        this.a = sap;
    }

    public final void a(CastDevice castDevice, String str, String str2) {
        for (sbo a : this.a.H) {
            a.a(str2);
        }
    }
}
