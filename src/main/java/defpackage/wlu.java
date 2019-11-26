package defpackage;

import android.text.Editable;
import android.text.Spannable;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: wlu */
public final class wlu {
    public static void a(Spannable spannable, float f, float f2, float f3, int i) {
        Spannable spannable2 = spannable;
        if (spannable.length() != 0) {
            int i2 = 0;
            for (aaaw aaaw : (aaaw[]) spannable.getSpans(0, spannable.length(), aaaw.class)) {
                apxu apxu = aaaw.a;
                if (apxu != null) {
                    anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                        apxu.a(access$000);
                        Object b = apxu.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        String str = ((apge) b).b;
                        if (!str.isEmpty()) {
                            int spanStart = spannable.getSpanStart(aaaw);
                            int spanEnd = spannable.getSpanEnd(aaaw);
                            if (!(spanStart == -1 || spanEnd == -1 || spanStart >= spanEnd)) {
                                spannable.setSpan(new wlr(str, f, f2, f3, i), spanStart, spanEnd, 33);
                            }
                        }
                    }
                }
            }
            aaaw[] aaawArr = (aaaw[]) spannable.getSpans(0, spannable.length(), aaaw.class);
            int length = aaawArr.length;
            while (i2 < length) {
                spannable.removeSpan(aaawArr[i2]);
                i2++;
            }
        }
    }

    public static void a(Editable editable) {
        int i = 0;
        for (Object obj : (wlr[]) editable.getSpans(0, editable.length(), wlr.class)) {
            int spanStart = editable.getSpanStart(obj);
            int spanEnd = editable.getSpanEnd(obj);
            if (!(spanStart == -1 || spanEnd == -1 || spanStart >= spanEnd)) {
                String str = "@";
                String valueOf = String.valueOf(obj.a);
                editable.replace(spanStart, spanEnd, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
        wlr[] wlrArr = (wlr[]) editable.getSpans(0, editable.length(), wlr.class);
        int length = wlrArr.length;
        while (i < length) {
            editable.removeSpan(wlrArr[i]);
            i++;
        }
    }
}
