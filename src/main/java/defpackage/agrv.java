package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collection;
import java.util.List;

/* renamed from: agrv */
public class agrv implements ague {
    public aafv a(Context context, agqp agqp, String str, byte[] bArr) {
        return new aafv(b(context, agqp, str, bArr));
    }

    public aafv a(Context context, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        return new aafv(b(context, agqi, list, i, str, bArr, aozg));
    }

    /* Access modifiers changed, original: protected|final */
    public final akcb b(Context context, agqp agqp, String str, byte[] bArr) {
        amqw.a((Object) context);
        amqw.a((Object) agqp);
        return a(context, agrv.a(null, agqp, -1, str, bArr), agqp);
    }

    /* Access modifiers changed, original: protected|final */
    public final akcb b(Context context, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        amqw.a((Object) context);
        amqw.a((Object) agqi);
        amqw.a((Object) list);
        int max = Math.max(0, Math.min(list.size() - 1, i));
        List list2 = list;
        agqp agqp = (agqp) list.get(max);
        agqi agqi2 = agqi;
        String str2 = str;
        byte[] bArr2 = bArr;
        Context context2 = context;
        akcb a = a(context, agrv.a(agqi2.a, agqp, max, str2, bArr2), agqp);
        a(context2, a, agqi2, list, max, str2, bArr2, aozg);
        return a;
    }

    /* Access modifiers changed, original: protected */
    public akad[] a(Context context, agqp agqp) {
        akad akad = new akad();
        ajwt ajwt = new ajwt();
        ajwt.b = b(context, agqp);
        akad.c = ajwt;
        return new akad[]{akad};
    }

    private final akcb a(Context context, apxu apxu, agqp agqp) {
        akcb akcb = new akcb();
        akcb.c = apxu;
        akap akap = new akap();
        akab akab = new akab();
        akab.b = a(context, agqp);
        akar akar = new akar();
        akar.a = akab;
        akap.a = akar;
        akce akce = new akce();
        akce.a = akap;
        akcb.a = akce;
        return akcb;
    }

    public aafv a(aafv aafv, Context context, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        aafv aafv2 = aafv;
        amqw.a((Object) aafv);
        amqw.a((Object) context);
        if (agqi == null || list == null) {
            return aafv2;
        }
        akcb akcb = aafv2.a;
        apxu apxu = akcb.c;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = akcb.c;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                akcb.c = agrv.a((azje.a & 2) != 0 ? azje.c : null, azje.b, azje.d, azje.e, akcb.c.b);
            }
        }
        return new aafv(a(context, akcb, agqi, list, i, str, bArr, aozg));
    }

    /* Access modifiers changed, original: protected|final */
    public final akcb a(Context context, akcb akcb, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        akcb akcb2 = akcb;
        agqi agqi2 = agqi;
        int i2 = i;
        aozg aozg2 = aozg;
        amqw.a((Object) context);
        amqw.a((Object) agqi);
        amqw.a((Object) list);
        akap akap = akcb2.a.a;
        if (akap != null) {
            int size = list.size();
            ajya ajya = new ajya();
            ajya.e = agqi2.a;
            ajya.b = agqi2.b;
            ajya.d = i2;
            ajya.f = size;
            ajya.l = agrv.a(context.getResources().getQuantityString(R.plurals.playlist_size, size, new Object[]{Integer.valueOf(size)}));
            ajya.c = new ajxz[list.size()];
            if (a().contains(agqi2.a)) {
                ajya.j = null;
            } else {
                auag auag = (auag) auad.d.createBuilder();
                auag.b(agqi2.a);
                ajya.j = agrv.a((auad) ((anxl) auag.build()));
            }
            size = 0;
            while (size < list.size()) {
                List list2;
                boolean z;
                if (size == i2) {
                    list2 = list;
                    z = true;
                } else {
                    list2 = list;
                    z = false;
                }
                agqp agqp = (agqp) list2.get(size);
                String str2 = agqi2.a;
                ajyc ajyc = new ajyc();
                ajyc.e = z;
                ajyc.h = agqp.a();
                ajyc.a = agrv.a(agqp.b());
                agpy agpy = agqp.a;
                if (agpy != null) {
                    ajyc.i = agrv.a(agpy.b);
                }
                int i3 = size + 1;
                ajyc.d = ajqy.a((long) i3);
                ajyc.c = agrv.a(agqp.c());
                ajyc.f = agrv.a(str2, agqp, size, str, bArr);
                ajyc.b = agqp.b.d();
                ajxz ajxz = new ajxz();
                ajxz.b = ajyc;
                ajya.c[size] = ajxz;
                size = i3;
            }
            akas akas = new akas();
            akas.a = ajya;
            akap.b = akas;
            if (aozg2 != null) {
                atol atol = (atol) atom.c.createBuilder();
                atol.copyOnWrite();
                atom atom = (atom) atol.instance;
                atom.b = aozg2;
                atom.a = 46659098;
                akap.c = (atom) ((anxl) atol.build());
            }
        }
        return akcb2;
    }

    /* Access modifiers changed, original: protected */
    public ajww[] b(Context context, agqp agqp) {
        ajww[] ajwwArr = new ajww[2];
        akbu akbu = new akbu();
        agpy agpy = agqp.a;
        if (agpy != null) {
            akbu.b = agrv.a(agpy.b);
            aaft aaft = agqp.a.c;
            if (aaft != null) {
                akbu.a = aaft.d();
            }
        }
        ajww ajww = new ajww();
        ajww.j = akbu;
        ajwwArr[0] = ajww;
        arml a = agrv.a(agqp.b());
        arml a2 = agrv.a(context.getString(R.string.video_views, new Object[]{Long.valueOf(agqp.g())}));
        arml a3 = agrv.a(agqp.d());
        arml a4 = agrv.a(agqp.e());
        arml a5 = agrv.a(agqp.d());
        arml a6 = agrv.a(agqp.e());
        armk armk = (armk) arml.f.createBuilder();
        if (agqp.d != null) {
            armo armo = (armo) armp.m.createBuilder();
            armo.a();
            armo.a(DateFormat.getLongDateFormat(context).format(agqp.d));
            armk.a((armp) ((anxl) armo.build()));
        }
        arml arml = (arml) ((anxl) armk.build());
        akbr akbr = new akbr();
        akbr.e = false;
        akbr.d = false;
        arml arml2 = agqp.e.j;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        akbr.c = arml2;
        akbr.f = arml;
        akbr.b = a2;
        akbr.a = a;
        auag auag = (auag) auad.d.createBuilder();
        auag.a(agqp.a());
        atzs atzs = (atzs) ((anxo) agrv.a((auad) ((anxl) auag.build())).toBuilder());
        atzq atzq = (atzq) ((anxo) atzs.a().toBuilder());
        atzq.copyOnWrite();
        atzr atzr = (atzr) atzq.instance;
        if (a4 != null) {
            atzr.i = a4;
            atzr.a |= 128;
            atzq.copyOnWrite();
            atzr = (atzr) atzq.instance;
            if (a6 != null) {
                atzr.j = a6;
                atzr.a |= 256;
                atzq.copyOnWrite();
                atzr = (atzr) atzq.instance;
                if (a3 != null) {
                    atzr.e = a3;
                    atzr.a |= 8;
                    atzq.copyOnWrite();
                    atzr = (atzr) atzq.instance;
                    if (a5 != null) {
                        atzr.f = a5;
                        atzr.a |= 16;
                        atzs.a(atzq);
                        akbr.g = (atzt) ((anxl) atzs.build());
                        ajww ajww2 = new ajww();
                        ajww2.k = akbr;
                        ajwwArr[1] = ajww2;
                        return ajwwArr;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected */
    public Collection a() {
        return amuw.a((Object) "PPSV");
    }

    private static atzt a(auad auad) {
        atzq atzq = (atzq) atzr.p.createBuilder();
        atzq.copyOnWrite();
        atzr atzr = (atzr) atzq.instance;
        if (auad != null) {
            atzr.b = auad;
            atzr.a |= 1;
            anvu anvu = anvu.a;
            atzq.copyOnWrite();
            atzr = (atzr) atzq.instance;
            if (anvu != null) {
                atzr.a |= 1024;
                atzr.l = anvu;
                atzq.copyOnWrite();
                atzr atzr2 = (atzr) atzq.instance;
                atzr2.a |= 2048;
                atzr2.m = true;
                atzq.a(auac.INDIFFERENT);
                atzr2 = (atzr) ((anxl) atzq.build());
                atzs atzs = (atzs) atzt.c.createBuilder();
                atzs.copyOnWrite();
                atzt atzt = (atzt) atzs.instance;
                if (atzr2 != null) {
                    atzt.b = atzr2;
                    atzt.a |= 1;
                    return (atzt) ((anxl) atzs.build());
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    protected static arml a(String str) {
        if (TextUtils.isEmpty(str)) {
            return ajqy.a(new String[0]);
        }
        return ajqy.a(str);
    }

    public static apxu a(String str, agqp agqp, int i, String str2, byte[] bArr) {
        anvu anvu;
        amqw.a((Object) agqp);
        String a = agqp.a();
        if (bArr == null) {
            anvu = anvu.a;
        } else {
            anvu = anvu.a(bArr);
        }
        return agrv.a(str, a, i, str2, anvu);
    }

    public static apxu a(String str, String str2, int i, String str3, anvu anvu) {
        avse avse = (avse) avsc.g.createBuilder();
        if (!TextUtils.isEmpty(str2)) {
            avse.a(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            avse.b(str);
        }
        if (i != -1) {
            avse.a(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            avse.c(str3);
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (avsc) ((anxl) avse.build()));
        if (!(anvu == null || anvu.c())) {
            apxx.a(anvu);
        }
        return (apxu) ((anxl) apxx.build());
    }

    public final aafv a(Context context, agqp agqp, aiqq aiqq) {
        return a(context, agqp, aiqq.h(), aiqq.k());
    }

    public final aafv a(Context context, agqi agqi, List list, int i, aiqq aiqq, aozg aozg) {
        return a(context, agqi, list, i, aiqq.h(), aiqq.k(), aozg);
    }

    public final aafv a(aafv aafv, Context context, agqi agqi, List list, int i, aiqq aiqq, aozg aozg) {
        return a(aafv, context, agqi, list, i, aiqq.h(), aiqq.k(), aozg);
    }
}
