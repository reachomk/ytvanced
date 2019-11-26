package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vke */
public final class vke implements vlr, vlu {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final Map g = new HashMap();
    private String h;
    private vpd i;

    public vke(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    private final void a(vkg vkg, String str) {
        if (!TextUtils.equals(this.h, str)) {
            this.h = str;
            this.i = null;
            int i = 0;
            int i2 = 0;
            while (i2 < vkg.b.b.size()) {
                vso vso = (vso) vkg.b.b.get(i2);
                if ((vso instanceof vrc) || (vso instanceof vrj) || !TextUtils.equals(str, vso.j)) {
                    i2++;
                } else {
                    xci xci = (xci) this.d.get();
                    vse vse = new vse(vso);
                    vsm e = vkg.b.a.e();
                    aakj aakj = vkg.a.f;
                    vrh vrh = vkg.d;
                    if (vrh == null) {
                        vrh = vrh.g;
                    }
                    vrh vrh2 = vrh;
                    List<vso> list = vkg.b.b;
                    ArrayList arrayList = new ArrayList();
                    for (vso vso2 : list) {
                        if (vso2 instanceof vtk) {
                            arrayList.add((vtk) vso2);
                        }
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size > i2) {
                            i += ((vtk) arrayList.get(size)).f() * 1000;
                        } else {
                            this.i = new vpd(xci, vse, e, aakj, vrh2, vrd.a(i2 + 1, arrayList.size(), i));
                            return;
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void a(vss vss) {
        this.g.remove(((vst) vss).a);
    }

    public final /* synthetic */ void b(vss vss, vsj vsj) {
        vst vst = (vst) vss;
        vsq vsq = (vsq) vsj;
        if (vsq instanceof vso) {
            vkg vkg = (vkg) this.g.get(vst.a);
            if (vkg == null) {
                ((vlo) this.a.get()).a(vst, new vly("Unrecognized layout for slot"));
                return;
            }
            try {
                ((waq) this.f.get()).a(4);
                vso vso = (vso) vsq;
                if (vkg.c == null) {
                    for (int i = 0; i < vkg.b.b.size(); i++) {
                        vso vso2 = (vso) vkg.b.b.get(i);
                        if (amqq.a(vso2, vso)) {
                            vso vso3;
                            vkg.c = vso2;
                            if (i == 0) {
                                ((waw) this.c.get()).a(vkg.b.a);
                            }
                            waw waw = (waw) this.c.get();
                            String str = vst.d;
                            vqy vqy = vkg.b.a;
                            if (vsq instanceof vrj) {
                                vso3 = ((vrj) vsq).b;
                            } else {
                                vso3 = (vso) vsq;
                            }
                            waw.a(str, vqy, vso3);
                            return;
                        }
                    }
                    throw new vkj();
                }
                throw new vkj();
            } catch (vkj e) {
                ((vlo) this.a.get()).a(vst, new vly(e.toString()));
                return;
            }
        }
        ((vlo) this.a.get()).a(vst, new vly("Invalid layout type"));
    }

    public final /* synthetic */ void a() {
        ((xci) this.d.get()).d(new vps());
    }
}
