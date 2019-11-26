package defpackage;

/* renamed from: ynh */
final class ynh extends bbze {
    private final /* synthetic */ yng a;

    ynh(yng yng) {
        this.a = yng;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yng yng = this.a;
        ykd ykd = (ykd) aadz.c();
        if (ykd != null) {
            yma g = yng.h.g();
            ylo ylo = new ylo();
            String conversationId = ykd.getConversationId();
            if (conversationId != null) {
                ylo.a = conversationId;
                String str = "";
                conversationId = ylo.a == null ? str.concat(" conversationId") : str;
                String str2 = "Missing required properties:";
                if (conversationId.isEmpty()) {
                    yng.h = g.a(new yll(ylo.a)).a();
                    if (ykd.getParticipantEntityKeys().size() > 2) {
                        g = yng.h.g();
                        yls yls = new yls();
                        conversationId = yng.f;
                        if (conversationId != null) {
                            yls.a = conversationId;
                            conversationId = yng.m.getHeaderKey();
                            if (conversationId != null) {
                                yls.b = conversationId;
                                if (yls.a == null) {
                                    str = str.concat(" chatEntityKey");
                                }
                                if (yls.b == null) {
                                    str = String.valueOf(str).concat(" chatHeaderKey");
                                }
                                if (str.isEmpty()) {
                                    yng.h = g.a(new ylp(yls.a, yls.b)).a();
                                } else {
                                    throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
                                }
                            }
                            throw new NullPointerException("Null chatHeaderKey");
                        }
                        throw new NullPointerException("Null chatEntityKey");
                    }
                    yng.l = ykd.getViewerKey();
                    yng.f();
                    return;
                }
                throw new IllegalStateException(conversationId.length() == 0 ? new String(str2) : str2.concat(conversationId));
            }
            throw new NullPointerException("Null conversationId");
        }
    }
}
