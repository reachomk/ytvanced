package defpackage;

import android.net.NetworkInfo;
import android.os.Handler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aeqo */
public final class aeqo implements aeqt {
    public final aajk a;
    public final Set b = new HashSet();
    public final owt c = new aeqp(this);
    private final bcaa d;
    private final xhv e;
    private final Map f = new HashMap();
    private final aeqn g = new aeqn();
    private String h;
    private String i;
    private boolean j;

    public aeqo(bcaa bcaa, xhv xhv, aajk aajk) {
        this.d = bcaa;
        this.e = xhv;
        this.a = aajk;
    }

    public final void c() {
        a((aajj) this.a.get()).c();
    }

    public final synchronized long a() {
        return e().b;
    }

    public final synchronized long d() {
        long d = a((aajj) this.a.get()).d();
        if (d > 0) {
            return d;
        }
        return e().b;
    }

    public final owt b() {
        return this.c;
    }

    public final void a(Handler handler, ova ova) {
        this.g.a.a(handler, ova);
    }

    public final void a(ova ova) {
        this.g.a.a((Object) ova);
    }

    public final synchronized aequ e() {
        aajj aajj = (aajj) this.a.get();
        NetworkInfo b = this.e.b();
        int b2 = this.e.b(b);
        long a = a(aajj).a();
        if (a <= 0) {
            aosb aosb;
            awdg awdg = aajj.c;
            if ((awdg.a & 8192) != 0) {
                aosb = awdg.i;
                if (aosb == null) {
                    aosb = aosb.n;
                }
                if (aosb.i.size() != 0) {
                    aosb = aajj.c.i;
                    if (aosb == null) {
                        aosb = aosb.n;
                    }
                    for (aosf aosf : r3.i) {
                        int a2 = aqvd.a(aosf.b);
                        if (a2 != 0) {
                            continue;
                        } else {
                            a2 = 1;
                            continue;
                        }
                        if (a2 == b2) {
                            a = aosf.c;
                            break;
                        }
                    }
                }
            }
            a = 0;
            if (a <= 0) {
                awdg = aajj.c;
                if ((awdg.a & 8192) != 0) {
                    aosb = awdg.i;
                    if (aosb == null) {
                        aosb = aosb.n;
                    }
                    if (aosb.c) {
                        if (aajj.az() > 0) {
                            return new aequ(aajj.az(), 3, b2);
                        }
                    }
                }
                a = this.e.a(b);
                if (a != -1) {
                    return new aequ(a, 2, b2);
                }
                int i;
                awdg awdg2 = aajj.c;
                if ((awdg2.a & 2) != 0) {
                    arhh arhh = awdg2.d;
                    if (arhh == null) {
                        arhh = arhh.bv;
                    }
                    i = arhh.i << 3;
                } else {
                    i = 0;
                }
                if (i == 0) {
                    i = 800000;
                }
                return new aequ((long) i, 4, b2);
            }
            return new aequ(a, 2, b2);
        }
        return new aequ(a, 1, b2);
    }

    public final void a(ovi ovi, ovm ovm, boolean z) {
        try {
            a((aajj) this.a.get()).a(ovi, ovm, z);
        } catch (RuntimeException e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
            stringBuilder.append("onTransferStart got an exception: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
    }

    public final synchronized void b(ovi ovi, ovm ovm, boolean z) {
        try {
            aeqt a = a((aajj) this.a.get());
            this.g.a(a);
            a.b(ovi, ovm, z);
            this.j = false;
        } catch (RuntimeException e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
            stringBuilder.append("onTransferStart got an exception: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
    }

    public final synchronized void a(ovi ovi, ovm ovm, boolean z, int i) {
        try {
            aeqt a = a((aajj) this.a.get());
            if (this.j) {
                this.g.a(null);
                this.f.remove(this.i);
                return;
            }
            a.a(ovi, ovm, z, i);
        } catch (RuntimeException e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 37);
            stringBuilder.append("onBytesTransferred got an exception: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
    }

    public final synchronized void c(ovi ovi, ovm ovm, boolean z) {
        try {
            aeqt a = a((aajj) this.a.get());
            if (this.j) {
                this.f.remove(this.i);
            } else {
                a.c(ovi, ovm, z);
            }
            this.g.a(null);
        } catch (RuntimeException e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
            stringBuilder.append("onTransferEnd got an exception: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
    }

    public final synchronized void a(long j) {
        a((aajj) this.a.get()).a(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    private final defpackage.aeqt a(defpackage.aajj r5) {
        /*
        r4 = this;
        r0 = r5.c;
        r1 = r0.a;
        r1 = r1 & 8192;
        r2 = 1;
        r3 = 2;
        if (r1 == 0) goto L_0x002e;
    L_0x000a:
        r0 = r0.i;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.aosb.n;
    L_0x0010:
        r0 = r0.e;
        r0 = defpackage.aose.a(r0);
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x002e;
    L_0x0019:
        if (r0 == r2) goto L_0x002e;
    L_0x001b:
        r5 = r5.c;
        r5 = r5.i;
        if (r5 != 0) goto L_0x0023;
    L_0x0021:
        r5 = defpackage.aosb.n;
    L_0x0023:
        r5 = r5.e;
        r5 = defpackage.aose.a(r5);
        if (r5 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x002f;
    L_0x002c:
        r5 = 1;
        goto L_0x002f;
    L_0x002e:
        r5 = 2;
    L_0x002f:
        r0 = r5 + -1;
        if (r5 == 0) goto L_0x007a;
    L_0x0033:
        if (r0 == r3) goto L_0x0048;
    L_0x0035:
        r5 = 3;
        if (r0 == r5) goto L_0x0043;
    L_0x0038:
        r1 = 4;
        if (r0 == r1) goto L_0x003e;
    L_0x003b:
        r5 = "";
        goto L_0x004c;
    L_0x003e:
        r5 = r4.a(r5);
        goto L_0x004c;
    L_0x0043:
        r5 = r4.a(r3);
        goto L_0x004c;
    L_0x0048:
        r5 = r4.a(r2);
    L_0x004c:
        r0 = r4.h;
        r0 = r5.equals(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x0054:
        r0 = r4.h;
        r4.i = r0;
        r4.h = r5;
        r4.j = r2;
    L_0x005c:
        r5 = r4.f;
        r0 = r4.h;
        r5 = r5.get(r0);
        r5 = (defpackage.aeqt) r5;
        if (r5 != 0) goto L_0x0079;
    L_0x0068:
        r4.j = r2;
        r5 = r4.d;
        r5 = r5.get();
        r5 = (defpackage.aeqt) r5;
        r0 = r4.f;
        r1 = r4.h;
        r0.put(r1, r5);
    L_0x0079:
        return r5;
    L_0x007a:
        r5 = 0;
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqo.a(aajj):aeqt");
    }

    private final String a(int i) {
        String[] h = this.e.h();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(i, h.length); i2++) {
            stringBuilder.append(h[i2]);
        }
        return stringBuilder.toString();
    }
}
