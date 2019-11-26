package defpackage;

/* renamed from: agqr */
public final class agqr {
    public final String a;
    public final int b;
    public final int c;

    public agqr(String str, int i, int i2) {
        this.a = (String) amqw.a((Object) str);
        this.b = i;
        this.c = i2;
    }

    public agqr(agqr agqr, int i) {
        this(agqr.a, i, agqr.c);
    }

    public static String a(asau asau) {
        try {
            int i = ((asau) amqw.a((Object) asau)).c;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("auto_offline_video_list_");
            stringBuilder.append(i);
            return stringBuilder.toString();
        } catch (NullPointerException unused) {
            return "auto_offline_video_list_0";
        }
    }

    public static String a(avmy avmy) {
        int i = ((avmy) amqw.a((Object) avmy)).g;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("offline_candidate_video_list_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
