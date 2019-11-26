package defpackage;

/* renamed from: atku */
public enum atku implements anxv {
    CODEC_ID_UNKNOWN(0),
    CODEC_ID_NONE(1),
    CODEC_ID_MP3(101),
    CODEC_ID_FLAC(102),
    CODEC_ID_AAC(103),
    CODEC_ID_VORBIS(104),
    CODEC_ID_OPUS(105),
    CODEC_ID_PCM_S16LE(201),
    CODEC_ID_AMR_NB(281),
    CODEC_ID_AMR_WB(282),
    CODEC_ID_MPEG4(301),
    CODEC_ID_H263(302),
    CODEC_ID_FLV1(303),
    CODEC_ID_H264(304),
    CODEC_ID_VP8(305),
    CODEC_ID_VP9(306),
    CODEC_ID_H265(307);
    
    public final int p;

    public final int getNumber() {
        return this.p;
    }

    public static atku a(int i) {
        if (i == 0) {
            return CODEC_ID_UNKNOWN;
        }
        if (i == 1) {
            return CODEC_ID_NONE;
        }
        if (i == 201) {
            return CODEC_ID_PCM_S16LE;
        }
        if (i == 281) {
            return CODEC_ID_AMR_NB;
        }
        if (i == 282) {
            return CODEC_ID_AMR_WB;
        }
        switch (i) {
            case 101:
                return CODEC_ID_MP3;
            case 102:
                return CODEC_ID_FLAC;
            case 103:
                return CODEC_ID_AAC;
            case 104:
                return CODEC_ID_VORBIS;
            case 105:
                return CODEC_ID_OPUS;
            default:
                switch (i) {
                    case 301:
                        return CODEC_ID_MPEG4;
                    case 302:
                        return CODEC_ID_H263;
                    case 303:
                        return CODEC_ID_FLV1;
                    case 304:
                        return CODEC_ID_H264;
                    case 305:
                        return CODEC_ID_VP8;
                    case 306:
                        return CODEC_ID_VP9;
                    case 307:
                        return CODEC_ID_H265;
                    default:
                        return null;
                }
        }
    }

    public static anxx a() {
        return atkt.a;
    }

    private atku(int i) {
        this.p = i;
    }

    public final String toString() {
        return Integer.toString(this.p);
    }
}
