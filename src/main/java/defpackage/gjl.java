package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;

/* renamed from: gjl */
public final class gjl {
    public static void a(Activity activity, zkw zkw, View view, bacy bacy, gjn gjn) {
        gjl.a(activity, zkw, zmb.a(activity, view), bacy, gjn);
    }

    public static void a(Activity activity, zkw zkw, Bitmap bitmap, bacy bacy, gjn gjn) {
        zkw.a(activity, bitmap, new gjk(activity, bacy, gjn, bitmap));
    }
}
