package defpackage;

/* renamed from: sfj */
public final class sfj {
    public final String a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String f;
    public final sfi g;
    public final boolean h;
    public final long i;
    public final int j;

    /* synthetic */ sfj(sfm sfm) {
        String str = sfm.a;
        if (str != null) {
            this.a = sfm.d;
            this.b = sfm.e;
            this.c = sfm.b;
            this.d = null;
            this.e = str;
            this.f = null;
            this.j = sfm.f;
            this.g = sfm.c;
            this.h = false;
            this.i = 0;
            return;
        }
        throw new IllegalArgumentException("GdiStoreSsoTokenRequest.Builder must set an auth code or an access token, or set a refresh token and an expires-in time.");
    }
}
