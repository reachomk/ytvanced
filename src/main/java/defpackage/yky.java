package defpackage;

import android.text.TextUtils;

/* renamed from: yky */
public final class yky extends ylf {
    public yky(String str, apsk apsk) {
        super(str, apsk, false, false);
    }

    public final String getTemporaryClientId() {
        return null;
    }

    public final String getAuthorKey() {
        return ((apsk) getEntity()).getChatMessageLinkType().d;
    }

    public final CharSequence getText() {
        return ajqy.a(((apsk) getEntity()).getChatMessageLinkType().e.d());
    }

    public static apxu a(yky yky) {
        if (((apsk) yky.getEntity()).getChatMessageLinkType().b == 2) {
            apsa chatMessageLinkType = ((apsk) yky.getEntity()).getChatMessageLinkType();
            if (((chatMessageLinkType.b == 2 ? (aprq) chatMessageLinkType.c : aprq.c).a & 1) != 0) {
                aprq aprq;
                apsa chatMessageLinkType2 = ((apsk) yky.getEntity()).getChatMessageLinkType();
                if (chatMessageLinkType2.b == 2) {
                    aprq = (aprq) chatMessageLinkType2.c;
                } else {
                    aprq = aprq.c;
                }
                String str = aprq.b;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return (apxu) abmi.b(str, apxu.d.getParserForType());
            }
        }
        return null;
    }

    public final void a(asfd asfd) {
        throw new UnsupportedOperationException();
    }

    public final yli f() {
        throw new UnsupportedOperationException();
    }
}
