package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: jkj */
public final class jkj extends aktw implements xcp {
    public final Context a;
    public final Executor b;
    public final xci c;
    public final amez d;
    public final akoh e;
    public final akpk f;
    public final akpk g;
    public final List h;
    public final Map i;
    public final Map j;
    public final Map k;
    public boolean l;
    private final Executor m;
    private final zzl n;
    private final alyf o;
    private final jkp p;
    private final anjv q;
    private final amav r;
    private final ambf s;
    private final arml t;
    private final arml u;
    private final boolean v;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    public jkj(android.content.Context r3, java.util.concurrent.Executor r4, defpackage.xci r5, defpackage.afpu r6, defpackage.amez r7, defpackage.amav r8, java.util.concurrent.Executor r9, defpackage.zzl r10, defpackage.alyf r11, defpackage.avvc r12) {
        /*
        r2 = this;
        r2.<init>();
        r2.a = r3;
        r2.b = r4;
        r2.c = r5;
        r2.d = r7;
        r2.n = r10;
        r2.o = r11;
        r7 = r2.n;
        r10 = 1;
        r0 = 0;
        if (r7 == 0) goto L_0x002e;
    L_0x0015:
        r7 = r7.b();
        if (r7 == 0) goto L_0x002e;
    L_0x001b:
        r7 = r2.n;
        r7 = r7.b();
        r7 = r7.j;
        if (r7 != 0) goto L_0x0027;
    L_0x0025:
        r7 = defpackage.ayva.m;
    L_0x0027:
        r7 = r7.e;
        if (r7 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x002e;
    L_0x002c:
        r7 = 1;
        goto L_0x002f;
    L_0x002e:
        r7 = 0;
    L_0x002f:
        r2.v = r7;
        r7 = new akoh;
        r7.<init>();
        r2.e = r7;
        r7 = new akpk;
        r7.<init>();
        r2.f = r7;
        r7 = new akpk;
        r7.<init>();
        r2.g = r7;
        r7 = r2.e;
        r1 = r2.f;
        r7.a(r1);
        r7 = r12.a;
        r7 = r7 & 2;
        if (r7 == 0) goto L_0x005a;
    L_0x0053:
        r7 = r12.b;
        if (r7 != 0) goto L_0x005b;
    L_0x0057:
        r7 = defpackage.arml.f;
        goto L_0x005b;
    L_0x005a:
        r7 = 0;
    L_0x005b:
        r7 = defpackage.ajqy.a(r7);
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x006c;
    L_0x0066:
        r7 = r12.a;
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x0071;
    L_0x006c:
        r7 = r2.f;
        r7.add(r12);
    L_0x0071:
        r7 = r2.e;
        r12 = r2.g;
        r7.a(r12);
        r7 = r2.g;
        r12 = new jkn;
        r12.<init>(r2);
        r7.a(r12);
        r7 = new java.util.HashMap;
        r7.<init>();
        r2.i = r7;
        r7 = new java.util.HashMap;
        r7.<init>();
        r2.j = r7;
        r7 = new java.util.HashMap;
        r7.<init>();
        r2.k = r7;
        r7 = defpackage.ankc.a(r9);
        r2.m = r7;
        r7 = new java.util.LinkedList;
        r7.<init>();
        r7 = java.util.Collections.synchronizedList(r7);
        r2.h = r7;
        r2.r = r8;
        r7 = new jky;
        r7.<init>(r2);
        r2.s = r7;
        r7 = r2.s;
        r8.a(r7);
        r7 = new java.lang.String[r10];
        r8 = r3.getResources();
        r9 = 2131952226; // 0x7f130262 float:1.9540889E38 double:1.0533243534E-314;
        r8 = r8.getString(r9);
        r7[r0] = r8;
        r7 = defpackage.ajqy.a(r7);
        r2.t = r7;
        r7 = new java.lang.String[r10];
        r3 = r3.getResources();
        r8 = 2131953793; // 0x7f130881 float:1.9544067E38 double:1.0533251276E-314;
        r3 = r3.getString(r8);
        r7[r0] = r3;
        r3 = defpackage.ajqy.a(r7);
        r2.u = r3;
        r3 = new jkp;
        r3.<init>(r2);
        r2.p = r3;
        r3 = r6.c();
        r7 = r2.p;
        r11.a(r3, r7);
        r3 = r6.c();
        r3 = r11.a(r3);
        r2.q = r3;
        r2.l = r10;
        r3 = r2.q;
        r6 = defpackage.jki.a;
        r7 = new jkl;
        r7.<init>(r2);
        defpackage.xan.a(r3, r4, r6, r7);
        r5.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkj.<init>(android.content.Context, java.util.concurrent.Executor, xci, afpu, amez, amav, java.util.concurrent.Executor, zzl, alyf, avvc):void");
    }

    public final aknh a() {
        return this.e;
    }

    public final void c() {
        b();
        this.r.a();
        this.r.b(this.s);
        this.l = false;
        anjv anjv = this.q;
        if (!(anjv == null || anjv.isDone())) {
            this.q.cancel(true);
        }
        this.o.a(this.p);
    }

    public final void b() {
        for (AsyncTask cancel : this.h) {
            cancel.cancel(true);
        }
        this.h.clear();
    }

    public final void a(amea amea) {
        amea amea2 = amea;
        int a = amek.a(amea2.h);
        if (a == 0 || a != 5) {
            fnp fnp;
            fnp fnp2;
            String str = amea2.g;
            xvd.a(str);
            int a2 = amek.a(amea2.h);
            if (a2 == 0) {
                a2 = 1;
            }
            Object obj = a2 != 4 ? null : 1;
            String str2 = amea2.G;
            boolean z = obj == null || !str2.isEmpty();
            amqw.b(z);
            if (obj != null) {
                fnp = (fnp) this.k.get(str2);
            } else {
                fnp = (fnp) this.i.get(str);
            }
            if (fnp != null) {
                fnp2 = fnp;
            } else {
                String str3;
                CharSequence charSequence;
                awnx a3;
                ameo ameo = amea2.f;
                if (ameo == null) {
                    ameo = ameo.g;
                }
                Iterable arrayList = new ArrayList();
                if (obj != null) {
                    zzl zzl = this.n;
                    if (!(zzl == null || zzl.b() == null)) {
                        ayva ayva = this.n.b().j;
                        if (ayva == null) {
                            ayva = ayva.m;
                        }
                        if (ayva.f) {
                            araz araz = (araz) EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.c.createBuilder();
                            araz.copyOnWrite();
                            EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint = (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint) araz.instance;
                            if (str2 != null) {
                                editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.a |= 1;
                                editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.b = str2;
                                EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint2 = (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint) ((anxl) araz.build());
                                auvo auvo = (auvo) auvl.f.createBuilder();
                                auvo.a(this.u);
                                apxx apxx = (apxx) apxu.d.createBuilder();
                                apxx.a(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint2);
                                auvo.copyOnWrite();
                                auvl auvl = (auvl) auvo.instance;
                                auvl.d = (apxu) ((anxl) apxx.build());
                                auvl.a |= 4;
                                auvl = (auvl) ((anxl) auvo.build());
                                auvm auvm = (auvm) auvj.j.createBuilder();
                                auvm.a(auvl);
                                arrayList.add((auvj) ((anxl) auvm.build()));
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                }
                auvs auvs = (auvs) auvp.h.createBuilder();
                auvs.a(this.t);
                aquo aquo = (aquo) DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.createBuilder();
                aquo.a(amea2.g);
                if (a2 == 4) {
                    str3 = amea2.G;
                    aquo.copyOnWrite();
                    DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) aquo.instance;
                    if (str3 != null) {
                        deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a |= 2;
                        deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b = str3;
                    } else {
                        throw new NullPointerException();
                    }
                }
                apxx apxx2 = (apxx) apxu.d.createBuilder();
                apxx2.a(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint, (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) ((anxl) aquo.build()));
                auvs.a(apxx2);
                auvm auvm2 = (auvm) auvj.j.createBuilder();
                auvm2.a(auvs);
                arrayList.add((auvj) ((anxl) auvm2.build()));
                auvq auvq = (auvq) auvn.l.createBuilder();
                auvq.a(arrayList);
                auvn auvn = (auvn) ((anxl) auvq.build());
                a2 = amek.a(amea2.h);
                if (a2 == 0 || a2 != 5) {
                    String str4 = ameo.b;
                    a2 = ames.a(ameo.d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    charSequence = str4;
                    a3 = jkj.a(a2);
                } else {
                    a3 = awnx.UNLISTED;
                    charSequence = "";
                }
                str3 = str2;
                fnp = new fnp(charSequence, a3, this.v, str2, auvn, amea2.e);
                amec amec = amea2.s;
                if (amec == null) {
                    amec = amec.g;
                }
                int a4 = amee.a(amec.b);
                if ((a4 == 0 || a4 != 4) && !amea2.d.isEmpty()) {
                    Uri parse = Uri.parse(amea2.d);
                    if (parse != null) {
                        jkm jkm = new jkm(this, parse, fnp);
                        this.h.add(jkm);
                        jkm.executeOnExecutor(this.m, new Void[0]);
                    }
                }
                if (obj == null) {
                    this.i.put(str, fnp);
                    this.r.a(amea2.g, null, amea2.F);
                } else {
                    this.j.put(str, fnp);
                    this.k.put(str3, fnp);
                    this.r.a(null, amea2.G, null);
                }
            }
            amec amec2 = amea2.s;
            if (amec2 == null) {
                amec2 = amec.g;
            }
            fnp2.a(amec2);
            fnp2.a(amjq.c(amea));
            if (amea2.L) {
                fnp2.a(true, amea2.M);
            }
            if (amea2.M) {
                fnp2.a();
            }
            a(fnp2);
        }
    }

    public final fnp a(String str, String str2) {
        fnp fnp;
        if (!TextUtils.isEmpty(str)) {
            fnp = (fnp) this.i.get(str);
            if (fnp == null) {
                return (fnp) this.j.get(str);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            return (fnp) this.k.get(str2);
        } else {
            fnp = null;
        }
        return fnp;
    }

    public final void a(fnp fnp) {
        if (this.g.contains(fnp)) {
            this.g.a((Object) fnp, (Object) fnp);
            return;
        }
        int size = this.g.size();
        while (size > 0) {
            int i = size - 1;
            if (fnp.a >= ((fnp) this.g.get(i)).a) {
                size = i;
            } else {
                this.g.add(size, fnp);
                return;
            }
        }
        this.g.add(0, fnp);
    }

    public static void a(Map map, fnp fnp) {
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() == fnp) {
                map.remove(entry.getKey());
                return;
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{aaxd.class};
        } else if (i == 0) {
            aaxd aaxd = (aaxd) obj;
            Object obj2 = aaxd.b;
            if (obj2 != null) {
                this.f.remove(obj2);
                this.g.remove(aaxd.b);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    public static awnx a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return awnx.PRIVATE;
        } else {
            if (i2 == 1) {
                return awnx.PUBLIC;
            }
            if (i2 == 2) {
                return awnx.UNLISTED;
            }
            Object obj;
            if (i == 0) {
                obj = "null";
            } else if (i == 0) {
                throw null;
            } else if (i == 0) {
                throw null;
            } else {
                obj = Integer.toString(i2);
            }
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("Unhandled Privacy enum: ");
            stringBuilder.append(valueOf);
            throw new AssertionError(stringBuilder.toString());
        }
    }
}
