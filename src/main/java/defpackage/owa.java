package defpackage;

import android.text.TextUtils;

/* renamed from: owa */
final /* synthetic */ class owa implements ozc {
    public static final ozc a = new owa();

    private owa() {
    }

    public final boolean a(Object obj) {
        String d = ozp.d((String) obj);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        if ((d.contains("text") && !d.contains("text/vtt")) || d.contains("html") || d.contains("xml")) {
            return false;
        }
        return true;
    }
}
