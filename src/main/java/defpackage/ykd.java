package defpackage;

/* renamed from: ykd */
public final class ykd extends yie {
    public ykd(String str, apso apso) {
        super(str, apso);
    }

    public final String getConversationId() {
        return ((apso) getEntity()).getConversationId();
    }

    public final String getMessagesKey() {
        return ((apso) getEntity()).b.d;
    }

    public final String getViewerKey() {
        return ((apso) getEntity()).b.e;
    }

    public final CharSequence getReadReceiptText() {
        if ((((apso) getEntity()).b.a & 32) == 0) {
            return null;
        }
        return ajqy.a(((apso) getEntity()).getReadReceiptText().d());
    }

    public final String getOnViewToken() {
        return ((apso) getEntity()).getOnViewEditConversationToken();
    }

    public final amul getParticipantEntityKeys() {
        amuo amuo = new amuo();
        for (apre apre : ((apso) getEntity()).getParticipants()) {
            amuo.c(apre.b);
        }
        return amuo.a();
    }

    public final amul getParticipants() {
        return amul.a(((apso) getEntity()).getParticipants());
    }

    public final String getShowTypingStatusToken() {
        return ((apso) getEntity()).getShowTypingStatusToken();
    }

    public final String getHideTypingStatusToken() {
        return ((apso) getEntity()).getHideTypingStatusToken();
    }

    public final atun getInvalidationId() {
        return ((apso) getEntity()).getInvalidationId();
    }

    public final String getGetConversationAttachmentToken() {
        return ((apso) getEntity()).getGetConversationAttachmentToken();
    }
}
