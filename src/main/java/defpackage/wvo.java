package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: wvo */
public final class wvo implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private wvo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static wvo a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new wvo(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        Context context = (Context) this.a.get();
        String str = (String) this.b.get();
        wvn wvn = (wvn) this.c.get();
        String str2 = "CacheDir";
        File a = wvk.a(str2, context.getCacheDir());
        for (int i = 0; i < 5 && a == null; i++) {
            Thread.yield();
            StringBuilder stringBuilder = new StringBuilder(19);
            stringBuilder.append(str2);
            stringBuilder.append(i);
            a = wvk.a(stringBuilder.toString(), context.getCacheDir());
        }
        if (a == null) {
            a = wvk.a("ExternalCacheDir", context.getExternalCacheDir());
        }
        String property = System.getProperty("java.io.tmpdir");
        String packageName = context.getPackageName();
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(property).length() + 1) + String.valueOf(packageName).length());
        stringBuilder2.append(property);
        stringBuilder2.append("/");
        stringBuilder2.append(packageName);
        File file = new File(stringBuilder2.toString());
        if (a == null) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder stringBuilder3 = new StringBuilder(34);
            stringBuilder3.append("failovercache-");
            stringBuilder3.append(currentTimeMillis);
            a = new File(file, stringBuilder3.toString());
            packageName = String.valueOf(a.getPath());
            String str3 = "Could not obtain a cache directory - using failover dir: ";
            if (packageName.length() == 0) {
                packageName = new String(str3);
            } else {
                packageName = str3.concat(packageName);
            }
            xtl.e(packageName);
            a.mkdirs();
        } else if (file.isDirectory()) {
            wvn.a.execute(new wvm(wvn, file));
        }
        if (str == null) {
            obj = a;
        } else {
            obj = new File(a, str);
            obj.mkdir();
        }
        return (File) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
