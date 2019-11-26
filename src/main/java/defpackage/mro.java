package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: mro */
public final class mro implements amro {
    private final Context a;
    private final String b;
    private final mni c;

    public mro(Context context, String str, mni mni) {
        this.a = context;
        this.b = str;
        this.c = mni;
    }

    public final /* synthetic */ Object get() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.google.android.youtube.player/");
        stringBuilder.append(this.b);
        stringBuilder.append(' ');
        stringBuilder.append(this.a.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(ammm.a(this.a));
        stringBuilder.append(' ');
        stringBuilder.append(this.c.a);
        stringBuilder.append('/');
        stringBuilder.append(this.c.b);
        stringBuilder.append(" (Linux; U; Android ");
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
        return stringBuilder.toString();
    }
}
