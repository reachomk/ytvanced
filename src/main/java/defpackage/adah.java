package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundScanJobService;

/* renamed from: adah */
public final class adah {
    private static final String a = xtl.b("MDX.BackgroundScanStarter");
    private final Context b;
    private final aczz c;
    private boolean d;

    public adah(Context context, aczz aczz) {
        this.b = context;
        this.c = aczz;
    }

    public final synchronized void a() {
        if (!this.d) {
            if (this.c.a().isEmpty()) {
                xtl.c(a, "no background scan clients registered, not starting background scan job");
                return;
            }
            xtl.c(a, "starting background scan job");
            aczl.a(this.b).a(MdxBackgroundScanJobService.class, "mdx_background_scanner", 1);
            this.d = true;
        }
    }
}
