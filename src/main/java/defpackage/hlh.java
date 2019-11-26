package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NavigationListRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: hlh */
public final class hlh extends agrv {
    private final zyw a;
    private final hoc b;

    public hlh(zyw zyw, hoc hoc) {
        this.a = zyw;
        this.b = hoc;
    }

    public final aafv a(Context context, agqp agqp, String str, byte[] bArr) {
        amqw.a((Object) context);
        amqw.a((Object) agqp);
        akcb b = b(context, agqp, str, bArr);
        if (b == null) {
            return null;
        }
        b.e = hlh.c(context, agqp);
        return new aafv(b);
    }

    public final aafv a(Context context, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        int i2 = i;
        int max = Math.max(0, Math.min(list.size() - 1, i));
        akcb b = b(context, agqi, list, max, str, bArr, aozg);
        if (b == null) {
            return null;
        }
        List list2 = list;
        Context context2 = context;
        b.e = hlh.c(context, (agqp) list.get(max));
        b.n = a(agqi, list2, max, str, bArr);
        return new aafv(b);
    }

    public final aafv a(aafv aafv, Context context, agqi agqi, List list, int i, String str, byte[] bArr, aozg aozg) {
        aafv aafv2 = aafv;
        amqw.a((Object) aafv);
        amqw.a((Object) context);
        if (agqi == null || list == null) {
            return aafv2;
        }
        akcb akcb = aafv2.a;
        a(context, akcb, agqi, list, i, str, bArr, aozg);
        akcb.n = a(agqi, list, i, str, bArr);
        return new aafv(akcb);
    }

    /* Access modifiers changed, original: protected|final */
    public final Collection a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(super.a());
        hashSet.add("PPMA");
        return hashSet;
    }

    /* Access modifiers changed, original: protected|final */
    public final akad[] a(Context context, agqp agqp) {
        apxn a = this.a.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.bk) {
                new akad().A = (axpw) this.b.a(agqp.class, axpw.class, (agqp) amqw.a((Object) agqp), null);
                return new akad[]{r5};
            }
        }
        return super.a(context, agqp);
    }

    private final atok a(agqi agqi, List list, int i, String str, byte[] bArr) {
        if (!foh.f(this.a) || list == null || list.isEmpty()) {
            return null;
        }
        String str2 = agqi.a;
        avjk avjk = (avjk) avjl.e.createBuilder();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            anvu anvu;
            avji avji = (avji) avjj.c.createBuilder();
            String a = ((agqp) list.get(i2)).a();
            if (bArr == null) {
                anvu = anvu.a;
            } else {
                anvu = anvu.a(bArr);
            }
            avji.a(agrv.a(str2, a, i2, str, anvu));
            axaj axaj = (axaj) axak.a.createBuilder();
            axaj.a(NavigationListRendererOuterClass.navigationListEntryRenderer, (avjj) ((anxl) avji.build()));
            arrayList.add((axak) ((anxl) axaj.build()));
        }
        avjk.copyOnWrite();
        avjl avjl = (avjl) avjk.instance;
        if (!avjl.b.a()) {
            avjl.b = anxl.mutableCopy(avjl.b);
        }
        anvf.addAll(arrayList, avjl.b);
        avjk.copyOnWrite();
        avjl = (avjl) avjk.instance;
        avjl.a |= 1;
        avjl.d = i;
        atoj atoj = (atoj) atok.c.createBuilder();
        atoj.copyOnWrite();
        atok atok = (atok) atoj.instance;
        atok.b = (avjl) ((anxl) avjk.build());
        atok.a |= 1;
        return (atok) ((anxl) atoj.build());
    }

    private static ajxr c(Context context, agqp agqp) {
        arml a = agrv.a(agqp.b());
        String string = context.getString(R.string.video_views, new Object[]{Long.valueOf(agqp.g())});
        agpy agpy = agqp.a;
        CharSequence charSequence = agpy != null ? agpy.b : "";
        awft awft = (awft) awfq.d.createBuilder();
        awft.copyOnWrite();
        awfq awfq = (awfq) awft.instance;
        if (a != null) {
            awfq.b = a;
            awfq.a |= 1;
            int isEmpty = TextUtils.isEmpty(charSequence) ^ 1;
            int isEmpty2 = TextUtils.isEmpty(string) ^ 1;
            arml a2 = (isEmpty == 0 || isEmpty2 == 0) ? isEmpty != 0 ? agrv.a(charSequence.toString()) : isEmpty2 != 0 ? agrv.a(string.toString()) : null : agrv.a(TextUtils.concat(new CharSequence[]{charSequence, " · ", string}).toString());
            awft.copyOnWrite();
            awfq awfq2 = (awfq) awft.instance;
            if (a2 != null) {
                awfq2.c = a2;
                awfq2.a |= 2;
                awfq awfq3 = (awfq) ((anxl) awft.build());
                ajxs ajxs = new ajxs();
                awfv awfv = (awfv) awfs.c.createBuilder();
                awfv.copyOnWrite();
                awfs awfs = (awfs) awfv.instance;
                if (awfq3 != null) {
                    awfs.b = awfq3;
                    awfs.a = 128392103;
                    ajxs.f = (awfs) ((anxl) awfv.build());
                    ajxr ajxr = new ajxr();
                    ajxr.b = ajxs;
                    return ajxr;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final ajww[] b(Context context, agqp agqp) {
        ajww[] ajwwArr = new ajww[1];
        akay akay = (akay) this.b.a(agqp.class, akay.class, (agqp) amqw.a((Object) agqp), null);
        ajww ajww = new ajww();
        ajww.al = akay;
        ajwwArr[0] = ajww;
        return ajwwArr;
    }
}
