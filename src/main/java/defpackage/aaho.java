package defpackage;

/* renamed from: aaho */
public enum aaho {
    INVALID_VIDEO_FORMAT(0, "", -1, -1, -1),
    RAW(15, "", -1, -1, -1),
    MP4_AVCBASE640_AAC(18, "video/mp4", aaho.a(400), 640, 360),
    MP4_H264_AAC_DVD(78, "video/mp4", aaho.a(720), 854, 480),
    MP4_H264_AAC_HIGH(59, "video/mp4", aaho.a(720), 854, 480),
    MP4_AVC720P_AAC(22, "video/mp4", aaho.b(2), 1280, 720),
    THREEGPP_MPEG4SP_AAC(17, "video/3gpp", aaho.a(56), 176, 144),
    THREEGPP_MPEG4SP_AAC_HIGH(36, "video/3gpp", aaho.a(192), 320, 240),
    M2TS_H264_AAC_MED(93, "", aaho.a(400), 640, 360),
    DASH_WEBM_VP9_ULTRALOW(278, "video/webm", aaho.a(95), 256, 144),
    DASH_WEBM_VP9_LOW(242, "video/webm", aaho.a(150), 426, 240),
    DASH_WEBM_VP9_MED(243, "video/webm", aaho.a(276), 640, 360),
    DASH_WEBM_VP9_HIGH(244, "video/webm", aaho.a(512), 854, 480),
    DASH_WEBM_VP9_HIGH_MQ(245, "video/webm", aaho.a(750), 854, 480),
    DASH_WEBM_VP9_HIGH_HQ(246, "video/webm", aaho.b(1), 854, 480),
    DASH_WEBM_VP9_720P(247, "video/webm", aaho.b(1), 1280, 720),
    DASH_WEBM_VP9_720P_HFR(302, "video/webm", aaho.b(2), 1280, 720),
    DASH_WEBM_VP9_1080P(248, "video/webm", aaho.b(2), 1920, 1080),
    DASH_WEBM_VP9_1080P_HFR(303, "video/webm", aaho.b(3), 1920, 1080),
    DASH_WEBM_VP9_2K(271, "video/webm", aaho.b(6), 2560, 1440),
    DASH_WEBM_VP9_2K_HFR(308, "video/webm", aaho.b(9), 2560, 1440),
    DASH_WEBM_VP9_4K(313, "video/webm", aaho.b(12), 3840, 2160),
    DASH_WEBM_VP9_4K_HFR(315, "video/webm", aaho.b(18), 3840, 2160),
    DASH_WEBM_VP9_HIGHRES(272, "video/webm", aaho.b(18), 8192, 8192),
    DASH_WEBM_VP9_HDR_ULTRALOW(330, "video/webm", aaho.a(142), 256, 144),
    DASH_WEBM_VP9_HDR_LOW(331, "video/webm", aaho.a(225), 426, 240),
    DASH_WEBM_VP9_HDR_MED(332, "video/webm", aaho.a(414), 640, 360),
    DASH_WEBM_VP9_HDR_HIGH(333, "video/webm", aaho.a(768), 854, 480),
    DASH_WEBM_VP9_HDR_720P(334, "video/webm", aaho.b(2), 1280, 720),
    DASH_WEBM_VP9_HDR_1080P(335, "video/webm", aaho.b(3), 1920, 1080),
    DASH_WEBM_VP9_HDR_2K(336, "video/webm", aaho.b(9), 2560, 1440),
    DASH_WEBM_VP9_HDR_4K(337, "video/webm", aaho.b(18), 3840, 2160),
    DASH_WEBM_OPUS_LOW(249, "audio/webm", aaho.a(48)),
    DASH_WEBM_OPUS_MED(250, "audio/webm", aaho.a(64)),
    DASH_WEBM_OPUS_HIGH(251, "audio/webm", aaho.a(128)),
    DASH_WEBM_OPUS_AMBISONICS(338, "audio/webm", aaho.a(256)),
    DASH_WEBM_VORBIS_AMBISONICS(339, "audio/webm", aaho.a(256)),
    DASH_WEBM_VP9_LOW_ENC(279, "video/webm", aaho.a(150), 426, 240),
    DASH_WEBM_VP9_MED_ENC(280, "video/webm", aaho.a(276), 640, 360),
    DASH_WEBM_VP9_HIGH_HQ_ENC(273, "video/webm", aaho.b(1), 854, 480),
    DASH_WEBM_VP9_720P_ENC(274, "video/webm", aaho.b(1), 1280, 720),
    DASH_WEBM_VP9_1080P_ENC(275, "video/webm", aaho.b(2), 1920, 1080),
    DASH_WEBM_VP9_2K_ENC(276, "video/webm", aaho.b(6), 2560, 1440),
    DASH_WEBM_VP9_HIGHRES_ENC(277, "video/webm", aaho.b(18), 8192, 8192),
    DASH_FMP4_H264_ULTRALOW(160, "video/mp4", aaho.a(108), 256, 144),
    DASH_FMP4_H264_LOW(133, "video/mp4", aaho.a(242), 426, 240),
    DASH_FMP4_H264_MED(134, "video/mp4", aaho.a(400), 640, 360),
    DASH_FMP4_H264_HIGH(135, "video/mp4", aaho.b(1), 854, 480),
    DASH_FMP4_H264_HIGH_MQ(212, "video/mp4", aaho.b(2), 854, 480),
    DASH_FMP4_H264_HIGH_HQ(213, "video/mp4", aaho.b(3), 854, 480),
    DASH_FMP4_H264_720P(136, "video/mp4", aaho.b(2), 1280, 720),
    DASH_FMP4_H264_720P_MQ(214, "video/mp4", aaho.b(3), 1280, 720),
    DASH_FMP4_H264_720P_HQ(215, "video/mp4", aaho.b(5), 1280, 720),
    DASH_FMP4_H264_720P_HFR(298, "video/mp4", aaho.b(3), 1280, 720),
    DASH_FMP4_H264_1080P(137, "video/mp4", aaho.b(4), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ(216, "video/mp4", aaho.b(5), 1920, 1080),
    DASH_FMP4_H264_1080P_HQ(217, "video/mp4", aaho.b(7), 1920, 1080),
    DASH_FMP4_H264_1080P_HFR(299, "video/mp4", aaho.b(5), 1920, 1080),
    DASH_FMP4_H264_2K(264, "video/mp4", aaho.b(9), 2560, 1440),
    DASH_FMP4_H264_2K_HFR(304, "video/mp4", aaho.b(14), 2560, 1440),
    DASH_FMP4_H264_4K(266, "video/mp4", aaho.b(17), 3840, 2160),
    DASH_FMP4_H264_4K_HFR(305, "video/mp4", aaho.b(25), 3840, 2160),
    DASH_FMP4_H264_HIGHRES(138, "video/mp4", aaho.b(22), 8192, 8192),
    DASH_FMP4_HE_AAC_LOW(139, "audio/mp4", aaho.a(48)),
    DASH_FMP4_AAC_MED(140, "audio/mp4", aaho.a(128)),
    DASH_FMP4_AAC_HIGH(141, "audio/mp4", aaho.a(256)),
    DASH_FMP4_AAC_51_LOW(256, "audio/mp4", aaho.a(192)),
    DASH_FMP4_AAC_51_HIGH(258, "audio/mp4", aaho.a(384)),
    DASH_FMP4_H264_ULTRALOW_CENC(161, "video/mp4", aaho.a(108), 256, 144),
    DASH_FMP4_H264_LOW_CENC(142, "video/mp4", aaho.a(242), 426, 240),
    DASH_FMP4_H264_MED_CENC(143, "video/mp4", aaho.a(400), 640, 360),
    DASH_FMP4_H264_HIGH_CENC(144, "video/mp4", aaho.b(1), 854, 480),
    DASH_FMP4_H264_HIGH_MQ_CENC(222, "video/mp4", aaho.b(2), 854, 480),
    DASH_FMP4_H264_HIGH_HQ_CENC(223, "video/mp4", aaho.b(3), 854, 480),
    DASH_FMP4_H264_720P_CENC(145, "video/mp4", aaho.b(2), 1280, 720),
    DASH_FMP4_H264_720P_MQ_CENC(224, "video/mp4", aaho.b(3), 1280, 720),
    DASH_FMP4_H264_720P_HFR_CENC(384, "video/mp4", aaho.b(3), 1280, 720),
    DASH_FMP4_H264_720P_MQ_HFR_CENC(376, "video/mp4", aaho.b(4), 1280, 720),
    DASH_FMP4_H264_720P_HQ_CENC(225, "video/mp4", aaho.b(5), 1280, 720),
    DASH_FMP4_H264_1080P_CENC(146, "video/mp4", aaho.b(4), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ_CENC(226, "video/mp4", aaho.b(5), 1920, 1080),
    DASH_FMP4_H264_1080P_HFR_CENC(385, "video/mp4", aaho.b(5), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ_HFR_CENC(377, "video/mp4", aaho.b(6), 1920, 1080),
    DASH_FMP4_H264_1080P_HQ_CENC(227, "video/mp4", aaho.b(7), 1920, 1080),
    DASH_FMP4_H264_HIGHRES_CENC(147, "video/mp4", aaho.b(22), 8192, 8192),
    DASH_FMP4_HE_AAC_LOW_CENC(148, "audio/mp4", aaho.a(48)),
    DASH_FMP4_AAC_MED_CENC(149, "audio/mp4", aaho.a(128)),
    DASH_FMP4_AAC_HIGH_CENC(150, "audio/mp4", aaho.a(256)),
    DASH_FMP4_AAC_51_LOW_CENC(259, "audio/mp4", aaho.a(192)),
    DASH_FMP4_AAC_51_HIGH_CENC(261, "audio/mp4", aaho.a(384)),
    DASH_FMP4_TT_FMT3(386, "text/mp4", aaho.a(8)),
    DASH_FMP4_TT_WEBVTT(387, "text/webvtt", aaho.a(8));
    
    public static final aaho aw = null;
    private final String aQ;
    private final int aR;
    private final int aS;
    private final int aT;
    public final int ax;

    private static int a(int i) {
        return i << 10;
    }

    private static int b(int i) {
        return i << 20;
    }

    private aaho(int i, String str, int i2) {
        this(r9, r10, i, str, i2, -2, -2);
    }

    private aaho(int i, String str, int i2, int i3, int i4) {
        this.ax = i;
        this.aQ = str;
        this.aR = i2;
        this.aS = i3;
        this.aT = i4;
    }

    public final arlv a() {
        arlx arlx = (arlx) arlv.E.createBuilder();
        arlx.a(this.ax);
        arlx.b(this.aQ);
        arlx.b(this.aR);
        int i = this.aS;
        if (i > 0 && this.aT > 0) {
            arlx.c(i);
            arlx.d(this.aT);
        }
        return (arlv) ((anxl) arlx.build());
    }

    static {
        aw = r1;
    }
}
