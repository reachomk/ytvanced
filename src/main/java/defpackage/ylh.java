package defpackage;

/* renamed from: ylh */
public final class ylh extends ylf {
    private final String d;

    public ylh(String str, apsk apsk, String str2, boolean z, boolean z2) {
        super(str, apsk, z, z2);
        this.d = str2;
    }

    public final String getAuthorKey() {
        return ((apsk) getEntity()).getChatMessageVideoType().b;
    }

    public final amul getEmotions() {
        return amul.a(((apsk) getEntity()).getChatMessageVideoType().e);
    }

    public final String getHeartToken() {
        return ((apsk) getEntity()).getChatMessageVideoType().h;
    }

    public final String getUnheartToken() {
        return ((apsk) getEntity()).getChatMessageVideoType().i;
    }

    public final String getDeleteToken() {
        return ((apsk) getEntity()).getChatMessageVideoType().j;
    }

    public final String getShareToken() {
        return ((apsk) getEntity()).getChatMessageVideoType().k;
    }

    public final String getRelatedVideoRepliesToken() {
        return ((apsk) getEntity()).getChatMessageVideoType().l;
    }

    public final String getVideoId() {
        return ((apsk) getEntity()).getChatMessageVideoType().c;
    }

    public final CharSequence getVideoTitle() {
        return ajqy.a(((apsk) getEntity()).getChatMessageVideoType().g.d());
    }

    public final aygk getVideoThumbnail() {
        aygk aygk = ((apsk) getEntity()).getChatMessageVideoType().d;
        return aygk == null ? aygk.f : aygk;
    }

    public final String getTemporaryClientId() {
        return ((apsk) getEntity()).getChatMessageVideoType().f;
    }

    public final void a(asfd asfd) {
        asdn asdn = (asdn) asdk.d.createBuilder();
        asdn.a(this.d);
        asdn.b(this.a);
        asfd.a(asdn);
    }

    public final /* synthetic */ yli f() {
        return new ylk(this, this.d);
    }

    /* synthetic */ ylh(String str, apsk apsk, String str2, boolean z, boolean z2, byte b) {
        this(str, apsk, str2, z, z2);
    }
}
