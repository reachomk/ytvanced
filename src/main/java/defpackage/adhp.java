package defpackage;

/* renamed from: adhp */
public final class adhp extends tgh {
    private static final String a = xtl.b("MDX.CastRouteManager");
    private final tbq b;
    private final bcaa c;
    private final adhn d;
    private String e = null;

    public adhp(tbq tbq, bcaa bcaa, adhn adhn) {
        this.b = tbq;
        this.c = bcaa;
        this.d = adhn;
    }

    public final void a(tbn tbn, bbs bbs) {
        xtl.c(a, "onDeviceSelected");
        if (tbn == null) {
            c(this.e);
            return;
        }
        String str = bbs.c;
        String str2 = this.e;
        String valueOf;
        StringBuilder stringBuilder;
        if (str2 != null && str2.equals(str)) {
            String.valueOf(bbs).length();
        } else if (this.d.d(bbs)) {
            String.valueOf(bbs).length();
            str = this.e;
            if (str != null) {
                c(str);
            }
            tbn = this.b.a(bbs.r);
            if (tbn == null) {
                str = a;
                valueOf = String.valueOf(bbs);
                stringBuilder = new StringBuilder(valueOf.length() + 33);
                stringBuilder.append("Can't get Cast device for route: ");
                stringBuilder.append(valueOf);
                xtl.b(str, stringBuilder.toString());
                return;
            }
            adil a = adil.a(tbn);
            str2 = a;
            String valueOf2 = String.valueOf(a.bv_());
            String str3 = "Selecting Cast device: ";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str3);
            } else {
                valueOf2 = str3.concat(valueOf2);
            }
            xtl.c(str2, valueOf2);
            this.e = bbs.c;
            ((adgj) this.c.get()).a(a, this.e);
        } else {
            str = a;
            valueOf = String.valueOf(bbs);
            stringBuilder = new StringBuilder(valueOf.length() + 25);
            stringBuilder.append("Ignoring non-Cast route: ");
            stringBuilder.append(valueOf);
            xtl.c(str, stringBuilder.toString());
        }
    }

    private final void c(String str) {
        String str2 = this.e;
        if (str2 != null && str2.equals(str)) {
            str2 = a;
            String valueOf = String.valueOf(str);
            String str3 = "Unselecting Cast route: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            xtl.c(str2, valueOf);
            ((adgj) this.c.get()).a(str);
            this.e = null;
        }
    }
}
