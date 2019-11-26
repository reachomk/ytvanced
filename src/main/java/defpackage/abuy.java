package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.design.tabs.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SuperStickerPackRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abuy */
public final class abuy implements abrv, jx {
    public final anm a;
    public final ViewGroup b;
    public final akpk c;
    public boolean d;
    private final Context e;
    private final akvz f;
    private final akpe g;
    private final acvx h;
    private final aaas i;
    private final aklt j;
    private final int k;
    private final Map l = new HashMap();
    private axyq m;
    private final TabLayout n;
    private final RecyclerView o;
    private apk p;

    public abuy(Context context, acwa acwa, akvz akvz, akpe akpe, aaas aaas, aklt aklt, abrs abrs) {
        this.e = context;
        this.h = acwa.t();
        this.f = akvz;
        this.g = akpe;
        this.i = aaas;
        this.j = aklt;
        akvz.a(axyu.class);
        akvz.a(axyr.class);
        abrs.a = this;
        this.b = (ViewGroup) View.inflate(context, R.layout.live_chat_sticker_purchase_content, null);
        this.n = (TabLayout) this.b.findViewById(R.id.sticker_sets);
        this.n.a((jx) this);
        this.o = (RecyclerView) this.b.findViewById(R.id.sticker_grid);
        this.c = new akpk();
        this.k = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_sticker_tab_icon_size);
        this.a = new anm(context, 3);
    }

    public final void a() {
    }

    public final void a(axyq axyq) {
        Object obj;
        int i;
        this.m = axyq;
        this.o.removeAllViews();
        apk apk = this.p;
        if (apk != null) {
            this.o.b(apk);
        }
        this.n.d();
        this.l.clear();
        this.c.clear();
        List a = amvj.a(axyq.f, new abvb());
        SharedPreferences a2 = xly.a(this.e);
        if (a.contains(axyq.h)) {
            obj = axyq.h;
        } else {
            obj = a2.getString("default_sticker_pack_id", "");
        }
        if (axyq.e.size() == 0) {
            i = 0;
        } else {
            if (!a.contains(obj) && axyq.e.size() > 0) {
                obj = ((axyw) ajzv.a(ajzv.a((axak) axyq.f.get(0)), axyw.class)).b;
            }
            i = 0;
            for (int i2 = 0; i2 < axyq.e.size(); i2++) {
                axys axys = (axys) ajzv.a(ajzv.a((axak) axyq.e.get(i2)), axys.class);
                axyw axyw = (axyw) ajzv.a(ajzv.a((axak) axyq.f.get(i2)), axyw.class);
                if (axys != null) {
                    int i3 = axys.a;
                    if (!((i3 & 8) == 0 || (i3 & 4) == 0)) {
                        boolean z;
                        int i4;
                        ka a3 = this.n.a();
                        a3.a(ra.a(this.e, (int) R.drawable.live_chat_sticker_grey_preload_drawable));
                        this.n.a(a3);
                        if (axyw.b.equals(obj)) {
                            a3.a();
                            z = true;
                            i4 = i2;
                        } else {
                            i4 = i;
                            z = false;
                        }
                        a(axys, a3, z);
                        i = i4;
                    }
                }
            }
        }
        apa a4 = this.g.a((akpb) this.f.get());
        if (axyq.f.size() != 0) {
            a((axyw) ajzv.a(ajzv.a((axak) axyq.f.get(i)), axyw.class));
        } else {
            xtl.d("No items found in pack.");
        }
        this.o.a(a4);
        this.o.a(this.a);
        this.p = new abvd(this, this.e.getResources().getDimensionPixelSize(R.dimen.live_chat_sticker_item_padding), this.e.getResources().getDimensionPixelSize(R.dimen.live_chat_bottom_sticker_item_padding));
        this.o.a(this.p);
        this.a.b = new abva(this);
        a4.a(this.c);
        this.h.b(new acvs(axyq.i));
    }

    public final void a(String str) {
        if (str != null && this.m.f.size() != 0) {
            for (axak a : this.m.f) {
                axyw axyw = (axyw) ajzv.a(ajzv.a(a), axyw.class);
                if (axyw != null && (axyw.a & 1) != 0 && axyw.b.equals(str)) {
                    a(axyw);
                    anm anm = this.a;
                    if (anm != null) {
                        anm.e(0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void a(axys axys, ka kaVar, boolean z) {
        aygk aygk;
        aygk aygk2;
        cgu cgu = (absd) this.l.get(kaVar);
        if (cgu == null) {
            int i = this.k;
            cgu = new absd(kaVar, i, i, new abvc(kaVar, axys));
            this.l.put(kaVar, cgu);
        }
        if (z) {
            aygk = axys.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygk2 = axys.d;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        } else {
            aygk = axys.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygk2 = axys.c;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        }
        aklt aklt = this.j;
        int i2 = this.k;
        aklt.a(aygk2, i2, i2);
        this.j.a(cgu, this.b.getContext(), aygk, null);
        aodx aodx = aygk.d;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) != 0) {
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            kaVar.a(aodv.b);
        }
    }

    private final void a(axyw axyw) {
        if (axyw != null && axyw.c.size() != 0) {
            anxp anxp = axyw.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(SuperStickerPackRendererOuterClass.superStickerPackBackstoryRenderer);
            anxp.a(access$000);
            this.d = anxp.h.a(access$000.d);
            Collection arrayList = new ArrayList();
            for (axak axak : axyw.c) {
                anxr access$0002 = anxl.checkIsLite(SuperStickerPackRendererOuterClass.superStickerPackItemButtonRenderer);
                axak.a(access$0002);
                if (axak.h.a(access$0002.d)) {
                    access$0002 = anxl.checkIsLite(SuperStickerPackRendererOuterClass.superStickerPackItemButtonRenderer);
                    axak.a(access$0002);
                    Object b = axak.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    arrayList.add((axyu) b);
                }
            }
            if (!arrayList.isEmpty()) {
                this.c.a(arrayList);
            }
            if (this.d) {
                akpk akpk = this.c;
                anxp anxp2 = axyw.d;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$000 = anxl.checkIsLite(SuperStickerPackRendererOuterClass.superStickerPackBackstoryRenderer);
                anxp2.a(access$000);
                Object b2 = anxp2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                akpk.add(b2);
            }
        }
    }

    public final void a(ka kaVar) {
        Editor edit = xly.a(this.e).edit();
        axyq axyq = this.m;
        String str = "default_sticker_pack_id";
        edit.putString(str, ((axyw) ajzv.a(ajzv.a((axak) axyq.f.get(kaVar.e)), axyw.class)).b).apply();
        Object obj = kaVar.a;
        if (obj instanceof axys) {
            axys axys = (axys) obj;
            a(axys, kaVar, true);
            if ((axys.a & 2) != 0) {
                aaas aaas = this.i;
                apxu apxu = axys.b;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    public final void b(ka kaVar) {
        Object obj = kaVar.a;
        if (obj instanceof axys) {
            a((axys) obj, kaVar, false);
        }
    }
}
