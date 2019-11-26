package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: anms */
public final class anms {
    public static anlw a(Status status, String str) {
        pzr.a((Object) status);
        String str2 = status.g;
        if (!(str2 == null || str2.isEmpty())) {
            str = str2;
        }
        int i = status.f;
        if (i == 17510) {
            return new anly(str);
        }
        if (i == 17511) {
            return new anme(str);
        }
        if (i == 17602) {
            return new anmc(str);
        }
        switch (i) {
            case 17513:
                return new anlv(str);
            case 17514:
                return new anlt(str);
            case 17515:
                return new anmb(str);
            case 17516:
                return new anlz(str);
            case 17517:
                return new anma(str);
            case 17518:
                return new anlx(str);
            default:
                return new anlw(str);
        }
    }
}
