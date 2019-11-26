package defpackage;

/* renamed from: arzx */
public enum arzx implements anxv {
    YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_UNKNOWN(0),
    YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_CURATED(1),
    YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_TOPIC_ENTITY(2),
    YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_MUSIC_ENTITY(3),
    YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_GENERAL_ENTITY(4);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static arzx a(int i) {
        if (i == 0) {
            return YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_CURATED;
        }
        if (i == 2) {
            return YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_TOPIC_ENTITY;
        }
        if (i != 3) {
            return i != 4 ? null : YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_GENERAL_ENTITY;
        } else {
            return YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_P13N_PROFILE_MUSIC_ENTITY;
        }
    }

    public static anxx a() {
        return arzw.a;
    }

    private arzx(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
