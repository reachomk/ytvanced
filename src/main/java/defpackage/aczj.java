package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aczj */
public final class aczj implements adaa {
    private static final String a = xtl.b("MDX.BackgroundDeviceLogger");
    private static final int b = ((int) TimeUnit.MINUTES.toSeconds(5));
    private static final int c = ((int) TimeUnit.MINUTES.toSeconds(5));

    public final void a() {
    }

    public final String b() {
        return "background-logger";
    }

    public final adac c() {
        return adac.e().a(true).a(10).c(b).b(c).a();
    }

    public final void a(amul amul) {
        xtl.c(a, String.format(Locale.US, "discovered %d devices", new Object[]{Integer.valueOf(amul.size())}));
        amxn amxn = (amxn) amul.listIterator();
        while (amxn.hasNext()) {
            bbs bbs = (bbs) amxn.next();
            String.format(Locale.US, "route: %s", new Object[]{bbs.d});
        }
    }

    public final void d() {
        xtl.c(a, "wifi network disconnected");
    }
}
