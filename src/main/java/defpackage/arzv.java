package defpackage;

/* renamed from: arzv */
public enum arzv implements anxv {
    YOUTUBE_ASSISTANT_AUDIO_ENCODING_UNKNOWN(0),
    YOUTUBE_ASSISTANT_AUDIO_ENCODING_LINEAR16(1),
    YOUTUBE_ASSISTANT_AUDIO_ENCODING_AMR_WB(2),
    YOUTUBE_ASSISTANT_AUDIO_ENCODING_OGG_OPUS(3),
    YOUTUBE_ASSISTANT_AUDIO_ENCODING_FLAC(4);
    
    private final int f;

    public final int getNumber() {
        return this.f;
    }

    public static arzv a(int i) {
        if (i == 0) {
            return YOUTUBE_ASSISTANT_AUDIO_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return YOUTUBE_ASSISTANT_AUDIO_ENCODING_LINEAR16;
        }
        if (i == 2) {
            return YOUTUBE_ASSISTANT_AUDIO_ENCODING_AMR_WB;
        }
        if (i != 3) {
            return i != 4 ? null : YOUTUBE_ASSISTANT_AUDIO_ENCODING_FLAC;
        } else {
            return YOUTUBE_ASSISTANT_AUDIO_ENCODING_OGG_OPUS;
        }
    }

    public static anxx a() {
        return arzu.a;
    }

    private arzv(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
