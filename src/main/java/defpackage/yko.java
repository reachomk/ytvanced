package defpackage;

/* renamed from: yko */
public final class yko extends yie {
    public yko(String str, apst apst) {
        super(str, apst);
    }

    public final String getHeaderKey() {
        return ((apst) getEntity()).b.c;
    }

    public final String getBodyKey() {
        return ((apst) getEntity()).b.d;
    }

    public final String getForegroundChatToken() {
        apst apst = (apst) getEntity();
        if ((apst.getForegroundChatToken().a & 1) == 0) {
            return null;
        }
        return apst.getForegroundChatToken().b;
    }

    public final String getSyncToken() {
        apst apst = (apst) getEntity();
        if ((apst.getSyncToken().a & 1) == 0) {
            return null;
        }
        return apst.getSyncToken().b;
    }

    public final long e() {
        return ((apst) getEntity()).getEntityFilledTimestamp().longValue();
    }
}
