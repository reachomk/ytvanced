package defpackage;

import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* renamed from: anmh */
public class anmh {
    public final Bundle a = new Bundle();
    public anml b;
    public String c;
    private final String d;

    protected anmh(String str) {
        pzr.a((Object) str);
        pzr.a(str);
        this.d = str;
    }

    public final anmh a(String str, String... strArr) {
        Bundle bundle = this.a;
        pzr.a((Object) str);
        pzr.a((Object) strArr);
        strArr = (String[]) Arrays.copyOf(strArr, 1);
        if (strArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr.length, 100); i2++) {
                String str2 = strArr[i2];
                strArr[i] = str2;
                if (strArr[i2] != null) {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        str2 = strArr[i];
                        if (str2.length() > 20000) {
                            if (Character.isHighSurrogate(str2.charAt(19999)) && Character.isLowSurrogate(str2.charAt(20000))) {
                                i3 = 19999;
                            }
                            str2 = str2.substring(0, i3);
                        }
                        strArr[i] = str2;
                    }
                    i++;
                }
            }
            if (i > 0) {
                bundle.putStringArray(str, (String[]) anmh.a((String[]) Arrays.copyOfRange(strArr, 0, i)));
            }
        }
        return this;
    }

    public final anmg a() {
        Bundle bundle = new Bundle(this.a);
        anml anml = this.b;
        if (anml == null) {
            anml = new anmi().a();
        }
        return new Thing(bundle, anml, this.c, this.d);
    }

    public static Object[] a(Object[] objArr) {
        return objArr.length >= 100 ? Arrays.copyOf(objArr, 100) : objArr;
    }
}
