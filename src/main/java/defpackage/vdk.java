package defpackage;

/* renamed from: vdk */
final class vdk extends vdi {
    public String a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Boolean g;
    public Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;

    vdk() {
    }

    public final vdi a(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final vdi b(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final vdi c(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final vdi d(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final vdj a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" getAppVersionForAds");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" getMidrollAdsFreqCapMillis");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" getImmediateAdExpireTimeMillis");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" getAdsTimeoutMillis");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" getAdWarningMillis");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" getMidrollPrefetchMillis");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" trackUserPresence");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" shouldAllowInnertubeCaching");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" shouldPreventYoutubeHeaders");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" shouldPreventAdsHeaders");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" shouldBlockAds");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" shouldBlockOfflineAds");
        }
        if (str.isEmpty()) {
            return new vdl(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue(), this.e.longValue(), this.f.longValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.g.booleanValue(), this.h.booleanValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
