package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: afyx */
public final class afyx implements wxx {
    private final bcaa a;
    private final bcaa b;

    public afyx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final int a(Bundle bundle) {
        agpo agpo = (agpo) this.a.get();
        avoa avoa = agpo.d.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        avpy avpy = avoa.c;
        if (avpy == null) {
            avpy = avpy.d;
        }
        if (avpy.b) {
            String c = ((agwc) agpo.h.get()).c();
            if (!(c == null || c.equals("NO_OP_STORE_TAG"))) {
                Iterator it;
                agvz agvz;
                agqy agqy;
                Iterator it2;
                agvz agvz2;
                long j;
                avsi avsi;
                int a;
                int parseInt;
                agvz b = ((agwc) agpo.h.get()).b();
                Collection<agqy> a2 = b.k().a();
                Collection a3 = b.n().a();
                Object obj = (a2.isEmpty() && a3.isEmpty()) ? null : 1;
                String a4 = xuq.a("offline_client_state_should_log_%s", c);
                if (obj != null) {
                    agpo.c.edit().putBoolean(a4, true).apply();
                } else if (agpo.c.getBoolean(a4, false)) {
                    agpo.c.edit().putBoolean(a4, false).apply();
                }
                Map hashMap = new HashMap();
                long j2 = 0;
                long j3 = 0;
                for (agqy agqy2 : a2) {
                    hashMap.put(agqy2.a(), agqy2);
                    agvz = b;
                    long j4 = agqy2.f;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    j4 = agqy2.g;
                    if (j4 > j3) {
                        j3 = j4;
                    }
                    b = agvz;
                }
                agvz = b;
                avnj avnj = (avnj) avng.m.createBuilder();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = a2.iterator();
                while (it3.hasNext()) {
                    agqy = (agqy) it3.next();
                    avnn avnn = (avnn) avnk.p.createBuilder();
                    String a5 = agqy.a();
                    avnn.copyOnWrite();
                    it2 = it3;
                    avnk avnk = (avnk) avnn.instance;
                    if (a5 != null) {
                        int i;
                        avnk.a |= 1;
                        avnk.b = a5;
                        switch (agqy.u().ordinal()) {
                            case 0:
                                i = 7;
                                break;
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 18;
                                break;
                            case 3:
                            case 4:
                            case 12:
                                i = 3;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 10;
                                break;
                            case 11:
                                i = 4;
                                break;
                            case 13:
                                i = 17;
                                break;
                            case 14:
                                i = 11;
                                break;
                            case 15:
                                i = 12;
                                break;
                            case 16:
                                i = 13;
                                break;
                            case 17:
                                i = 5;
                                break;
                            case 18:
                                i = 8;
                                break;
                            case 19:
                                i = 9;
                                break;
                            case 20:
                                i = 16;
                                break;
                            case 21:
                                i = 15;
                                break;
                            case 22:
                                i = 14;
                                break;
                            case 23:
                                i = 6;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        avnn.copyOnWrite();
                        avnk = (avnk) avnn.instance;
                        avnk.a |= 2;
                        i--;
                        avnk.c = i;
                        i = avne.a(i);
                        if (i != 0 && i == 10) {
                            i = agqy.o();
                            if (agqy.k()) {
                                i |= agpp.a(agqy.o.c);
                            }
                            avnn.copyOnWrite();
                            avnk = (avnk) avnn.instance;
                            avnk.a |= 4;
                            avnk.d = i;
                        }
                        agvz2 = agvz;
                        j = j2;
                        long g = agqy.g();
                        avnn.copyOnWrite();
                        avnk = (avnk) avnn.instance;
                        avnk.a |= 8;
                        avnk.e = g;
                        avsi = agqy.b;
                        avnn.copyOnWrite();
                        avnk avnk2 = (avnk) avnn.instance;
                        if (avsi != null) {
                            avnk2.a |= 16;
                            avnk2.f = avsi.k;
                            a = agqy.m.a();
                            avnn.copyOnWrite();
                            avnk2 = (avnk) avnn.instance;
                            if (a != 0) {
                                axuy axuy;
                                avnk2.a |= 32;
                                avnk2.g = a - 1;
                                g = agqy.f;
                                avnn.copyOnWrite();
                                avnk = (avnk) avnn.instance;
                                avnk.a |= 64;
                                avnk.h = g;
                                agqw agqw = agqy.j;
                                if (agqw != null) {
                                    g = agqw.d;
                                    avnn.copyOnWrite();
                                    avnk = (avnk) avnn.instance;
                                    avnk.a |= 128;
                                    avnk.i = g;
                                    agqw = agqy.j;
                                    g = TimeUnit.MILLISECONDS.toSeconds(agqw.f() - agqw.e.a());
                                    avnn.copyOnWrite();
                                    avnk = (avnk) avnn.instance;
                                    avnk.a |= 256;
                                    avnk.j = g;
                                }
                                g = agqy.g;
                                avnn.copyOnWrite();
                                avnk = (avnk) avnn.instance;
                                avnk.a |= 16384;
                                avnk.l = g;
                                boolean z = agqy.e;
                                avnn.copyOnWrite();
                                avnk2 = (avnk) avnn.instance;
                                avnk2.a |= 1024;
                                avnk2.k = z ^ 1;
                                z = agqy.z();
                                avnn.copyOnWrite();
                                avnk2 = (avnk) avnn.instance;
                                avnk2.a |= 32768;
                                avnk2.m = z;
                                agqn agqn = agqy.n;
                                a = (agqn == null || !agqn.h) ? 0 : 1;
                                avnn.copyOnWrite();
                                avnk2 = (avnk) avnn.instance;
                                avnk2.a |= 65536;
                                avnk2.n = a ^ 1;
                                agqn = agqy.n;
                                CharSequence charSequence = agqn == null ? null : agqn.g;
                                axux axux = (axux) axuy.d.createBuilder();
                                axux.a(1);
                                if (TextUtils.isEmpty(charSequence)) {
                                    axuy = (axuy) ((anxl) axux.build());
                                } else {
                                    List c2 = amqz.a(';').c(charSequence);
                                    if (c2.size() != 2) {
                                        axuy = (axuy) ((anxl) axux.build());
                                    } else if (((String) c2.get(0)).length() < 2) {
                                        axuy = (axuy) ((anxl) axux.build());
                                    } else {
                                        a4 = ((String) c2.get(0)).substring(((String) c2.get(0)).length() - 2);
                                        if (((String) c2.get(1)).length() <= 0) {
                                            axuy = (axuy) ((anxl) axux.build());
                                        } else {
                                            String substring = ((String) c2.get(1)).substring(((String) c2.get(1)).length() - 1);
                                            try {
                                                parseInt = Integer.parseInt(a4, 16);
                                                axux.copyOnWrite();
                                                axuy axuy2 = (axuy) axux.instance;
                                                axuy2.a |= 1;
                                                axuy2.b = parseInt;
                                                a = Integer.parseInt(substring);
                                                if (a == 1) {
                                                    axux.a(2);
                                                } else if (a == 2) {
                                                    axux.a(3);
                                                } else if (a != 3) {
                                                    axux.a(1);
                                                } else {
                                                    axux.a(4);
                                                }
                                                axuy = (axuy) ((anxl) axux.build());
                                            } catch (NumberFormatException unused) {
                                                axuy = (axuy) ((anxl) axux.build());
                                            }
                                        }
                                    }
                                }
                                avnn.copyOnWrite();
                                avnk2 = (avnk) avnn.instance;
                                if (axuy != null) {
                                    avnk2.o = axuy;
                                    avnk2.a |= 131072;
                                    arrayList.add((avnk) ((anxl) avnn.build()));
                                    agvz = agvz2;
                                    it3 = it2;
                                    j2 = j;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                agvz2 = agvz;
                j = j2;
                avnj.copyOnWrite();
                avng avng = (avng) avnj.instance;
                if (!avng.b.a()) {
                    avng.b = anxl.mutableCopy(avng.b);
                }
                anvf.addAll(arrayList, avng.b);
                arrayList = new ArrayList();
                it3 = a3.iterator();
                while (it3.hasNext()) {
                    agqk agqk = (agqk) it3.next();
                    avnl avnl = (avnl) avni.k.createBuilder();
                    a4 = agqk.a.a;
                    avnl.copyOnWrite();
                    avni avni = (avni) avnl.instance;
                    if (a4 != null) {
                        avni.a |= 1;
                        avni.b = a4;
                        List list = agqk.b;
                        avnl.copyOnWrite();
                        avni = (avni) avnl.instance;
                        if (!avni.c.a()) {
                            avni.c = anxl.mutableCopy(avni.c);
                        }
                        anvf.addAll(list, avni.c);
                        parseInt = agqk.b.size();
                        avnl.copyOnWrite();
                        avni = (avni) avnl.instance;
                        avni.a |= 2;
                        avni.d = parseInt;
                        it = agqk.b.iterator();
                        it2 = it3;
                        a = 0;
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (it.hasNext()) {
                            Iterator it4 = it;
                            agqy = (agqy) hashMap.get((String) it.next());
                            if (agqy != null) {
                                switch (agqy.u().ordinal()) {
                                    case 0:
                                        break;
                                    case 1:
                                        i2++;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                        i5++;
                                        break;
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                        i3++;
                                        break;
                                    case 18:
                                        i4++;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            a++;
                            it = it4;
                        }
                        avnl.copyOnWrite();
                        avni avni2 = (avni) avnl.instance;
                        Map map = hashMap;
                        avni2.a |= 4;
                        avni2.e = i2;
                        avnl.copyOnWrite();
                        avni avni3 = (avni) avnl.instance;
                        avni3.a |= 8;
                        avni3.f = i3;
                        avnl.copyOnWrite();
                        avni3 = (avni) avnl.instance;
                        avni3.a |= 16;
                        avni3.g = i5;
                        avnl.copyOnWrite();
                        avni3 = (avni) avnl.instance;
                        avni3.a |= 32;
                        avni3.h = i4;
                        avnl.copyOnWrite();
                        avni3 = (avni) avnl.instance;
                        avni3.a |= 64;
                        avni3.i = a;
                        avsi = agqk.c;
                        avnl.copyOnWrite();
                        avni avni4 = (avni) avnl.instance;
                        if (avsi != null) {
                            avni4.a |= 128;
                            avni4.j = avsi.k;
                            arrayList.add((avni) ((anxl) avnl.build()));
                            it3 = it2;
                            hashMap = map;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
                avnj.copyOnWrite();
                avng = (avng) avnj.instance;
                if (!avng.c.a()) {
                    avng.c = anxl.mutableCopy(avng.c);
                }
                anvf.addAll(arrayList, avng.c);
                long c3 = agpo.f.c();
                avnj.copyOnWrite();
                avng avng2 = (avng) avnj.instance;
                avng2.a |= 1;
                avng2.d = c3;
                avnj.copyOnWrite();
                avng avng3 = (avng) avnj.instance;
                avng3.a |= 4;
                avng3.e = j3;
                avnj.copyOnWrite();
                avng3 = (avng) avnj.instance;
                avng3.a |= 8;
                avng3.f = j;
                c3 = agpo.c.getLong(xuq.a("%s_offline_download_success", c), 0);
                avnj.copyOnWrite();
                avng avng4 = (avng) avnj.instance;
                avng4.a |= 16;
                avng4.g = c3;
                boolean b2 = agpo.a.b();
                avnj.copyOnWrite();
                avng3 = (avng) avnj.instance;
                avng3.a |= 32;
                avng3.h = b2;
                int m = agpo.b.m();
                avnj.copyOnWrite();
                avng3 = (avng) avnj.instance;
                if (m != 0) {
                    avng3.a |= 64;
                    avng3.i = m - 1;
                    if (agpo.a.a() != -1.0f) {
                        float a6 = agpo.a.a();
                        avnj.copyOnWrite();
                        avng3 = (avng) avnj.instance;
                        avng3.a |= 128;
                        avng3.j = (int) (a6 * 100.0f);
                    }
                    avnj.copyOnWrite();
                    avng4 = (avng) avnj.instance;
                    avng4.a |= 256;
                    avng4.k = false;
                    afzh d = agvz2.d();
                    apxn a7 = agpo.e.a();
                    if ((a7.a & 524288) != 0) {
                        avnm avnm = a7.l;
                        if (avnm == null) {
                            avnm = avnm.q;
                        }
                        if (avnm.i && d != null) {
                            avms a8 = d.a(false);
                            avnj.copyOnWrite();
                            avng4 = (avng) avnj.instance;
                            if (a8 != null) {
                                avng4.l = a8;
                                avng4.a |= 512;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                    ((agps) agpo.g.get()).a((avng) ((anxl) avnj.build()));
                    ((agpn) this.b.get()).a();
                } else {
                    throw new NullPointerException();
                }
            }
        }
        return 0;
    }
}
