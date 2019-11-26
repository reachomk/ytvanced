package defpackage;

/* renamed from: ykv */
public final class ykv extends yie {
    public static aqkt a(ykv ykv, ymn ymn) {
        if (ymn == null) {
            return ykv.getStatus();
        }
        int ordinal = ykv.getStatus().ordinal();
        int a;
        if (ordinal == 1) {
            a = ymp.a(ymn.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 5) {
                return aqkt.CONTACT_STATUS_BLOCKED;
            }
            if (a == 7) {
                return aqkt.CONTACT_STATUS_UNCONNECTED;
            }
        } else if (ordinal == 2) {
            a = ymp.a(ymn.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 1) {
                return aqkt.CONTACT_STATUS_INVITE_SENT;
            }
            if (a == 5) {
                return aqkt.CONTACT_STATUS_BLOCKED;
            }
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal == 5) {
                    a = ymp.a(ymn.b);
                    if (a == 0) {
                        a = 1;
                    }
                    if (a - 1 == 6) {
                        return aqkt.CONTACT_STATUS_UNCONNECTED;
                    }
                } else if (ordinal != 7) {
                    a = ymp.a(ymn.b);
                    if (a == 0) {
                        a = 1;
                    }
                    if (a - 1 == 5) {
                        return aqkt.CONTACT_STATUS_BLOCKED;
                    }
                }
            }
            a = ymp.a(ymn.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 3) {
                return aqkt.CONTACT_STATUS_CONNECTED;
            }
            if (a == 5) {
                return aqkt.CONTACT_STATUS_BLOCKED;
            }
        } else {
            a = ymp.a(ymn.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 2) {
                return aqkt.CONTACT_STATUS_UNCONNECTED;
            }
            if (a == 5) {
                return aqkt.CONTACT_STATUS_BLOCKED;
            }
        }
        return ykv.getStatus();
    }

    public ykv(String str, aqkj aqkj) {
        super(str, aqkj);
    }

    public final CharSequence getName() {
        return ajqy.a(((aqkj) getEntity()).getName().d());
    }

    public final boolean f() {
        return ((aqkj) getEntity()).getViewer().booleanValue();
    }

    public final aygk getAvatar() {
        return ((aqkj) getEntity()).getAvatar();
    }

    public final aqkt getStatus() {
        return ((aqkj) getEntity()).getStatus();
    }

    public final String getInviteToken() {
        return ((aqkj) getEntity()).getInviteToken();
    }

    public final String getAcceptInviteToken() {
        return ((aqkj) getEntity()).getAcceptInviteToken();
    }

    public final String getBlockToken() {
        return ((aqkj) getEntity()).getBlockToken();
    }

    public final String getUnblockToken() {
        return ((aqkj) getEntity()).getUnblockToken();
    }

    public final String getReinviteToken() {
        return ((aqkj) getEntity()).getReinviteToken();
    }

    public final String getCancelInviteToken() {
        return ((aqkj) getEntity()).getCancelInviteToken();
    }

    public final String getRemoveToken() {
        return ((aqkj) getEntity()).getRemoveToken();
    }

    public final String getRejectInviteToken() {
        return ((aqkj) getEntity()).getRejectInviteToken();
    }

    public final String getExternalChannelId() {
        return ((aqkj) getEntity()).getExternalChannelId();
    }

    public final String getSerializedContactInvitee() {
        return ((aqkj) getEntity()).getSerializedContactInvitee();
    }
}
