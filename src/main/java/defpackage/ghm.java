package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ghm */
public final class ghm implements gjs, zqo {
    public static final amur n = amur.a(bach.LOCATION_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), bach.LOCATION_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final bach o = bach.LOCATION_NORMAL;
    public final zqs a;
    public final Activity b;
    public final gjv c;
    public final boolean d;
    public final gim e;
    public alak f;
    public gha g;
    public LocationSearchView h;
    public zqm i;
    public nf j;
    public acvx k;
    public axak l;
    public boolean m;
    private final gkt p;
    private final gia q;
    private final zkw r;

    public ghm(zqs zqs, Activity activity, gjv gjv, zzl zzl, gia gia, gkt gkt, zkw zkw, gim gim) {
        this.a = zqs;
        this.b = activity;
        this.c = gjv;
        this.q = gia;
        this.p = gkt;
        this.r = zkw;
        this.e = gim;
        boolean z = false;
        if (zzl.b() != null) {
            aujp aujp = zzl.b().c;
            if (aujp == null) {
                aujp = aujp.C;
            }
            if (aujp.l) {
                z = true;
            }
        }
        this.d = z;
    }

    public final void a() {
        this.h.setVisibility(8);
    }

    public final void a(zrb zrb) {
        this.q.a(this.l);
        this.h.setVisibility(8);
        this.g.a();
        if (this.p.a()) {
            this.k.b(new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
        }
        bacd bacd = (bacd) baca.f.createBuilder();
        ArrayList<bach> arrayList = new ArrayList();
        arrayList.add(bach.LOCATION_NORMAL);
        if (this.p.a()) {
            arrayList.add(bach.LOCATION_LIGHT);
        }
        bace bace = (bace) bacc.e.createBuilder();
        bace.copyOnWrite();
        bacc bacc = (bacc) bace.instance;
        if (!bacc.c.a()) {
            bacc.c = anxl.mutableCopy(bacc.c);
        }
        for (bach bach : arrayList) {
            bacc.c.d(bach.d);
        }
        bace.a(o);
        bacd.a(bace);
        bacy bacy = (bacy) bacz.g.createBuilder();
        bacw bacw = (bacw) bacx.e.createBuilder();
        bacw.a(this.m);
        bacw.a(bacd);
        bacy.a(bacw);
        a(zrb, o, bacy, true);
    }

    private final void a(zrb zrb, bach bach, bacy bacy, boolean z) {
        bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
        bacx b = bacy.b();
        bacd bacd = (bacd) ((anxo) (b.b == 3 ? (baca) b.c : baca.f).toBuilder());
        String str = zrb.a;
        bacd.copyOnWrite();
        baca baca = (baca) bacd.instance;
        if (str != null) {
            baca.a |= 2;
            baca.c = str;
            str = zrb.b;
            bacd.copyOnWrite();
            baca = (baca) bacd.instance;
            if (str != null) {
                baca.a |= 4;
                baca.d = str;
                bacx b2 = bacy.b();
                anxl anxl = (b2.b == 3 ? (baca) b2.c : baca.f).e;
                if (anxl == null) {
                    anxl = bacc.e;
                }
                bace bace = (bace) ((anxo) anxl.toBuilder());
                bace.a(bach);
                bacd.a(bace);
                bacw.a(bacd);
                bacy.a(bacw);
                String str2 = zrb.b;
                View inflate = LayoutInflater.from(new ContextThemeWrapper(this.b, ((Integer) n.get(bach)).intValue())).inflate(R.layout.location_sticker, new FrameLayout(this.b));
                ((TextView) inflate.findViewById(R.id.text)).setText(str2);
                gjl.a(this.b, this.r, inflate, bacy, new ghl(this, z));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(bacz bacz) {
        this.k.a(3, new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        bacx bacx = bacz.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        baca baca = bacx.b == 3 ? (baca) bacx.c : baca.f;
        zrb zrb = new zrb(baca.c, baca.d);
        bacc bacc = baca.e;
        if (bacc == null) {
            bacc = bacc.e;
        }
        anyc anyc = new anyc(bacc.c, bacc.d);
        bacc bacc2 = baca.e;
        if (bacc2 == null) {
            bacc2 = bacc.e;
        }
        Object a = bach.a(bacc2.b);
        if (a == null) {
            a = bach.LOCATION_STYLE_UNSPECIFIED;
        }
        a(zrb, (bach) gih.a(anyc, a), (bacy) ((anxo) bacz.toBuilder()), false);
    }

    public final void b() {
        this.h.setVisibility(0);
        this.i.a();
    }

    /* Access modifiers changed, original: final */
    public final alak c() {
        return new alak(alan.a(this.j), this.k, Arrays.asList(new alad[]{new alad(3, acwc.REEL_APPROVE_LOCATION_BUTTON, acwc.REEL_DENY_LOCATION_BUTTON)}), R.string.reel_permission_open_settings_location, R.string.reel_permissions_missing_location, new gho(this));
    }
}
