package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: giw */
public final class giw implements gjs {
    public final gjd a;
    public final gjv b;
    public final Executor c;
    public final gkt d;
    public final wxg e = new gjb();
    public final gim f;
    public final acwa g;

    public giw(gjd gjd, gjv gjv, Executor executor, gkt gkt, gim gim, acwa acwa) {
        this.a = gjd;
        this.b = gjv;
        this.c = executor;
        this.d = gkt;
        this.f = gim;
        this.g = acwa;
    }

    public final void a(bacz bacz) {
        Uri parse;
        bacx bacx = bacz.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        bade bade = bacx.b == 2 ? (bade) bacx.c : bade.d;
        if ((bade.a & 4) != 0) {
            badc badc = bade.c;
            if (badc == null) {
                badc = badc.d;
            }
            anyd anyd = badc.c;
            parse = Uri.parse((String) anyd.get((anyd.indexOf(badc.b) + 1) % anyd.size()));
        } else {
            parse = null;
        }
        if (parse != null) {
            this.g.t().a(3, new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
            this.c.execute(new giz(this, parse, bacz));
            return;
        }
        afpc.a(2, afpf.reels, "VideoFX: Static Sticker added without valid uri");
        this.b.a((bacy) ((anxo) bacz.toBuilder()));
    }

    public static String a(Uri uri) {
        return zjz.a(uri.getLastPathSegment());
    }
}
