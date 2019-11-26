package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: xst */
public final class xst {
    public final String a;
    public final String b;
    public final int c;

    public static xst a(Context context, int i, Object... objArr) {
        return xst.a(context, 0, i, objArr);
    }

    public static xst a(Context context, int i, int i2, Object... objArr) {
        return new xst(context.getString(i2, objArr), xst.b(context, i2, objArr), i);
    }

    public xst(String str, String str2) {
        this(str, str2, 0);
    }

    private xst(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static String b(Context context, int i, Object... objArr) {
        Object str;
        if (objArr.length > 0) {
            String str2 = "_";
            String valueOf = String.valueOf(TextUtils.join(str2, objArr));
            str = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
        } else {
            str = "";
        }
        String valueOf2 = String.valueOf(context.getResources().getResourceEntryName(i));
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
    }
}
