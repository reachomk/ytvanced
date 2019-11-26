package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundScanJobService;
import java.util.Locale;

/* renamed from: adkb */
final class adkb implements adjw {
    private final /* synthetic */ adjy a;

    adkb(adjy adjy) {
        this.a = adjy;
    }

    public final void a(aczq aczq) {
        adjz adjz = this.a.e;
        String a = aczq.a();
        adjz.a.edit().putString("mdx.continue_watching_route_id", a).putLong("mdx.continue_watching_last_shown", this.a.f.a()).putBoolean("mdx.continue_watching_visible", true).apply();
        adjy adjy = this.a;
        String str = "continue-watching";
        if (adjy.c) {
            adae adae = adjy.b;
            String str2 = "Client configuration changed: ";
            if (str.length() == 0) {
                String str3 = new String(str2);
            } else {
                str2.concat(str);
            }
            aczl aczl = adae.c;
            aczl.a(adae.b).a(MdxBackgroundScanJobService.class, "mdx_background_scanner", 0);
            return;
        }
        xtl.b(aczd.a, String.format(Locale.US, "Client %s attempted to notify configuration change when it hasn't been registered.", new Object[]{str}));
    }

    public final void a(Uri uri, Exception exception) {
        String str = adjy.d;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("Error downloading ");
        stringBuilder.append(valueOf);
        xtl.a(str, stringBuilder.toString(), (Throwable) exception);
    }
}
