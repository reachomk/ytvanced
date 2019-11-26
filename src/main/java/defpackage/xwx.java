package defpackage;

/* renamed from: xwx */
public enum xwx {
    CHANNEL_ITEM,
    REMOVE_CONTACT_ITEM,
    BLOCK_ITEM,
    UNBLOCK_ITEM,
    INVITE_ITEM,
    CANCEL_INVITE_ITEM,
    ACCEPT_INVITE_ITEM,
    REINVITE_ITEM,
    CHAT_ITEM;

    public final auuz a(aqjk aqjk) {
        auuz auuz;
        switch (ordinal()) {
            case 0:
                auuz = aqjk.b;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 1:
                auuz = aqjk.c;
                if (auuz != null) {
                    return auuz;
                }
                return auuz.f;
            case 2:
                auuz = aqjk.d;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 3:
                auuz = aqjk.i;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 4:
                auuz = aqjk.e;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 5:
                auuz = aqjk.f;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 6:
                auuz = aqjk.h;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 7:
                auuz = aqjk.g;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            case 8:
                auuz = aqjk.j;
                if (auuz == null) {
                    auuz = auuz.f;
                }
                return auuz;
            default:
                throw new IllegalArgumentException(name());
        }
    }
}
