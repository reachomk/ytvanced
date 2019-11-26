package defpackage;

import android.util.Log;
import java.util.Map;

/* renamed from: afpl */
final class afpl implements Runnable {
    private final /* synthetic */ afpf a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Throwable c;
    private final /* synthetic */ afpi d;
    private final /* synthetic */ int e;

    public final void run() {
        afpi afpi = this.d;
        Map map;
        if (afpi.e) {
            int i = this.e;
            afpf afpf = this.a;
            String str = this.b;
            Throwable th = this.c;
            apux apux = (apux) apuy.e.createBuilder();
            apvd apvd = (apvd) apve.e.createBuilder();
            int i2 = i - 1;
            if (i != 0) {
                i = 3;
                i2 = i2 != 0 ? i2 != 1 ? 1 : 3 : 2;
                apvd.copyOnWrite();
                apve apve = (apve) apvd.instance;
                apve.a |= 2;
                apve.c = i2 - 1;
                String canonicalName = th.getClass().getCanonicalName();
                apvd.copyOnWrite();
                apve = (apve) apvd.instance;
                if (canonicalName != null) {
                    apve.a |= 4;
                    apve.d = canonicalName;
                    apvd.copyOnWrite();
                    apve apve2 = (apve) apvd.instance;
                    if (str != null) {
                        apvg apvg;
                        apve2.a |= 1;
                        apve2.b = str;
                        apux.copyOnWrite();
                        apuy apuy = (apuy) apux.instance;
                        apuy.d = (apve) ((anxl) apvd.build());
                        apuy.a |= 4;
                        apuz apuz = (apuz) apva.d.createBuilder();
                        switch (afpf.ordinal()) {
                            case 0:
                                i = 2;
                                break;
                            case 1:
                                break;
                            case 2:
                                i = 4;
                                break;
                            case 3:
                                i = 6;
                                break;
                            case 4:
                                i = 9;
                                break;
                            case 5:
                                i = 16;
                                break;
                            case 6:
                                i = 28;
                                break;
                            case 7:
                                i = 19;
                                break;
                            case 8:
                                i = 27;
                                break;
                            case 9:
                                i = 21;
                                break;
                            case 10:
                                i = 20;
                                break;
                            case 11:
                                i = 24;
                                break;
                            case 12:
                                i = 13;
                                break;
                            case 13:
                                i = 17;
                                break;
                            case 14:
                                i = 10;
                                break;
                            case 15:
                                i = 22;
                                break;
                            case 16:
                                i = 7;
                                break;
                            case 17:
                                i = 26;
                                break;
                            case 18:
                                i = 8;
                                break;
                            case 19:
                                i = 25;
                                break;
                            case 20:
                                i = 11;
                                break;
                            case 21:
                                i = 15;
                                break;
                            case 22:
                                i = 18;
                                break;
                            case 23:
                                i = 5;
                                break;
                            case 24:
                                i = 23;
                                break;
                            case 25:
                                i = 14;
                                break;
                            case 26:
                                i = 12;
                                break;
                            case 27:
                                i = 29;
                                break;
                            case 29:
                                i = 31;
                                break;
                            case 31:
                                i = 33;
                                break;
                            case 32:
                                i = 34;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        apuz.copyOnWrite();
                        apva apva = (apva) apuz.instance;
                        apva.a |= 1;
                        apva.b = i - 1;
                        map = afpi.b;
                        apvf apvf = (apvf) apvg.g.createBuilder();
                        if (map != null) {
                            apvg apvg2;
                            long parseLong;
                            String str2 = "innertube.run.job";
                            if (map.containsKey(str2)) {
                                str2 = (String) map.get(str2);
                                apvf.copyOnWrite();
                                apvg2 = (apvg) apvf.instance;
                                if (str2 != null) {
                                    apvg2.a |= 32;
                                    apvg2.f = str2;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            str2 = "innertube.build.label";
                            if (map.containsKey(str2)) {
                                str2 = (String) map.get(str2);
                                apvf.copyOnWrite();
                                apvg2 = (apvg) apvf.instance;
                                if (str2 != null) {
                                    apvg2.a = 4 | apvg2.a;
                                    apvg2.d = str2;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            str2 = "innertube.build.timestamp";
                            if (map.containsKey(str2)) {
                                parseLong = Long.parseLong((String) map.get(str2), 10);
                                apvf.copyOnWrite();
                                apvg apvg3 = (apvg) apvf.instance;
                                apvg3.a = 8 | apvg3.a;
                                apvg3.e = parseLong;
                            }
                            String str3 = "innertube.build.changelist";
                            if (map.containsKey(str3)) {
                                parseLong = Long.parseLong((String) map.get(str3), 10);
                                apvf.copyOnWrite();
                                apvg apvg4 = (apvg) apvf.instance;
                                apvg4.a |= 1;
                                apvg4.b = parseLong;
                            }
                            str3 = "innertube.build.experiments.source_version";
                            if (map.containsKey(str3)) {
                                long parseLong2 = Long.parseLong((String) map.get(str3), 10);
                                apvf.copyOnWrite();
                                apvg = (apvg) apvf.instance;
                                apvg.a |= 2;
                                apvg.c = parseLong2;
                            }
                            apvg = (apvg) ((anxl) apvf.build());
                        } else {
                            apvg = (apvg) ((anxl) apvf.build());
                        }
                        apuz.copyOnWrite();
                        apva = (apva) apuz.instance;
                        if (apvg != null) {
                            apva.c = apvg;
                            apva.a |= 2;
                            apux.copyOnWrite();
                            apuy apuy2 = (apuy) apux.instance;
                            apuy2.b = (apva) ((anxl) apuz.build());
                            apuy2.a |= 1;
                            apvb apvb = (apvb) apvc.c.createBuilder();
                            aput aput = (aput) apuu.c.createBuilder();
                            angt angt = (angt) angu.d.createBuilder();
                            angp a = angw.a(th);
                            angt.copyOnWrite();
                            angu angu = (angu) angt.instance;
                            angu.b = (angq) ((anxl) a.build());
                            angu.a |= 1;
                            while (true) {
                                Throwable cause = th.getCause();
                                if (!(cause == null || cause == th)) {
                                    a = angw.a(th.getCause());
                                    angt.copyOnWrite();
                                    angu = (angu) angt.instance;
                                    if (!angu.c.a()) {
                                        angu.c = anxl.mutableCopy(angu.c);
                                    }
                                    angu.c.add((angq) ((anxl) a.build()));
                                    th = th.getCause();
                                }
                            }
                            anvu toByteString = ((angu) ((anxl) angt.build())).toByteString();
                            aput.copyOnWrite();
                            apuu apuu = (apuu) aput.instance;
                            if (toByteString != null) {
                                apuu.a |= 1;
                                apuu.b = toByteString;
                                apuu apuu2 = (apuu) ((anxl) aput.build());
                                apvb.copyOnWrite();
                                apvc apvc = (apvc) apvb.instance;
                                if (apuu2 != null) {
                                    apvc.b = apuu2;
                                    apvc.a = 2;
                                    apux.copyOnWrite();
                                    apuy apuy3 = (apuy) apux.instance;
                                    apuy3.c = (apvc) ((anxl) apvb.build());
                                    apuy3.a |= 2;
                                    afpi.c.a((apuy) ((anxl) apux.build()));
                                    return;
                                }
                                throw new NullPointerException();
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw null;
        }
        String stackTraceString = Log.getStackTraceString(this.c);
        map = this.d.a(this.b);
        xvo a2 = this.d.a(this.e, this.a, this.c.getClass().getCanonicalName());
        map.put("stacktrace.java", stackTraceString);
        this.d.a(a2, map);
    }

    afpl(afpi afpi, int i, afpf afpf, String str, Throwable th) {
        this.d = afpi;
        this.e = i;
        this.a = afpf;
        this.b = str;
        this.c = th;
    }
}
