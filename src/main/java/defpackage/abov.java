package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abov */
public final class abov extends aknb {
    public final ArrayList a = new ArrayList();
    public final akoq b = new abou(this);
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public final long a(int i) {
        return (long) i;
    }

    public static String a(Object obj) {
        if (obj != null) {
            if (obj instanceof auej) {
                auej auej = (auej) obj;
                if ((auej.a & 1) != 0) {
                    return auej.b;
                }
                return null;
            } else if (obj instanceof audv) {
                return ((audv) obj).b;
            } else {
                if (obj instanceof audr) {
                    return ((audr) obj).b;
                }
                if (obj instanceof audt) {
                    return ((audt) obj).d;
                }
                if (obj instanceof aued) {
                    return ((aued) obj).d;
                }
                if (obj instanceof audn) {
                    return ((audn) obj).b;
                }
                if (obj instanceof auef) {
                    auef auef = (auef) obj;
                    if ((auef.a & 1) != 0) {
                        return auef.b;
                    }
                    return null;
                } else if (obj instanceof auel) {
                    return ((auel) obj).d;
                } else {
                    if (obj instanceof audx) {
                        audx audx = (audx) obj;
                        if ((audx.a & 2) != 0) {
                            return audx.c;
                        }
                        return null;
                    } else if (obj instanceof aufj) {
                        aufj aufj = (aufj) obj;
                        if ((aufj.a & 1) != 0) {
                            return aufj.b;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Object a(audp audp) {
        int i = audp.a;
        if (i == 117300536) {
            return (auej) audp.b;
        }
        if (i == 129492606) {
            return (audv) audp.b;
        }
        if (i == 165252689) {
            return (auel) audp.b;
        }
        if (i == 130661514) {
            return (audr) audp.b;
        }
        if (i == 232396290) {
            return (audt) audp.b;
        }
        if (i == 132496275) {
            return (aued) audp.b;
        }
        if (i == 146966970) {
            return (audn) audp.b;
        }
        if (i == 146948953) {
            return (auef) audp.b;
        }
        if (i != 133279312) {
            return i == 197064214 ? (aufj) audp.b : null;
        } else {
            return (audx) audp.b;
        }
    }

    public static String b(Object obj) {
        if (obj instanceof auej) {
            return ((auej) obj).e;
        }
        if (obj instanceof audr) {
            return ((audr) obj).d;
        }
        if (obj instanceof audt) {
            return ((audt) obj).f;
        }
        if (obj instanceof aued) {
            return ((aued) obj).g;
        }
        if (obj instanceof aufj) {
            return ((aufj) obj).l;
        }
        if (obj instanceof augz) {
            return ((augz) obj).l;
        }
        if (obj instanceof auhb) {
            return ((auhb) obj).l;
        }
        if (obj instanceof augv) {
            return ((augv) obj).i;
        }
        if (obj instanceof audn) {
            axak axak;
            audn audn = (audn) obj;
            if ((audn.a & 8) != 0) {
                axak = audn.d;
                if (axak == null) {
                    axak = axak.a;
                }
            } else {
                axak = null;
            }
            ajzw a = ajzv.a(axak);
            if (a != null) {
                return abov.b(ajzv.b(a));
            }
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:13:0x0033, code skipped:
            return;
     */
    public final synchronized void a(defpackage.audp r3, boolean r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r3 = defpackage.abov.a(r3);	 Catch:{ all -> 0x0034 }
        r0 = defpackage.abov.a(r3);	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0032;
    L_0x000b:
        r1 = r2.d;	 Catch:{ all -> 0x0034 }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0034 }
        if (r1 != 0) goto L_0x0032;
    L_0x0013:
        if (r3 == 0) goto L_0x0030;
    L_0x0015:
        r1 = r2.d;	 Catch:{ all -> 0x0034 }
        r1.put(r0, r3);	 Catch:{ all -> 0x0034 }
        r3 = r2.a;	 Catch:{ all -> 0x0034 }
        r3.add(r0);	 Catch:{ all -> 0x0034 }
        if (r4 == 0) goto L_0x0030;
    L_0x0021:
        r3 = r2.d();	 Catch:{ all -> 0x0034 }
        defpackage.xak.a();	 Catch:{ all -> 0x0034 }
        r4 = r2.c;	 Catch:{ all -> 0x0034 }
        r3 = r3 + -1;
        r0 = 1;
        r4.b(r3, r0);	 Catch:{ all -> 0x0034 }
    L_0x0030:
        monitor-exit(r2);
        return;
    L_0x0032:
        monitor-exit(r2);
        return;
    L_0x0034:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abov.a(audp, boolean):void");
    }

    public final boolean a(String str, audp audp, boolean z) {
        return a(str, abov.a(audp), z);
    }

    /* JADX WARNING: Missing block: B:16:0x0037, code skipped:
            return false;
     */
    private final synchronized boolean a(java.lang.String r4, java.lang.Object r5, boolean r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x0038 }
        r0 = r0.indexOf(r4);	 Catch:{ all -> 0x0038 }
        r1 = r3.d;	 Catch:{ all -> 0x0038 }
        r1 = r1.containsKey(r4);	 Catch:{ all -> 0x0038 }
        r2 = 0;
        if (r1 == 0) goto L_0x0036;
    L_0x0010:
        if (r0 < 0) goto L_0x0036;
    L_0x0012:
        r1 = defpackage.abov.a(r5);	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0034;
    L_0x0018:
        r2 = r3.d;	 Catch:{ all -> 0x0038 }
        r2.remove(r4);	 Catch:{ all -> 0x0038 }
        r2 = r3.e;	 Catch:{ all -> 0x0038 }
        r2.remove(r4);	 Catch:{ all -> 0x0038 }
        r4 = r3.d;	 Catch:{ all -> 0x0038 }
        r4.put(r1, r5);	 Catch:{ all -> 0x0038 }
        r4 = r3.a;	 Catch:{ all -> 0x0038 }
        r4.set(r0, r1);	 Catch:{ all -> 0x0038 }
        if (r6 == 0) goto L_0x0031;
    L_0x002e:
        r3.e(r0);	 Catch:{ all -> 0x0038 }
    L_0x0031:
        r4 = 1;
        monitor-exit(r3);
        return r4;
    L_0x0034:
        monitor-exit(r3);
        return r2;
    L_0x0036:
        monitor-exit(r3);
        return r2;
    L_0x0038:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abov.a(java.lang.String, java.lang.Object, boolean):boolean");
    }

    public final synchronized void a(String str, boolean z) {
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            this.d.remove(str);
            this.a.remove(str);
            this.e.remove(str);
            if (z) {
                xak.a();
                d(indexOf, 1);
            }
        }
    }

    public final synchronized void a() {
        this.a.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        b();
    }

    /* JADX WARNING: Missing block: B:19:0x006e, code skipped:
            return;
     */
    public final synchronized void a(defpackage.apxu r5, boolean r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;	 Catch:{ all -> 0x0092 }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ all -> 0x0092 }
        r5.a(r0);	 Catch:{ all -> 0x0092 }
        r1 = r5.h;	 Catch:{ all -> 0x0092 }
        r0 = r0.d;	 Catch:{ all -> 0x0092 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x0092 }
        if (r0 != 0) goto L_0x006f;
    L_0x0014:
        r0 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;	 Catch:{ all -> 0x0092 }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ all -> 0x0092 }
        r5.a(r0);	 Catch:{ all -> 0x0092 }
        r1 = r5.h;	 Catch:{ all -> 0x0092 }
        r0 = r0.d;	 Catch:{ all -> 0x0092 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x006d;
    L_0x0027:
        r0 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;	 Catch:{ all -> 0x0092 }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ all -> 0x0092 }
        r5.a(r0);	 Catch:{ all -> 0x0092 }
        r1 = r5.h;	 Catch:{ all -> 0x0092 }
        r2 = r0.d;	 Catch:{ all -> 0x0092 }
        r1 = r1.b(r2);	 Catch:{ all -> 0x0092 }
        if (r1 != 0) goto L_0x003d;
    L_0x003a:
        r0 = r0.b;	 Catch:{ all -> 0x0092 }
        goto L_0x0041;
    L_0x003d:
        r0 = r0.a(r1);	 Catch:{ all -> 0x0092 }
    L_0x0041:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) r0;	 Catch:{ all -> 0x0092 }
        r0 = r0.d;	 Catch:{ all -> 0x0092 }
        r1 = 0;
    L_0x0046:
        r2 = r4.a;	 Catch:{ all -> 0x0092 }
        r2 = r2.size();	 Catch:{ all -> 0x0092 }
        if (r1 >= r2) goto L_0x006d;
    L_0x004e:
        r2 = r4.a;	 Catch:{ all -> 0x0092 }
        r2 = r2.get(r1);	 Catch:{ all -> 0x0092 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0092 }
        r3 = r4.d;	 Catch:{ all -> 0x0092 }
        r3 = r3.get(r2);	 Catch:{ all -> 0x0092 }
        r3 = defpackage.abov.b(r3);	 Catch:{ all -> 0x0092 }
        r3 = android.text.TextUtils.equals(r0, r3);	 Catch:{ all -> 0x0092 }
        if (r3 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x006a;
    L_0x0067:
        r4.a(r2, r5, r6);	 Catch:{ all -> 0x0092 }
    L_0x006a:
        r1 = r1 + 1;
        goto L_0x0046;
    L_0x006d:
        monitor-exit(r4);
        return;
    L_0x006f:
        r0 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;	 Catch:{ all -> 0x0092 }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ all -> 0x0092 }
        r5.a(r0);	 Catch:{ all -> 0x0092 }
        r1 = r5.h;	 Catch:{ all -> 0x0092 }
        r2 = r0.d;	 Catch:{ all -> 0x0092 }
        r1 = r1.b(r2);	 Catch:{ all -> 0x0092 }
        if (r1 != 0) goto L_0x0085;
    L_0x0082:
        r0 = r0.b;	 Catch:{ all -> 0x0092 }
        goto L_0x0089;
    L_0x0085:
        r0 = r0.a(r1);	 Catch:{ all -> 0x0092 }
    L_0x0089:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction) r0;	 Catch:{ all -> 0x0092 }
        r0 = r0.d;	 Catch:{ all -> 0x0092 }
        r4.a(r0, r5, r6);	 Catch:{ all -> 0x0092 }
        monitor-exit(r4);
        return;
    L_0x0092:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x0096;
    L_0x0095:
        throw r5;
    L_0x0096:
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abov.a(apxu, boolean):void");
    }

    /* JADX WARNING: Missing block: B:47:0x0071, code skipped:
            return;
     */
    private final synchronized void a(java.lang.String r4, defpackage.apxu r5, boolean r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0072 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0072 }
        r1 = r0 instanceof defpackage.audr;	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x000f;
    L_0x000b:
        r3.a(r4, r6);	 Catch:{ all -> 0x0072 }
        goto L_0x0070;
    L_0x000f:
        r1 = r0 instanceof defpackage.audn;	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x005c;
    L_0x0013:
        r0 = (defpackage.audn) r0;	 Catch:{ all -> 0x0072 }
        r1 = r0.a;	 Catch:{ all -> 0x0072 }
        r1 = r1 & 8;
        r2 = 0;
        if (r1 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r0.d;	 Catch:{ all -> 0x0072 }
        if (r0 != 0) goto L_0x0024;
    L_0x0020:
        r0 = defpackage.axak.a;	 Catch:{ all -> 0x0072 }
        goto L_0x0024;
    L_0x0023:
        r0 = r2;
    L_0x0024:
        r0 = defpackage.ajzv.a(r0);	 Catch:{ all -> 0x0072 }
        if (r0 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x005c;
    L_0x002b:
        r0 = defpackage.ajzv.b(r0);	 Catch:{ all -> 0x0072 }
        r1 = r0 instanceof defpackage.auej;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x0033:
        r1 = r0 instanceof defpackage.audv;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x0037:
        r1 = r0 instanceof defpackage.auel;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x003b:
        r1 = r0 instanceof defpackage.audr;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x003f:
        r1 = r0 instanceof defpackage.audt;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x0043:
        r1 = r0 instanceof defpackage.aued;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x0047:
        r1 = r0 instanceof defpackage.audn;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x004b:
        r1 = r0 instanceof defpackage.auef;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x004f:
        r1 = r0 instanceof defpackage.audx;	 Catch:{ all -> 0x0072 }
        if (r1 != 0) goto L_0x0059;
    L_0x0053:
        r1 = r0 instanceof defpackage.aufj;	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0059;
    L_0x0058:
        r0 = r2;
    L_0x0059:
        r3.a(r4, r0, r6);	 Catch:{ all -> 0x0072 }
    L_0x005c:
        r0 = r3.a;	 Catch:{ all -> 0x0072 }
        r0 = r0.indexOf(r4);	 Catch:{ all -> 0x0072 }
        if (r0 < 0) goto L_0x0070;
    L_0x0064:
        r1 = r3.e;	 Catch:{ all -> 0x0072 }
        r1.put(r4, r5);	 Catch:{ all -> 0x0072 }
        if (r6 == 0) goto L_0x0070;
    L_0x006b:
        r3.e(r0);	 Catch:{ all -> 0x0072 }
        monitor-exit(r3);
        return;
    L_0x0070:
        monitor-exit(r3);
        return;
    L_0x0072:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abov.a(java.lang.String, apxu, boolean):void");
    }

    /* JADX WARNING: Missing block: B:10:0x001f, code skipped:
            return;
     */
    public final synchronized void a(defpackage.audp r2, int r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r2 = defpackage.abov.a(r2);	 Catch:{ all -> 0x0020 }
        r2 = defpackage.abov.a(r2);	 Catch:{ all -> 0x0020 }
        if (r2 == 0) goto L_0x001e;
    L_0x000b:
        r0 = r1.f;	 Catch:{ all -> 0x0020 }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001e;
    L_0x0013:
        r0 = r1.f;	 Catch:{ all -> 0x0020 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0020 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0020 }
        monitor-exit(r1);
        return;
    L_0x001e:
        monitor-exit(r1);
        return;
    L_0x0020:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abov.a(audp, int):void");
    }

    public final synchronized apxu a(String str) {
        return (apxu) this.e.get(str);
    }

    public final synchronized boolean b(int i) {
        if (i >= this.a.size()) {
            return false;
        }
        return this.f.containsKey((String) this.a.get(i));
    }

    public final synchronized int d(int i) {
        String str = (String) this.a.get(i);
        if (str == null) {
            return 0;
        }
        return ((Integer) this.f.get(str)).intValue();
    }

    public final synchronized int d() {
        return this.a.size();
    }

    public final synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final synchronized Object c(int i) {
        return this.d.get((String) this.a.get(i));
    }
}
