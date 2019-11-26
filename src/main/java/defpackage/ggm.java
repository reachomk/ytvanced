package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ggm */
public final class ggm implements gjs {
    public final Activity a;
    public final gjv b;
    public final ggj c;
    public final gkt d;
    public final acwa e;
    public final zkw f;
    public final gim g;

    public ggm(Activity activity, gjv gjv, ggj ggj, gkt gkt, zkw zkw, gim gim, acwa acwa) {
        this.a = activity;
        this.b = gjv;
        this.c = ggj;
        this.d = gkt;
        this.f = zkw;
        this.g = gim;
        this.e = acwa;
    }

    public final void a(bacz bacz) {
        String str;
        anxl anxl;
        bacx bacx = bacz.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        badp badp = bacx.b == 7 ? (badp) bacx.c : badp.e;
        if ((badp.a & 4) != 0) {
            badr badr = badp.d;
            if (badr == null) {
                badr = badr.d;
            }
            anyd anyd = badr.c;
            str = (String) anyd.get((anyd.indexOf(badr.b) + 1) % anyd.size());
        } else {
            str = badp.c;
        }
        View view = (TextView) LayoutInflater.from(this.a).inflate(R.layout.unicode_emoji_sticker, null);
        view.setText(str);
        this.e.t().a(3, new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        bacx bacx2 = bacz.d;
        if (bacx2 == null) {
            bacx2 = bacx.e;
        }
        anxl anxl2 = (bacx2.b == 7 ? (badp) bacx2.c : badp.e).d;
        if (anxl2 == null) {
            anxl2 = badr.d;
        }
        badq badq = (badq) ((anxo) anxl2.toBuilder());
        badq.a(str);
        badr badr2 = (badr) ((anxl) badq.build());
        bacy bacy = (bacy) ((anxo) bacz.toBuilder());
        anxl anxl3 = bacz.d;
        if (anxl3 == null) {
            anxl3 = bacx.e;
        }
        bacw bacw = (bacw) ((anxo) anxl3.toBuilder());
        bacx bacx3 = bacz.d;
        if (bacx3 == null) {
            bacx3 = bacx.e;
        }
        if (bacx3.b == 7) {
            anxl = (badp) bacx3.c;
        } else {
            anxl = badp.e;
        }
        bado bado = (bado) ((anxo) anxl.toBuilder());
        bado.a(str);
        bado.a(badr2);
        bacw.a(bado);
        bacy.a(bacw);
        gjl.a(this.a, this.f, view, bacy, new ggp(this));
    }
}
