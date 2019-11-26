package defpackage;

/* renamed from: azzo */
public final class azzo implements azzp {
    private final azyk a;

    public static azzr a(azyk azyk) {
        return new azzr(azyk);
    }

    public final azzh a(String str, String str2, azyn azyn, azyl azyl, String str3, azzn azzn) {
        String str4 = str2;
        boolean z = true;
        if (!(str2.equalsIgnoreCase("put") || str2.equalsIgnoreCase("post"))) {
            z = false;
        }
        amqw.a(z);
        if (azzn == null || azyl.a() == -1 || azyl.a() >= 0) {
            return new azza(str, str2, azyn, azyl, str3, this.a, azzn, false);
        }
        return new azyw(str, str2, azyn, azyl, str3, this.a, azzn);
    }

    public final azzh a(String str, azyl azyl, azzn azzn) {
        return new azza(str, "PUT", null, azyl, null, this.a, azzn, true);
    }

    /* synthetic */ azzo(azyk azyk) {
        this.a = azyk;
    }
}
