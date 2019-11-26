package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: aeoj */
public final class aeoj {
    public final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final String c;
    private final String d;
    private final afjj e;
    private final afgz f;
    private final afjc g;
    private final Set h = new HashSet();
    private final Map i = new LinkedHashMap();
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ouu n;
    private affh o;
    private boolean p = true;
    private String q;
    private boolean r = false;

    public aeoj(String str, String str2, afjj afjj, afgz afgz, afjc afjc) {
        this.c = str;
        this.d = str2;
        this.e = afjj;
        this.f = afgz;
        this.g = afjc;
    }

    public final synchronized boolean a() {
        c();
        return this.r;
    }

    public final synchronized void a(ouu ouu, affh affh) {
        this.n = ouu;
        this.o = affh;
        if (ouu != null) {
            int i = 0;
            while (true) {
                oun oun = ouu.c;
                if (i < oun.a) {
                    oum a = oun.a(i);
                    if (a != null) {
                        for (int i2 = 0; i2 < a.g(); i2++) {
                            this.h.add(Integer.valueOf(aajy.a(a.a(i2).a)));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:119:0x0233=Splitter:B:119:0x0233, B:144:0x0276=Splitter:B:144:0x0276} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0276 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:144|145|146|147|148|149) */
    /* JADX WARNING: Missing block: B:145:?, code skipped:
            r1.p = false;
            r1.q = "missing_stream_exception";
     */
    /* JADX WARNING: Missing block: B:147:?, code skipped:
            notifyAll();
            c();
     */
    /* JADX WARNING: Missing block: B:149:0x0283, code skipped:
            return null;
     */
    public final synchronized defpackage.afgv a(java.lang.String r19, defpackage.aajs r20, defpackage.aajj r21, boolean r22, boolean r23) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r20;
        monitor-enter(r18);
        r3 = r1.c;	 Catch:{ all -> 0x0284 }
        r3 = android.text.TextUtils.equals(r3, r0);	 Catch:{ all -> 0x0284 }
        r4 = 0;
        r5 = 0;
        if (r3 != 0) goto L_0x002f;
    L_0x0011:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r2 = "cpn_mismatch";
        r1.q = r2;	 Catch:{ all -> 0x0284 }
        r2 = r1.i;	 Catch:{ all -> 0x0284 }
        r3 = "cpn1";
        r5 = r1.c;	 Catch:{ all -> 0x0284 }
        r2.put(r3, r5);	 Catch:{ all -> 0x0284 }
        r2 = r1.i;	 Catch:{ all -> 0x0284 }
        r3 = "cpn2";
        r2.put(r3, r0);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x002f:
        r0 = r1.d;	 Catch:{ all -> 0x0284 }
        r3 = r2.c;	 Catch:{ all -> 0x0284 }
        r0 = android.text.TextUtils.equals(r0, r3);	 Catch:{ all -> 0x0284 }
        if (r0 != 0) goto L_0x0047;
    L_0x0039:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "content_id_mismatch";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0047:
        r0 = r1.r;	 Catch:{ all -> 0x0284 }
        if (r0 == 0) goto L_0x0059;
    L_0x004b:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "streaming_data_already_added";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0059:
        r0 = r1.n;	 Catch:{ all -> 0x0284 }
        if (r0 != 0) goto L_0x0070;
    L_0x005d:
        r0 = "Track selection too late for EMP.";
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x0284 }
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "late_track_selection";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0070:
        r8 = new java.util.HashSet;	 Catch:{ all -> 0x0284 }
        r8.<init>();	 Catch:{ all -> 0x0284 }
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0284 }
        r0.<init>();	 Catch:{ all -> 0x0284 }
        r3 = r2.n;	 Catch:{ all -> 0x0284 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0284 }
    L_0x0080:
        r6 = r3.hasNext();	 Catch:{ all -> 0x0284 }
        if (r6 == 0) goto L_0x00ce;
    L_0x0086:
        r6 = r3.next();	 Catch:{ all -> 0x0284 }
        r6 = (defpackage.aahr) r6;	 Catch:{ all -> 0x0284 }
        r7 = r6.b();	 Catch:{ all -> 0x0284 }
        r9 = -1;
        if (r7 != r9) goto L_0x00c5;
    L_0x0093:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "unknown_itag";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "id";
        r3 = r6.e;	 Catch:{ all -> 0x0284 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0284 }
        r0 = "Unknown itag found in streamingData: ";
        r2 = r6.e;	 Catch:{ all -> 0x0284 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0284 }
        r3 = r2.length();	 Catch:{ all -> 0x0284 }
        if (r3 != 0) goto L_0x00b6;
    L_0x00b0:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0284 }
        r2.<init>(r0);	 Catch:{ all -> 0x0284 }
        goto L_0x00ba;
    L_0x00b6:
        r2 = r0.concat(r2);	 Catch:{ all -> 0x0284 }
    L_0x00ba:
        defpackage.aepe.a(r2);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x00c5:
        r8.add(r6);	 Catch:{ all -> 0x0284 }
        r7 = r6.e;	 Catch:{ all -> 0x0284 }
        r0.put(r7, r6);	 Catch:{ all -> 0x0284 }
        goto L_0x0080;
    L_0x00ce:
        r3 = r1.o;	 Catch:{ all -> 0x0284 }
        if (r3 != 0) goto L_0x00e0;
    L_0x00d2:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "null_track_selector_candidate_video_itags";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x00e0:
        if (r22 != 0) goto L_0x00e4;
    L_0x00e2:
        r3 = defpackage.affd.c;	 Catch:{ all -> 0x0284 }
    L_0x00e4:
        r6 = r1.o;	 Catch:{ all -> 0x0284 }
        r6 = r6.c;	 Catch:{ all -> 0x0284 }
        r7 = r3.c;	 Catch:{ all -> 0x0284 }
        if (r6 == r7) goto L_0x0112;
    L_0x00ec:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "non_matching_track_renderer_types";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "trt_1";
        r5 = defpackage.afjo.a(r6);	 Catch:{ all -> 0x0284 }
        r0.put(r2, r5);	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "trt_2";
        r3 = r3.c;	 Catch:{ all -> 0x0284 }
        r3 = defpackage.afjo.a(r3);	 Catch:{ all -> 0x0284 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0112:
        r6 = r1.g;	 Catch:{ afgr -> 0x0276 }
        r7 = defpackage.affd.b;	 Catch:{ afgr -> 0x0276 }
        r9 = r21;
        r6 = defpackage.affd.a(r2, r9, r6, r7);	 Catch:{ afgr -> 0x0276 }
        r7 = r1.f;	 Catch:{ afgr -> 0x0276 }
        r10 = r3.a;	 Catch:{ afgr -> 0x0276 }
        r11 = r6.a;	 Catch:{ afgr -> 0x0276 }
        r3 = r23;
        r16 = defpackage.afam.a(r2, r3);	 Catch:{ afgr -> 0x0276 }
        r2 = r1.c;	 Catch:{ afgr -> 0x0276 }
        r3 = 0;
        r12 = 1;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r6 = r7;
        r7 = r21;
        r9 = r3;
        r17 = r2;
        r2 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ afgr -> 0x0276 }
        r3 = new java.util.HashSet;	 Catch:{ all -> 0x0284 }
        r3.<init>();	 Catch:{ all -> 0x0284 }
        r6 = r2.a;	 Catch:{ all -> 0x0284 }
        r7 = r6.length;	 Catch:{ all -> 0x0284 }
        r8 = 0;
    L_0x0142:
        if (r8 >= r7) goto L_0x014e;
    L_0x0144:
        r9 = r6[r8];	 Catch:{ all -> 0x0284 }
        r9 = r9.e;	 Catch:{ all -> 0x0284 }
        r3.add(r9);	 Catch:{ all -> 0x0284 }
        r8 = r8 + 1;
        goto L_0x0142;
    L_0x014e:
        r6 = r2.b;	 Catch:{ all -> 0x0284 }
        r7 = r6.length;	 Catch:{ all -> 0x0284 }
        r8 = 0;
    L_0x0152:
        if (r8 >= r7) goto L_0x015e;
    L_0x0154:
        r9 = r6[r8];	 Catch:{ all -> 0x0284 }
        r9 = r9.e;	 Catch:{ all -> 0x0284 }
        r3.add(r9);	 Catch:{ all -> 0x0284 }
        r8 = r8 + 1;
        goto L_0x0152;
    L_0x015e:
        r6 = r3.iterator();	 Catch:{ all -> 0x0284 }
    L_0x0162:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0284 }
        if (r7 == 0) goto L_0x0191;
    L_0x0168:
        r7 = r6.next();	 Catch:{ all -> 0x0284 }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x0284 }
        r8 = r0.get(r7);	 Catch:{ all -> 0x0284 }
        r8 = (defpackage.aahr) r8;	 Catch:{ all -> 0x0284 }
        if (r8 != 0) goto L_0x018b;
    L_0x0176:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "null_selected_format_stream";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "id";
        r0.put(r2, r7);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x018b:
        r9 = r1.a;	 Catch:{ all -> 0x0284 }
        r9.put(r7, r8);	 Catch:{ all -> 0x0284 }
        goto L_0x0162;
    L_0x0191:
        r0 = r3.iterator();	 Catch:{ all -> 0x0284 }
    L_0x0195:
        r3 = r0.hasNext();	 Catch:{ all -> 0x0284 }
        if (r3 == 0) goto L_0x01ca;
    L_0x019b:
        r3 = r0.next();	 Catch:{ all -> 0x0284 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0284 }
        r3 = defpackage.aajy.a(r3);	 Catch:{ all -> 0x0284 }
        r6 = r1.h;	 Catch:{ all -> 0x0284 }
        r7 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0284 }
        r6 = r6.contains(r7);	 Catch:{ all -> 0x0284 }
        if (r6 != 0) goto L_0x0195;
    L_0x01b1:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "selector_result_does_not_contain_fmt";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "itag";
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x0284 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x01ca:
        r0 = r1.b;	 Catch:{ all -> 0x0284 }
        r0 = r0.values();	 Catch:{ all -> 0x0284 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0284 }
    L_0x01d4:
        r3 = r0.hasNext();	 Catch:{ all -> 0x0284 }
        if (r3 == 0) goto L_0x0232;
    L_0x01da:
        r3 = r0.next();	 Catch:{ all -> 0x0284 }
        r3 = (defpackage.aahr) r3;	 Catch:{ all -> 0x0284 }
        r6 = r1.a;	 Catch:{ all -> 0x0284 }
        r7 = r3.e;	 Catch:{ all -> 0x0284 }
        r6 = r6.get(r7);	 Catch:{ all -> 0x0284 }
        r6 = (defpackage.aahr) r6;	 Catch:{ all -> 0x0284 }
        if (r6 != 0) goto L_0x01fa;
    L_0x01ec:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "incompatible_null_fmt";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x01fa:
        r7 = r3.C();	 Catch:{ all -> 0x0284 }
        r9 = r6.C();	 Catch:{ all -> 0x0284 }
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x01d4;
    L_0x0206:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "lmt_mismatch";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "lmt1";
        r7 = r3.C();	 Catch:{ all -> 0x0284 }
        r3 = java.lang.Long.toString(r7);	 Catch:{ all -> 0x0284 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0284 }
        r0 = r1.i;	 Catch:{ all -> 0x0284 }
        r2 = "lmt2";
        r5 = r6.C();	 Catch:{ all -> 0x0284 }
        r3 = java.lang.Long.toString(r5);	 Catch:{ all -> 0x0284 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0232:
        r0 = 0;
    L_0x0233:
        r3 = r1.n;	 Catch:{ all -> 0x0284 }
        r3 = r3.c;	 Catch:{ all -> 0x0284 }
        r6 = r3.a;	 Catch:{ all -> 0x0284 }
        if (r0 >= r6) goto L_0x026b;
    L_0x023b:
        r3 = r3.a(r0);	 Catch:{ all -> 0x0284 }
        if (r3 != 0) goto L_0x0242;
    L_0x0241:
        goto L_0x025a;
    L_0x0242:
        r6 = 0;
    L_0x0243:
        r7 = r3.g();	 Catch:{ all -> 0x0284 }
        if (r6 >= r7) goto L_0x025d;
    L_0x0249:
        r7 = r3.a(r6);	 Catch:{ all -> 0x0284 }
        r8 = r1.a;	 Catch:{ all -> 0x0284 }
        r7 = r7.a;	 Catch:{ all -> 0x0284 }
        r7 = r8.containsKey(r7);	 Catch:{ all -> 0x0284 }
        if (r7 != 0) goto L_0x025a;
    L_0x0257:
        r6 = r6 + 1;
        goto L_0x0243;
    L_0x025a:
        r0 = r0 + 1;
        goto L_0x0233;
    L_0x025d:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "selection_does_not_contain_streaming_data_fmt";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x026b:
        r0 = 1;
        r1.r = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r2;
    L_0x0276:
        r1.p = r5;	 Catch:{ all -> 0x0284 }
        r0 = "missing_stream_exception";
        r1.q = r0;	 Catch:{ all -> 0x0284 }
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        monitor-exit(r18);
        return r4;
    L_0x0284:
        r0 = move-exception;
        r18.notifyAll();	 Catch:{ all -> 0x028c }
        r18.c();	 Catch:{ all -> 0x028c }
        throw r0;	 Catch:{ all -> 0x028c }
    L_0x028c:
        r0 = move-exception;
        monitor-exit(r18);
        goto L_0x0290;
    L_0x028f:
        throw r0;
    L_0x0290:
        goto L_0x028f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeoj.a(java.lang.String, aajs, aajj, boolean, boolean):afgv");
    }

    public final synchronized void a(String str, int i, String str2, long j, int i2) {
        Object obj;
        String a = aajy.a(i, str2);
        arlx arlx = (arlx) arlv.E.createBuilder();
        if (TextUtils.isEmpty(str2)) {
            obj = "";
        } else {
            String valueOf = String.valueOf(str2);
            String str3 = "&xtags=";
            obj = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 70) + String.valueOf(obj).length());
        stringBuilder.append("http://oda/videoplayback?id=");
        stringBuilder.append(str);
        stringBuilder.append("&itag=");
        stringBuilder.append(i);
        stringBuilder.append("&lmt=");
        stringBuilder.append(j);
        stringBuilder.append(obj);
        arlx.a(stringBuilder.toString());
        arlx.a(i);
        arlx.c(str2);
        arma arma = (arma) armb.d.createBuilder();
        arma.a(0);
        arma.b(1);
        arlx.a(arma);
        arma = (arma) armb.d.createBuilder();
        arma.a(2);
        arma.b((long) i2);
        arlx.b(arma);
        arlx.a(j);
        arlx.b(-1);
        this.b.put(a, new aahr((arlv) ((anxl) arlx.build()), str, -1));
        notifyAll();
    }

    public final synchronized boolean a(String str) {
        boolean z;
        z = this.b.containsKey(str) || this.a.containsKey(str);
        return z;
    }

    public final synchronized orc b(String str) {
        c();
        if (this.a.containsKey(str)) {
            return ((aahr) this.a.get(str)).d(this.c);
        } else if (!this.b.containsKey(str)) {
            return null;
        } else {
            return ((aahr) this.b.get(str)).d(this.c);
        }
    }

    public final synchronized boolean a(Set set) {
        boolean z;
        for (String contains : this.b.keySet()) {
            if (set.contains(contains)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|47) */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            defpackage.aepe.a("Interrupted while waiting for streaming data representation.");
            r5.p = false;
            r5.q = "interrupted_waiting";
            notifyAll();
     */
    public final synchronized defpackage.orc c(java.lang.String r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = defpackage.aajy.a(r6);	 Catch:{ all -> 0x00e8 }
        r1 = defpackage.aahv.n();	 Catch:{ all -> 0x00e8 }
        r2 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00e8 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00e8 }
        r3 = 29;
        r4 = 1;
        if (r1 == 0) goto L_0x002a;
    L_0x0016:
        r0 = r5.j;	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x005b;
    L_0x001b:
        r0 = r5.e;	 Catch:{ all -> 0x00e8 }
        r0 = r0.a;	 Catch:{ all -> 0x00e8 }
        r1 = new aegw;	 Catch:{ all -> 0x00e8 }
        r1.<init>();	 Catch:{ all -> 0x00e8 }
        r0.a(r1);	 Catch:{ all -> 0x00e8 }
        r5.j = r4;	 Catch:{ all -> 0x00e8 }
        goto L_0x005b;
    L_0x002a:
        r1 = defpackage.aahv.h();	 Catch:{ all -> 0x00e8 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00e8 }
        if (r1 == 0) goto L_0x0047;
    L_0x0034:
        r0 = r5.l;	 Catch:{ all -> 0x00e8 }
        if (r0 != 0) goto L_0x005b;
    L_0x0038:
        r0 = r5.e;	 Catch:{ all -> 0x00e8 }
        r0 = r0.a;	 Catch:{ all -> 0x00e8 }
        r1 = new aeha;	 Catch:{ all -> 0x00e8 }
        r1.<init>();	 Catch:{ all -> 0x00e8 }
        r0.a(r1);	 Catch:{ all -> 0x00e8 }
        r5.l = r4;	 Catch:{ all -> 0x00e8 }
        goto L_0x005b;
    L_0x0047:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e8 }
        r1.<init>(r3);	 Catch:{ all -> 0x00e8 }
        r2 = "Invalid EMP itag: ";
        r1.append(r2);	 Catch:{ all -> 0x00e8 }
        r1.append(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r1.toString();	 Catch:{ all -> 0x00e8 }
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x00e8 }
    L_0x005b:
        r0 = r5.p;	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x007f;
    L_0x005f:
        r0 = r5.r;	 Catch:{ all -> 0x00e8 }
        if (r0 != 0) goto L_0x007f;
    L_0x0063:
        r0 = r5.a;	 Catch:{ all -> 0x00e8 }
        r0 = r0.containsKey(r6);	 Catch:{ all -> 0x00e8 }
        if (r0 != 0) goto L_0x007f;
    L_0x006b:
        r5.wait();	 Catch:{ InterruptedException -> 0x006f }
        goto L_0x005b;
    L_0x006f:
        r0 = "Interrupted while waiting for streaming data representation.";
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x00e8 }
        r0 = 0;
        r5.p = r0;	 Catch:{ all -> 0x00e8 }
        r0 = "interrupted_waiting";
        r5.q = r0;	 Catch:{ all -> 0x00e8 }
        r5.notifyAll();	 Catch:{ all -> 0x00e8 }
        goto L_0x005b;
    L_0x007f:
        r0 = defpackage.aajy.a(r6);	 Catch:{ all -> 0x00e8 }
        r1 = defpackage.aahv.n();	 Catch:{ all -> 0x00e8 }
        r2 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00e8 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00e8 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0091:
        r0 = r5.k;	 Catch:{ all -> 0x00e8 }
        if (r0 != 0) goto L_0x00d5;
    L_0x0095:
        r0 = r5.e;	 Catch:{ all -> 0x00e8 }
        r0 = r0.a;	 Catch:{ all -> 0x00e8 }
        r1 = new aegt;	 Catch:{ all -> 0x00e8 }
        r1.<init>();	 Catch:{ all -> 0x00e8 }
        r0.a(r1);	 Catch:{ all -> 0x00e8 }
        r5.k = r4;	 Catch:{ all -> 0x00e8 }
        goto L_0x00d5;
    L_0x00a4:
        r1 = defpackage.aahv.h();	 Catch:{ all -> 0x00e8 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00e8 }
        if (r1 == 0) goto L_0x00c1;
    L_0x00ae:
        r0 = r5.m;	 Catch:{ all -> 0x00e8 }
        if (r0 != 0) goto L_0x00d5;
    L_0x00b2:
        r0 = r5.e;	 Catch:{ all -> 0x00e8 }
        r0 = r0.a;	 Catch:{ all -> 0x00e8 }
        r1 = new aegx;	 Catch:{ all -> 0x00e8 }
        r1.<init>();	 Catch:{ all -> 0x00e8 }
        r0.a(r1);	 Catch:{ all -> 0x00e8 }
        r5.m = r4;	 Catch:{ all -> 0x00e8 }
        goto L_0x00d5;
    L_0x00c1:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e8 }
        r1.<init>(r3);	 Catch:{ all -> 0x00e8 }
        r2 = "Invalid EMP itag: ";
        r1.append(r2);	 Catch:{ all -> 0x00e8 }
        r1.append(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r1.toString();	 Catch:{ all -> 0x00e8 }
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x00e8 }
    L_0x00d5:
        r5.c();	 Catch:{ all -> 0x00e8 }
        r0 = r5.a;	 Catch:{ all -> 0x00e8 }
        r6 = r0.get(r6);	 Catch:{ all -> 0x00e8 }
        r6 = (defpackage.aahr) r6;	 Catch:{ all -> 0x00e8 }
        r0 = r5.c;	 Catch:{ all -> 0x00e8 }
        r6 = r6.d(r0);	 Catch:{ all -> 0x00e8 }
        monitor-exit(r5);
        return r6;
    L_0x00e8:
        r6 = move-exception;
        monitor-exit(r5);
        goto L_0x00ec;
    L_0x00eb:
        throw r6;
    L_0x00ec:
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeoj.c(java.lang.String):orc");
    }

    public final synchronized void b() {
        this.p = false;
        this.q = "destroyed";
        notifyAll();
    }

    private final synchronized void c() {
        if (!this.p) {
            throw new aeom(this.q, this.i, (byte) 0);
        }
    }
}
