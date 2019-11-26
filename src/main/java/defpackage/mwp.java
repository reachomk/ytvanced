package defpackage;

/* renamed from: mwp */
final class mwp implements mud {
    private final /* synthetic */ mvs a;

    public final void a(String str) {
        mvs mvs = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped due to unauthorized overlay on top of player. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        mvs.a(str, amkz.UNAUTHORIZED_OVERLAY);
    }

    public final void b(String str) {
        mvs mvs = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped due to the player's view being too small. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        mvs.a(str, amkz.PLAYER_VIEW_TOO_SMALL);
    }

    public final void c(String str) {
        mvs mvs = this.a;
        str = String.valueOf(str);
        String str2 = "YouTube video playback stopped because the player's view is not visible. ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        mvs.a(str, amkz.PLAYER_VIEW_NOT_VISIBLE);
    }

    /* synthetic */ mwp(mvs mvs) {
        this.a = mvs;
    }
}
