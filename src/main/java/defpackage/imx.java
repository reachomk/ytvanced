package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;

/* renamed from: imx */
public final class imx extends imv implements xcp {
    public Boolean b;
    private final Activity c;
    private final hpt d;
    private final xci e;
    private final eki f;
    private final hna g;
    private final ekg h;
    private final OfflineArrowView i = ((OfflineArrowView) K_().findViewById(R.id.offline_button));
    private final bcaa j = new ina(this);
    private final bcaa k = imz.a;
    private String l;
    private hnb m;

    public imx(Activity activity, Context context, aaas aaas, hpt hpt, xci xci, eki eki, flu flu, inh inh, hna hna, ekg ekg) {
        super(context, aaas, flu, inh, R.layout.bundle_item_layout, new apr(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_height)), new apr(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height));
        this.c = activity;
        this.e = xci;
        this.f = eki;
        this.d = hpt;
        this.g = hna;
        this.h = ekg;
    }

    public final void a(akpb akpb) {
        this.e.b(this);
        this.m = null;
        this.l = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        apgu apgu = (apgu) obj;
        super.a(akor, apgu);
        this.e.a((Object) this);
        avsj avsj = null;
        this.l = (apgu.a & 16) != 0 ? apgu.h : null;
        anxp anxp = apgu.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(OfflineabilityRendererOuterClass.offlineabilityRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = apgu.g;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(OfflineabilityRendererOuterClass.offlineabilityRenderer);
            anxp2.a(access$0002);
            obj = anxp2.h.b(access$0002.d);
            if (obj == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(obj);
            }
            avsj = (avsj) obj;
        }
        avsj avsj2 = avsj;
        hna hna = this.g;
        String str = this.l;
        OfflineArrowView offlineArrowView = this.i;
        boolean z = avsj2 != null && avsj2.b;
        this.m = hna.a(str, offlineArrowView, z, this.h.a(str, avsj2, this.j, this.k, akor.a));
        this.m.a();
        if (this.f.a(this.l)) {
            hpt hpt = this.d;
            String str2 = this.l;
            hpt.a(str2, wxc.a(this.c, new inc(this, str2)));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{agkx.class, agla.class, agkz.class, aglb.class, agld.class, aglg.class};
                break;
            case 0:
                if (((agkx) obj).a.equals(this.l)) {
                    this.m.a();
                    return null;
                }
                break;
            case 1:
                if (((agla) obj).a.equals(this.l)) {
                    this.m.a();
                    return null;
                }
                break;
            case 2:
                if (((agkz) obj).a.equals(this.l)) {
                    this.m.a();
                    return null;
                }
                break;
            case 3:
                aglb aglb = (aglb) obj;
                if (aglb.a.a().equals(this.l)) {
                    this.m.a(hks.a(aglb.a));
                    return null;
                }
                break;
            case 4:
                agld agld = (agld) obj;
                if (agld.a.a().equals(this.l)) {
                    this.m.a(hks.a(agld.a));
                    return null;
                }
                break;
            case 5:
                if (((aglg) obj).a.equals(this.l)) {
                    this.m.a();
                    return null;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
