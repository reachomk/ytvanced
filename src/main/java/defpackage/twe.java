package defpackage;

import android.text.TextUtils;

/* renamed from: twe */
public final class twe {
    public final String a;
    public final Long b;
    private final String c;
    private final String d;
    private final tap e;
    private final long f;
    private final tzu g;
    private final int h;

    public final bcfe a(bcfe bcfe) {
        CharSequence charSequence = null;
        if (bcfe != null) {
            bcfd bcfd = (bcfd) ((anxo) bcfe.toBuilder());
            bcdo bcdo = (bcdo) bcdl.g.createBuilder();
            int i = this.h;
            bcdo.copyOnWrite();
            bcdl bcdl = (bcdl) bcdo.instance;
            if (i != 0) {
                long longValue;
                bcdl.a |= 4;
                bcdl.d = i - 1;
                String str = this.c;
                if (str != null) {
                    bcdo.copyOnWrite();
                    bcdl = (bcdl) bcdo.instance;
                    bcdl.a |= 1;
                    bcdl.b = str;
                }
                Long l = this.b;
                if (l != null) {
                    longValue = l.longValue();
                    bcdo.copyOnWrite();
                    bcdl bcdl2 = (bcdl) bcdo.instance;
                    bcdl2.a |= 8;
                    bcdl2.e = longValue;
                }
                str = this.a;
                if (str != null) {
                    bcdo.copyOnWrite();
                    bcdl = (bcdl) bcdo.instance;
                    bcdl.a |= 2;
                    bcdl.c = str;
                }
                str = this.d;
                if (str != null) {
                    bcdo.copyOnWrite();
                    bcdl = (bcdl) bcdo.instance;
                    bcdl.a |= 16;
                    bcdl.f = str;
                }
                bcfd.copyOnWrite();
                bcfe bcfe2 = (bcfe) bcfd.instance;
                bcfe2.f = (bcdl) ((anxl) bcdo.build());
                bcfe2.a |= 16;
                bcdu bcdu = (bcdu) bcdr.d.createBuilder();
                longValue = this.e.a().getFreeSpace();
                bcdu.copyOnWrite();
                bcdr bcdr = (bcdr) bcdu.instance;
                bcdr.a |= 1;
                bcdr.b = longValue / 1024;
                longValue = this.f;
                bcdu.copyOnWrite();
                bcdr = (bcdr) bcdu.instance;
                bcdr.a |= 2;
                bcdr.c = longValue;
                bcfd.copyOnWrite();
                bcfe2 = (bcfe) bcfd.instance;
                bcfe2.u = (bcdr) ((anxl) bcdu.build());
                bcfe2.a |= 4194304;
                tzu tzu = this.g;
                if (tzu != null) {
                    charSequence = ((twr) tzu.a()).a;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    anxl anxl = bcfe.s;
                    if (anxl == null) {
                        anxl = bcdj.c;
                    }
                    bcdm bcdm = (bcdm) ((anxo) anxl.toBuilder());
                    if (bcdm.a().isEmpty()) {
                        bcdm.a(charSequence);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(charSequence);
                        stringBuilder.append("::");
                        stringBuilder.append(bcdm.a());
                        bcdm.a(stringBuilder.toString());
                    }
                    bcfd.a(bcdm);
                }
                return (bcfe) ((anxl) bcfd.build());
            }
            throw new NullPointerException();
        }
        tyv.d("MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.", new Object[0]);
        return null;
    }

    public twe(String str, String str2, String str3, int i, Long l, tap tap, tzu tzu) {
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.h = i;
        this.b = l;
        this.e = tap;
        this.f = tap.a().getTotalSpace() / 1024;
        this.g = tzu;
    }
}
