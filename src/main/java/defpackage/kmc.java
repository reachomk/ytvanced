package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: kmc */
public final class kmc implements exw {
    private akyy A;
    private akyy B;
    private final Map C;
    private RecyclerView D;
    private akpb E;
    public final eif a;
    public int b;
    public boolean c = false;
    public boolean d = false;
    public LoadingFrameLayout e;
    public View f;
    public final Set g;
    public final Map h;
    public kly i;
    private final Activity j;
    private final bcaa k;
    private final bcaa l;
    private final kmd m;
    private final xoi n;
    private final fga o;
    private final int p;
    private final int q;
    private final int r;
    private final akpe s;
    private kml t;
    private kml u;
    private int v;
    private boolean w;
    private ViewGroup x;
    private akpk y;
    private anm z;

    public kmc(Activity activity, exu exu, bcaa bcaa, bcaa bcaa2, eif eif, kmd kmd, akpe akpe, fga fga, xoi xoi) {
        this.j = (Activity) amqw.a((Object) activity);
        this.k = (bcaa) amqw.a((Object) bcaa);
        this.l = (bcaa) amqw.a((Object) bcaa2);
        this.a = (eif) amqw.a((Object) eif);
        this.m = (kmd) amqw.a((Object) kmd);
        this.s = (akpe) amqw.a((Object) akpe);
        this.o = (fga) amqw.a((Object) fga);
        this.n = (xoi) amqw.a((Object) xoi);
        exu.a((exw) this);
        this.g = new HashSet();
        this.C = new HashMap();
        this.h = new HashMap();
        exu.a((exw) this);
        this.p = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_gap_between_buttons);
        this.q = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_empty_space);
        this.r = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_after_button_gap_width);
    }

    public final void a() {
        this.x = xro.a(this.j);
        this.f = LayoutInflater.from(this.j).inflate(R.layout.topic_picker, this.x, false);
        this.f.setVisibility(8);
        this.e = (LoadingFrameLayout) this.f.findViewById(R.id.topic_picker_loading_layout);
        fna fna = (fna) this.k.get();
        this.A = fna.a((TextView) this.f.findViewById(R.id.finish_button));
        this.A.c = new kmg(this);
        this.B = fna.a((TextView) this.f.findViewById(R.id.dismiss_button));
        this.B.c = new kmf(this);
        this.E = new aknw();
        this.E.a(akbg.class, (akox) this.l.get());
        this.E.a(kmj.class, kme.a);
        this.D = (RecyclerView) this.f.findViewById(R.id.topic_container);
        a(this.j.getResources().getConfiguration().orientation);
        this.D.a(this.z);
    }

    public final void b() {
        this.i = null;
        this.x.removeView(this.f);
        this.f.setVisibility(8);
        this.x.setVisibility(8);
        this.o.b(4);
    }

    public final boolean c() {
        View view = this.f;
        return view != null && view.getVisibility() == 0 && this.x.getVisibility() == 0 && this.f.getParent() == this.x;
    }

    public static boolean a(akbi akbi) {
        return akbi == null || akbi.b.length == 0;
    }

    public final void a(Throwable th) {
        this.e.a(this.n.a(th), true);
    }

    public final void d() {
        this.e.a(this.j.getApplicationContext().getString(R.string.common_error_generic), false);
    }

    public final void e() {
        if (this.f != null && this.x != null) {
            this.o.a(4);
            this.f.bringToFront();
            this.f.setVisibility(0);
            this.x.setVisibility(0);
            this.x.addView(this.f);
        }
    }

    public final void a(akbi akbi, acvx acvx) {
        int i;
        int i2;
        this.C.clear();
        this.g.clear();
        this.h.clear();
        apa a = this.s.a(this.E);
        a.a(new akpk());
        a.a(new kmh(acvx));
        this.y = (akpk) a.c;
        this.D.a(a);
        this.y.add(new kmj(ajqy.a(akbi.a), ajqy.a(akbi.f)));
        for (akbe a2 : akbi.b) {
            akbg a3 = kmc.a(a2);
            if (a3 != null) {
                this.y.add(a3);
                this.C.put(a3.d, a3);
            }
        }
        this.b = akbi.i;
        this.c = akbi.j;
        a(akbi.g);
        kmc.a(this.A, akbi.d, acvx);
        kmc.a(this.B, akbi.c, acvx);
        f();
        boolean z = akbi.h;
        boolean z2 = this.A.f;
        View findViewById = this.f.findViewById(R.id.topic_container_space_before_buttons);
        View findViewById2 = this.f.findViewById(R.id.topic_container_space_between_buttons);
        View findViewById3 = this.f.findViewById(R.id.topic_container_space_after_buttons);
        if (z2) {
            i2 = this.q;
        } else {
            i2 = this.r;
        }
        findViewById3.setLayoutParams(new LayoutParams(i2, -2));
        float f = 0.0f;
        findViewById.setLayoutParams(new LayoutParams(this.q, -2, !z ? 0.0f : 1.0f));
        if (z) {
            i = this.p;
        } else {
            i = this.q;
        }
        if (!z) {
            f = 1.0f;
        }
        findViewById2.setLayoutParams(new LayoutParams(i, -2, f));
        if (!c()) {
            e();
        }
        this.e.b();
        this.i = new kly((aapn) kmd.a((aapn) this.m.a.get(), 1), (acvx) kmd.a(acvx, 2), (kmc) kmd.a(this, 3));
        acvx.a(akbi.e, null);
    }

    public final void a(akbd[] akbdArr) {
        int length = akbdArr.length;
        if (length != 0) {
            int i = 0;
            while (i < length) {
                akbd akbd = akbdArr[i];
                List arrayList = new ArrayList();
                for (akbe a : akbd.d) {
                    akbg a2 = kmc.a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                akbg akbg = (akbg) this.C.get(akbd.b);
                boolean z = akbd.c;
                if (!z || akbg != null) {
                    if (z && akbg.c) {
                        a(akbd.b, arrayList);
                    } else {
                        this.h.put(akbd.b, arrayList);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static akbg a(akbe akbe) {
        return akbe != null ? akbe.a : null;
    }

    private static void a(akyy akyy, aphj aphj, acvx acvx) {
        if (aphj != null) {
            aphg aphg;
            if ((aphj.a & 1) != 0) {
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            } else {
                aphg = null;
            }
            akyy.a(aphg, acvx);
        }
    }

    public final void f() {
        this.A.a(this.g.isEmpty() ^ 1);
    }

    public final apxu a(apxu apxu) {
        if (apxu == null) {
            return apxu;
        }
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return apxu;
        }
        Object obj;
        access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        apgd apgd = (apgd) ((anxo) ((apge) obj).toBuilder());
        amuo j = amul.j();
        j.b(this.g);
        if (apgd.a().a.size() != 0) {
            j.b(apgd.a().a);
        }
        apgl apgl = (apgl) apgm.b.createBuilder();
        amul a = j.a();
        apgl.copyOnWrite();
        apgm apgm = (apgm) apgl.instance;
        if (!apgm.a.a()) {
            apgm.a = anxl.mutableCopy(apgm.a);
        }
        anvf.addAll(a, apgm.a);
        apgd.copyOnWrite();
        apge apge = (apge) apgd.instance;
        apge.g = (apgm) ((anxl) apgl.build());
        apge.a |= 64;
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public final void a(String str, List list) {
        akbg akbg = (akbg) this.C.get(str);
        int indexOf = this.y.indexOf(akbg);
        if (indexOf < 0) {
            xtl.c("Topic not found, could not complete expansion");
            return;
        }
        int i;
        akbg akbg2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            akbg akbg3 = (akbg) it.next();
            akbg2 = (akbg) this.C.get(akbg3.d);
            if (akbg2 == null || !akbg2.hasExtension(akbf.a) || !((Boolean) akbg2.getExtension(akbf.a)).booleanValue()) {
                boolean z;
                if (akbg2 != null) {
                    z = true;
                }
                akbg3.setExtension(akbf.d, Boolean.valueOf(z));
                arrayList.add(akbg3);
            }
        }
        int i2 = this.z.a;
        int intValue = akbg.hasExtension(akbf.e) ? ((Integer) akbg.getExtension(akbf.e)).intValue() : 0;
        int size = arrayList.size();
        if (this.w) {
            int i3 = size % i2;
            int i4 = this.v;
            size = Math.min(size - i3, i4 - (i4 % i2));
        } else {
            size = Math.min(size, this.v);
        }
        List<akbg> subList = arrayList.subList(0, size);
        i2 = this.w ? Math.min(((((indexOf - 1) / i2) + 1) * i2) + 1, this.y.size()) : indexOf + 1;
        intValue++;
        for (akbg akbg22 : subList) {
            String str2 = akbg22.d;
            if (akbg22.hasExtension(akbf.d) && ((Boolean) akbg22.getExtension(akbf.d)).booleanValue()) {
                this.y.remove(this.C.get(str2));
                this.C.remove(str2);
            }
            akbg22.setExtension(akbf.e, Integer.valueOf(intValue));
            this.y.add(i2 + i, akbg22);
            this.C.put(str2, akbg22);
            i++;
        }
        i2 = (i2 + subList.size()) - 1;
        if (this.z.s() < i2) {
            this.D.c(i2);
        }
        akbg.setExtension(akbf.b, Boolean.valueOf(true));
    }

    public final void a(Configuration configuration) {
        a(configuration.orientation);
    }

    private final void a(int i) {
        ann ann;
        int integer = this.j.getResources().getInteger(R.integer.topic_picker_row_span);
        this.j.getResources().getInteger(R.integer.topic_picker_min_number_of_topics_to_expand);
        this.v = this.j.getResources().getInteger(R.integer.topic_picker_max_number_of_topics_to_expand);
        this.w = this.j.getResources().getBoolean(R.bool.topic_picker_maintain_complete_rows_on_expansion);
        if (this.z == null) {
            this.z = new anm(this.j, integer);
        }
        if (i == 2) {
            if (this.u == null) {
                this.u = new kml(integer);
            }
            ann = this.u;
        } else {
            if (this.t == null) {
                this.t = new kml(integer);
            }
            ann = this.t;
        }
        this.z.a(integer);
        this.z.b = ann;
    }
}
