package defpackage;

/* renamed from: foc */
enum foc {
    NONE(0.0f),
    AUTOPLAYABLE(0.0f),
    INLINE_PLAYBACK(0.5f),
    INLINE_PLAYBACK_VIDEO_FEED(0.0f),
    CONVERSATION_PLAYABLE(0.0f),
    INLINE_SURVEY_PLAYABLE(0.0f),
    PROMOTED_VIDEO_PLAYABLE(0.0f),
    CAROUSEL_PLAYABLE(0.0f),
    DEFAULT_PROMO_PANEL(0.0f),
    DISCOVERY_ACTION_VIDEO_PLAYABLE(0.0f),
    DISCOVERY_APP_VIDEO_PLAYABLE(0.0f),
    CHAT_INLINE_PLAYABLE(0.0f);
    
    public final float m;

    private foc(float f) {
        this.m = f;
    }
}
