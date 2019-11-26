package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: iup */
public final class iup extends aktw implements xcp {
    public final akpk a;
    public final Handler b;
    public final RecyclerView c;
    public final akxv d;
    public int e = 0;
    private final akoh f;
    private final aknc g;
    private final int h;
    private final int i;
    private final int j;
    private final akpk k;
    private final akpk l;
    private final ist m;
    private final ivy n;
    private final xci o;
    private final akbk p;
    private final Resources q;
    private final akbk r;
    private final Context s;
    private int t = 0;
    private int u = 0;
    private final OnClickListener v;
    private boolean w = false;
    private boolean x = false;

    public iup(Context context, akvz akvz, xci xci, Handler handler, akbk akbk, RecyclerView recyclerView, akxv akxv) {
        int i;
        akvz.a(akbk.class);
        this.s = context;
        this.o = xci;
        this.p = akbk;
        this.b = handler;
        this.q = context.getResources();
        this.r = akbk;
        this.c = recyclerView;
        this.d = akxv;
        xci.a((Object) this);
        this.v = new iuq(this, akbk);
        this.f = new akoh();
        aknh akpk = new akpk();
        this.f.a(akpk);
        azhy azhy = akbk.a;
        if (!(azhy == null && akbk.b == null)) {
            akpk.add(new iux(azhy, akbk.b));
        }
        azhs azhs = akbk.b;
        if (azhs != null && azhs.a == 122710540) {
            this.x = true;
        } else if (azhs != null && azhs.a == 132989167) {
            this.w = ((((axtn) azhs.b).a & 1) ^ 1) != 0;
        }
        this.k = new akpk();
        this.f.a(this.k);
        this.a = new akpk();
        this.g = new aknc(this.a);
        this.f.a(this.g);
        this.j = akbk.d;
        akcc[] akccArr = akbk.c;
        if (akccArr != null) {
            this.i = akccArr.length;
            int i2 = 0;
            i = Integer.MAX_VALUE;
            while (i2 < akbk.c.length) {
                int size = this.a.size();
                if (i2 >= this.j && size < r8) {
                    i = size;
                }
                if (i2 > 0) {
                    this.a.add(new ivy());
                }
                akcc akcc = akbk.c[i2];
                akbz akbz = akcc.b;
                if (akbz != null) {
                    akbw akbw = akbz.a;
                    if (akbw != null) {
                        iup.a(this.a, akbw);
                        i2++;
                    }
                }
                akca akca = akcc.c;
                int intValue;
                if (akca == null || akca.a == null) {
                    akby akby = akcc.d;
                    if (!(akby == null || akby.a == null)) {
                        this.a.add(akby);
                        this.e++;
                        if (akby.a.length > 0) {
                            if (akby.hasExtension(akbx.b) && ((Boolean) akby.getExtension(akbx.b)).booleanValue()) {
                                intValue = akbk.hasExtension(akbj.a) ? ((Integer) akbk.getExtension(akbj.a)).intValue() : 0;
                                iup.a(this.a, akby.a[intValue]);
                                this.u = akby.e;
                                akby.setExtension(akbx.a, Integer.valueOf(intValue));
                            } else {
                                iup.a(this.a, akby.a[akby.e]);
                                this.u = akby.e;
                                akby.setExtension(akbx.a, Integer.valueOf(akby.e));
                            }
                        }
                        this.t = i2;
                    }
                    i2++;
                } else {
                    if (this.x) {
                        this.a.add(epq.a(8));
                    }
                    for (akbw a : akcc.c.a) {
                        iup.a(this.a, a);
                    }
                    i2++;
                }
            }
        } else {
            this.i = 0;
            i = Integer.MAX_VALUE;
        }
        this.h = i;
        this.g.b(i);
        if (i < Integer.MAX_VALUE) {
            this.m = new ist(ajqy.a(akbk.e), this.x);
            this.m.b = this.v;
            this.l = new akpk();
            this.l.add(this.m);
            this.f.a(this.l);
            a(false);
        } else {
            this.m = null;
            this.l = null;
        }
        if (this.w) {
            this.n = new ivy();
            b();
            return;
        }
        this.n = null;
    }

    public final void b() {
        if (this.w) {
            boolean z = true;
            Object obj = (this.r.hasExtension(akbj.b) && ((Boolean) this.r.getExtension(akbj.b)).booleanValue()) ? 1 : null;
            if (this.i != 0 && obj == null && this.j <= 0) {
                z = false;
            }
            if (z == this.k.isEmpty()) {
                if (z) {
                    this.k.add(this.n);
                } else {
                    this.k.clear();
                }
                this.k.a();
            }
        }
    }

    public final void a(boolean z) {
        if (this.m != null) {
            if (z && xrn.c(this.s)) {
                this.d.j().b(new ius(this));
            }
            if (this.r.hasExtension(akbj.b) && ((Boolean) this.r.getExtension(akbj.b)).booleanValue()) {
                this.m.a = 1;
                this.g.b(Integer.MAX_VALUE);
            } else {
                this.m.a = 0;
                this.g.b(this.h);
            }
            this.l.a();
        }
    }

    public final aknh a() {
        return this.f;
    }

    public final void c() {
        this.o.b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a4 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    private static void a(defpackage.akpk r5, defpackage.akbw r6) {
        /*
        r0 = r6.d;
        r1 = 0;
        if (r0 != 0) goto L_0x0036;
    L_0x0005:
        r6 = r6.c;
        if (r6 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x00ca;
    L_0x000b:
        r0 = r6.a;
        r2 = r0.length;
    L_0x000e:
        if (r1 >= r2) goto L_0x00ca;
    L_0x0010:
        r3 = r0[r1];
        r4 = r3.c;
        if (r4 != 0) goto L_0x001d;
    L_0x0016:
        r3 = r3.e;
        if (r3 != 0) goto L_0x001d;
    L_0x001a:
        r1 = r1 + 1;
        goto L_0x000e;
    L_0x001d:
        r0 = r6.c;
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0031;
    L_0x0022:
        r1 = r0.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0031;
    L_0x0028:
        r0 = r0.b;
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        r0 = defpackage.arvh.g;
    L_0x002e:
        r5.add(r0);
    L_0x0031:
        r5.add(r6);
        goto L_0x00ca;
    L_0x0036:
        r6 = r0.c;
        r6 = r6.size();
        if (r1 >= r6) goto L_0x00a7;
    L_0x003e:
        r6 = r0.c;
        r6 = r6.get(r1);
        r6 = (defpackage.azhe) r6;
        r2 = r6.a;
        r3 = 122814739; // 0x7520113 float:1.579896E-34 double:6.06785433E-316;
        if (r2 != r3) goto L_0x006e;
    L_0x004d:
        r2 = r6.b;
        r2 = (defpackage.azhw) r2;
        r5.add(r2);
        r6 = defpackage.iup.a(r6);
        if (r6 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x00a4;
    L_0x005b:
        r6 = r0.c;
        r6 = r6.size();
        r6 = r6 + -1;
        if (r1 >= r6) goto L_0x00a4;
    L_0x0065:
        r6 = new ivy;
        r6.<init>();
        r5.add(r6);
        goto L_0x00a4;
    L_0x006e:
        r4 = 130523099; // 0x7c79fdb float:3.0036147E-34 double:6.4486979E-316;
        if (r2 != r4) goto L_0x00a4;
    L_0x0073:
        r2 = r6.b;
        r2 = (defpackage.axtr) r2;
        r5.add(r2);
        r2 = r6.a;
        if (r2 != r3) goto L_0x0087;
    L_0x007e:
        r6 = r6.b;
        r6 = (defpackage.azhw) r6;
        r6 = r6.a;
    L_0x0084:
        r6 = r6 & 1;
        goto L_0x0090;
    L_0x0087:
        if (r2 != r4) goto L_0x0092;
    L_0x0089:
        r6 = r6.b;
        r6 = (defpackage.axtr) r6;
        r6 = r6.a;
        goto L_0x0084;
    L_0x0090:
        if (r6 != 0) goto L_0x00a4;
    L_0x0092:
        r6 = r0.c;
        r6 = r6.size();
        r6 = r6 + -1;
        if (r1 >= r6) goto L_0x00a4;
    L_0x009c:
        r6 = new ivy;
        r6.<init>();
        r5.add(r6);
    L_0x00a4:
        r1 = r1 + 1;
        goto L_0x0036;
    L_0x00a7:
        r6 = r0.a;
        r1 = r6 & 2;
        if (r1 == 0) goto L_0x00ca;
    L_0x00ad:
        r6 = r6 & 4;
        if (r6 == 0) goto L_0x00ca;
    L_0x00b1:
        r6 = defpackage.iuo.a;
        r5.a(r6);
        r6 = new ivp;
        r1 = r0.e;
        if (r1 != 0) goto L_0x00be;
    L_0x00bc:
        r1 = defpackage.arml.f;
    L_0x00be:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00c4;
    L_0x00c2:
        r0 = defpackage.apxu.d;
    L_0x00c4:
        r6.<init>(r1, r0);
        r5.add(r6);
    L_0x00ca:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iup.a(akpk, akbw):void");
    }

    public static boolean a(azhe azhe) {
        if (azhe.a == 122814739) {
            int a = azgi.a(((azhw) azhe.b).j);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        int i2 = 0;
        if (i == -1) {
            return new Class[]{isq.class};
        } else if (i == 0) {
            isq isq = (isq) obj;
            akcc[] akccArr = this.p.c;
            if (akccArr == null) {
                return null;
            }
            int length = akccArr.length;
            int i3 = this.t;
            if (length <= i3) {
                return null;
            }
            akcc akcc = akccArr[i3];
            akby akby = akcc.d;
            if (akby == null) {
                return null;
            }
            akbw[] akbwArr = akby.a;
            if (akbwArr == null) {
                return null;
            }
            i3 = this.u;
            int i4 = isq.a;
            if (i3 == i4 || akbwArr.length <= i4) {
                return null;
            }
            int dimensionPixelSize;
            azhi azhi = akbwArr[i4].d;
            azhe[] azheArr = (azhe[]) azhi.c.toArray(new azhe[0]);
            ArrayList arrayList = new ArrayList();
            for (Object add : azheArr) {
                arrayList.add(add);
            }
            this.b.removeCallbacksAndMessages(null);
            this.a.a(iur.a);
            for (i3 = 0; i3 < arrayList.size(); i3++) {
                dimensionPixelSize = this.q.getDimensionPixelSize(R.dimen.watch_card_item_padding_top_bottom);
                dimensionPixelSize += dimensionPixelSize;
                if (iup.a((azhe) arrayList.get(i3))) {
                    this.a.add(epq.b((int) (((float) this.q.getDimensionPixelSize(R.dimen.watch_card_list_item_compact_thumbnail_width)) / this.q.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))));
                    if (i3 < arrayList.size() - 1) {
                        this.a.add(epq.b(this.q.getDimensionPixelSize(R.dimen.line_separator_height) + dimensionPixelSize));
                    }
                } else {
                    this.a.add(epq.b(((int) (((float) this.q.getDimensionPixelSize(R.dimen.watch_card_list_item_thumbnail_width)) / this.q.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))) + dimensionPixelSize));
                }
            }
            i3 = azhi.a;
            if (!((i3 & 2) == 0 || (i3 & 4) == 0)) {
                akpk akpk = this.a;
                arml arml = azhi.e;
                if (arml == null) {
                    arml = arml.f;
                }
                apxu apxu = azhi.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                akpk.add(new ivp(arml, apxu));
            }
            length = 0;
            while (i2 < arrayList.size()) {
                this.b.postDelayed(new iut(this, arrayList, i2, length), (long) (i2 * 100));
                if (iup.a((azhe) arrayList.get(i2)) && i2 < arrayList.size() - 1) {
                    length++;
                }
                i2++;
                length++;
            }
            this.u = isq.a;
            this.r.setExtension(akbj.a, Integer.valueOf(isq.a));
            akcc.d.setExtension(akbx.b, Boolean.valueOf(true));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
