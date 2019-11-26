package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: kka */
public final class kka extends jxf implements OnLongClickListener, xcp {
    private final xci e;
    private final kzb f;
    private final xhv g;
    private final Set h;
    private final kzl i;
    private final SharedPreferences j;

    public kka(aaas aaas, akvp akvp, Context context, xci xci, kzb kzb, xhv xhv, SharedPreferences sharedPreferences, ViewGroup viewGroup) {
        this(aaas, akvp, context, xci, kzb, xhv, sharedPreferences, viewGroup, R.layout.slim_metadata_button, null);
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        return R.color.slim_meta_data_toggle_button_selected_nonchanging;
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        return R.color.slim_meta_data_toggle_button_nonchanging;
    }

    public kka(aaas aaas, akvp akvp, Context context, xci xci, kzb kzb, xhv xhv, SharedPreferences sharedPreferences, ViewGroup viewGroup, int i, kld kld) {
        super(aaas, akvp, context, viewGroup, i, kld);
        this.e = xci;
        this.f = kzb;
        this.g = xhv;
        this.j = sharedPreferences;
        this.i = new kkd(this);
        this.h = new zl();
    }

    public final void a() {
        super.a();
        this.h.clear();
        this.e.b(this);
        kzb kzb = this.f;
        kzb.j.remove(this.i);
    }

    public final void a(axpa axpa) {
        super.a(axpa);
        if ((axpa.a & 1) != 0) {
            this.b.setOnLongClickListener(this);
        }
        this.e.a((Object) this);
        kzb kzb = this.f;
        kzb.j.add(this.i);
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A:{SYNTHETIC, RETURN} */
    public final void onClick(android.view.View r4) {
        /*
        r3 = this;
        r4 = r3.c();
        if (r4 == 0) goto L_0x0019;
    L_0x0006:
        r4 = r3.j;
        r4 = r4.edit();
        r0 = r3.i();
        r1 = "add_to_long_press_hint_trigger_video_id";
        r4 = r4.putString(r1, r0);
        r4.apply();
    L_0x0019:
        r4 = r3.g;
        r4 = r4.c();
        if (r4 == 0) goto L_0x002b;
    L_0x0021:
        r4 = r3.c();
        if (r4 != 0) goto L_0x002b;
    L_0x0027:
        r4 = 1;
        r3.a(r4);
    L_0x002b:
        r4 = r3.c();
        r0 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (r4 != 0) goto L_0x0042;
    L_0x0033:
        r4 = r3.c;
        r1 = r4.a;
        r1 = r1 & 512;
        if (r1 == 0) goto L_0x005d;
    L_0x003b:
        r4 = r4.h;
        if (r4 != 0) goto L_0x0050;
    L_0x003f:
        r4 = defpackage.apxu.d;
        goto L_0x0050;
    L_0x0042:
        r4 = r3.c;
        r1 = r4.a;
        r1 = r1 & 16384;
        if (r1 == 0) goto L_0x005d;
    L_0x004a:
        r4 = r4.m;
        if (r4 != 0) goto L_0x0050;
    L_0x004e:
        r4 = defpackage.apxu.d;
    L_0x0050:
        r1 = new java.util.HashMap;
        r1.<init>();
        r1.put(r0, r3);
        r2 = r3.a;
        r2.a(r4, r1);
    L_0x005d:
        r4 = r3.c;
        r1 = r4.a;
        r1 = r1 & 1024;
        if (r1 == 0) goto L_0x0078;
    L_0x0065:
        r4 = r4.i;
        if (r4 != 0) goto L_0x006b;
    L_0x0069:
        r4 = defpackage.apxu.d;
    L_0x006b:
        r1 = new java.util.HashMap;
        r1.<init>();
        r1.put(r0, r3);
        r0 = r3.a;
        r0.a(r4, r1);
    L_0x0078:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kka.onClick(android.view.View):void");
    }

    public final boolean onLongClick(View view) {
        if ((((axpa) this.d).a & 1) == 0) {
            return false;
        }
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        aaas aaas = this.a;
        apxu apxu = ((axpa) this.d).b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
        return true;
    }

    private final boolean a(String str) {
        return TextUtils.equals(i(), str);
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c.b;
    }

    private final void a(boolean z) {
        aphv aphv = this.c;
        if (aphv.b != z) {
            aphy aphy = (aphy) ((anxo) aphv.toBuilder());
            aphy.a(z);
            this.c = (aphv) ((anxl) aphy.build());
            d();
        }
    }

    private final String i() {
        anxp anxp = ((axpa) this.d).b;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint);
        anxp.a(access$000);
        if (!anxp.h.a(access$000.d)) {
            return null;
        }
        anxp = ((axpa) this.d).b;
        if (anxp == null) {
            anxp = apxu.d;
        }
        access$000 = anxl.checkIsLite(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) b).b;
    }

    public final void g() {
        this.h.clear();
        a(false);
    }

    public final aruh h() {
        Object obj = this.d;
        if (obj != null) {
            aphj aphj = ((axpa) obj).c;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphv aphv = aphj.c;
            if (aphv == null) {
                aphv = aphv.s;
            }
            apht apht = aphv.g;
            if (apht == null) {
                apht = apht.c;
            }
            if (apht.a == 102716411) {
                aruh aruh;
                aphj = ((axpa) this.d).c;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphv = aphj.c;
                if (aphv == null) {
                    aphv = aphv.s;
                }
                apht = aphv.g;
                if (apht == null) {
                    apht = apht.c;
                }
                if (apht.a == 102716411) {
                    aruh = (aruh) apht.b;
                } else {
                    aruh = aruh.j;
                }
                return aruh;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ aphv b(Object obj) {
        aphj aphj = ((axpa) obj).c;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphv aphv = aphj.c;
        return aphv == null ? aphv.s : aphv;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{lbr.class, abgk.class, abgn.class, abgo.class};
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    abgn abgn = (abgn) obj;
                    if (a(abgn.b)) {
                        this.h.add(abgn.a);
                        a(this.h.isEmpty() ^ 1);
                        return null;
                    }
                } else if (i == 3) {
                    abgo abgo = (abgo) obj;
                    if (a(abgo.d)) {
                        this.h.remove(abgo.a);
                        a(this.h.isEmpty() ^ 1);
                        return null;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("unsupported op code: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else if (a(((abgk) obj).a)) {
                a(this.h.isEmpty() ^ 1);
                return null;
            }
        } else if (a(((lbr) obj).a)) {
            g();
            return null;
        }
        return clsArr;
    }
}
