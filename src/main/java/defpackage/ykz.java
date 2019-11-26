package defpackage;

/* renamed from: ykz */
public final class ykz extends ylf {
    private final String d;

    public ykz(String str, apsk apsk, String str2, boolean z, boolean z2) {
        super(str, apsk, z, z2);
        this.d = str2;
    }

    public final String getPlaylistKey() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().h;
    }

    public final String getAuthorKey() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().b;
    }

    public final amul getEmotions() {
        return amul.a(((apsk) getEntity()).getChatMessagePlaylistType().c);
    }

    public final String getHeartToken() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().e;
    }

    public final String getUnheartToken() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().f;
    }

    public final String getDeleteToken() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().g;
    }

    public final void a(asfd asfd) {
        asdn asdn = (asdn) asdk.d.createBuilder();
        asdn.a(this.d);
        asdn.b(this.a);
        asfd.a(asdn);
    }

    public final String getTemporaryClientId() {
        return ((apsk) getEntity()).getChatMessagePlaylistType().d;
    }

    public final /* synthetic */ yli f() {
        return new ylc(this, this.d);
    }
}
