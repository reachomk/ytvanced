package defpackage;

/* renamed from: vql */
public enum vql {
    NONE(0, 0, 0),
    NO_AD_RETURNED_ERROR(1, 2, 300),
    VIDEO_PLAYBACK_ERROR_NO_NETWORK(10, 7, 405),
    VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST(11, 7, 401),
    VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT(12, 7, 401),
    VIDEO_PLAYBACK_ERROR_TIMEOUT(13, 3, 402),
    VIDEO_PLAYBACK_UNKNOWN_ERROR(14, 3, 405),
    UNSUPPORTED_VIDEO_FORMAT(15, 6, 403),
    VIDEO_PLAYBACK_ERROR_LOAD_TIMEOUT(16, 3, 402),
    AD_SURVEY_PARSING_ERROR(20, 10, 900),
    VAST_AD_PARSING_ERROR(21, 10, 900),
    VMAP_AD_PARSING_ERROR(22, 11, 900),
    VIDEO_INFO_EXCEPTION(23, 7, 405),
    VAST_REQUEST_ERROR(24, 8, 301),
    VAST_TOO_MANY_WRAPPERS_ERROR(25, 8, 302),
    NON_SPACECAST_STREAM_ERROR(26, 15, 403);
    
    public final int i;
    public final int j;
    public final int k;

    private vql(int i, int i2, int i3) {
        this.i = i;
        this.j = i2;
        this.k = i3;
    }
}
