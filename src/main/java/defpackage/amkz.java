package defpackage;

/* renamed from: amkz */
public enum amkz {
    EMBEDDING_DISABLED,
    BLOCKED_FOR_APP,
    NOT_PLAYABLE,
    NETWORK_ERROR,
    UNAUTHORIZED_OVERLAY,
    PLAYER_VIEW_TOO_SMALL,
    PLAYER_VIEW_NOT_VISIBLE,
    EMPTY_PLAYLIST,
    AUTOPLAY_DISABLED,
    USER_DECLINED_RESTRICTED_CONTENT,
    USER_DECLINED_HIGH_BANDWIDTH,
    UNEXPECTED_SERVICE_DISCONNECTION,
    INTERNAL_ERROR,
    UNKNOWN;

    public static amkz a(String str) {
        return (amkz) Enum.valueOf(amkz.class, str);
    }
}
