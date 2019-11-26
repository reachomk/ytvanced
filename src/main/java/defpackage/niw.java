package defpackage;

import android.text.Spanned;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import java.util.ArrayList;

/* renamed from: niw */
final /* synthetic */ class niw implements Runnable {
    private final nit a;

    niw(nit nit) {
        this.a = nit;
    }

    public final void run() {
        nhd[] nhdArr;
        arej arej;
        arml arml;
        CharSequence charSequence;
        nit nit = this.a;
        nit.c.a();
        if (nit.a == null) {
            nhdArr = new nhd[0];
        } else {
            ArrayList arrayList = new ArrayList();
            for (awfw awfw : nit.a.b) {
                if ((awfw.a & 1) != 0) {
                    arej = awfw.b;
                    if (arej == null) {
                        arej = arej.m;
                    }
                    Object obj = null;
                    if (arej != null) {
                        arml arml2;
                        njc njc = nit.c;
                        aygk aygk = arej.c;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        int i = njc.a;
                        njc.a = i + 1;
                        njc.c.append(i, aklb.e(aygk));
                        ngm ngm = new ngm(njc.b, i);
                        njb njb = nit.d;
                        int i2 = njb.a;
                        njb.a = i2 + 1;
                        njb.c.append(i2, arej);
                        nhh nhh = new nhh(njb.b, i2);
                        String str = arej.b;
                        if ((arej.a & 8) != 0) {
                            arml2 = arej.d;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                        } else {
                            arml2 = null;
                        }
                        Spanned a = ajqy.a(arml2);
                        if ((arej.a & 32) != 0) {
                            arml2 = arej.f;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                        } else {
                            arml2 = null;
                        }
                        Spanned a2 = ajqy.a(arml2);
                        if ((arej.a & 512) != 0) {
                            arml = arej.j;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        }
                        obj = new nhd(str, a, a2, ajqy.a(arml), ngm, nhh);
                    }
                    arrayList.add(obj);
                }
            }
            nhdArr = (nhd[]) arrayList.toArray(new nhd[arrayList.size()]);
        }
        RemoteDataBus remoteDataBus = nit.e;
        awfu awfu = nit.a;
        if (awfu == null || (awfu.a & 1) == 0) {
            charSequence = "";
        } else {
            arml = awfu.c;
            if (arml == null) {
                arml = arml.f;
            }
            charSequence = ajqy.a(arml);
        }
        remoteDataBus.a(new nhf(charSequence, nhdArr));
        awfu awfu2 = nit.a;
        if (awfu2 != null) {
            for (awfw awfw2 : awfu2.b) {
                arej = awfw2.b;
                if (arej == null) {
                    arej = arej.m;
                }
                if ((awfw2.a & 1) != 0) {
                    nit.f.a(arej.l.d());
                }
            }
        }
    }
}
