package defpackage;

import android.content.Intent;

/* renamed from: adij */
public enum adij {
    AUTHORIZATION_LIGHTWEIGHT_ACCOUNT,
    BIG_SCREEN_CONNECTED,
    BIG_SCREEN_ON_ERROR,
    BIG_SCREEN_PLAY_STATE_UPDATE,
    BIG_SCREEN_PLAYER_STATE_CHANGED,
    BIG_SCREEN_PLAYLIST_CONFIRMED,
    BIG_SCREEN_PLAYLIST_UPDATE,
    CLOUD_SERVICE_NO_NETWORK,
    DECLINED_PARTY,
    END_PARTY_MODE,
    GO_HOME,
    LOUNGE_SERVER_CONNECTION_ERROR,
    LOUNGE_STATUS,
    NO_ACTION,
    PARTY_VIDEO_FLING,
    PLAYSTATE_CHANGED,
    QUEUE_MODIFIED,
    QUEUE_MODIFIED_VIDEO_ADDED,
    QUEUE_MODIFIED_VIDEO_REMOVED,
    REFRESH,
    REMOTE_CALL_ERROR,
    SHARED_PLAYLIST_MODIFIED,
    SWITCH_USER;

    public static adij a(String str) {
        return (adij) Enum.valueOf(adij.class, str.substring(str.lastIndexOf(".") + 1));
    }

    public final Intent a() {
        return new Intent(toString());
    }

    public final String toString() {
        String canonicalName = adij.class.getCanonicalName();
        String name = name();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(canonicalName).length() + 1) + String.valueOf(name).length());
        stringBuilder.append(canonicalName);
        stringBuilder.append(".");
        stringBuilder.append(name);
        return stringBuilder.toString();
    }
}
