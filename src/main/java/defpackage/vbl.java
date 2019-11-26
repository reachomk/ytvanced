package defpackage;

import android.text.Spanned;
import java.util.Comparator;

/* renamed from: vbl */
final /* synthetic */ class vbl implements Comparator {
    public static final Comparator a = new vbl();

    private vbl() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Spanned) obj).toString().compareTo(((Spanned) obj2).toString());
    }
}
