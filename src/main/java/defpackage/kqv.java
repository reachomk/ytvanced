package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: kqv */
public class kqv {
    public final dwk a;
    public Object b;
    public String c;
    private final aaas d;
    private final tpu e;
    private final View f;
    private String g;

    public kqv(aaas aaas, tpu tpu, dwk dwk, View view) {
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (tpu) amqw.a((Object) tpu);
        this.a = (dwk) amqw.a((Object) dwk);
        this.f = (View) amqw.a((Object) view);
    }

    /* Access modifiers changed, original: protected */
    public aftl[] b() {
        return new aftl[0];
    }

    public final void a(acvx acvx, Object obj, String str, apxu[] apxuArr, ajyl ajyl, aojc aojc, byte[] bArr) {
        this.b = amqw.a(obj);
        this.c = str;
        amqw.a((Object) ajyl);
        if (bArr != null && bArr.length > 0) {
            acvx.a(bArr, null);
        }
        if (apxuArr != null) {
            boolean z;
            if (this.a.a()) {
                kqx kqx = (kqx) this.a.a(this.c, kqx.class, "PPState", kqu.a, this.b);
                boolean z2 = kqx.a;
                if (!z2) {
                    kqx.a = true;
                }
                z = z2;
            } else {
                z = ajyl.a();
                if (!z) {
                    ajyl.b();
                }
            }
            if (!z) {
                a(apxuArr, false);
            }
        }
        if (aojc == null || aojc.b.size() <= 0 || amqu.a(aojc.e)) {
            this.g = null;
            return;
        }
        this.e.a(aojc.e, this.f, new wbv(obj, aojc, this.d));
        this.g = aojc.e;
    }

    public final void a() {
        String str = this.g;
        if (str != null) {
            this.e.a(str);
        }
    }

    public static apxu[] a(String[] strArr) {
        Object[] objArr;
        int length = strArr.length;
        if (length > 0) {
            objArr = new aule[length];
            int i = 0;
            while (i < strArr.length) {
                aulh aulh = (aulh) aule.d.createBuilder();
                String str = strArr[i];
                aulh.copyOnWrite();
                aule aule = (aule) aulh.instance;
                if (str != null) {
                    aule.a |= 1;
                    aule.b = str;
                    objArr[i] = (aule) ((anxl) aulh.build());
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }
        objArr = new aule[0];
        avzp avzp = (avzp) PingingEndpointOuterClass$PingingEndpoint.c.createBuilder();
        avzp.copyOnWrite();
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint = (PingingEndpointOuterClass$PingingEndpoint) avzp.instance;
        pingingEndpointOuterClass$PingingEndpoint.a |= 1;
        pingingEndpointOuterClass$PingingEndpoint.b = true;
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint, (PingingEndpointOuterClass$PingingEndpoint) ((anxl) avzp.build()));
        List asList = Arrays.asList(objArr);
        apxx.copyOnWrite();
        apxu apxu = (apxu) apxx.instance;
        if (!apxu.c.a()) {
            apxu.c = anxl.mutableCopy(apxu.c);
        }
        anvf.addAll(asList, apxu.c);
        return new apxu[]{(apxu) ((anxl) apxx.build())};
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            this.d.a(apxu, a(true));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apxu[] apxuArr, boolean z) {
        if (apxuArr != null) {
            Map a = a(z);
            for (apxu apxu : apxuArr) {
                if (apxu != null) {
                    this.d.a(apxu, a);
                }
            }
        }
    }

    private final Map a(boolean z) {
        Map a = acwi.a(this.b, z);
        a.put("MacrosConverters.CustomConvertersKey", b());
        return a;
    }
}
