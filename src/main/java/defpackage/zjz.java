package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: zjz */
public final class zjz {
    public static final String a;
    public static final String b = new File(a, "stickers").getPath();
    public static final String c = new File(a, "dynamic_stickers").getPath();
    @Deprecated
    public static final String d = new File(a, "text").getPath();
    public static final String e;
    public static final long f = TimeUnit.DAYS.toSeconds(14);
    public static final long g = TimeUnit.DAYS.toSeconds(1);

    public static String a(String str) {
        return new File("stickers", str).getPath();
    }

    public static String b(String str) {
        return new File("dynamic_stickers", str).getPath();
    }

    static {
        String str = "video_effects";
        a = new File(str, "assets").getPath();
        e = new File(str, "effects_state").getPath();
    }
}
