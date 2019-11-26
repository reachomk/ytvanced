package defpackage;

import android.net.Uri;

/* renamed from: xgr */
public final class xgr {
    public static final xgr a = new xgr();
    public final Uri[] b;

    private xgr() {
        this.b = null;
    }

    public xgr(Uri[] uriArr) {
        this.b = (Uri[]) amqw.a((Object) uriArr);
        amqw.a(uriArr.length > 0, (Object) "No prewarming urls provided");
        for (int i = 0; i < uriArr.length; i++) {
            Object obj = uriArr[i];
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Provided url is null at index ");
            stringBuilder.append(i);
            amqw.a(obj, stringBuilder.toString());
        }
    }

    public final boolean a() {
        Uri[] uriArr = this.b;
        return uriArr != null && uriArr.length > 0;
    }
}
