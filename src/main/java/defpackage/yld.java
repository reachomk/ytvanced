package defpackage;

/* renamed from: yld */
public final class yld extends ylf {
    public yld(String str, apsk apsk, boolean z) {
        super(str, apsk, z, false);
    }

    public final CharSequence getText() {
        return ajqy.a(((apsk) getEntity()).getChatMessageTextType().c.d());
    }

    public final String getAuthorKey() {
        return ((apsk) getEntity()).getChatMessageTextType().b;
    }

    public final amul getEmotions() {
        return amul.a(((apsk) getEntity()).getChatMessageTextType().d);
    }

    public final String getHeartToken() {
        return ((apsk) getEntity()).getChatMessageTextType().f;
    }

    public final String getUnheartToken() {
        return ((apsk) getEntity()).getChatMessageTextType().g;
    }

    public final String getDeleteToken() {
        return ((apsk) getEntity()).getChatMessageTextType().h;
    }

    public final String getTemporaryClientId() {
        return ((apsk) getEntity()).getChatMessageTextType().e;
    }

    public final void a(asfd asfd) {
        asdl asdl = (asdl) asdi.d.createBuilder();
        asdl.a(getText().toString());
        asdl.b(this.a);
        asfd.a(asdl);
    }

    /* renamed from: h */
    public final ylg f() {
        return new ylg(this);
    }

    /* synthetic */ yld(String str, apsk apsk, boolean z, boolean z2) {
        super(str, apsk, z, z2);
    }
}
