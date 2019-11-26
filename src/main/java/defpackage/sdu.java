package defpackage;

import android.app.PendingIntent;

/* renamed from: sdu */
final class sdu extends ser {
    public String a;
    public Integer b;
    public Boolean c;
    private PendingIntent d;
    private Boolean e;

    sdu() {
    }

    public final ser a(PendingIntent pendingIntent) {
        this.d = pendingIntent;
        return this;
    }

    public final ser a() {
        this.e = Boolean.valueOf(true);
        return this;
    }

    public final seo b() {
        String str = "";
        if (this.e == null) {
            str = str.concat(" fullFlowEnabled");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" focusClientId");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" socialClientId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" appFlipSupportedByCallingApp");
        }
        if (str.isEmpty()) {
            return new sej(this.d, this.e.booleanValue(), this.a, this.b.intValue(), null, this.c.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
