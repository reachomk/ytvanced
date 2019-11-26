package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: xgb */
public final class xgb implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xgb(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xgb a(bcaa bcaa, bcaa bcaa2) {
        return new xgb(bcaa, bcaa2);
    }

    public static String a(Context context, amqp amqp) {
        Object obj;
        if (amqp.a()) {
            obj = (String) ((amro) amqp.b()).get();
        } else {
            Object b = xul.b(context);
            amqw.a((Object) context);
            amqw.a(b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append('/');
            stringBuilder.append(b);
            stringBuilder.append("(Linux; U; Android ");
            stringBuilder.append(VERSION.RELEASE);
            String str = "; ";
            stringBuilder.append(str);
            stringBuilder.append(Locale.getDefault().toString());
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                stringBuilder.append(str);
                stringBuilder.append(str2);
            }
            str = Build.ID;
            if (str.length() > 0) {
                stringBuilder.append(" Build/");
                stringBuilder.append(str);
            }
            stringBuilder.append(')');
            if (!TextUtils.isEmpty(null)) {
                stringBuilder.append(" null");
            }
            obj = stringBuilder.toString();
        }
        return (String) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xgb.a((Context) this.a.get(), (amqp) this.b.get());
    }
}
