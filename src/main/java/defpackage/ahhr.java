package defpackage;

/* renamed from: ahhr */
final class ahhr extends ahhs {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public bcaa h;
    public Long i;
    public Integer j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    ahhr() {
    }

    public final ahhs a(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final ahhs a(bcaa bcaa) {
        this.h = bcaa;
        return this;
    }

    public final ahhs b(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final ahhs c(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public final ahhq a() {
        String str = "";
        if (this.k == null) {
            str = str.concat(" onesieEnabled");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" enableVss2StatsTracking");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" enableGmsCoreFirstPartyApis");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" enableRawCcSupport");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" enableLegacyHeartbeatFlow");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" enableAggressiveLossOfForeground");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" backgroundNotificationIconResourceId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" subtitleCacheSize");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" useV19SystemCaptionSettings");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" playerFetcherTimeoutMillis");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" maximumConsecutiveSkippedUnplayableVideos");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" enableVss2UserPresenceTracking");
        }
        if (str.isEmpty()) {
            return new ahho(this.k.booleanValue(), this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.intValue(), this.g.intValue(), this.h, this.l.booleanValue(), this.i.longValue(), this.j.intValue(), this.m.booleanValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
