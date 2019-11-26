package defpackage;

/* renamed from: aghr */
public final class aghr {
    public static final String[] a = new String[]{"video_id", "language_code", "subtitles_path", "track_vss_id", "user_visible_track_name"};
    public final agfd b;

    public aghr(agfd agfd) {
        this.b = agfd;
    }

    public final void a(String str) {
        this.b.a().delete("subtitles_v5", "video_id = ?", new String[]{str});
    }
}
