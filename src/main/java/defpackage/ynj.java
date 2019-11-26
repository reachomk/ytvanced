package defpackage;

/* renamed from: ynj */
final /* synthetic */ class ynj implements xsd {
    private final ynk a;

    ynj(ynk ynk) {
        this.a = ynk;
    }

    public final void a(Object obj) {
        ynk ynk = this.a;
        ykd ykd = (ykd) obj;
        if (ykd.b()) {
            String conversationId;
            if (ynk.p == null) {
                conversationId = ykd.getConversationId();
                if (conversationId != null) {
                    ynk.p = new ypq(conversationId);
                    ynk.k.a(ynk.p);
                } else {
                    throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
                }
            }
            ynk.a(ykd.getMessagesKey(), new ynm(ynk, ykd));
            ynk.a(ykd.a, new ynl(ynk));
            conversationId = String.valueOf(ykd.a);
            String str = "empty_";
            if (conversationId.length() == 0) {
                conversationId = new String(str);
            } else {
                conversationId = str.concat(conversationId);
            }
            ynk.a(conversationId, new yno(ynk, ykd));
            conversationId = String.valueOf(ykd.a);
            str = "pending_";
            if (conversationId.length() == 0) {
                conversationId = new String(str);
            } else {
                conversationId = str.concat(conversationId);
            }
            ynk.a(conversationId, new ynn(ynk, ykd));
        }
    }
}
