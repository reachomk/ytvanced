package defpackage;

/* renamed from: adbv */
final class adbv extends adbx {
    public String a;
    public String b;
    private adca c;
    private String d;
    private zzf e;
    private Integer f;
    private Boolean g;
    private Integer h;
    private Boolean i;
    private Boolean j;

    adbv() {
    }

    public final adbx a(adca adca) {
        this.c = adca;
        return this;
    }

    public final adbx a(String str) {
        this.d = str;
        return this;
    }

    public final adbx a(zzf zzf) {
        if (zzf != null) {
            this.e = zzf;
            return this;
        }
        throw new NullPointerException("Null commonConfigs");
    }

    public final adbx a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final adbx a(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final adbx b(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final adbx b(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final adbx c(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final adby a() {
        String str = "";
        if (this.c == null) {
            str = str.concat(" castAppIdConfigs");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" theme");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" dialAppName");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" commonConfigs");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" remoteNotificationIconResId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" lockscreenAdSupported");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" multiUserSession");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" forceQueueingEnabled");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" mdxPlaybackQueueEnabled");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" castDataChannelNameSpace");
        }
        if (str.isEmpty()) {
            return new adbw(this.c, this.d, this.a, this.e, this.f.intValue(), this.g.booleanValue(), this.h.intValue(), this.i.booleanValue(), this.j.booleanValue(), this.b);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
