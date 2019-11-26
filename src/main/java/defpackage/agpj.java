package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: agpj */
public final class agpj {
    public final File a;
    public File b;
    public File c;
    private File d;

    public agpj(Context context, String str) {
        amqw.a((Object) context);
        xvd.a(str);
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 7) + String.valueOf(str).length());
        stringBuilder.append("offline");
        stringBuilder.append(str2);
        stringBuilder.append(str);
        this.a = new File(new File(filesDir, stringBuilder.toString()), "data");
    }

    public final File a(String str) {
        xvd.a(str);
        if (this.d == null) {
            this.d = new File(this.a, "videos");
        }
        return new File(this.d, str);
    }
}
