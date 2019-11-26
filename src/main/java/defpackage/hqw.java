package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;

/* renamed from: hqw */
public final class hqw implements xcp {
    public final hpd a;
    public final xci b;
    public final hls c;
    public final hmj d;
    public final bcaa e;
    public final TextView f;
    public final OfflineArrowView g;
    public final akoj h;
    public aqey i;
    public String j;
    public hlp k;
    public Future l;
    private final ahcd m;

    public hqw(hpd hpd, xci xci, hls hls, ahcd ahcd, hmj hmj, bcaa bcaa, View view, akoj akoj) {
        this.a = hpd;
        this.b = xci;
        this.c = hls;
        this.m = ahcd;
        this.d = hmj;
        this.e = bcaa;
        this.h = akoj;
        this.f = (TextView) view.findViewById(R.id.subtitle);
        this.g = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
    }

    public final void a(hkt hkt) {
        String[] strArr = hkt.b;
        TextView textView;
        if (strArr == null || amqu.a(strArr[0])) {
            arml arml;
            textView = this.f;
            aqey aqey = this.i;
            if ((aqey.a & 2) != 0) {
                arml = aqey.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
            textView = this.f;
            textView.setTextColor(xwe.a(textView.getContext(), R.attr.ytTextSecondary, 0));
            this.f.setTypeface(Typeface.DEFAULT);
            return;
        }
        xpr.a(this.f, hkt.b[0]);
        TextView textView2 = this.f;
        textView2.setTextColor(xwe.a(textView2.getContext(), hkt.a, 0));
        textView = this.f;
        textView.setTypeface(textView.getTypeface(), 0);
    }

    public final void a() {
        if (!amqu.a(this.j)) {
            if (!"PPSV".equals(this.j)) {
                this.m.a(this.j, ahbv.a(true));
            }
        }
    }

    private final void a(agqh agqh) {
        this.k.a(hks.a((agqj) agqh));
        a(this.d.a(agqh));
    }

    private final void a(agqx agqx) {
        this.k.a(hks.a(agqx));
        a(this.d.b());
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agky.class, agkz.class, aglb.class, aglu.class};
        } else if (i != 0) {
            String str = "PPSV";
            if (i != 1) {
                if (i == 2) {
                    aglb aglb = (aglb) obj;
                    if (aglb.a.a().equals(this.j) && this.k != null) {
                        a(aglb.a);
                        return null;
                    }
                } else if (i == 3) {
                    aglu aglu = (aglu) obj;
                    if (str.equals(this.j) && this.k != null) {
                        a(aglu.a);
                        return null;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("unsupported op code: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else if (((agkz) obj).a.equals(this.j)) {
                a(((agwc) this.e.get()).b().n().f(this.j));
            } else if (str.equals(this.j)) {
                a(((agwc) this.e.get()).b().k().g());
                return null;
            }
        } else if (((agky) obj).a.equals(this.j)) {
            a(((agwc) this.e.get()).b().n().f(this.j));
            return null;
        }
        return clsArr;
    }
}
