package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kwi */
public final class kwi implements t, xcp {
    private final Map a = new HashMap();
    private final xci b;
    private final kwk c;

    public kwi(xci xci, kwk kwk) {
        this.b = (xci) amqw.a((Object) xci);
        this.c = (kwk) amqw.a((Object) kwk);
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
        this.b.a((Object) this);
    }

    public final void d() {
        this.b.b(this);
    }

    private final void a(kwl kwl) {
        if (this.a.containsKey(kwl)) {
            AdsWebView adsWebView = (AdsWebView) this.a.get(kwl);
            if (adsWebView != null) {
                if (adsWebView.getParent() != null) {
                    ((ViewGroup) adsWebView.getParent()).removeView(adsWebView);
                }
                adsWebView.destroy();
            }
            this.a.remove(kwl);
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((kwl) arrayList.get(i));
        }
    }

    public final void a(Activity activity, AdsWebView adsWebView, String str, boolean z) {
        a(activity, adsWebView, str, false, z);
    }

    public final void a(Activity activity, AdsWebView adsWebView, String str, boolean z, boolean z2) {
        if (z2) {
            kwk kwk = this.c;
            try {
                bblt.a(new afpr(activity, kwk.a.b(kwk.b.c()), str, kwk.a(adsWebView, z))).b(bbzi.c).c();
                return;
            } catch (Exception e) {
                xtl.a("Failed to execute GoogleSsoAuthTokenTask.", e);
                return;
            }
        }
        activity.runOnUiThread(new kwm(adsWebView, z, str));
    }

    public final AdsWebView a(Activity activity, String str, String str2, boolean z) {
        if (this.a.get(new kwl(str, str2)) != null) {
            AdsWebView adsWebView = (AdsWebView) this.a.get(new kwl(str, str2));
            if (adsWebView != null && (adsWebView.getParent() == null || z)) {
                return adsWebView;
            }
        }
        AdsWebView adsWebView2 = new AdsWebView(activity);
        kwl kwl = new kwl(str, str2);
        a(kwl);
        this.a.put(kwl, adsWebView2);
        return adsWebView2;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{uyw.class};
        } else if (i == 0) {
            uyw uyw = (uyw) obj;
            if (uyw.a == uyz.FINISHED && uyw.b) {
                f();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
