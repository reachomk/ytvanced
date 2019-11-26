package defpackage;

/* renamed from: iat */
final class iat extends idq {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private aicd k;

    iat() {
    }

    /* Access modifiers changed, original: final */
    public final idq a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq c(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq d(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq e(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq f(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq g(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq h(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq i(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq j(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final idq a(aicd aicd) {
        if (aicd != null) {
            this.k = aicd;
            return this;
        }
        throw new NullPointerException("Null style");
    }

    /* Access modifiers changed, original: final */
    public final idn a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" isControlsOverlayVisible");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isVideoInNewState");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" isFullscreen");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isInInlineMode");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" hasNext");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" hasPrevious");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" autonavVisible");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" isUserScrubbing");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" isFullscreenEngagementViewVisible");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" isExtendedRelatedEndScreenShowing");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" style");
        }
        if (str.isEmpty()) {
            return new iaq(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ iat(idn idn) {
        iaq iaq = (iaq) idn;
        this.a = Boolean.valueOf(iaq.a);
        this.b = Boolean.valueOf(iaq.b);
        this.c = Boolean.valueOf(iaq.c);
        this.d = Boolean.valueOf(iaq.d);
        this.e = Boolean.valueOf(iaq.e);
        this.f = Boolean.valueOf(iaq.f);
        this.g = Boolean.valueOf(iaq.g);
        this.h = Boolean.valueOf(iaq.h);
        this.i = Boolean.valueOf(iaq.i);
        this.j = Boolean.valueOf(iaq.j);
        this.k = iaq.k;
    }
}
