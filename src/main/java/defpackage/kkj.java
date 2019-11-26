package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* renamed from: kkj */
public final class kkj {
    private final List a = new ArrayList();
    private final ViewGroup b;
    private final boolean c;
    private final bcaa d;
    private final aizy e;
    private final agwc f;
    private final kki g;
    private boolean h;

    public kkj(ViewGroup viewGroup, boolean z, bcaa bcaa, aizy aizy, agwc agwc, kke kke, kkq kkq, kkm kkm, kle kle, kkc kkc) {
        this.b = viewGroup;
        this.c = z;
        this.d = bcaa;
        this.e = aizy;
        this.f = agwc;
        kki kki = new kki(viewGroup);
        kki.a(1, kke);
        kki.a(2, kkq);
        kki.a(3, kkm);
        kki.a(4, kkm);
        kki.a(5, kle);
        kki.a(6, kkc);
        this.g = kki;
        this.h = true;
    }

    public final void a() {
        boolean z = false;
        if (this.h) {
            this.b.removeAllViews();
            this.h = true;
            for (Pair pair : this.a) {
                this.b.addView(((kkg) pair.second).b());
            }
            this.h = false;
        }
        View view = this.b;
        if (view.getChildCount() > 0) {
            z = true;
        }
        xpr.a(view, z);
    }

    public final View b() {
        for (Pair pair : this.a) {
            if (((Integer) pair.first).intValue() == 2) {
                return ((kkg) pair.second).b();
            }
        }
        return null;
    }

    public final kka c() {
        for (Pair pair : this.a) {
            if (((Integer) pair.first).intValue() == 6) {
                return (kka) pair.second;
            }
        }
        return null;
    }

    public final View d() {
        kka c = c();
        return c != null ? c.b : null;
    }

    public final void a(Object obj, String str, akor akor) {
        boolean z;
        int i = 0;
        kkf kkf = null;
        if (obj instanceof axpc) {
            obj = (axpc) obj;
            if (obj.b) {
                agqy a = a(str);
                aizy aizy = this.e;
                Object obj2 = ((a == null || a.t()) && elq.c(aizy) == null && kkp.a(aizy) == null) ? null : 1;
                if (this.c || obj2 != null) {
                    ayet ayet;
                    ColorStateList colorStateList;
                    Context context;
                    ColorStateList colorStateList2;
                    kkp kkp = (kkp) this.g.a(2);
                    Object obj3 = (acvx) this.d.get();
                    kkp.p = str;
                    kkp.o = (axpc) amqw.a(obj);
                    kkp.n = (acvx) amqw.a(obj3);
                    aphj aphj = obj.e;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    amqw.b((aphj.a & 1) != 0);
                    aphj = obj.e;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    kkp.q = aphg;
                    kkp.a.c = str;
                    aphj aphj2 = obj.e;
                    if (aphj2 == null) {
                        aphj2 = aphj.d;
                    }
                    aphg aphg2 = aphj2.b;
                    if (aphg2 == null) {
                        aphg2 = aphg.s;
                    }
                    z = (aphg2.f || obj2 == null) ? false : true;
                    kkp.e.setAlpha(!z ? 0.5f : 1.0f);
                    kkp.e.setOnClickListener(z ? kkp.k : null);
                    kkp.e.setClickable(z);
                    kkp.g.setClickable(z);
                    kkp.c.a(kkp.a);
                    aphg2 = kkp.a(kkp.i);
                    if (aphg2 != null && aphg2.b == 20) {
                        ayet = (ayet) aphg2.c;
                    } else {
                        aphg2 = kkp.q;
                        ayet = aphg2.b == 20 ? (ayet) aphg2.c : null;
                    }
                    if (ayet == null || (ayet.a & 1) == 0) {
                        colorStateList = kkp.l;
                    } else {
                        context = kkp.b;
                        ayem a2 = ayem.a(ayet.b);
                        if (a2 == null) {
                            a2 = ayem.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList = ColorStateList.valueOf(alay.a(context, a2));
                    }
                    kkp.f.setTextColor(colorStateList);
                    if (ayet == null || (ayet.a & 2) == 0) {
                        colorStateList2 = kkp.m;
                    } else {
                        context = kkp.b;
                        ayem a3 = ayem.a(ayet.c);
                        if (a3 == null) {
                            a3 = ayem.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList2 = ColorStateList.valueOf(alay.a(context, a3));
                    }
                    OfflineArrowView offlineArrowView = kkp.g;
                    offlineArrowView.e = colorStateList2;
                    offlineArrowView.a(offlineArrowView.d, true);
                    aphg2 = kkp.a(kkp.i);
                    if (aphg2 != null) {
                        hia hia = kkp.a;
                        hia.b = aphg2;
                        hia.a = null;
                    } else {
                        kkp.a.a(elq.c(kkp.i));
                    }
                    if (kkp.a(kkp.i) != null) {
                        kkp.a(kkp.c());
                    } else {
                        agqy c = kkp.c();
                        kkp.a(c, elq.c(kkp.i));
                        kkp.b(c);
                    }
                    kkp.f.setImportantForAccessibility(2);
                    kkp.e.setId(R.id.offline_button);
                    if (kkp.e.getVisibility() == 0) {
                        aphg2 = kkp.q;
                        if (aphg2 != null) {
                            kkp.j.a(aphg2, kkp.e);
                        }
                    }
                    this.a.add(Pair.create(Integer.valueOf(2), kkp));
                    kkf = kkp;
                }
            } else {
                kkf = (kkf) this.g.a(1);
                kkf.a(obj, (acvx) this.d.get(), akor);
                this.a.add(Pair.create(Integer.valueOf(1), kkf));
            }
        } else if (obj instanceof axpi) {
            axpi axpi = (axpi) obj;
            int i2 = !axpi.b ? axpi.c ? 4 : 5 : 3;
            kkf = (jxf) this.g.a(i2);
            kkf.a(axpi);
            this.a.add(Pair.create(Integer.valueOf(i2), kkf));
        } else if (obj instanceof axpa) {
            kkf = (kka) this.g.a(6);
            kkf.a((axpa) obj);
            this.a.add(Pair.create(Integer.valueOf(6), kkf));
        }
        z = this.h;
        if (kkf != null) {
            i = 1;
        }
        this.h = z | i;
    }

    public final agqy a(String str) {
        return !TextUtils.isEmpty(str) ? this.f.b().k().a(str) : null;
    }

    public final void e() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Pair pair = (Pair) this.a.get(size);
                kki kki = this.g;
                int intValue = ((Integer) pair.first).intValue();
                kkg kkg = (kkg) pair.second;
                kkg.a();
                kki.b.removeView(kkg.b());
                ((Deque) kki.a.get(intValue)).offerLast(kkg);
            } else {
                this.a.clear();
                return;
            }
        }
    }
}
