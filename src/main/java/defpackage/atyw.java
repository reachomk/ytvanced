package defpackage;

/* renamed from: atyw */
public enum atyw implements anxv {
    LATENCY_ACTION_UNKNOWN(0),
    LATENCY_ACTION_HOME(1),
    LATENCY_ACTION_EXPLORE(75),
    LATENCY_ACTION_RESULTS(2),
    LATENCY_ACTION_WATCH(3),
    LATENCY_ACTION_CHANNELS(4),
    LATENCY_ACTION_APP_STARTUP(5),
    LATENCY_ACTION_VIDEO_PREVIEW(6),
    LATENCY_ACTION_SHOW_MORE(7),
    LATENCY_ACTION_VIDEO_THUMBNAIL(8),
    LATENCY_ACTION_PROCESS(9),
    LATENCY_ACTION_PLAYABILITY_CHECK(10),
    LATENCY_ACTION_BROWSE(11),
    LATENCY_ACTION_MDX_COMMAND(12),
    LATENCY_ACTION_RESOLVE_URL(13),
    LATENCY_ACTION_SPINNER_DISPLAYED(14),
    LATENCY_ACTION_MDX_LAUNCH(15),
    LATENCY_ACTION_AD_TO_VIDEO(16),
    LATENCY_ACTION_VIDEO_TO_AD(17),
    LATENCY_ACTION_EMBED(18),
    LATENCY_ACTION_OFFLINE_SHARING_RECEIVER_PAIRING(19),
    LATENCY_ACTION_LIVE(20),
    LATENCY_ACTION_LIBRARY(21),
    LATENCY_ACTION_AD_TO_AD(22),
    LATENCY_ACTION_NEW_COMMENT(23),
    LATENCY_ACTION_EDIT_COMMENT(24),
    LATENCY_ACTION_LOAD_COMMENTS(25),
    LATENCY_ACTION_LOAD_COMMENT_REPLIES(26),
    LATENCY_ACTION_TRENDING(27),
    LATENCY_ACTION_SUBSCRIPTIONS(28),
    LATENCY_ACTION_SUGGEST(30),
    LATENCY_ACTION_ON_DEVICE_MODEL_DOWNLOAD(54),
    LATENCY_ACTION_FIRST_THUMBNAIL_LOAD(29),
    LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS(31),
    LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS(32),
    LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS(33),
    LATENCY_ACTION_CREATOR_VIDEO_COMMENTS(34),
    LATENCY_ACTION_SEARCH_UI(35),
    LATENCY_ACTION_CREATOR_VIDEO_EDIT(36),
    LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR(37),
    LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS(38),
    LATENCY_ACTION_TENX(39),
    LATENCY_ACTION_PREBUFFER(40),
    LATENCY_ACTION_REEL_WATCH(41),
    LATENCY_ACTION_THUMBNAIL_LOAD(42),
    LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION(43),
    LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT(44),
    LATENCY_ACTION_ABANDONED_WATCH(45),
    LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC(46),
    LATENCY_ACTION_VOICE_ASSISTANT(47),
    LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS(48),
    LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD(49),
    LATENCY_ACTION_CREATOR_VIDEO_EDITOR(50),
    LATENCY_ACTION_CREATOR_VIDEO_EDITOR_ASYNC(51),
    LATENCY_ACTION_PREFETCH(52),
    LATENCY_ACTION_KIDS_LIBRARY(53),
    LATENCY_ACTION_CHANNEL_PREVIEW(55),
    LATENCY_ACTION_CHANNEL_SUBSCRIBE(56),
    LATENCY_ACTION_SUBSCRIPTIONS_LIST(57),
    LATENCY_ACTION_REEL_EDITOR(58),
    LATENCY_ACTION_SEARCH_THUMBNAILS(59),
    LATENCY_ACTION_HOME_RESUME(60),
    LATENCY_ACTION_OFFLINE_STORE_START(61),
    LATENCY_ACTION_KIDS_CURATED_COLLECTION(62),
    LATENCY_ACTION_VIDEO_LIST(63),
    LATENCY_ACTION_MODIFY_CHANNEL_NOTIFICATION(65),
    LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS(66),
    LATENCY_ACTION_SEARCH_ZERO_STATE(67),
    LATENCY_ACTION_CHIPS(68),
    LATENCY_ACTION_LOCATION_SIGNAL_COLLECTION(69),
    LATENCY_ACTION_ELEMENTS_PERFORMANCE(70),
    LATENCY_ACTION_MUSIC_PLAYLIST_DETAIL(71),
    LATENCY_ACTION_MUSIC_ALBUM_DETAIL(72),
    LATENCY_ACTION_LITE_SWITCH_ACCOUNT(73),
    LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION(74);
    
    public final int j;

    public final int getNumber() {
        return this.j;
    }

    public static atyw a(int i) {
        switch (i) {
            case 0:
                return LATENCY_ACTION_UNKNOWN;
            case 1:
                return LATENCY_ACTION_HOME;
            case 2:
                return LATENCY_ACTION_RESULTS;
            case 3:
                return LATENCY_ACTION_WATCH;
            case 4:
                return LATENCY_ACTION_CHANNELS;
            case 5:
                return LATENCY_ACTION_APP_STARTUP;
            case 6:
                return LATENCY_ACTION_VIDEO_PREVIEW;
            case 7:
                return LATENCY_ACTION_SHOW_MORE;
            case 8:
                return LATENCY_ACTION_VIDEO_THUMBNAIL;
            case 9:
                return LATENCY_ACTION_PROCESS;
            case 10:
                return LATENCY_ACTION_PLAYABILITY_CHECK;
            case 11:
                return LATENCY_ACTION_BROWSE;
            case 12:
                return LATENCY_ACTION_MDX_COMMAND;
            case 13:
                return LATENCY_ACTION_RESOLVE_URL;
            case 14:
                return LATENCY_ACTION_SPINNER_DISPLAYED;
            case 15:
                return LATENCY_ACTION_MDX_LAUNCH;
            case 16:
                return LATENCY_ACTION_AD_TO_VIDEO;
            case 17:
                return LATENCY_ACTION_VIDEO_TO_AD;
            case 18:
                return LATENCY_ACTION_EMBED;
            case 19:
                return LATENCY_ACTION_OFFLINE_SHARING_RECEIVER_PAIRING;
            case 20:
                return LATENCY_ACTION_LIVE;
            case 21:
                return LATENCY_ACTION_LIBRARY;
            case 22:
                return LATENCY_ACTION_AD_TO_AD;
            case 23:
                return LATENCY_ACTION_NEW_COMMENT;
            case 24:
                return LATENCY_ACTION_EDIT_COMMENT;
            case 25:
                return LATENCY_ACTION_LOAD_COMMENTS;
            case 26:
                return LATENCY_ACTION_LOAD_COMMENT_REPLIES;
            case 27:
                return LATENCY_ACTION_TRENDING;
            case 28:
                return LATENCY_ACTION_SUBSCRIPTIONS;
            case 29:
                return LATENCY_ACTION_FIRST_THUMBNAIL_LOAD;
            case 30:
                return LATENCY_ACTION_SUGGEST;
            case 31:
                return LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS;
            case 32:
                return LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS;
            case 33:
                return LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS;
            case 34:
                return LATENCY_ACTION_CREATOR_VIDEO_COMMENTS;
            case 35:
                return LATENCY_ACTION_SEARCH_UI;
            case 36:
                return LATENCY_ACTION_CREATOR_VIDEO_EDIT;
            case 37:
                return LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR;
            case 38:
                return LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS;
            case 39:
                return LATENCY_ACTION_TENX;
            case 40:
                return LATENCY_ACTION_PREBUFFER;
            case 41:
                return LATENCY_ACTION_REEL_WATCH;
            case 42:
                return LATENCY_ACTION_THUMBNAIL_LOAD;
            case 43:
                return LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION;
            case 44:
                return LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT;
            case 45:
                return LATENCY_ACTION_ABANDONED_WATCH;
            case 46:
                return LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC;
            case 47:
                return LATENCY_ACTION_VOICE_ASSISTANT;
            case 48:
                return LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS;
            case cv.aT /*49*/:
                return LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD;
            case cv.aU /*50*/:
                return LATENCY_ACTION_CREATOR_VIDEO_EDITOR;
            case cv.aV /*51*/:
                return LATENCY_ACTION_CREATOR_VIDEO_EDITOR_ASYNC;
            case cv.aW /*52*/:
                return LATENCY_ACTION_PREFETCH;
            case cv.aX /*53*/:
                return LATENCY_ACTION_KIDS_LIBRARY;
            case cv.aY /*54*/:
                return LATENCY_ACTION_ON_DEVICE_MODEL_DOWNLOAD;
            case cv.aZ /*55*/:
                return LATENCY_ACTION_CHANNEL_PREVIEW;
            case cv.ba /*56*/:
                return LATENCY_ACTION_CHANNEL_SUBSCRIBE;
            case cv.bb /*57*/:
                return LATENCY_ACTION_SUBSCRIPTIONS_LIST;
            case 58:
                return LATENCY_ACTION_REEL_EDITOR;
            case cv.bc /*59*/:
                return LATENCY_ACTION_SEARCH_THUMBNAILS;
            case cv.bd /*60*/:
                return LATENCY_ACTION_HOME_RESUME;
            case cv.be /*61*/:
                return LATENCY_ACTION_OFFLINE_STORE_START;
            case cv.bf /*62*/:
                return LATENCY_ACTION_KIDS_CURATED_COLLECTION;
            case cv.bg /*63*/:
                return LATENCY_ACTION_VIDEO_LIST;
            case 65:
                return LATENCY_ACTION_MODIFY_CHANNEL_NOTIFICATION;
            case 66:
                return LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS;
            case 67:
                return LATENCY_ACTION_SEARCH_ZERO_STATE;
            case 68:
                return LATENCY_ACTION_CHIPS;
            case 69:
                return LATENCY_ACTION_LOCATION_SIGNAL_COLLECTION;
            case 70:
                return LATENCY_ACTION_ELEMENTS_PERFORMANCE;
            case 71:
                return LATENCY_ACTION_MUSIC_PLAYLIST_DETAIL;
            case 72:
                return LATENCY_ACTION_MUSIC_ALBUM_DETAIL;
            case 73:
                return LATENCY_ACTION_LITE_SWITCH_ACCOUNT;
            case 74:
                return LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION;
            case 75:
                return LATENCY_ACTION_EXPLORE;
            default:
                return null;
        }
    }

    public static anxx a() {
        return atyz.a;
    }

    private atyw(int i) {
        this.j = i;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
