package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Locale;

/* renamed from: alvn */
public final class alvn {
    public static void a(String str, Bundle bundle) {
        if (bundle != null && VERSION.SDK_INT >= 24) {
            for (String str2 : bundle.keySet()) {
                String str22;
                int i;
                Object obj = bundle.get(str22);
                if (obj == null) {
                    i = 0;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeValue(obj);
                    i = obtain.dataSize();
                    obtain.recycle();
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = str;
                objArr[1] = str22;
                objArr[2] = Integer.valueOf(i);
                String.format(locale, "onSaveInstanceState entry: class: %s, key: %s, size: %d", objArr);
                if (i > 512000) {
                    afpf afpf = afpf.system_health;
                    str22 = String.valueOf(str22);
                    String str3 = "Bundle value size (on N+) too large for key:";
                    if (str22.length() == 0) {
                        str22 = new String(str3);
                    } else {
                        str22 = str3.concat(str22);
                    }
                    afpc.a(1, afpf, str22, new Exception(String.format(Locale.US, "class:%s,size:%d", new Object[]{str, r7})));
                }
            }
        }
    }
}
