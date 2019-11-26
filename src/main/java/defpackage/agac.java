package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: agac */
final /* synthetic */ class agac implements Runnable {
    private final afzs a;
    private final String b;
    private final int c = Integer.MAX_VALUE;
    private final avsi d;
    private final agqq e;
    private final byte[] f;
    private final int g;
    private final int h;

    agac(afzs afzs, String str, avsi avsi, agqq agqq, byte[] bArr, int i, int i2) {
        this.a = afzs;
        this.b = str;
        this.d = avsi;
        this.e = agqq;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    public final void run() {
        afzs afzs = this.a;
        String str = this.b;
        int i = this.c;
        avsi avsi = this.d;
        agqq agqq = this.e;
        byte[] bArr = this.f;
        int i2 = this.g;
        int i3 = this.h;
        long a = afzs.c.a();
        xak.b();
        if (((afzg) afzs.l.get()).i()) {
            agfi agfi = (agfi) afzs.k.get();
            if (agfi.l(str) == null) {
                StringBuilder stringBuilder;
                try {
                    agra a2 = ((agul) afzs.h.get()).a(str, i);
                    String str2;
                    if (a2 == null) {
                        String valueOf = String.valueOf(str);
                        str2 = "Not adding null playlist ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            str2.concat(valueOf);
                        }
                        afzs.m(str);
                        return;
                    }
                    int b = ((agvs) afzs.e.get()).b(avsi);
                    agqi agqi = a2.a;
                    agqi agqi2 = agqi;
                    agqq agqq2 = agqq;
                    agra agra = a2;
                    byte[] bArr2 = bArr;
                    i = i3;
                    byte[] bArr3 = bArr;
                    agfi agfi2 = agfi;
                    long j = a;
                    int i4 = i2;
                    boolean a3 = agfi.a(agqi, avsi, b, i2, bArr2, j, i);
                    String str3 = " to database";
                    String str4 = "Failed inserting playlist ";
                    if (a3) {
                        afzq afzq = (afzq) afzs.o.get();
                        agpy agpy = agqi2.c;
                        if (agpy != null) {
                            afzq.a(agpy);
                        }
                        xak.b();
                        try {
                            agpi agpi = (agpi) afzs.m.get();
                            agpi.a(agpi.d(agqi2.a));
                            agpi.a(agqi2);
                            agpy agpy2 = agqi2.c;
                            if (agpy2 != null) {
                                agpi.a(agpy2);
                            }
                        } catch (IOException | ExecutionException e) {
                            str2 = String.valueOf(agqi2.a);
                            String str5 = "Failed saving playlist thumbnail for ";
                            xtl.b(str2.length() == 0 ? new String(str5) : str5.concat(str2), e);
                        }
                        ((agfi) afzs.k.get()).m(agqi2.a);
                        agfi2.m(agqi2.a);
                        String.valueOf(str).length();
                        afzs.i.a(new agky(str));
                        List<agqp> list = agra.b;
                        Set a4 = ((agci) afzs.p.get()).a((List) list);
                        avsi avsi2 = avsi;
                        afzq afzq2 = afzq;
                        String str6 = str4;
                        int i5 = i4;
                        agqi agqi3 = agqi2;
                        String str7 = str3;
                        if (agfi2.a(agqi2, (List) list, avsi, b, a4, agqq2, i5, bArr3)) {
                            agqi agqi4 = agqi3;
                            agdu a5 = afzs.s.a(agqi4, (Collection) a4);
                            agci agci = (agci) afzs.p.get();
                            agdz agdz = (agdz) afzs.r.get();
                            agdz.a(agci.a().size());
                            agdz.b().a((Collection) a4);
                            String.valueOf(agqi4.a).length();
                            afzs.i.a(new aglb(a5.c()));
                            agci.a(agdz.b().a());
                            afzq2.a((List) list);
                            agdo agdo = (agdo) afzs.n.get();
                            for (agqp agqp : list) {
                                if (a4.remove(agqp.a())) {
                                    agqq agqq3 = agqq2;
                                    agqq agqq4 = agqq2;
                                    Set set = a4;
                                    avsi avsi3 = avsi2;
                                    agdo.a(str, agqp.a(), null, avsi2, b, false, 0, agqq3, false, 0, false);
                                    a4 = set;
                                    agqq2 = agqq4;
                                }
                            }
                        } else {
                            stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
                            stringBuilder.append(str6);
                            stringBuilder.append(str);
                            stringBuilder.append(str7);
                            xtl.c(stringBuilder.toString());
                            afzs.p(str);
                            agfi2.t(str);
                            afzs.o(str);
                            return;
                        }
                    }
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 38);
                    stringBuilder2.append(str4);
                    stringBuilder2.append(str);
                    stringBuilder2.append(str3);
                    xtl.c(stringBuilder2.toString());
                    afzs.m(str);
                    return;
                } catch (ExecutionException e2) {
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
                    stringBuilder.append("Failed requesting playlist ");
                    stringBuilder.append(str);
                    stringBuilder.append(" for offline");
                    xtl.a(stringBuilder.toString(), e2);
                    afzs.m(str);
                    return;
                }
            }
            String.valueOf(str).length();
            afzs.i.a(new agla(str));
            return;
        }
        afzs.m(str);
    }
}
