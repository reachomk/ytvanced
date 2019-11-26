package defpackage;

/* renamed from: yni */
final class yni extends bbze {
    private final /* synthetic */ yng a;

    yni(yng yng) {
        this.a = yng;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yng yng = this.a;
        ykg ykg = (ykg) aadz.c();
        if (ykg != null) {
            yma a = yng.h.g().a(ykg.getTitle());
            ylu ylu = new ylu();
            String str = yng.f;
            if (str != null) {
                ylu.a = str;
                ylu.b = Boolean.valueOf(((apsu) ykg.getEntity()).getNotificationsMuted().booleanValue());
                str = "";
                if (ylu.a == null) {
                    str = str.concat(" chatEntityKey");
                }
                if (ylu.b == null) {
                    str = String.valueOf(str).concat(" muted");
                }
                if (str.isEmpty()) {
                    yng.h = a.a(new ylr(ylu.a, ylu.b.booleanValue())).a();
                    yng.k = ykg.getOwnerKey();
                    yng.f();
                    return;
                }
                String str2;
                String str3 = "Missing required properties:";
                if (str.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str2 = str3.concat(str);
                }
                throw new IllegalStateException(str2);
            }
            throw new NullPointerException("Null chatEntityKey");
        }
    }
}
