package defpackage;

/* renamed from: yks */
public final class yks extends yid {
    public String a;
    public ykn b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    private yks(String str, String str2, String str3, String str4, String str5, ykn ykn) {
        this.d = xvd.a(str);
        this.c = xvd.a(str2);
        this.e = xvd.a(str3);
        this.f = xvd.a(str4);
        this.a = str5;
        this.b = ykn;
    }

    public final ykp a() {
        return new ykp(this.d, this.c, this.e, this.f, this.a, this.b);
    }

    public final /* synthetic */ yie b(aadw aadw) {
        return a();
    }

    public final /* bridge */ /* synthetic */ aadq a(aadw aadw) {
        return a();
    }

    public /* synthetic */ yks(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null);
    }

    /* synthetic */ yks(ykp ykp) {
        this(ykp.a, ykp.getConversationId(), ykp.getChatMessageSetKey(), ykp.getAuthorKey(), ykp.getText(), ykp.getAttachment());
    }
}
