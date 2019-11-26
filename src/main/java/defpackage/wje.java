package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wje */
public final class wje extends wib implements xcp {
    public final wcq g;
    private final xci h;
    private WeakReference i;
    private final aaas j;
    private awzv k;

    public wje(Context context, akkq akkq, akvz akvz, akoe akoe, wda wda, wcq wcq, xci xci, aaas aaas) {
        super(context, akkq, akvz, akoe, wda);
        this.g = (wcq) amqw.a((Object) wcq);
        this.h = (xci) amqw.a((Object) xci);
        this.j = (aaas) amqw.a((Object) aaas);
    }

    public final void a(akpb akpb) {
        super.b();
        this.h.b(this);
        this.i = null;
        this.k = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajrq ajrq;
        akor akor2 = akor;
        ajsw ajsw = (ajsw) obj;
        this.h.a(this);
        akor2.a.a(ajsw.c, null);
        CharSequence a = ajqy.a(ajsw.d);
        CharSequence a2 = ajqy.a(ajsw.e);
        a(a, a2);
        xpr.a(this.e, ajqy.a(ajsw.i));
        xpr.a(this.f, ajsw.i != null);
        String str = "sectionController";
        akvy akvy = (akvy) akor2.a(str);
        wey wey = new wey(akvy);
        ajsm ajsm = ajsw.a;
        ajsr ajsr = ajsm != null ? ajsm.a : null;
        this.i = null;
        this.k = null;
        if (ajsr != null) {
            akvy akvy2 = (akvy) akor2.a(str);
            azru azru = ajsr.e;
            if (azru != null) {
                azrq azrq = azru.b;
                if (azrq == null) {
                    azrq = azrq.f;
                }
                azrs azrs = azrq.e;
                if (azrs == null) {
                    azrs = azrs.c;
                }
                if ((azrs.a & 1) != 0) {
                    azrq = ajsr.e.b;
                    if (azrq == null) {
                        azrq = azrq.f;
                    }
                    azrs = azrq.e;
                    if (azrs == null) {
                        azrs = azrs.c;
                    }
                    awzv awzv = azrs.b;
                    if (awzv == null) {
                        awzv = awzv.d;
                    }
                    this.k = awzv;
                    if (akvy2 instanceof akuz) {
                        this.i = new WeakReference((akuz) akvy2);
                    }
                }
            }
            a(ajsr.b, ajsr.g, ajqy.a(ajsr.c), new wjh(this, ajsr, akvy2));
        }
        Object obj2 = (TextUtils.isEmpty(a) && TextUtils.isEmpty(a2)) ? 1 : null;
        ajsm ajsm2 = ajsw.a;
        if (ajsm2 != null) {
            ajrq = ajsm2.b;
        } else {
            ajrq = null;
        }
        int i = obj2 == null ? 2 : 4;
        if (ajrq != null) {
            a(ajrq.a, i, ajqy.a(ajrq.d), new wjg(this, ajrq, wey));
            wjv wjv = this.g.f;
            Dialog dialog = wjv != null ? wjv.c : null;
            if (dialog != null && dialog.isShowing()) {
                this.g.d.b = wey;
            }
        }
        aqbq aqbq = ajsw.b;
        axqn axqn = aqbq != null ? aqbq.a == 76818770 ? (axqn) aqbq.b : axqn.f : null;
        a(akor2, axqn);
        if (ajsw.f) {
            wda wda = this.a;
            ajsm2 = ajsw.a;
            wda.a(ajsm2 != null ? ajsm2.a : null, akvy);
            ajsw.f = false;
        }
        apxu[] apxuArr = ajsw.g;
        if (apxuArr != null) {
            Map hashMap;
            aaas aaas = this.j;
            akvy akvy3 = (akvy) akor2.a(str);
            if (akvy3 != null) {
                hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new wey(akvy3));
            } else {
                hashMap = null;
            }
            aaas.a(apxuArr, hashMap);
            ajsw.g = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{uru.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((uru) obj).a) {
            WeakReference weakReference = this.i;
            if (weakReference != null) {
                akuz akuz = (akuz) weakReference.get();
                if (akuz != null) {
                    awzv awzv = this.k;
                    if (awzv != null) {
                        akuz.a(new akvf(ajtj.a(awzv)));
                        return null;
                    }
                }
            }
        }
        return clsArr;
    }
}
