package defpackage;

/* renamed from: ykc */
public final class ykc extends ylf {
    private final String d;

    public ykc(String str, apsk apsk, String str2, boolean z, boolean z2) {
        super(str, apsk, z, z2);
        this.d = str2;
    }

    public final String getChannelKey() {
        return ((apsk) getEntity()).getChatMessageChannelType().h;
    }

    public final String getAuthorKey() {
        return ((apsk) getEntity()).getChatMessageChannelType().b;
    }

    public final amul getEmotions() {
        return amul.a(((apsk) getEntity()).getChatMessageChannelType().c);
    }

    public final String getHeartToken() {
        return ((apsk) getEntity()).getChatMessageChannelType().e;
    }

    public final String getUnheartToken() {
        return ((apsk) getEntity()).getChatMessageChannelType().f;
    }

    public final String getDeleteToken() {
        return ((apsk) getEntity()).getChatMessageChannelType().g;
    }

    public final void a(asfd asfd) {
        asdn asdn = (asdn) asdk.d.createBuilder();
        asdn.a(this.d);
        asdn.b(this.a);
        asfd.a(asdn);
    }

    public final String getTemporaryClientId() {
        return ((apsk) getEntity()).getChatMessageChannelType().d;
    }

    public final /* synthetic */ yli f() {
        return new ykb(this, this.d);
    }
}
