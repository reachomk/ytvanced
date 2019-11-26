package defpackage;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: giv */
public final class giv implements gjs, grd {
    public static final amur m = amur.a(baaz.CHANNEL_MENTION_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), baaz.CHANNEL_MENTION_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final baaz n = baaz.CHANNEL_MENTION_NORMAL;
    public final grc a;
    public final Activity b;
    public final gjv c;
    public final zkw d;
    public final gim e;
    public gha f;
    public ViewGroup g;
    public gqy h;
    public axak i;
    public boolean j;
    public apxu k;
    public gaz l;
    private final akkq o;
    private final gia p;
    private final gkt q;
    private final acwa r;

    public giv(grc grc, Activity activity, akkq akkq, gkt gkt, gjv gjv, gia gia, zkw zkw, gim gim, acwa acwa) {
        this.a = grc;
        this.b = activity;
        this.o = akkq;
        this.q = gkt;
        this.c = gjv;
        this.p = gia;
        this.d = zkw;
        this.e = gim;
        this.r = acwa;
    }

    public final void a() {
        b();
    }

    public final void a(aywd aywd) {
        this.p.a(this.i);
        b();
        this.f.a();
        bacy bacy = (bacy) bacz.g.createBuilder();
        baav baav = (baav) baas.f.createBuilder();
        String str = aywd.c;
        baav.copyOnWrite();
        baas baas = (baas) baav.instance;
        if (str != null) {
            baas.a |= 2;
            baas.c = str;
            if ((aywd.a & 4) != 0) {
                aygk aygk = aywd.d;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                str = aklb.e(aygk).toString();
                baav.copyOnWrite();
                baas = (baas) baav.instance;
                if (str != null) {
                    baas.a |= 4;
                    baas.d = str;
                } else {
                    throw new NullPointerException();
                }
            }
            ArrayList<baaz> arrayList = new ArrayList();
            arrayList.add(baaz.CHANNEL_MENTION_NORMAL);
            if (this.q.a()) {
                arrayList.add(baaz.CHANNEL_MENTION_LIGHT);
            }
            baaw baaw = (baaw) baau.e.createBuilder();
            baaw.copyOnWrite();
            baau baau = (baau) baaw.instance;
            if (!baau.c.a()) {
                baau.c = anxl.mutableCopy(baau.c);
            }
            for (baaz baaz : arrayList) {
                baau.c.d(baaz.d);
            }
            baaw.a(n);
            baav.a(baaw);
            bacw bacw = (bacw) bacx.e.createBuilder();
            bacw.a(this.j);
            bacw.a(baav);
            bacy.a(bacw);
            babx babx = (babx) babu.c.createBuilder();
            String str2 = aywd.b;
            babx.copyOnWrite();
            babu babu = (babu) babx.instance;
            if (str2 != null) {
                babu.a |= 1;
                babu.b = str2;
                babu babu2 = (babu) ((anxl) babx.build());
                babv babv = (babv) babs.f.createBuilder();
                babv.copyOnWrite();
                babs babs = (babs) babv.instance;
                babs.a |= 1;
                babs.d = 1;
                babv.copyOnWrite();
                babs = (babs) babv.instance;
                if (babu2 != null) {
                    babs.c = babu2;
                    babs.b = 2;
                    bacb bacb = (bacb) baby.c.createBuilder();
                    float[] fArr = new float[9];
                    new Matrix().getValues(fArr);
                    aodc aodc = (aodc) aocz.f.createBuilder();
                    aodc.a();
                    aodc.b();
                    aodc.a(2);
                    for (int i = 0; i < 9; i++) {
                        aodc.a(fArr[i]);
                    }
                    aocz aocz = (aocz) ((anxl) aodc.build());
                    bacb.copyOnWrite();
                    baby baby = (baby) bacb.instance;
                    if (aocz != null) {
                        baby.b = aocz;
                        baby.a = 1;
                        babv.copyOnWrite();
                        babs = (babs) babv.instance;
                        if (!babs.e.a()) {
                            babs.e = anxl.mutableCopy(babs.e);
                        }
                        babs.e.add((baby) ((anxl) bacb.build()));
                        babs babs2 = (babs) ((anxl) babv.build());
                        bacy.copyOnWrite();
                        bacz bacz = (bacz) bacy.instance;
                        if (babs2 != null) {
                            if (!bacz.f.a()) {
                                bacz.f = anxl.mutableCopy(bacz.f);
                            }
                            bacz.f.add(babs2);
                            a(bacy, n, true);
                            if (this.q.a()) {
                                this.r.t().b(new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void b() {
        this.l.a();
        this.g.setVisibility(8);
    }

    public final void a(bacz bacz) {
        baas baas;
        this.r.t().a(3, new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        bacx bacx = bacz.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        if (bacx.b == 6) {
            baas = (baas) bacx.c;
        } else {
            baas = baas.f;
        }
        baau baau = baas.e;
        if (baau == null) {
            baau = baau.e;
        }
        anyc anyc = new anyc(baau.c, baau.d);
        Object a = baaz.a(baau.b);
        if (a == null) {
            a = baaz.CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        a((bacy) ((anxo) bacz.toBuilder()), (baaz) gih.a(anyc, a), false);
    }

    private final void a(bacy bacy, baaz baaz, boolean z) {
        baas baas;
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.b, ((Integer) m.get(baaz)).intValue())).inflate(R.layout.user_mention_sticker, new FrameLayout(this.b));
        bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
        bacx b = bacy.b();
        baav baav = (baav) ((anxo) (b.b == 6 ? (baas) b.c : baas.f).toBuilder());
        bacx b2 = bacy.b();
        anxl anxl = (b2.b == 6 ? (baas) b2.c : baas.f).e;
        if (anxl == null) {
            anxl = baau.e;
        }
        baaw baaw = (baaw) ((anxo) anxl.toBuilder());
        baaw.a(baaz);
        baav.a(baaw);
        bacw.a(baav);
        bacy.a(bacw);
        bacx b3 = bacy.b();
        if (b3.b == 6) {
            baas = (baas) b3.c;
        } else {
            baas = baas.f;
        }
        ((TextView) inflate.findViewById(R.id.text)).setText(baas.c);
        this.o.b(xvt.d(baas.d), new gix(this, (ImageView) inflate.findViewById(R.id.icon), inflate, bacy, new giu(this, z)));
    }

    public final void a(ImageView imageView) {
        st.a(imageView.getDrawable(), this.b.getColor(R.color.yt_dark_blue));
    }
}
