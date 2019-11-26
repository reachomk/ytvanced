package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: csf */
public final class csf {
    public final Map a = new HashMap();
    public final csg b = new csg();
    public final aaf c = new aaf();
    public final Map d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final csj f = new csj(this);
    public final csl g = new csl(this);
    public final csh h;
    public ctq i;
    private final csm j = new csm(this);

    public csf(csh csh) {
        this.h = csh;
    }

    public final void a(csd csd, cqo cqo) {
        csi csi = (csi) this.b.a(csd);
        if (csi != null) {
            a(csi, cqo);
        }
    }

    public final void a(csd csd, cqo cqo, cqo cqo2) {
        csi csi = (csi) this.b.a(csd);
        if (csi == null) {
            csi = new csi();
            csg csg = this.b;
            if (csg.d.put(csd, csi) == null) {
                int i = csd.a;
                if (i == 1) {
                    csg.a.put(csd.b, csd);
                } else if (i == 2) {
                    String str = csd.c;
                    Map map = (Map) csg.b.get(str);
                    if (map == null) {
                        map = new LinkedHashMap();
                        csg.b.put(str, map);
                    }
                    map.put(csd.b, csd);
                } else if (i == 3) {
                    csg.c.put(csd.b, csd);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Unknown TransitionId type ");
                    stringBuilder.append(i);
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
        if (cqo == null && cqo2 == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (cqo == null && cqo2 != null) {
            csi.c = 0;
        } else if (cqo == null || cqo2 == null) {
            csi.c = 2;
        } else {
            csi.c = 1;
        }
        csi.d = cqo;
        csi.e = cqo2;
        cqo cqo3 = csi.e;
        clm clm = cqo3 != null ? (cpd) cqo3.a() : null;
        for (cto cto : csi.a.keySet()) {
            csk csk = (csk) csi.a.get(cto);
            if (clm == null) {
                csk.d = null;
            } else {
                csk.d = Float.valueOf(cto.a(clm));
            }
        }
        csi.f = true;
    }

    public final ctq a(crr crr) {
        ctq ctq = null;
        int i = 0;
        ArrayList arrayList;
        if (crr instanceof csb) {
            csb csb = (csb) crr;
            cru cru = csb.c;
            arrayList = new ArrayList();
            a(csb, this.b.a((String) cru.a.a), arrayList);
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    ctq = (ctq) arrayList.get(0);
                } else {
                    ctq = new ctu(arrayList);
                }
            }
            return ctq;
        } else if (crr instanceof cso) {
            cso cso = (cso) crr;
            ArrayList arrayList2 = cso.c;
            arrayList = new ArrayList();
            int size = arrayList2.size();
            while (i < size) {
                ctq a = a((crr) arrayList2.get(i));
                if (a != null) {
                    arrayList.add(a);
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return cso.a(arrayList);
        } else {
            String valueOf = String.valueOf(crr);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
            stringBuilder.append("Unhandled Transition type: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private final void a(csb csb, csd csd, ArrayList arrayList) {
        ctq a = a(csb, csd, (cto) csb.c.b.a);
        if (a != null) {
            arrayList.add(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    private final defpackage.ctq a(defpackage.csb r8, defpackage.csd r9, defpackage.cto r10) {
        /*
        r7 = this;
        r0 = r7.b;
        r0 = r0.a(r9);
        r0 = (defpackage.csi) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x00fc;
    L_0x000b:
        r2 = r0.d;
        if (r2 != 0) goto L_0x0013;
    L_0x000f:
        r2 = r0.e;
        if (r2 == 0) goto L_0x00fc;
    L_0x0013:
        r2 = r0.c;
        r3 = -1;
        r4 = 1;
        r5 = 2;
        if (r2 == r3) goto L_0x003a;
    L_0x001a:
        if (r2 == 0) goto L_0x003a;
    L_0x001c:
        if (r2 == r4) goto L_0x003a;
    L_0x001e:
        if (r2 != r5) goto L_0x0021;
    L_0x0020:
        goto L_0x003a;
    L_0x0021:
        r8 = new java.lang.RuntimeException;
        r9 = new java.lang.StringBuilder;
        r10 = 31;
        r9.<init>(r10);
        r10 = "Unknown changeType: ";
        r9.append(r10);
        r9.append(r2);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x003a:
        if (r2 != 0) goto L_0x0043;
    L_0x003c:
        r2 = r8.a();
        if (r2 == 0) goto L_0x0049;
    L_0x0042:
        goto L_0x004a;
    L_0x0043:
        if (r2 != r5) goto L_0x004a;
    L_0x0045:
        r2 = r8.f;
        if (r2 != 0) goto L_0x004a;
    L_0x0049:
        return r1;
    L_0x004a:
        r2 = r0.a;
        r2 = r2.get(r10);
        r2 = (defpackage.csk) r2;
        r3 = new ctv;
        r3.<init>(r9, r10);
        if (r2 == 0) goto L_0x005e;
    L_0x0059:
        r9 = r2.a;
        r9 = r9.c;
        goto L_0x0075;
    L_0x005e:
        r9 = r0.c;
        if (r9 == 0) goto L_0x006f;
    L_0x0062:
        r9 = r0.d;
        r9 = r9.a();
        r9 = (defpackage.clm) r9;
        r9 = r10.a(r9);
        goto L_0x0075;
    L_0x006f:
        r9 = r8.e;
        r9 = r9.a();
    L_0x0075:
        r6 = r0.c;
        if (r6 == r5) goto L_0x0086;
    L_0x0079:
        r5 = r0.e;
        r5 = r5.a();
        r5 = (defpackage.clm) r5;
        r5 = r10.a(r5);
        goto L_0x008c;
    L_0x0086:
        r5 = r8.f;
        r5 = r5.a();
    L_0x008c:
        if (r2 == 0) goto L_0x009c;
    L_0x008e:
        r6 = r2.c;
        if (r6 == 0) goto L_0x009c;
    L_0x0092:
        r6 = r6.floatValue();
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a1;
    L_0x009b:
        return r1;
    L_0x009c:
        r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r6 != 0) goto L_0x00a1;
    L_0x00a0:
        return r1;
    L_0x00a1:
        r1 = new ctw;
        r1.<init>(r3, r5);
        r5 = r8.d;
        r1 = r5.a(r1);
        r5 = r7.j;
        r1.a(r5);
        if (r2 != 0) goto L_0x00c7;
    L_0x00b3:
        r2 = new csk;
        r5 = 0;
        r2.<init>(r5);
        r5 = new ctn;
        r6 = r0.b;
        r5.<init>(r6, r10);
        r2.a = r5;
        r0 = r0.a;
        r0.put(r10, r2);
    L_0x00c7:
        r10 = r2.a;
        r10.c = r9;
        r10.a(r9);
        r10 = r2.e;
        r10 = r10 + r4;
        r2.e = r10;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r10.add(r3);
        r0 = r7.a;
        r0.put(r1, r10);
        r10 = r7.d;
        r9 = java.lang.Float.valueOf(r9);
        r10.put(r3, r9);
        r9 = r8.g;
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 != 0) goto L_0x00fc;
    L_0x00f1:
        r9 = r7.c;
        r10 = r1.hashCode();
        r8 = r8.g;
        r9.b(r10, r8);
    L_0x00fc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csf.a(csb, csd, cto):ctq");
    }

    public final void a(csi csi, cqo cqo) {
        cqo cqo2 = csi.b;
        if (cqo2 != null || cqo != null) {
            if (cqo2 == null || !cqo2.equals(cqo)) {
                Map map = csi.a;
                if (csi.b != null) {
                    for (cto a : map.keySet()) {
                        csf.a(a, csi.b);
                    }
                    a(csi.b, true);
                }
                for (csk csk : map.values()) {
                    ctn ctn = csk.a;
                    ctn.a(cqo);
                    ctn.a(ctn.c);
                }
                if (cqo != null) {
                    a(cqo, false);
                }
                csi.b = cqo;
            }
        }
    }

    public final void a(cqo cqo, boolean z) {
        Object a = cqo.a(3);
        if (a instanceof View) {
            a((View) a, z);
        }
    }

    private final void a(View view, boolean z) {
        if (view instanceof ComponentHost) {
            ComponentHost componentHost;
            if (z) {
                componentHost = (ComponentHost) view;
                if (componentHost.r) {
                    componentHost.r = false;
                    componentHost.setClipChildren(componentHost.s);
                }
            } else {
                componentHost = (ComponentHost) view;
                if (!componentHost.r) {
                    componentHost.s = componentHost.getClipChildren();
                    componentHost.setClipChildren(false);
                    componentHost.r = true;
                }
            }
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ComponentHost) {
            a((View) parent, z);
        }
    }

    public static void a(csi csi) {
        if (csi.d != null) {
            csi.d = null;
        }
        if (csi.e != null) {
            csi.e = null;
        }
    }

    public static void a(cto cto, float f, cqo cqo) {
        short s = cqo.b;
        for (short s2 = (short) 0; s2 < s; s2++) {
            cto.a(cqo.c(s2), f);
        }
    }

    public static void a(cto cto, cqo cqo) {
        short s = cqo.b;
        for (short s2 = (short) 0; s2 < s; s2++) {
            cto.b(cqo.c(s2));
        }
    }
}
