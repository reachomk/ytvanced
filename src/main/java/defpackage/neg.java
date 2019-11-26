package defpackage;

/* renamed from: neg */
final class neg implements mud {
    private final /* synthetic */ ndt a;

    public final void a(String str) {
        ndt ndt = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped due to unauthorized overlay on top of player. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        ndt.a(str);
    }

    public final void b(String str) {
        ndt ndt = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped due to the player's view being too small. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        ndt.a(str);
    }

    public final void c(String str) {
        ndt ndt = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped because the player's view is not visible. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        ndt.a(str);
    }

    /* synthetic */ neg(ndt ndt) {
        this.a = ndt;
    }
}
