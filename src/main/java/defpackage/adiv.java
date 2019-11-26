package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: adiv */
public enum adiv {
    ADD_VIDEO("addVideo"),
    ADD_VIDEOS("addVideos"),
    AD_PLAYING("adPlaying"),
    ON_AD_STATE_CHANGED("onAdStateChange"),
    CLEAR_PLAYLIST("clearPlaylist"),
    CONFIRM_PLAYLIST_UPDATE("confirmPlaylistUpdate"),
    INSERT_VIDEO("insertVideo"),
    INSERT_VIDEOS("insertVideos"),
    LOUNGE_STATUS("loungeStatus"),
    MOVE_VIDEO("moveVideo"),
    NEXT("next"),
    NOOP("noop"),
    NOW_PLAYING("nowPlaying"),
    NOW_PLAYING_PLAYLIST("nowPlayingPlaylist"),
    ON_SUBTITLES_TRACK_CHANGED("onSubtitlesTrackChanged"),
    PAUSE("pause"),
    PLAY("play"),
    PLAYLIST_MODIFIED("playlistModified"),
    PREVIOUS("previous"),
    REMOVE_VIDEO("removeVideo"),
    SCREEN_DISCONNECTED("loungeScreenDisconnected"),
    SEEK_TO("seekTo"),
    SET_AUDIO_TRACK("setAudioTrack"),
    SET_PLAYLIST("setPlaylist"),
    SET_SUBTITLES_TRACK("setSubtitlesTrack"),
    SET_VIDEO("setVideo"),
    SET_VOLUME("setVolume"),
    ON_VOLUME_CHANGED("onVolumeChanged"),
    SHOW_QR_CODE("showQrCode"),
    SKIP_AD("skipAd"),
    ON_STATE_CHANGED("onStateChange"),
    STOP("stopVideo"),
    NOW_AUTONAVING("nowAutoplaying"),
    AUTONAV_DISMISSED("autoplayDismissed"),
    DISMISS_AUTONAV("dismissAutoplay"),
    AUTONAV_UP_NEXT("autoplayUpNext"),
    ON_AUTONAV_MODE_CHANGED("onAutoplayModeChanged"),
    SET_AUTONAV_MODE("setAutoplayMode"),
    ON_AUDIO_TRACK_LIST_CHANGED("onAudioTrackListChanged"),
    ON_AUDIO_TRACK_CHANGED("onAudioTrackChanged"),
    ON_USER_ACTIVITY("onUserActivity"),
    ON_PLAYLIST_MODE_CHANGED("onPlaylistModeChanged"),
    SET_PLAYLIST_MODE("setPlaylistMode"),
    GRACEFUL_RECONNECT("gracefulReconnect"),
    SEND_DEBUG_COMMAND("sendDebugCommand"),
    CUSTOM("custom"),
    MDX_SESSION_STATUS("mdxSessionStatus"),
    MDX_REMOTE_STATUS("mdxRemoteStatus"),
    ENCRYPTION("mdxEncrypted"),
    REQUEST_ASSISTED_SIGN_IN("requestAssistedSignIn"),
    VOICE_COMMAND("voiceCommand"),
    DPAD_COMMAND("dpadCommand"),
    SET_IMPACTED_SESSIONS_SERVER_EVENT("setImpactedSessionsServerEvent");
    
    public static final amuw D = null;
    public static final amuw E = null;
    private static final Map ae = null;
    private static final amuw af = null;
    public final String F;

    public static adiv a(String str) {
        return (adiv) ae.get(str);
    }

    private adiv(String str) {
        this.F = (String) amqw.a((Object) str);
    }

    public final String toString() {
        return this.F;
    }

    public final boolean a() {
        return af.contains(this);
    }

    static {
        ae = new HashMap();
        af = amuw.a(NEXT, ON_USER_ACTIVITY, PAUSE, PLAY, PREVIOUS, SEEK_TO, SEND_DEBUG_COMMAND, SET_VOLUME, SKIP_AD, STOP, MDX_REMOTE_STATUS, ENCRYPTION, VOICE_COMMAND, DPAD_COMMAND);
        D = amuw.a(SET_AUDIO_TRACK, SET_SUBTITLES_TRACK);
        E = amuw.a(MDX_REMOTE_STATUS, ENCRYPTION);
        adiv[] values = adiv.values();
        int length = values.length;
        int i;
        while (i < length) {
            adiv adiv = values[i];
            ae.put(adiv.F, adiv);
            i++;
        }
    }
}
