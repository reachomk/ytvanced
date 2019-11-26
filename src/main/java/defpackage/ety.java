package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: ety */
public final class ety implements etx {
    private final etz a;
    private String b;
    private String c;
    private int d;
    private long e;

    public ety(etz etz) {
        this.a = etz;
    }

    public final void a(apxu apxu, aygk aygk) {
        airn airn = new airn();
        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            nkm c = airn.c(apxu);
            if (c != null) {
                this.b = c.b;
                this.c = c.d;
                this.d = c.e;
                this.e = c.k;
                return;
            }
            return;
        }
        c();
    }

    public final void d() {
        c();
    }

    private final void c() {
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0;
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.b) ^ 1;
    }

    public final void b() {
        if (!TextUtils.isEmpty(this.b)) {
            etz etz = this.a;
            String str = this.b;
            String str2 = this.c;
            int i = this.d;
            etz.a.edit().putString("restore_context_video_id", str).putString("restore_context_playlist_id", str2).putInt("restore_context_playlist_index", i).putLong("restore_context_video_start_time", this.e).putLong("restore_context_crash_timestamp", etz.b.b()).commit();
        }
    }

    public final void a(ahkm ahkm) {
        this.e = ahkm.a;
    }
}
