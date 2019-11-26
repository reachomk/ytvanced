package defpackage;

import com.google.android.libraries.youtube.mdx.background.MdxBackgroundScanJobService;
import java.util.Collections;
import java.util.Locale;

/* renamed from: adad */
public final class adad implements Runnable {
    private final /* synthetic */ MdxBackgroundScanJobService a;

    public adad(MdxBackgroundScanJobService mdxBackgroundScanJobService) {
        this.a = mdxBackgroundScanJobService;
    }

    public final void run() {
        amul a;
        int d;
        MdxBackgroundScanJobService mdxBackgroundScanJobService = this.a;
        mdxBackgroundScanJobService.d.c(mdxBackgroundScanJobService);
        amuw b = mdxBackgroundScanJobService.b();
        amxo amxo;
        if (mdxBackgroundScanJobService.g.e()) {
            a = amul.a(mdxBackgroundScanJobService.e.a());
            amxo = (amxo) b.iterator();
            while (amxo.hasNext()) {
                ((adaa) amxo.next()).a(a);
            }
        } else {
            a = amul.a(Collections.emptyList());
            amxo = (amxo) b.iterator();
            while (amxo.hasNext()) {
                ((adaa) amxo.next()).d();
            }
        }
        int isEmpty = a.isEmpty() ^ 1;
        if (isEmpty != 0) {
            d = mdxBackgroundScanJobService.i.d();
        } else {
            d = mdxBackgroundScanJobService.i.c();
        }
        String.format(Locale.US, "scheduling job with %s seconds of delay", new Object[]{Integer.valueOf(d)});
        mdxBackgroundScanJobService.j.a(mdxBackgroundScanJobService.getClass(), "mdx_background_scanner", d, isEmpty ^ 1);
        aczm aczm = mdxBackgroundScanJobService.j;
        String str = "mdx_fallback_background_scanner";
        String str2 = "canceling job ";
        if (str.length() == 0) {
            String str3 = new String(str2);
        } else {
            str2.concat(str);
        }
        aczm.b.a(str);
        mdxBackgroundScanJobService.a((der) amqw.a(mdxBackgroundScanJobService.k), false);
    }
}
