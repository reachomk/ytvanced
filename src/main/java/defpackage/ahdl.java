package defpackage;

import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahdl */
public final class ahdl {
    public static final Map a = new HashMap();
    public static final Map b = new HashMap();
    private static final Map c = new HashMap();

    public static int a(avsi avsi, int i) {
        return a.containsKey(avsi) ? ((Integer) a.get(avsi)).intValue() : i;
    }

    public static avsi a(int i) {
        Map map = c;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (avsi) c.get(valueOf);
        }
        return avsi.UNKNOWN_FORMAT_TYPE;
    }

    static {
        Map map = a;
        avsi avsi = avsi.AUDIO_ONLY;
        Integer valueOf = Integer.valueOf(0);
        map.put(avsi, valueOf);
        map = a;
        avsi = avsi.LD;
        Integer valueOf2 = Integer.valueOf(144);
        map.put(avsi, valueOf2);
        map = a;
        avsi = avsi.LD_240;
        Integer valueOf3 = Integer.valueOf(240);
        map.put(avsi, valueOf3);
        map = a;
        avsi = avsi.SD;
        Integer valueOf4 = Integer.valueOf(360);
        map.put(avsi, valueOf4);
        map = a;
        avsi = avsi.SD_480;
        Integer valueOf5 = Integer.valueOf(480);
        map.put(avsi, valueOf5);
        map = a;
        avsi = avsi.HD;
        Integer valueOf6 = Integer.valueOf(720);
        map.put(avsi, valueOf6);
        map = a;
        avsi = avsi.HD_1080;
        Integer valueOf7 = Integer.valueOf(1080);
        map.put(avsi, valueOf7);
        map = a;
        avsi = avsi.HD_1440;
        Integer valueOf8 = Integer.valueOf(1440);
        map.put(avsi, valueOf8);
        map = a;
        avsi = avsi.HD_2160;
        Integer valueOf9 = Integer.valueOf(2160);
        map.put(avsi, valueOf9);
        c.put(valueOf, avsi.AUDIO_ONLY);
        c.put(valueOf2, avsi.LD);
        c.put(valueOf3, avsi.LD_240);
        c.put(valueOf4, avsi.SD);
        c.put(valueOf5, avsi.SD_480);
        c.put(valueOf6, avsi.HD);
        c.put(valueOf7, avsi.HD_1080);
        c.put(valueOf8, avsi.HD_1440);
        c.put(valueOf9, avsi.HD_2160);
        b.put(avsi.AUDIO_ONLY, Integer.valueOf(R.string.offline_video_quality_audio_only));
        b.put(avsi.LD, Integer.valueOf(R.string.offline_video_quality_144p));
        b.put(avsi.SD, Integer.valueOf(R.string.offline_video_quality_360p));
        b.put(avsi.HD, Integer.valueOf(R.string.offline_video_quality_720p));
        b.put(avsi.HD_1080, Integer.valueOf(R.string.offline_video_quality_1080p));
    }
}
